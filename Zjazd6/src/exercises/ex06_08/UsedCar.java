package exercises.ex06_08;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/*
    
    Author: Karol Kuchnio   
 */public class UsedCar {
    private List<String> listCars;
    private int year;
    private double price;
    private double mileage;
    private String make;
    private String vin;

    public UsedCar(int year, double price, double mileage, String make, String vin) throws UsedCarException {
        listCars = Arrays.asList("Ford","Honda","Toyota","Chrysler","Other");
        Check(listCars,year,price,mileage,make,vin);
        this.year = year;
        this.price = price;
        this.mileage = mileage;
        this.make = make;
        this.vin = vin;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    private static void Check(List<String> listCars,int year, double price, double mileage, String make, String vin) throws UsedCarException {
        if (vin.length() != 4) {
            throw new UsedCarException("VIN is invalid");
        }
        if (!listCars.contains(make)) {
            throw new UsedCarException("Make is invalid");
        }
        if (year < 1997 || year > 2017) {
            throw new UsedCarException("Year is invalid");
        }
        if (mileage < 0) {
            throw new UsedCarException("Mileage is invalid");
        }
        if (price < 0) {
            throw new UsedCarException("Price is invalid");
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UsedCar{");
        sb.append("year=").append(year);
        sb.append(", price=").append(price);
        sb.append(", mileage=").append(mileage);
        sb.append(", make='").append(make).append('\'');
        sb.append(", vin='").append(vin).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
