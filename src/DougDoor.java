public class DougDoor {
    private boolean open;

    public DougDoor() {
        this.open = false;
    }

    public void open() {
        System.out.println("The dog door is open.");
        open = true;
    }

    public void close() {
        System.out.println("The dog door closes.");
        open = false;
    }

    public boolean isOpen() {
        return open;
    }
}
