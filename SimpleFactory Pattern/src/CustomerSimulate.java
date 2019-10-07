public class CustomerSimulate {
    public static void main(String[] args){
        PizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store= new PizzaStore(factory);
        Pizza pizza = store.orderPizza("cheese");
        System.out.println(pizza);

        PizzaFactory factory1 = new RandomOnePizzaFactory();
        PizzaStore store1= new PizzaStore(factory1);
        Pizza pizza1 = store1.orderPizza("cheese");
        System.out.println(pizza1);

        PizzaFactory factory2 = new RandomTwoPizzaFactory();
        PizzaStore store2= new PizzaStore(factory2);
        Pizza pizza2 = store2.orderPizza("cheese");
        System.out.println(pizza2);
    }
}
