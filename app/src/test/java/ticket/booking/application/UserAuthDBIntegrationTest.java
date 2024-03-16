package ticket.booking.application;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserAuthDBIntegrationTest {
    @Test
    public void testUserAuthAndBookingHistoryRetrieval() {
        UserAuthenticationModule authModule = new UserAuthenticationModule();
        DatabaseAccessModule dbModule = new DatabaseAccessModule();

        // Simulate user login
        boolean loginSuccess = authModule.login("username", "password");
        assertTrue(loginSuccess);

        // Simulate fetching booking history after successful login
        if (loginSuccess) {
            BookingHistory history = dbModule.fetchBookingHistory("username");
            assertNotNull(history);
        }
    }
}
