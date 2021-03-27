public class Application {
    public static void main(String[] args) {
        DougDoor door = new DougDoor();
        Remote remote = new Remote(door);
        BarkRecognizer recognizer = new BarkRecognizer();

        System.out.println("Fido barks to go outside...");
        recognizer.recognize("Woof");
        remote.pressButton();
        System.out.println("\nFid has gone outside...");
        System.out.println("\nFido's all done...");

        try {
            Thread.currentThread().sleep(10000);
        } catch (InterruptedException e) { }
        System.out.println("\nbut he's stuck outside...");
        System.out.println("\nFido starts barking...");
        recognizer.recognize("Woof");
        System.out.println("\n... so Gina grabs the remote control.");
        remote.pressButton();
        System.out.println("\nFido is inside...");
    }
}
