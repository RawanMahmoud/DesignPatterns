public class ChicagoPizzaStore extends PizzaStore {
    protected Pizza createPizza(String... type_list) {
        Pizza pizza = null;
        String type;

        if(type_list.length > 0) {
            type = type_list[0];
        } else {
            type = "cheese";
        }

        if(type == "pepperoni") {
            pizza = new ChicagoStylePepperoniPizza();
        }else if(type == "clam") {
            pizza = new ChicagoStyleClamPizza();
        }else if(type == "veggie") {
            pizza = new ChicagoStyleVeggiePizza();
        } else {
            pizza = new ChicagoStyleCheesePizza();
        }
        return pizza;
    }
}
