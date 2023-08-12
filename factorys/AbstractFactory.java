package factorys;

import interfaces.*;

// Interface do Abstract Factory
public abstract class AbstractFactory {
    abstract Color GetColor(String color);
    abstract Shape GetShape(String shape);
}
