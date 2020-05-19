package virtual_pet;

import java.util.Random;
/*
 * I would like to see some improvements to this application:
 * 1 - Rename methods that are 'getters' to 'get' + the field name to act as getters.
 * 2 - If you want to give a 'headPet' you should have a method called 'petHead()' or something similar.  These methods
 *     will be how you change the amount of pets your pet has.
 * 3 - Remove the static keyword from the field declarations.  It's unneeded and will produce errors when we build on
 *     this project.
 * 4 - You can move the petLevels method to the VirtualPetApplication class to keep things that use the console in the
 *     Application class.  All the pet should care about is the pet things, not writing to the console.
 * 5 - Add a tick() method to turn this into a turn based game, when the user makes an action maybe the pet's hunger
 *     goes up and the need to poop goes up.  Maybe it's pet count starts to diminish.
 */
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
