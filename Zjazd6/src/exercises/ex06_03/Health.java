package exercises.ex06_03;

/*
      Ex. 06_03
    Author: Karol Kuchnio   
 */
public class Health extends Insurance {

    public Health(){
        typeOfInsurance ="Health";
        this.setCost();
    }
    @Override
    public void setCost() {
        monthlyPrice = 196;
    }

    @Override
    public void display() {
        System.out.printf("Type of insurance : %s\nMonthly " +
                "cost is : %.2f\n", getTypeOfInsurance(), getMonthlyPrice());
    }
}
