package brainatwork.pattern.creational.factorypattern;

public class Main {
	public static void main(String[] args) {
	      ShapeFactory shapeFactory = new ShapeFactory();

	      //get an object of Circle and call its draw method.
	      Shape shape1 = shapeFactory.getShape("CIRCLE");

	      //call draw method of Circle
	      shape1.draw();

	      //get an object of Square and call its draw method.
	      Shape shape2 = shapeFactory.getShape("SQUARE");

	      //call draw method of circle
	      shape2.draw();
	   }
}
