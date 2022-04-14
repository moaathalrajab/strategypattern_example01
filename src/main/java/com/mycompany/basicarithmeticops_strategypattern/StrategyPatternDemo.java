package com.mycompany.basicarithmeticops_strategypattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class StrategyPatternDemo {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		  System.out.print("Enter the first value: ");
		  float value1=Float.parseFloat(br.readLine());
		  System.out.print("Enter the second value: ");
		  float value2=Float.parseFloat(br.readLine());
	      		
	      System.out.println("Addition = " + new Context(new Addition()).executeStrategy(value1, value2));

              
	      System.out.println("Subtraction = " + new Context(new Subtraction()).executeStrategy(value1, value2));

	
	      System.out.println("Multiplication = " + new Context(new Multiplication()).executeStrategy(value1, value2));
	   }

}
