#include <LiquidCrystal_I2C.h>
#include <Adafruit_Sensor.h>
#include <DHT.h>
#include <DHT_U.h>

#include <Ethernet.h>
#include <SPI.h>

#define DHT11PIN 5
#define DHTTYPE DHT11
//Temp and humidity
DHT temp(DHT11PIN,DHTTYPE);

LiquidCrystal_I2C lcd(0x27,16,2);
//Rain In/OUT
int rain_input=A0;
int LED_rain=4;

//Light In/Out
int light_input=3;
int LED_light=6; 

byte mac[] = { 0xDE, 0xAD, 0xBE, 0xEF, 0xFE, 0xED };
//IPAddress ip(192, 168, 1, 132); de akasa
IPAddress ip(172,27,164,81); //de la fakulta
EthernetServer server(80);

void setup() {
 
  Ethernet.init(10);
  Ethernet.begin(mac,ip);
  server.begin();
  Serial.begin(9600);

  lcd.init();
  lcd.backlight();

  pinMode(rain_input,INPUT);
  pinMode(LED_rain,OUTPUT);

  pinMode(light_input,INPUT);
  pinMode(LED_light,OUTPUT);

  temp.begin();

}

void loop() {
 
  lcd.clear();
  int value_rain = analogRead(rain_input);
  int value_light = digitalRead(light_input);
  int hum_temp = temp.read(DHT11PIN);
  float hum = temp.readHumidity();
  float temper = temp.readTemperature();
  String isRaining;

  EthernetClient client = server.available();
  
  if (client) 
    {
      boolean currentLineIsBlank = true;
      while (client.connected ( ) ) 
        {
          if (client.available ( ) ) 
            {
              char character = client.read ( );
              Serial.write(character);
              if (character == '\n' && currentLineIsBlank) 
                {
                  client.println ("HTTP/1.1 200 OK");
                  client.println ("Content-Type: text/html");
                  client.println ("Connection: close");
                  client.println ("Refresh: 5");
                  client.println ( );
                  client.println ("<!DOCTYPE HTML>");
                  client.println ("<html>");
                  client.print ("<Title>Arduino Weather Station</Title>");
                  client.print ("<h1>Weather Station</h1>");
                  client.print ("<h4>Temperature in C: ");
                  client.print (temper);client.print("C");
                  client.print ("</h4><h4>Humidity: ");
                  client.print (hum);client.print("%");
                  client.print ("</h4><h4>Rain factor is:");
                  client.print (value_rain);
                  client.print ("</h4><h4>Is it raining? ");
                  if(value_rain<700){
                
                    isRaining="YES";
                    client.print(isRaining);
                     }
                     else              
                     {
                        isRaining="NO";
                        client.print(isRaining);
                     }
                  
                  client.print ("</h4><h4>Is it sunny outside? ");
                  if(value_light)
                    client.print("No, its dark");
                    else
                    client.print("Yes, it's sunny outside");

                  client.println ("<br />");
                  client.println ("</html>");
                  break;
                }
                 
                if ( character == '\n') 
                  {
                    currentLineIsBlank = true;
                  } 
                else if (character != '\r') 
                  {
                    currentLineIsBlank = false;
            }
        }
    }
    delay(1);
    client.stop();
  }


  Serial.println("//////////////////////////////");

  
  /////RAIN/////
  Serial.print("Rain factor: ");
  Serial.println(value_rain);

  Serial.println("Is it raining?");
  if(value_rain<700){
    digitalWrite(LED_rain,HIGH);
    isRaining="YES";
    Serial.println(isRaining);
    
  }
  else
  {
    digitalWrite(LED_rain,LOW);
    delay(100);
    isRaining="NO";
    Serial.println(isRaining);
    
  }

//////LIGHT/////////

  if(value_light==1){
    digitalWrite(LED_light,HIGH);
    Serial.println("It's dark outside");
    
  }
  else
  {
    digitalWrite(LED_light,LOW);
    Serial.println("It's light outside");
  }

/////HUMIDITY and TEMPERATURE/////////
  Serial.print("Humidity (%): ");
  Serial.println(hum, 2);
  delay(100);
  Serial.print("Temperature  (C): ");
  Serial.println(temper, 2);

///LCD///
  
  lcd.setCursor(0,0);
  lcd.print("T:");
  lcd.print(temper, 2);

  lcd.setCursor(0,1);
  lcd.print("H:");
  lcd.print(hum, 2);

  lcd.setCursor(9,0);
  lcd.print("L:");
  lcd.print(value_light);

  lcd.setCursor(9,1);
  lcd.print("R:");
  lcd.print(value_rain);

   delay(3000);
}
