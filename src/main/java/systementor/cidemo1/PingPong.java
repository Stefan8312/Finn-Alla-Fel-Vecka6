package systementor.cidemo1;

public class PingPong {

    private int pingCounter = 0;          // counts valid pings
    private boolean lastPingWasCounted = false; // track consecutive duplicates

    public String ping(String input) {
        if (input != null && input.contains("ping")) {
            // Only increment if previous ping was not counted
            if (!lastPingWasCounted) {
                pingCounter++;
                lastPingWasCounted = true;
            }
            return "pong";
        } else {
            // Reset tracker for non-ping input
            lastPingWasCounted = false;
            return "You didn't say ping!";
        }
    }

    public int getPingCounter() {
        // Return -1 if no pings yet
        return pingCounter == 0 ? -1 : pingCounter;
    }
}