package shapes;

import interfaces.Shape;

public class Square implements Shape {
    @Override
    public void Draw() {
        System.out.println("Inside Classes.Square::draw() method.");
    }
}
