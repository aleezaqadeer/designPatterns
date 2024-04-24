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
public class FactoryProducer {
   public static AbstractFactory getFactory(String style){   
      if(style=="Rounded"){
         return new RoundedShapeFactory();         
      }else if(style=="Simple"){
         return new ShapeFactory();
      }else{
          return new DoubleBorderedShapeFactory();
      }
   }
}