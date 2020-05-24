package exercises.ex06_05;

/*
    
    Author: Karol Kuchnio   
 */
public class DemoTurners {
    public static void main(String[] args){
        Turner turner;
        turner = new Leaf();
        turner.turn();
        turner = new Page();
        turner.turn();
        turner = new Pancake();
        turner.turn();
    }
}
