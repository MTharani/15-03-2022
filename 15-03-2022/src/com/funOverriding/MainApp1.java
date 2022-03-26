package com.funOverriding;
class parent
{
	 void display()
	{
		System.out.println("parent class");
	}
}
class Child extends parent
{
	 void display()
	{
		super.display();
		System.out.println("child class");
		
	}
}

public class MainApp1
{
	public static void main(String[] args) 
	{
		Child ob=new Child();
		ob.display();
		
		
	}
  
  
}
