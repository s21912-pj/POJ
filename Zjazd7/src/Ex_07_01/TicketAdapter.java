package Ex_07_01;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
    
    Author: Karol Kuchnio   
 */
public class TicketAdapter implements BATicketService,UATicketService {

     UATicketService uaTicketService;
     BATicketService baTicketService;
     public TicketAdapter(){
         this.uaTicketService = new UATicketServiceImpl();
         this.baTicketService = new BATicketServiceImpl();
     }

    public List<TicketDetails> getAllTicketInfo(String from, String to, LocalDateTime when){
        List<TicketDetails> result = new ArrayList<TicketDetails>();
        getTicketInfo(from, to, when).forEach(x->result.add(TicketDetails.TicketInfo(x)));
        Airport airportFrom = AirportMapper.mapAirportByString(from);
        Airport airportTo = AirportMapper.mapAirportByString(to);
        getTicketInfo(airportFrom, airportTo, when).forEach(x->result.add(TicketDetails.TicketInfo(x)));
        return result;
    }


    @Override
    public List<UATicketDetailsInfo> getTicketInfo(String from, String to, LocalDateTime when){
         return uaTicketService.getTicketInfo(from,to,when);
    }

    @Override
    public List<BATicketDetails> getTicketInfo(Airport from, Airport to, LocalDateTime when) {
        return baTicketService.getTicketInfo(from, to, when);
    }
}
