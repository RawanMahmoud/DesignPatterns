public class CustomerSimulate {

    public static void main(String[] args){

        PizzaStore store= new NYPizzaStore();
        Pizza pizza = store.orderPizza("clams");
        System.out.println(pizza.getName());
        System.out.println(pizza.getDough().getDoughName());
        System.out.println(pizza.getSauce().getSauceName());
        System.out.println(pizza.getCheese().getCheeseName());
        System.out.println(pizza.getClams().getClamName());
        for (Veggies topping : pizza.getVegetables()){
            System.out.println(topping.getVegetableName());
        }

        store= new ChicagoPizzaStore();
        pizza = store.orderPizza("cheese");
        System.out.println(pizza.getName());
        System.out.println(pizza.getDough().getDoughName());
        System.out.println(pizza.getSauce().getSauceName());
        System.out.println(pizza.getCheese().getCheeseName());


    }
}
