package Module7.Topic3;

import java.util.Random;

interface PersonInterface {
    Random random = new Random();
    final int recordId = random.nextInt(1000);
    
    public void displayInfo();
}
