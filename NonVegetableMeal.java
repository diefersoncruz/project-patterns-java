// Implementação do Builder
public class NonVegetableMeal extends MealBuilder {
    @Override
    public Meal prepareMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
