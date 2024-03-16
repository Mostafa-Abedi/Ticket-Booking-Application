package ticket.booking.application;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PaymentProcessingIntegrationTest {
    @Test
    public void testPaymentProcessing() {
        FlightBookingModule bookingModule = new FlightBookingModule();
        PaymentProcessingModule paymentModule = new PaymentProcessingModule();

        // Simulate flight booking
        BookingDetails bookingDetails = bookingModule.bookFlight("FlightDetails", "PassengerDetails", "PaymentDetails");
        assertNotNull(bookingDetails);

        // Simulate payment processing
        boolean paymentSuccess = paymentModule.processPayment(bookingDetails.getPaymentDetails());
        assertTrue(paymentSuccess);
    }
}
