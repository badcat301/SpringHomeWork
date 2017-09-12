package Service;

import java.util.List;

public interface BookingService {

    int getTicketsPrice();

    String bookTicket();

    List<String> getPurchasedTicketsForEvent();
}
