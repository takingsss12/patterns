package brainatwork.pattern.creational.factorypattern;

public class ShapeFactory {
	
	   //use getShape method to get object of type shape 
	   public Shape getShape(String shapeType){
		   if ("CIRCLE".equalsIgnoreCase(shapeType))
		   {
			   return new Circle();
		   }
		   
		   if ("SQUARE".equalsIgnoreCase(shapeType))
		   {
			   return new Square();
		   }
		   
		   return null;
	   }
	}
