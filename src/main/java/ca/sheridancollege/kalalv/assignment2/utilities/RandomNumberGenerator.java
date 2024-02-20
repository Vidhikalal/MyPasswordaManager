package ca.sheridancollege.kalalv.assignment2.utilities;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class RandomNumberGenerator {



public static Long generateRandomId() {
    Random random = new Random();
    return (long) (Math.random()*(999999999 - 100000000)+100000000);
}


}
