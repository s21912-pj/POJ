package exercises.ex06_07;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
    
    Author: Karol Kuchnio   
 */public class PizzaDemo {

     public static void main(String[] args){
         ArrayList<Pizza> pizzas = new ArrayList<>();
         pizzas.add(new PizzaDeluxe(460,"Dex",15));
         pizzas.add(new PizzaSpecial(560,"Spec",12));
         pizzas.add(new PizzaWoogy(800,"Gec",18));
         pizzas.add(new PizzaDeluxe(700,"Ec",19));
         pizzas.add(new PizzaDeluxe(700,"Ecx",21));
         pizzas.add(new PizzaDeluxe(460,"Maris",15));
         pizzas.add(new PizzaSpecial(560,"Xosa",11));
         pizzas.add(new PizzaWoogy(800,"Gecxxs",21));
         pizzas.add(new PizzaDeluxe(700,"Ecxxl",13));
         pizzas.add(new PizzaDeluxe(700,"EcxLos",21));
         pizzas.add(new PizzaDeluxe(460,"Dex",15));
         pizzas.add(new PizzaSpecial(560,"Spec12",12));
         pizzas.add(new PizzaWoogy(800,"Gec22",18));
         pizzas.add(new PizzaDeluxe(700,"Ec22",19));
         pizzas.add(new PizzaDeluxe(700,"Ecx3",21));
         pizzas.add(new PizzaDeluxe(460,"Covas",16));
         pizzas.add(new PizzaSpecial(560,"Robson",17));
         pizzas.add(new PizzaWoogy(800,"Boiled",22));
         pizzas.add(new PizzaDeluxe(700,"Zasa",12));
         pizzas.add(new PizzaDeluxe(700,"Bobo",31));
         pizzas.add(new PizzaDeluxe(460,"Dex",15));
         pizzas.add(new PizzaSpecial(560,"Spec12",32));
         pizzas.add(new PizzaWoogy(800,"Gec",12));
         pizzas.add(new PizzaDeluxe(777,"Ecxa",22));
         pizzas.add(new PizzaDeluxe(700,"Opens",21));
         pizzas.add(new PizzaDeluxe(460,"Marisib",15));
         pizzas.add(new PizzaSpecial(560,"Xoxo",14));
         pizzas.add(new PizzaWoogy(800,"Gors",21));
         pizzas.add(new PizzaDeluxe(700,"Ecxxsl",13));
         pizzas.add(new PizzaDeluxe(700,"Ebnemes",34));
         pizzas.add(new PizzaDeluxe(652,"Dex",15));
         pizzas.add(new PizzaSpecial(560,"Spec14",12));
         pizzas.add(new PizzaWoogy(900,"Barson",19));
         pizzas.add(new PizzaDeluxe(456,"Ec22",19));
         pizzas.add(new PizzaDeluxe(700,"Ecx3",21));
         pizzas.add(new PizzaDeluxe(333,"Covasss1",34));
         pizzas.add(new PizzaSpecial(1200,"Robson",41));
         pizzas.add(new PizzaWoogy(800,"Eggs",34));
         pizzas.add(new PizzaDeluxe(700,"Zasa",12));
         pizzas.add(new PizzaDeluxe(700,"Bobo",31));
         Collections.sort(pizzas);
         pizzas.forEach(x->{
             System.out.println(x.toString());
         });
     }
}
