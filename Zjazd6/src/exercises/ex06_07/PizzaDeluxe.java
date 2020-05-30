package exercises.ex06_07;

/*
    
    Author: Karol Kuchnio   
 */public class PizzaDeluxe extends Pizza{

     private boolean isPizzaVege;
     private boolean isPizzaPromo;
     private boolean isPizzaCrispy;

    public PizzaDeluxe(double calories, String name, double price) {
        super(calories, name, price);
    }

    public PizzaDeluxe(double calories, String name, double price, boolean isPizzaVege, boolean isPizzaPromo, boolean isPizzaCrispy) {
        super(calories, name, price);
        this.isPizzaVege = isPizzaVege;
        this.isPizzaPromo = isPizzaPromo;
        this.isPizzaCrispy = isPizzaCrispy;
    }

    public boolean isPizzaVege() {
        return isPizzaVege;
    }

    public void setPizzaVege(boolean pizzaVege) {
        isPizzaVege = pizzaVege;
    }

    public boolean isPizzaPromo() {
        return isPizzaPromo;
    }

    public void setPizzaPromo(boolean pizzaPromo) {
        isPizzaPromo = pizzaPromo;
    }

    public boolean isPizzaCrispy() {
        return isPizzaCrispy;
    }

    public void setPizzaCrispy(boolean pizzaCrispy) {
        isPizzaCrispy = pizzaCrispy;
    }
}
