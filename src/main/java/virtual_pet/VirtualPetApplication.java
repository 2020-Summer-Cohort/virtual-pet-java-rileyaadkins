package virtual_pet;


import java.util.Random;
import java.util.Scanner;

public class VirtualPetApplication<userSelection> {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        VirtualPet scullyTheCat = new VirtualPet();

        System.out.println("Welcome to your Virtual Pet.");
        System.out.println("This is Scully the Cat! 龴ↀ◡ↀ龴");
        System.out.println("To win, you must get all the levels above 50!");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Press ENTER to Start.");
        input.nextLine();

        VirtualPet.petLevels();

        boolean gameLoop = true;
        while (gameLoop) {

            System.out.println("What would you like to do for Scully??");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            int userSelection;

            System.out.println("Press 1 for Head Pets:");
            System.out.println("Press 2 for Butt Pets.");
            System.out.println("Press 3 for Give Treats.");
            System.out.println("Press 4 for Scoop Poop.");
            System.out.println("Press 5 to Leave Scully Alone.");

            userSelection = input.nextInt();


            if (userSelection == 1)
                System.out.println("≧◔◡◔≦ thanks for the head pets! :D");
                int giveHeadPet = VirtualPet.giveHeadPet();

            if (userSelection == 2)
                System.out.println("^ↀᴥↀ^ those were some great butt pets!");
                int giveButtPet = VirtualPet.giveButtPet();


            if (userSelection == 3)
                System.out.println("yummy! ♥‿♥ i love treats!");
                int giveTreat = VirtualPet.giveTreat();

            if (userSelection == 4)
                System.out.println("♥ thank you ♥");
                int scoopPoop = VirtualPet.scoopPoop();

            if (userSelection == 5)
                System.out.println("so sad to see you go! (◕︵◕)");

        }


        }


    }