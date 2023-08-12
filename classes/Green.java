package classes;

import interfaces.Color;

// Implementação dos Objetos (interfaces.Color)
public class Green implements Color {
    @Override
    public void Fill() {
        System.out.println("Inside Classes.Green::fill() method.");
    }
}