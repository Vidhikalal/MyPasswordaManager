package ca.sheridancollege.kalalv.assignment2.utilities;
import ca.sheridancollege.kalalv.assignment2.beans.PasswordRecord;
import org.springframework.data.annotation.Id;

import java.util.Random;


public class RandomNumberGenerator {


    public static Long generateRandomId() {
        Random random = new Random();
        // Generate a random 9-digit number
        return (long) (random.nextInt(900_000_000) + 100_000_000);
    }
}
