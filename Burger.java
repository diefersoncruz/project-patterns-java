import interfaces.Item;
import interfaces.Packing;
// Implementação dos Objetos
public abstract class Burger implements Item {
    @Override
    public abstract String name();
    @Override
    public Packing packing() {
        return new Wrapper();
    }
    @Override
    public abstract float price();
}
