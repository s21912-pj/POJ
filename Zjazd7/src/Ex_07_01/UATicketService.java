package Ex_07_01;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

/*
    
    Author: Karol Kuchnio   
 */
public interface UATicketService {
    List<UATicketDetailsInfo> getTicketInfo(String from, String to, LocalDateTime when);
}
