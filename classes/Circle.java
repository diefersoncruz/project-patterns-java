package classes;

import interfaces.Shape;

// Implementação dos Objetos (interfaces.Shape)
public class Circle implements Shape {
    @Override
    public void Draw() {
        System.out.println("Inside Classes.Circle::draw() method.");
    }
}