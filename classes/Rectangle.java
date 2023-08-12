package classes;

import interfaces.Shape;

// Implementação dos Objetos (interfaces.Shape)
public class Rectangle implements Shape {
    @Override
    public void Draw() {
        System.out.println("Inside Classes.Rectangle::draw() method.");
    }
}