package com.homework;

/*
    Just to check created model classes.
    Author: Karol Kuchnio
 */
public class Main {
    //Things to check
    public static void main(String[] args) {
        //Account class model
        Account acc1 = new Account("1", "Marlon", 30000);
        Account acc2 = new Account("2", "Barsyn", 45000);
        System.out.println(acc1.credit(10000));
        System.out.println(acc1.debit(1000));
        System.out.println(acc1.debit(15000));
        System.out.println(acc1.transferTo(acc2, 3500));
        System.out.println(acc2.getBalance());
        System.out.println(acc1.toString());
        System.out.println(acc2.toString());

        //Date class model
        Date date = new Date(21, 02, 1896);
        System.out.println(date.toString());

        //Time class model
        Time myTime = new Time(15, 59, 59);
        System.out.println(myTime.toString());
        System.out.println(myTime.nextSecond());
        System.out.println(myTime.previousSecond().previousSecond().previousSecond());

        //Employee class model
        Employee myData = new Employee(1, "Adam", "Norwid", 8000);
        System.out.println(myData.getAnnualSalary());
        System.out.println(myData.raiseSalary(25));
        System.out.println(myData.toString());

        //Invoice class model
        InvoiceItem item = new InvoiceItem("1", "Iphone X", 10, 3600.00);
        System.out.println(item.getTotal());
        System.out.println(item.toString());

    }
}
