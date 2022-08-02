package Volumes;

import java.util.Scanner;


public class cuboid {
	double length;
	double width;
	double height;
	
	public cuboid(double length, double width, double height) {
		this.height=height;
		this.length=length;
		this.width=width;
	}
	public void setHeight(double height) {
		this.height=height;
	}
	public void setWidth(double width) {
		this.width=width;
	}
	public void setLength(double length) {
		this.length=length;
	}
	public double getLength() {
		return length;
	}
	public double getWidth() {
		return width;
	}
	public double getHeight() {
		return height;
	}
	public double getVolume() {
		return length*width*height;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("********************************");
		System.out.println("welcome to my volume calculator: ");
		System.out.println("********************************");
		System.out.println("what is the object whose volume you want to find");
		String object=scanner.nextLine();
		System.out.println(" ");
		System.out.println("calculating for a "+ object);
		System.out.print("please insert the length: ");
		double inputLength=scanner.nextDouble();
		System.out.println("********************************");
		System.out.print("please insert the height: ");
		double inputWidth=scanner.nextDouble();
		System.out.println("********************************");
		System.out.print("please input the height: ");
		System.out.println(" ");
		double inputHeight=scanner.nextDouble();
		
		cuboid cube=new cuboid(inputLength, inputWidth, inputHeight);
		double answer= cube.getVolume();
		System.out.println("the volume is : "+answer);
		System.out.println("********************************");
		
	}

}
