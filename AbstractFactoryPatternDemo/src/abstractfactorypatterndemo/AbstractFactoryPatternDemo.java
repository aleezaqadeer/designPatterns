/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactorypatterndemo;

/**
 *
 * @author sp21-bse-033
 */
public class AbstractFactoryPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //get shape factory
      AbstractFactory shapeFactory = FactoryProducer.getFactory("Simple");
      //get an object of Shape Rectangle
      Shape shape1 = shapeFactory.getShape("RECTANGLE");
      //call draw method of Shape Rectangle
      shape1.draw();
      //get an object of Shape Square 
      Shape shape2 = shapeFactory.getShape("SQUARE");
      //call draw method of Shape Square
      shape2.draw();
      Shape shape7 = shapeFactory.getShape("TRIANGLE");
      //call draw method of Shape Square
      shape7.draw();
      //get shape factory
      AbstractFactory shapeFactory1 = FactoryProducer.getFactory("Rounded");
      //get an object of Shape Rectangle
      Shape shape3 = shapeFactory1.getShape("RECTANGLE");
      //call draw method of Shape Rectangle
      shape3.draw();
      //get an object of Shape Square 
      Shape shape4 = shapeFactory1.getShape("SQUARE");
      //call draw method of Shape Square
      shape4.draw();
      Shape shape8 = shapeFactory1.getShape("TRIANGLE");
      //call draw method of Shape Square
      shape8.draw();
      AbstractFactory shapeFactory2 = FactoryProducer.getFactory("");
      //get an object of Shape Rectangle
      Shape shape5 = shapeFactory2.getShape("RECTANGLE");
      //call draw method of Shape Rectangle
      shape5.draw();
      //get an object of Shape Square 
      Shape shape6 = shapeFactory2.getShape("SQUARE");
      //call draw method of Shape Square
      shape6.draw();
      Shape shape9 = shapeFactory2.getShape("TRIANGLE");
      //call draw method of Shape Square
      shape9.draw();
    }
    
}
