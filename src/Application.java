public class Application {
    public static void main(String[] args) {
        DougDoor door = new DougDoor();
        Remote remote = new Remote(door);
        System.out.println("Fido barks to go outside...");
        remote.pressButton();
        System.out.println("\nFid has gone outside...");
        remote.pressButton();
        System.out.println("\nFido's all done...");
        remote.pressButton();
        System.out.println("\nFido is inside...");
        remote.pressButton();
    }
}
