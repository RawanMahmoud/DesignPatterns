import java.util.Random;

public class RandomOnePizzaFactory implements PizzaFactory {
    public Pizza createPizza(String ... type){
        Random rand= new Random();
        int r = rand.nextInt(11);
        Pizza pizza = null;
        if(r==0)
            pizza=new CheesePizza();
        else if (r==1)
            pizza= new PepperoniPizza();
        else
            pizza=new VeggiePizza();

        return pizza;
    }
}
