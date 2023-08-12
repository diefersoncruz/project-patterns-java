
public class VegetableMeal extends MealBuilder {
    @Override
    public Meal prepareMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }
}
