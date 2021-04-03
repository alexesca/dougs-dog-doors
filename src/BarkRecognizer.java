import java.util.*;

public class BarkRecognizer {
    DougDoor door;

    public BarkRecognizer(DougDoor door) {
        this.door = door;
    }

    public void recognize(Bark bark) {
        System.out.println("\nBarkRecognizer: Heard a " + bark.getSound() + ".");
        List allowedBarks = door.getAllowedBarks();
        for(Iterator i = allowedBarks.iterator(); i.hasNext();) {
            Bark allowedBark = (Bark)i.next();
            if(allowedBark.equals(bark)) {
                door.open();
                return;
            }
        }
        System.out.println("This dog is not allowed.");
    }
}
