public class DrawingApp {
    public static void main(String[] args) {
        // Criar um círculo vermelho
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        redCircle.draw();

        // Criar um círculo verde
        Shape greenCircle = new Circle(50, 50, 5, new GreenCircle());
        greenCircle.draw();
    }
}
