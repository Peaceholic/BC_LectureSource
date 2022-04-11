import java.lang.Math;

public class TestShape
{
    //main method
    public static void main (String[] args)
    {
		Shape [] shape = new Shape[2];

		shape[0] = new Circle("원", 10);
		shape[1] = new Rectangular("직사각형", 10, 20);

		for(int i=0; i<shape.length; i++){
			shape[i].calculationArea();
			shape[i].print();
		}
		
    }//end of main  
}//end of class

abstract class Shape
{
	private double area;
	private String name;

	public Shape(){
	}

	public Shape(String name){
		this.area = area;
		this.name = name;
	}

	public double getArea(){
		return this.area;
	}

	public void setArea(double input){
		this.area = input;
	}

	public abstract void calculationArea();

	public void print(){
		System.out.println(name+" 의 면적은 "+area);	
	}
	
}//end of Shape

class Circle extends Shape
{
	private double radius;

	public Circle(String name, double radius){
		super(name);
		this.radius =radius;
		//System.out.println(name+", "+radius);
	}

	public void calculationArea(){
		super.setArea(Math.PI*this.radius*this.radius);
	}	
}//end of Circle

class Rectangular extends Shape
{
	private double width;
	private double hight;

	public Rectangular(String name, double width, double hight){
		super(name);
		this.width =width;
		this.hight =hight;
		//System.out.println(name+", "+width+", "+hight);
	}

	public void calculationArea(){
		super.setArea(this.width*this.hight);	
	}
	
}//end of Rectangular