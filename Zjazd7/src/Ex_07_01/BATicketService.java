package Ex_07_01;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

/*
    
    Author: Karol Kuchnio   
 */public interface BATicketService {
    List<BATicketDetails> getTicketInfo(Airport from, Airport to, LocalDateTime when);
}
