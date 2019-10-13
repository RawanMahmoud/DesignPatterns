public class NYPizzaStore extends PizzaStore {
    protected Pizza createPizza(String... type_list) {
        Pizza pizza = null;
        String type;

        if(type_list.length > 0) {
            type = type_list[0];
        } else {
            type = "cheese";
        }

        if(type == "pepperoni") {
            pizza = new NYStylePepperoniPizza();
        }else if(type == "clam") {
            pizza = new NYStyleClamPizza();
        }else if(type == "veggie") {
            pizza = new NYStyleVeggiePizza();
        } else {
            pizza = new NYStyleCheesePizza();
        }
        return pizza;
    }
}
