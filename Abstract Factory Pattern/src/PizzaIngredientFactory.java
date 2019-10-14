public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVegetables();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
