public class CustomerSimulate {
    public static void main(String[] args){
        PizzaStore store = new NYPizzaStore();
        Pizza pizza = store.orderPizza("cheese");
        System.out.println(pizza);

        store = new ChicagoPizzaStore();
        pizza = store.orderPizza("clam");
        System.out.println(pizza);
    }
}
