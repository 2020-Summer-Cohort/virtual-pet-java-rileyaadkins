package virtual_pet;

import java.util.Scanner;

public class VirtualPet {
//   void tick(){

    public int headPet;
    public int buttPet;
    public int giveTreat;
    public int scoopPoop;

    public VirtualPet (int headPet, int buttPet, int giveTreat, int scoopPoop){
        this.headPet = headPet;
        this.buttPet = buttPet;
        this.giveTreat = giveTreat;
        this.scoopPoop = scoopPoop;
    }

    public int giveHeadPet(){return headPet;}

    public int giveButtPet(){return buttPet;}

    public int giveTreat(){return giveTreat;}

    public int scoopPoop(){return scoopPoop;}



}
