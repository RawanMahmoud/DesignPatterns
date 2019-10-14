public class ClamPizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory factory){
        this.ingredientFactory = factory;
    }

    void prepare() {
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        clams = ingredientFactory.createClam();
        cheese = ingredientFactory.createCheese();
        veggies = ingredientFactory.createVegetables();
    }



}
