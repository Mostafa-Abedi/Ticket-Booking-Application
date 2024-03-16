package ticket.booking.application;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FlightBookingIntegrationTest {
    @Test
    public void testFlightInformationRetrieval() {
        FlightBookingModule bookingModule = new FlightBookingModule();
        FlightInformationModule infoModule = new FlightInformationModule();

        // Simulate flight search
        Flight selectedFlight = bookingModule.searchFlights("Departure", "Destination", "Dates", "Passengers", false).get(0);
        assertNotNull(selectedFlight);

        // Simulate retrieving flight information
        int totalFlightTime = infoModule.calculateTotalFlightTime(selectedFlight.getItinerary());
        
        assertTrue(totalFlightTime > 0);
    }
}
