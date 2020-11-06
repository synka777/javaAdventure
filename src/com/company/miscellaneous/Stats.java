package com.company.miscellaneous;

/**
 * The purpose of this class is to be able to easily tweak the game parameters.
 */
public abstract class Stats {
    public static int nbRooms, atkPlayer, hpPlayer, atkMonster, hpMonster, barbarianAttackScoreMultiplier;
    public static double playerEventRate, barbarianEventRate, sorcererEventRate;
    private static String selectedMode;

    /**
     * This function sets the variables according to which mode is selected in the main menu
     * @param mode
     */
    public static void setMode(String mode){
        if(mode.equals("normal")){
            nbRooms=5;
            atkPlayer=10;
            hpPlayer=200;
            playerEventRate=0.1;
            atkMonster=10;
            hpMonster=40;
            barbarianAttackScoreMultiplier =2;
            barbarianEventRate=0.3;
            sorcererEventRate=0.1;
            selectedMode = mode;
        }
        else if(mode.equals("hardcore")){
            nbRooms=5;
            atkPlayer=10;
            hpPlayer=250;
            playerEventRate=0.3;
            atkMonster=10;
            hpMonster=80;
            barbarianAttackScoreMultiplier =4;
            barbarianEventRate=0.15;
            sorcererEventRate=0.1;
            System.out.println("| HARCORE MODE ACTIVATED |");
            selectedMode = mode;
        }
    }

    public static String getMode() {
        return selectedMode;
    }
}
