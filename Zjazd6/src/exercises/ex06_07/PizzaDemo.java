package exercises.ex06_07;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
    
    Author: Karol Kuchnio   
 */public class PizzaDemo {

     public static void main(String[] args){
         ArrayList<Pizza> pizzas = new ArrayList<>();
         pizzas.add(new PizzaDeluxe(460,"Dex",15,true,true,false));
         pizzas.add(new PizzaSpecial(560,"Spec",12,true,true,false));
         pizzas.add(new PizzaWoogy(800,"Gec",18,true,true,false));
         pizzas.add(new PizzaDeluxe(700,"Ec",19,true,true,false));
         pizzas.add(new PizzaDeluxe(700,"Ecx",21,true,true,false));
         pizzas.add(new PizzaDeluxe(460,"Maris",15,false,true,false));
         pizzas.add(new PizzaSpecial(560,"Xosa",11,false,true,false));
         pizzas.add(new PizzaWoogy(800,"Gecxxs",21,false,true,false));
         pizzas.add(new PizzaDeluxe(700,"Ecxxl",13,false,true,false));
         pizzas.add(new PizzaDeluxe(700,"EcxLos",21,false,true,false));
         pizzas.add(new PizzaDeluxe(460,"Dex",15,false,true,false));
         pizzas.add(new PizzaSpecial(560,"Spec12",12,false,true,false));
         pizzas.add(new PizzaWoogy(800,"Gec22",18,false,true,false));
         pizzas.add(new PizzaDeluxe(700,"Ec22",19,false,true,false));
         pizzas.add(new PizzaDeluxe(700,"Ecx3",21,false,true,false));
         pizzas.add(new PizzaDeluxe(460,"Covas",16,false,true,false));
         pizzas.add(new PizzaSpecial(560,"Robson",17,false,true,false));
         pizzas.add(new PizzaWoogy(800,"Boiled",22,false,true,false));
         pizzas.add(new PizzaDeluxe(700,"Zasa",12,false,true,false));
         pizzas.add(new PizzaDeluxe(700,"Bobo",31,true,true,true));
         pizzas.add(new PizzaDeluxe(460,"Dex",15,true,true,true));
         pizzas.add(new PizzaSpecial(560,"Spec12",32,true,true,true));
         pizzas.add(new PizzaWoogy(800,"Gec",12,true,true,true));
         pizzas.add(new PizzaDeluxe(777,"Ecxa",22,true,true,true));
         pizzas.add(new PizzaDeluxe(700,"Opens",21,true,true,true));
         pizzas.add(new PizzaDeluxe(460,"Marisib",15,true,true,true));
         pizzas.add(new PizzaSpecial(560,"Xoxo",14,true,true,true));
         pizzas.add(new PizzaWoogy(800,"Gors",21,true,true,true));
         pizzas.add(new PizzaDeluxe(700,"Ecxxsl",13,true,true,true));
         pizzas.add(new PizzaDeluxe(700,"Ebnemes",34,true,true,true));
         pizzas.add(new PizzaDeluxe(652,"Dex",15,true,true,true));
         pizzas.add(new PizzaSpecial(560,"Spec14",12,true,true,true));
         pizzas.add(new PizzaWoogy(900,"Barson",19,true,true,true));
         pizzas.add(new PizzaDeluxe(456,"Ec22",19,true,true,true));
         pizzas.add(new PizzaDeluxe(700,"Ecx3",21,true,true,true));
         pizzas.add(new PizzaDeluxe(333,"Covasss1",34,true,true,true));
         pizzas.add(new PizzaSpecial(1200,"Robson",41,true,true,true));
         pizzas.add(new PizzaWoogy(800,"Eggs",34,true,true,true));
         pizzas.add(new PizzaDeluxe(700,"Zasa",12,true,true,true));
         pizzas.add(new PizzaDeluxe(700,"Bobo",31,true,true,true));
         Collections.sort(pizzas);
         pizzas.forEach(x->{
             System.out.println(x.toString());
         });
     }
}
