package com.edu1;
import com.edu2.Parent;

class Child extends Parent{ //dependent class
	
	void display() {
		//System.out.println("sal ="+sal); //private not accesseble
		System.out.println("Name="+name); //another extended class only public and protected 
		                                  //can be accessed
		System.out.println("age="+age);
		//System.out.println("accno="+accno);//default becomes private to another package
	}
}
public class MainApp1
{  //independent  class
	public static void main(String[] args) {
		Child ob=new Child();
		ob.input();
		ob.display();
		ob.printSal();
		
		//independent class
		Parent ob1=new Parent();
		//System.out.println("sal ="+sal); //private not accesseble
		System.out.println("Name="+ob1.name); 
//another extended class only public and protected can be accessed
//System.out.println("age="+ob1.age);
//protected data cannot be accessed from another package
				                                     
				
}
}


