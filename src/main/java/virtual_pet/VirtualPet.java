package virtual_pet;

import java.util.Random;

public class VirtualPet {
    Random random = new Random();

    public int headPet;
    public int buttPet;
    public int giveTreat;
    public int scoopPoop;



    public VirtualPet() {
        headPet = random.nextInt(50);
        buttPet = random.nextInt(50);
        giveTreat = random.nextInt(50);
        scoopPoop = random.nextInt(50);


    }

    public int getHeadPet() {
        return headPet;
    }

    public int getButtPet() {
        return buttPet;
    }

    public int getGiveTreat() {
        return giveTreat;
    }

    public int getScoopPoop() {
        return scoopPoop;
    }


    public int petHead() {
        return headPet;
    }

    public int petButt() {
        return buttPet;
    }

    public int feedTreat() {
        return giveTreat;
    }

    public int pickupPoop() {
        return scoopPoop;
    }


}
