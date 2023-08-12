package classes;

import interfaces.Color;

public class Red implements Color {
    @Override
    public void Fill() {
        System.out.println("Inside Classes.Red::fill() method.");
    }
}
