package com.homework4;

import com.homework4.animals.Cangaroo;
import com.homework4.animals.Coala;
import com.homework4.animals.Petauridae;


public class Main {
    public static void main(String[] args) {

//        Plant plant = new Plant(true,false);
//        Plant.grove;
//        Brassica brassica = new Brassica(true, false,true,true,90,2.5);
//            Brassica.grove;
//            Brassica.bearFruit;
//        PlantGrows plantGrows = new PlantGrows();
//        Brassica brassica = new Brassica();

        Cabbage cabbage = new Cabbage("Cabbage", true, false, true, true, 90, 2.5);
        cabbage.cabbageForSalad();
        cabbage.bearFruit();
        cabbage.grove();
        cabbage.applyFungicides();
        cabbage.removeWeeds();
        cabbage.plantsNeedToSun();
        cabbage.plantsNeedToWater();
        System.out.println();
        Broccoli broccoli = new Broccoli("Broccoli", true, false, true, true, 110, 0.4);
        broccoli.broccoliIsHealty();
        broccoli.bearFruit();
        broccoli.grove();
        broccoli.applyFungicides();
        broccoli.removeWeeds();
        broccoli.plantsNeedToSun();
        broccoli.plantsNeedToWater();
        System.out.println();
        BrusselsSprout brusselsSprout = new BrusselsSprout("Brussels Sprout", true, false, true, true, 120, 0.03);
        brusselsSprout.brusselsSproutFrozen();
        brusselsSprout.bearFruit();
        brusselsSprout.grove();
        brusselsSprout.applyFungicides();
        brusselsSprout.removeWeeds();
        brusselsSprout.plantsNeedToSun();
        brusselsSprout.plantsNeedToWater();
        System.out.println();

//        Animals animals = new Animals(true,false);
//        Diprotodontia diprotodontia = new Diprotodontia(true,false,true,true);
//        MoveAnimal moveAnimal = new MoveAnimal();
//        BehaviorAnimal behaviorAnimal = new BehaviorAnimal();

        Cangaroo cangaroo = new Cangaroo("Cangaroo", true, false, true, true, 170);
        cangaroo.jumpFar();
        cangaroo.born();
        cangaroo.reproduce();
        cangaroo.giveMilk();
        cangaroo.moveAnimal();
        cangaroo.runAnimal();
        cangaroo.jumpAnimal();
        cangaroo.fightAnimal();

        System.out.println();
        Coala coala = new Coala(true, true, false, true, 120, 60);
        coala.climbTrees();
        coala.born();
        coala.reproduce();
        coala.giveMilk();
        coala.moveAnimal();
        coala.runAnimal();
        coala.jumpAnimal();
        coala.fightAnimal();
        System.out.println();
        Petauridae petauridae = new Petauridae(true, false, true, true, 80, 30);
        petauridae.fly();
        petauridae.born();
        petauridae.reproduce();
        petauridae.giveMilk();
        petauridae.moveAnimal();
        petauridae.runAnimal();
        petauridae.jumpAnimal();
        petauridae.fightAnimal();
    }
}
