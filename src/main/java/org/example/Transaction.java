package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Transaction {
    Map<String,Integer> transactions = new HashMap<>();

   public Transaction(){
       transactions.put("Balance", 1);
       transactions.put("Withdraw", 2);
       transactions.put("Deposit", 3);

   }

public Map<String,Integer> getTransactions(){
       return transactions;
}

   public List<String> getLoopedTransactions(){
       List<String> result = new ArrayList<>();
       transactions.forEach((key,value)-> {
               String transactionDetail = "Transaction Type " + key + "|" +  " Transaction Index " + value;
               result.add(transactionDetail);
               }
       );

       return result;

   }


}
