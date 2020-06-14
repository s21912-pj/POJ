package Ex_07_01;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/*
    
    Author: Karol Kuchnio   
 */public class UATicketServiceImpl implements UATicketService {
    @Override
    public List<UATicketDetailsInfo> getTicketInfo(String from, String to, LocalDateTime when) {
        Random generator = new Random();
        int tickeNumber = generator.nextInt((7 - 2) + 2) + 4;
        List<UATicketDetailsInfo> result = new ArrayList<UATicketDetailsInfo>();
        for (int i = 0; i < tickeNumber; i++) {
            UATicketDetailsInfo ticket = new UATicketDetailsInfo();
            ticket.price = generator.nextInt((1000 - 100) + 1) + 100;
            ticket.dateTime = when;
            ticket.from = from;
            ticket.to = to;
            result.add(ticket);
        }
        return result;
    }

}
