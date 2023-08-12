package factorys;

import colors.*;
import interfaces.*;

// Implementação da Factory (interfaces.Color)
public class ColorFactory extends AbstractFactory {
    @Override
    Color GetColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }
    @Override
    Shape GetShape(String shape) {
        return null;
    }
}
