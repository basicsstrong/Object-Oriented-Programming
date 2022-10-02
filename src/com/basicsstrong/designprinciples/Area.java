package com.basicsstrong.designprinciples;
abstract class shape{
	abstract public void calculateArea();
}
class Rectangle extends shape{
	double height;
	double width;
	
	 public Rectangle(double h, double w) {
		 this.height = h;
		 this.width = w;
	 }

	@Override
	public void calculateArea() {
		System.out.println("r.height * r.width");
		
	}
}

class Circle extends shape{
	double radius;
	public Circle(double r) {
		this.radius = r;
	}
	@Override
	public void calculateArea() {
		System.out.println(3.14 * radius * radius);
		
	}
}

class Triangle extends shape{
	double base;
	double height;
	public Triangle(double b, double h) {
		this.base = b;
		this.height = h;
	}
	@Override
	public void calculateArea() {
System.out.println(0.5 * base * height);		
	}
}
class AreaCalculator{
	public void calculate(Shape shape) {
		shape.calculateArea();
	}
}

public class Area {

	public static void main(String[] args) {
		AreaCalculator cal = new AreaCalculator();
		cal.calculate(new Rectangle(20, 10));
		cal.calculate(new Triangle(10,5));
		cal.calculate(new Circle(10));
		

	}
}






