package decoratorDesignPattern;

public class DynamicDecoratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle(10);
		System.out.println(circle.info());
		
		ColoredShape blueSquare = new ColoredShape(new Square(20), "blue");
		System.out.println(blueSquare.info());
	}
}

class rightAngledTriangle implements Shape{
	private float side; 
	public rightAngledTriangle(float side) {
		this.side = side;
	}
	 public int Angle() {
		 return 90;
	 }
	 public String info() {
		 return "Shape with all sides of lenght " + side;
	 }
}
class ColoredShape implements Shape{

	private Shape shape;
	private String color;
	public ColoredShape(Shape shape, String color) {
		this.color = color;
		this.shape = shape;
	}
	
	@Override
	public String info() {
		// TODO Auto-generated method stub
		return shape.info() + " has color: " + color;
	}
	
	
}
class Square implements Shape{
	private float side;
	public Square(float side) {
		this.side = side;
	}
	public float areaSquare() {
		return side * side;
	}
	public String info() {
		// TODO Auto-generated method stub
		return "a square with side :" + side;
	}
	
}

class Circle implements Shape {
	private float radius;
	public Circle(int radius) {
		this.radius = radius;
	}
	public void resize(float factor) {
		radius *= factor;
	}

	public String info() {
		// TODO Auto-generated method stub
		return "a circle with radius " + radius;
	}
}

interface Shape{
	String info();
}