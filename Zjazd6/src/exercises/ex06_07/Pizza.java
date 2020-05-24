package exercises.ex06_07;

/*
    
    Author: Karol Kuchnio   
 */public class Pizza implements Comparable {
     private double calories;
     private String name;
     private double price;

    public Pizza(double calories, String name, double price) {
        this.calories = calories;
        this.name = name;
        this.price = price;
    }

    public double getCalories() {
        return calories;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Object o) {
        return new Double(price).compareTo(((Pizza)o).getPrice());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pizza{");
        sb.append("calories=").append(calories);
        sb.append(", name='").append(name).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
