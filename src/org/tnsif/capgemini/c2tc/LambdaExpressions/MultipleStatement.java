package org.tnsif.capgemini.c2tc.LambdaExpressions;

@FunctionalInterface  
interface Sayable1{  
    String say(String message);  
} 

public class MultipleStatement {

	public static void main(String[] args) {     
        // You can pass multiple statements in lambda expression  
        Sayable1 person = (message)-> {  
            String str1 = "I would like to say, ";  
            String str2 = str1 + message;   
            return str2;  
        };  
            System.out.println(person.say("time is precious."));  
    }  
}
