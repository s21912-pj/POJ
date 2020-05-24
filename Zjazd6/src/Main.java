import exercises.ex06_01.Movable;
import exercises.ex06_01.MovablePoint;
import exercises.ex06_01.MovableRectangle;

/*
    Some test chceck for created classes.
    Author: Karol Kuchnio   
 */
public class Main {
    private static Movable movable;
    public static void main(String[] args){

        //Ex 06_01
        movable = new MovablePoint(2,3,5,6);
        movable.moveLeft();
        movable.moveRight();
        System.out.println(movable.toString());
        movable = new MovableRectangle(3,2,5,6,7,1);
        movable.moveDown();
        movable.moveUp();
        System.out.println(movable.toString());

    }
}
