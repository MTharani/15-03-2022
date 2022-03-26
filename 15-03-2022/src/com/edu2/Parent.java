package com.edu2;

import java.util.Scanner;

public class Parent 
{
	private int sal; //data accessed with in class , scope is with in class
	public String name;
	protected int age;
	int accno;
 public void input() 
 {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age");
		age=sc.nextInt();
		System.out.println("Enter salary");
		sal=sc.nextInt();
		System.out.println("Enter Accno");
		accno=sc.nextInt();
		System.out.println("Enter name");
		name=sc.next();
		sc.close();
	}
public void printSal() 
	{
		System.out.println("Salary="+sal);
	}
}




//private->data accessed with in class , scope is with in class
//public->with in package and outside package all the classes can access
//protected ->extended class can access without object ref
           //within package other classes can access with ref to object
           //another package only extended class can access
//default ->scope with in package all the classes  can access (public)
          //another package default becomes private
