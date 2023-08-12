package colors;

import interfaces.Color;

// Implementação dos Objetos (interfaces.Color)
public class Blue implements Color {
    @Override
    public void Fill() {
        System.out.println("Inside Classes.Blue::fill() method.");
    }
}