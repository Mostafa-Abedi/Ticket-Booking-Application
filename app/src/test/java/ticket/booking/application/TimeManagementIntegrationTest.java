package ticket.booking.application;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TimeManagementIntegrationTest {
    @Test
    public void testTimeFormatConversion() {
        TimeManagementModule timeModule = new TimeManagementModule();
        UserInterfaceModule uiModule = new UserInterfaceModule();

        // Simulate user selecting time format
        uiModule.setTimeFormatPreference("12-hour");

        // Simulate time conversion
        String convertedTime = timeModule.convertTo12HourFormat("14:30");
        
        assertEquals("2:30 PM", convertedTime);
    }
}
