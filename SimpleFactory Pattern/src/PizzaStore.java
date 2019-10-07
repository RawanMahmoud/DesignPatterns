public class PizzaStore {

    PizzaFactory factory;
    PizzaStore(PizzaFactory factory){
        this.factory = factory;
    }

    Pizza orderPizza(String type){
        Pizza pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
