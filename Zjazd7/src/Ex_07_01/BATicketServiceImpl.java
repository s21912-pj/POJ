package Ex_07_01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/*
    
    Author: Karol Kuchnio   
 */
public class BATicketServiceImpl implements BATicketService {
    @Override
    public List<BATicketDetails> getTicketInfo(Airport from, Airport to, LocalDateTime when) {
        Random generator = new Random();
        int tickeNumber = generator.nextInt((7 - 2) + 2) + 4;
        List<BATicketDetails> result = new ArrayList<BATicketDetails>();
        for (int i = 0; i < tickeNumber; i++) {
            BATicketDetails ticket = new BATicketDetails();
            ticket.ticketPrice = generator.nextInt((1000 - 100) + 1) + 100;
            ticket.departureTime = when;
            result.add(ticket);
        }
        return result;
    }
}
