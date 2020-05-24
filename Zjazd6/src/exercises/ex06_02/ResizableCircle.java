package exercises.ex06_02;

/*
    Ex.06_02
    Author: Karol Kuchnio   
 */
public class ResizableCircle extends Circle implements Resizable {

     public ResizableCircle(double radius) {
        super(radius);
    }
    @Override
    public void resize(int percent) {
        radius *= percent / 100.0;
    }
}
