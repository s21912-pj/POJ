package Ex_07_01;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

/*
    
    Author: Karol Kuchnio   
 */public class Main {

     public static void main(String args[]){
         TicketAdapter ticketAdapter = new TicketAdapter();

             List<TicketDetails> tickets = ticketAdapter.getAllTicketInfo("GDX123", "LUX123", LocalDateTime.now());
             tickets.forEach(x-> {
                 System.out.println(x.airlineName + ",price: " + x.price + ",date: " + x.dateTime);
             });

     }
}
