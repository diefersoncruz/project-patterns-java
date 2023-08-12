// Implementação do Cliente
public class Cooker {
    public void DoAsked(String mealType) {
        if (mealType == "Vegetal"){
            builder = new VegetableMeal();
        }
        if (mealType == "NonVegetal"){
            builder = new VegetableMeal();
        }
        Meal meal = builder.prepareMeal();
        System.out.println(mealType);
        meal.showItems();
        System.out.println("Total Cost: " + meal.getCost());
    }
    private
    MealBuilder builder;
}
