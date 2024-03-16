package ticket.booking.application;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UIFlightBookingIntegrationTest {
    @Test
    public void testFlightBookingProcess() {
        UserInterfaceModule uiModule = new UserInterfaceModule();
        FlightBookingModule bookingModule = new FlightBookingModule();

        // Simulate user interaction
        uiModule.displayHomePage();
        uiModule.displayFlightSearchForm();
        // Simulate user search and flight selection
        Flight selectedFlight = uiModule.displayFlightResults(bookingModule.searchFlights("Departure", "Destination", "Dates", "Passengers", false));
        // Simulate booking
        BookingDetails bookingDetails = bookingModule.bookFlight(selectedFlight, "PassengerDetails", "PaymentDetails");

        assertNotNull(bookingDetails);
        assertTrue(bookingDetails.isBookingConfirmed());
    }
}
