package org.tnsif.capgemini.c2tc.LambdaExpressions;

@FunctionalInterface    
interface Drawable{  
    public void draw();  
} 

public class withLamdaExp {

	public static void main(String[] args) {  
        int width=10;    
        //with lambda  
        Drawable d2=()->{  
            System.out.println("Drawing Width: "+width);  
        };  
        d2.draw();  
    }

}
