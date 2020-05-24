package exercises.ex06_03;

/*
    Ex06_03
    Author: Karol Kuchnio   
 */
public abstract class Insurance {
    public String typeOfInsurance;
    public double monthlyPrice;

    public Insurance(){

    }
    public Insurance(String typeOfInsurance) {
        this.typeOfInsurance = typeOfInsurance;
    }

    public abstract void setCost();

    public abstract void display();

    public String getTypeOfInsurance() {
        return typeOfInsurance;
    }

    public double getMonthlyPrice() {
        return monthlyPrice;
    }
}
