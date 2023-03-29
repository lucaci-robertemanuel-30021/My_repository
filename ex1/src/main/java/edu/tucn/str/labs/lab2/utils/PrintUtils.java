package edu.tucn.str.labs.lab2.utils;

import java.sql.SQLOutput;

public class PrintUtils {

  void printThreads(int n){
      for(int i=0;i<n;i++){
          Thread currentThread=Thread.currentThread();
          System.out.println(Thread.currentThread().getName());
      }
      try {
          Thread.sleep(50);
      } catch (InterruptedException e) {
      }
  }
}
