package exercises.ex06_08;

/*
    
    Author: Karol Kuchnio   
 */
public class ThrowUsedCarException {
    public static void main(String[] args) throws UsedCarException {
        final int MAXCARS = 7;
        UsedCar[] arr = new UsedCar[MAXCARS];
        try {
            arr[0] = new UsedCar(2001, 4000, 2001, "Ford", "9944");
            arr[1] = new UsedCar(1991, 6000, 2001, "Chrysler", "9986444");
            arr[2] = new UsedCar(2001, 14000, 2001, "Astron Martin", "998");
            //  carArray[6] = new UsedCar("12345", "Chrysler", 2006, 4234, 5255);

        } catch (UsedCarException e) {
            System.out.println(e.getMessage());
        }


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i].toString() + "is valid car");
            }

        }
    }
}