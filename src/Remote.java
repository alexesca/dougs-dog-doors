public class Remote {
    private DougDoor door;

    public Remote(DougDoor door) {
        this.door = door;
    }

    public void pressButton() {
        System.out.println("Pressing the remote control button...");
        if(door.isOpen()) {
            door.close();
        } else {
            door.open();
        }
    }
}
