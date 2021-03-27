public class Remote {
    private DougDoor dougDoor;

    public Remote(DougDoor dougDoor) {
        this.dougDoor = dougDoor;
    }

    public void pressButton() {
        System.out.println("Pressing the remote control button...");
        if(dougDoor.isOpen()) {
            dougDoor.close();
        } else {
            dougDoor.open();
        }
    }
}
