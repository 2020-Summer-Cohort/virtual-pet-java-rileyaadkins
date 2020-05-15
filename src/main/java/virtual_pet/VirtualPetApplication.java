package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        VirtualPet scullyTheCat = new VirtualPet(4,6,3,0);

        System.out.println("Welcome to your Virtual Pet!");
        System.out.println("This is Scully 龴ↀ◡ↀ龴");
        System.out.println("Head Pets: " + scullyTheCat.giveHeadPet());
        System.out.println("Butt Pets: " + scullyTheCat.giveButtPet());
        System.out.println("Give Treats: " + scullyTheCat.giveTreat());
        System.out.println("Scoop Poop: " + scullyTheCat.scoopPoop());





        while (true) {

        }
    }

}
