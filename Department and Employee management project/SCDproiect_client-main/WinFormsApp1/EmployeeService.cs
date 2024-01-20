using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.Http.Headers;
using System.Text;
using System.Text.Json;
using System.Threading.Tasks;


namespace WinFormsApp1
{
    internal class EmployeeService
    {
        static HttpClient client = new HttpClient();

        public void createConnection()
        {
            // Update port # in the following line.
            client.BaseAddress = new Uri("http://localhost:8082/");
            client.DefaultRequestHeaders.Accept.Clear();
            client.DefaultRequestHeaders.Accept.Add(
                new MediaTypeWithQualityHeaderValue("application/json"));
        }

        public List<Employee> GetEmployees()
        {
            List<Employee> employees = null;

            HttpResponseMessage response = client.GetAsync("employee").Result;
            if (response.IsSuccessStatusCode)
            {
                string resultString = response.Content.ReadAsStringAsync().Result;
                Console.WriteLine("gata : " + resultString);

                //to ignore the null fields(managerId)
                var ignoreNull = new Newtonsoft.Json.JsonSerializerSettings
                {
                    NullValueHandling = Newtonsoft.Json.NullValueHandling.Ignore
                };

                employees = JsonConvert.DeserializeObject<List<Employee>>(resultString,ignoreNull);
                return employees;

            }
            return null;
        }

        public bool AddEmployee(Employee newEmployee)
        {
           
                var ignoreNull = new Newtonsoft.Json.JsonSerializerSettings
                {
                    NullValueHandling = Newtonsoft.Json.NullValueHandling.Ignore
                };

                string jsonEmployee = JsonConvert.SerializeObject(newEmployee, ignoreNull);
                StringContent content = new StringContent(jsonEmployee, Encoding.UTF8, "application/json");

                HttpResponseMessage response = client.PostAsync("employee", content).Result;

                return response.IsSuccessStatusCode;
            
        }

        public bool UpdateEmployee(Employee updatedEmployee)
        {
            var ignoreNull = new Newtonsoft.Json.JsonSerializerSettings
            {
                NullValueHandling = Newtonsoft.Json.NullValueHandling.Ignore
            };

            string jsonEmployee = JsonConvert.SerializeObject(updatedEmployee,ignoreNull);
            StringContent content = new StringContent(jsonEmployee, Encoding.UTF8, "application/json");

            int employeeId = updatedEmployee.id;

            HttpResponseMessage response = client.PutAsync($"employee/{employeeId}", content).Result;

            if (response.IsSuccessStatusCode)
            {
                return true;
            }
            else
            {
                Console.WriteLine("Failed to update employee. Status code: " + response.StatusCode);
                return false;
            }
        }

        public bool DeleteEmployee(int employeeId)
        {
            HttpResponseMessage response = client.DeleteAsync($"employee/{employeeId}").Result;

            if (response.IsSuccessStatusCode)
            {
                return true;
            }
            else
            {
                Console.WriteLine("Failed to delete employee. Status code: " + response.StatusCode);
                return false;
            }
        }
    }
}
