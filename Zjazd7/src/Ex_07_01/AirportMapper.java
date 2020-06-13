package Ex_07_01;

import java.util.HashMap;
import java.util.Map;

/*
    
    Author: Karol Kuchnio   
 */public class AirportMapper {
    static Map<String ,String> airPortMap = new HashMap<String,String>() {{
         put("GDX123", "GD");
         put("LUX123", "LUX");
         put("BRL123", "BRL");
     }};
    public static Airport mapAirportByString(String from) {
        return new Airport(airPortMap.get(from));
    }
}
