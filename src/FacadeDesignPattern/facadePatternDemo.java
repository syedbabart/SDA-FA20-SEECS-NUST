package FacadeDesignPattern;

public class facadePatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeMaker shapeMaker = new ShapeMaker();

		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}
}

class ShapeMaker {
	   private Shape circle;
	   private Shape rectangle;
	   private Shape square;

	   public ShapeMaker() {
	      circle = new Circle();
	      rectangle = new Rectangle();
	      square = new Square();
	   }
	   public void drawCircle(){
	      circle.draw();
	   }
	   public void drawRectangle(){
	      rectangle.draw();
	   }
	   public void drawSquare(){
	      square.draw();
	   }
	}

class Circle implements Shape {

	   @Override
	   public void draw() {
	      System.out.println("Circle::draw()");
	   }
	}

class Square implements Shape {

	   @Override
	   public void draw() {
	      System.out.println("Square::draw()");
	   }
	}

class Rectangle implements Shape {

	   @Override
	   public void draw() {
	      System.out.println("Rectangle::draw()");
	   }
	}

interface Shape {
	   void draw();
	}