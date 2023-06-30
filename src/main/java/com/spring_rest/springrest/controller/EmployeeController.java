package com.spring_rest.springrest.controller;
import org.springframework.web.bind.annotation.RestController;

import com.spring_rest.springrest.model.Employee;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
@RestController
public class EmployeeController {
	 Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
   @GetMapping("/FetchNextNumber")
   public String getEmployee(@RequestBody Employee x) throws InterruptedException {
	   Integer  t = x. CategoryCode;
	   Thread.sleep(5000);
	   if(t==0) {
		   return "oldvalue" + " "+t+  " " +"newvalue"+ " " +0;
	   }
	   for (Entry<Integer, Integer> me :
           mp.entrySet()) {
		   if(me.getKey() == t) {
			   return "oldvalue" + " "+t+  " " +"newvalue"+ " " +me.getValue();
		   }

		   
	   }
	   Integer y = t;
	   Integer sum  = 0;
	   while(y!=0) {
		   sum+=y%10;
		   y/=10;
	   }
	   Integer t1  = t+1;
	   while(digitSum(t1)!=t) {
		   t1+=1;
	   }
	   mp.put(t, t1);
	   return "oldvalue" + " "+t+  " " +"newvalue"+ " " + t1;
	   
	   
   }
   private int digitSum(int number) {
      
       int sum = 0;
       while (number != 0) {
           sum += number % 10;
           number /= 10;
       }
       return sum;
   }

   
}
