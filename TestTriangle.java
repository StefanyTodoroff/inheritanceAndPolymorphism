package edu.smg;

import java.util.Scanner;

public class TestTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input side a of a triangle");
		double a = sc.nextDouble();
		System.out.println("Input side b of a triangle");
		double b = sc.nextDouble();
		System.out.println("Input side c of a triangle");
		double c = sc.nextDouble(); 
		
		sc.nextLine();
		System.out.println("Input color of a triangle");
		String color = sc.nextLine();
		System.out.println("Input if a triangle is filled (true/false");
		boolean isFilled = sc.nextBoolean();
		
		
		
		Triangle triangle = new Triangle(a, b, c);
		triangle.setColor(color);
		triangle.setFilled(isFilled);
		System.out.println(triangle.triangleDescription() + "\n" + "Area is:" + triangle.getArea() + " Perimeter is:"  + triangle.getPerimeter() + "\n" + triangle.toString());
	
	}

}
