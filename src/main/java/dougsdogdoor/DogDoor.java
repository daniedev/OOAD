package dougsdogdoor;

public class DogDoor {
    private boolean open;

    public DogDoor() {
        this.open = false;
    }

    public void open() {
        System.out.println("The Dog door opens");
        open = true;
    }

    public void close() {
        System.out.println("The Dog door closes");
        open = false;
    }

    public boolean isOpen() {
        return open;
    }
}
