package exercises.ex06_05;

/*
    
    Author: Karol Kuchnio   
 */
public class DemoTurners2 {
    public static void main(String[] args) {
        Turner turner;
        turner = new Gear();
        turner.turn();
        turner = new FeatureToggle();
        turner.turn();
    }

}
