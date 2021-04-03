public class Application {
    public static void main(String[] args) {
        DougDoor door = new DougDoor();
        door.addAllowedBark(new Bark("rowfl"));
        door.addAllowedBark(new Bark("woof"));
        door.addAllowedBark(new Bark("yip"));
        Remote remote = new Remote(door);
        BarkRecognizer recognizer = new BarkRecognizer(door);

        System.out.println("Fido barks to go outside...");
        recognizer.recognize(new Bark("Wooggf"));
        System.out.println("\nFid has gone outside...");
        System.out.println("\nFido's all done...");

        try {
            Thread.currentThread().sleep(10000);
        } catch (InterruptedException e) { }
        System.out.println("\nbut he's stuck outside...");
        System.out.println("\nFido starts barking...");
        recognizer.recognize(new Bark("Woof"));
        System.out.println("\nFido is inside...");
    }
}
