package dougsdogdoor;

import java.util.Timer;
import java.util.TimerTask;

public class DogDoorSimulator {
    public static void main(String args[]) {
        DogDoor door = new DogDoor();
        Remote remote = new Remote(door);

        System.out.println("Fido barks to go outside");
        remote.pressButton();
        System.out.println("\nFido has gone out");
        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Fido Barks!!");
                remote.pressButton();
                System.out.println("\nFido's back inside");
            }
        },10000);
        System.out.println("\nFido's all done");
    }
}
