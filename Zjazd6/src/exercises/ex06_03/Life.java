package exercises.ex06_03;

/*
    Ex. 06_03
    Author: Karol Kuchnio   
 */
public class Life extends Insurance{

    public Life(){
        typeOfInsurance = "Life";
        this.setCost();
    }

    @Override
    public void setCost() {
        monthlyPrice = 36;
    }

    @Override
    public void display() {
        System.out.printf("Type of insurance : %s\nMonthly " +
                "cost is : %.2f\n", getTypeOfInsurance(), getMonthlyPrice());
    }
}
