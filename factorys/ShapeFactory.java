package factorys;

import shapes.*;
import interfaces.*;

// Implementação da Factory (interfaces.Shape)
public class ShapeFactory extends AbstractFactory {
    @Override
    Color GetColor(String color) {
        return null;
    }
    @Override
    Shape GetShape(String shapeType) {
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Rectangle.Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
