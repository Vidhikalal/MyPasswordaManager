package ca.sheridancollege.kalalv.assignment2.utilities;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class RandomNumberGenerator {



public static Long generateRandomId() {
    Random random = new Random();
    return (long) (random.nextInt(900_000_000) + 100_000_000);
}


}
