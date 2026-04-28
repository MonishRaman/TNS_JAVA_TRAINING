package org.tnsif.capgemini.c2tc.LambdaExpressions;

interface Drawablee{  
    public void draw();  
}  
class test implements Drawablee {
	int width =10;
	public void draw()
	{
		System.out.println("Drawing Width: "+width);
	}  
};

public class withoutLambdaExp {

	public static void main(String[] args) {    
        //without lambda, Drawable implementation using test class  
    	Drawablee d = new test();
        d.draw();  
    }

}
