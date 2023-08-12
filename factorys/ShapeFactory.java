package factorys;

import interfaces.Color;
import interfaces.Shape;
import classes.*;

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
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
