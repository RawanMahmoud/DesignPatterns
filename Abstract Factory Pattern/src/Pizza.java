public abstract class Pizza {

    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Pepperoni pepperoni;
    Cheese cheese;
    Clams clams;

    public void bake(){
        System.out.println("Baking for 25 minutes");
    }
    public void cut(){
        System.out.println("Cutting the pizza");
    }
    public void box(){
        System.out.println("Boxing the pizza");
    }

    public Dough getDough() {
        return dough;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public String getName() {
        return name;
    }

    public Veggies[] getVegetables(){
        return veggies;
    }

    public Pepperoni getPepperoni() {
        return pepperoni;
    }

    public Cheese getCheese() {
        return cheese;
    }

    public Clams getClams() {
        return clams;
    }

    public void setName(String newName) {
        name = newName;
    }

    abstract void prepare();
}

