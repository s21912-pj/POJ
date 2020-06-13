package Ex_07_01;

import java.time.LocalDateTime;

/*
    
    Author: Karol Kuchnio   
 */public class TicketDetails {
    LocalDateTime dateTime;
    double price;
    String airlineName;
    String[] args;

    public TicketDetails(LocalDateTime dateTime, double price, String airlineName, String... arg)
    {  this.dateTime = dateTime;
        this.price = price;
        this.airlineName = airlineName;
        this.args = arg;
    }

    public static TicketDetails TicketInfo(BATicketDetails baTicketDetails){
        return new TicketDetails(baTicketDetails.departureTime,
                                                    baTicketDetails.ticketPrice,"British Airways",new String[0]);
    }

    public static TicketDetails TicketInfo(UATicketDetailsInfo uaTicketDetailsInfo){
        return new TicketDetails(uaTicketDetailsInfo.dateTime,uaTicketDetailsInfo.price,"United Airways",
                                                                        uaTicketDetailsInfo.from,uaTicketDetailsInfo.to);
    }
}
