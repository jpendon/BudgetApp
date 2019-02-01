package com.example.jay.budgetapp.models;

import java.io.Serializable;
import java.util.Date;

public class Expense implements Serializable {

   private double amount;
   private String name;
   private Date date;


   public Expense(){
      amount = 0;
      name = "";
      date = null;
   }

   public Expense(double amount){
      this.amount = amount;
   }

   public double getAmount(){
      return amount;
   }

   public String getName(){
      return name;
   }

   public Date getDate(){
      return date;
   }

}
