package dougsdogdoor;

import java.util.Timer;
import java.util.TimerTask;

public class DogDoorSimulator {
    public static void main(String args[]) {
        DogDoor door = new DogDoor();
        BarkRecognizer barkRecognizer = new BarkRecognizer(door);
        Remote remote = new Remote(door);

        System.out.println("Fido barks to go outside");
        barkRecognizer.recognize("bark");
        System.out.println("\nFido has gone out");
        final Timer timer = new Timer();
        System.out.println("\nFido's all done");
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Fido's stuck outside");
                System.out.println("Fido Barks!!");
                barkRecognizer.recognize("bark");
                System.out.println("\nFido's back inside");
            }
        },10000);
    }
}
