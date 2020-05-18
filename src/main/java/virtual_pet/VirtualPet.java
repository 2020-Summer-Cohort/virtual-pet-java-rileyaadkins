package virtual_pet;

import java.util.Random;

public class VirtualPet {
    Random random = new Random();

        static void petLevels(){
            System.out.println("Head Pets: " + headPet);
            System.out.println("Butt Pets: " + buttPet);
            System.out.println("Give Treats: " + giveTreat);
            System.out.println("Scoop Poop: " + scoopPoop);
        }

            public static int headPet;
            public static int buttPet;
            public static int giveTreat;
            public static int scoopPoop;


        public VirtualPet(){
            headPet = random.nextInt(50);
            buttPet = random.nextInt(50);
            giveTreat = random.nextInt(50);
            scoopPoop = random.nextInt(50);


        }
    public static int giveHeadPet(){return headPet;}

    public static int giveButtPet(){return buttPet;}

    public static int giveTreat(){return giveTreat;}

    public static int scoopPoop(){return scoopPoop;}

    public static int newHeadPet(){return headPet;}

    public static int newButtPet(){return buttPet;}

    public static int newGiveTreat(){return giveTreat;}

    public static int newScoopPoop(){return scoopPoop;}




}
