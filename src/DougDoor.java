import java.util.*;

public class DougDoor {
    private boolean open;
    private List<Bark> allowedBarks = new ArrayList();;

    public DougDoor() {
        this.open = false;
    }

    public void open() {
        System.out.println("The dog door is open.");
        open = true;

        // Close door automatically
        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                close();
                timer.cancel();
            }
        }, 5000);
    }

    public void close() {
        System.out.println("The dog door closes.");
        open = false;
    }

    public boolean isOpen() {
        return open;
    }

    public List<Bark> getAllowedBarks() {
        return allowedBarks;
    }

    public void addAllowedBark(Bark allowedBark) {
        allowedBarks.add(allowedBark);
    }
}
