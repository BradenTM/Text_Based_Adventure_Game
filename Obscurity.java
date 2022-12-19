package onePiece;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;


public class obscurity {
    static int enemyHP;
    static int playerHP;
    static boolean isAlive = true;
    static boolean notAlive = true;
    static int level;
    static boolean easyDif;
    static boolean medDif;
    static boolean hardDif;

    public static void enemyLiving() {
        if (enemyHP > 0) {
            boolean isAlive = true;
        }
        if (enemyHP <= 0) {
            boolean isAlive = false;
        }
    }

    public static void playerLiving() {
        if (playerHP > 0) {
            boolean playerAlive = true;
        }
        if (playerHP <= 0) {
            boolean playerAlive = false;
        }
    }

    public obscurity(int enemyHP) {
        this.enemyHP = enemyHP;
    }

    public void playerLvl() {
        level =1;
    }
    public void fightLvl(){
        easyDif = false;
        medDif = false;
        hardDif = false;
}
    public static void RobotStop(int enemyHP) {
        isAlive = enemyHP >= 0;
        if (playerHP > 0) {
            if (enemyHP > 0 && level >= 0 && playerHP > 0) {
                System.out.println("Your body feels overworked, but somehow you hit the enemy for 25 damage");
                int CurrentEnemyHP = enemyHP -= 25;
                System.out.println("Enemy Health: " + enemyHP + "HP");
                if (enemyHP > 0) {
                    System.out.println("The enemy strikes back, dealing damage");
                    if (level == 0) {
                        int CurrentPlayerHP = playerHP -= 10;
                    }
                    if (level == 1)
                    {
                        int CurrentPlayerHP = playerHP -= 20;
                    }
                    if (level == 2)
                    {
                        int CurrentPlayerHP = playerHP -= 25;
                    }
                    System.out.println("The enemy still stands, what next?");
                    System.out.println("Player HP: " + playerHP);
                    Scanner scanner = new Scanner(System.in);
                    String moveResponse = scanner.nextLine();
                    switch (moveResponse) {
                        case "RobotStop":
                            RobotStop(CurrentEnemyHP);
                            break;
                        case "NonagonInfinity":
                            NonagonInfinity(CurrentEnemyHP);
                            break;
                    }
                }
                if (enemyHP <= 0) {
                    System.out.println("The enemy is defeated and dissolves into a red smoke, you are victorious!");
                    level++;
                    playerHP += 25;
                    if (level == 1) {
                        if (easyDif = true) {
                            easyDifficultyTwo();
                        }
                        if (medDif = true) {
                            mediumDifficultyTwo();
                        }
                        if (hardDif = true) {
                            hardDifficultyTwo();
                        }
                    }
                    if (level == 2) {
                        if (easyDif = true) {
                            easyDifficultyThree();
                        }
                        if (medDif = true) {
                            mediumDifficultyThree();
                        }
                        if (hardDif = true) {
                            hardDifficultyThree();
                        }
                    }
                        if (level == 3)
                        {
                            System.out.println("After defeating Gondii, you spot a door that seems as it wasnt there before");
                            System.out.println("Inside you discover a podium with a limited blue marble 'Weezer' record, you are content. ");
                            System.exit(0);
                        }
                }
            }
        }
        else {
            System.out.println("You have died");
            System.exit(0);
        }
        }
    public static void NonagonInfinity(int enemyHP) {
        isAlive = enemyHP >= 0;
        if (playerHP > 0) {
            if (enemyHP > 0 && level >= 1) {
                System.out.println("Nonagon Infinity opens the door, dealing 30 damage");
                int CurrentEnemyHP = enemyHP -= 30;
                System.out.println("Enemy Health: " + enemyHP + "HP");
            } else {
                System.out.println("You're not a high enough level yet, nothing happens");
                System.out.println("Enemy HP: " + enemyHP);
            }
            if (enemyHP > 0) {
                System.out.println("The enemy strikes back, dealing damage");
                if (level == 0) {
                    int CurrentPlayerHP = playerHP -= 10;
                }
                if (level == 1)
                {
                    int CurrentPlayerHP = playerHP -= 20;
                }
                if (level == 2)
                {
                    int CurrentPlayerHP = playerHP -= 25;
                }
                System.out.println("The enemy still stands, what next?");
                System.out.println("Player HP: " + playerHP);
                Scanner scanner = new Scanner(System.in);
                String moveResponse = scanner.nextLine();
                switch (moveResponse) {
                    case "NonagonInfinity":
                        NonagonInfinity(30);
                        break;
                    case "RobotStop":
                        RobotStop(30);
                        break;
                }
            }
            if (enemyHP <= 0) {
                System.out.println("The enemy is defeated and dissolves into a red smoke, you are victorious!");
                System.out.println("Level Up!");
                level++;
                playerHP += 25;
                if (level == 1) {
                    if (easyDif = true) {
                        easyDifficultyTwo();
                    }
                    if (medDif = true) {
                        mediumDifficultyTwo();
                    }
                    if (hardDif = true) {
                        hardDifficultyTwo();
                    }
                }
                if (level == 2) {
                    if (easyDif = true) {
                        easyDifficultyThree();
                    }
                    if (medDif = true) {
                        mediumDifficultyThree();
                    }
                    if (hardDif = true) {
                        hardDifficultyThree();
                    }
                }
                if (level == 3){
                    System.out.println("After defeating Gondii, you spot a door that seems as it wasnt there before, inside you discover a podium with a limited blue marble 'Weezer' record, you are content. ");
                    System.exit(0);
                }
            }
        }
        else {
            System.out.println("You have died");
            System.exit(0);
        }
    }


    public static void easyDifficulty() {
        easyDif = true;
        System.out.println("You begin the journey into Magenta Mountain with your newfound powers and encounter an enemy, what do you do?");
        System.out.println("Abilities: Lvl 0: RobotStop (25), Lvl 1: NonagonInfinity (30) (Case sensitive)");
        System.out.println("Player HP:" + playerHP + " Player Lvl:" + level);
        Scanner scanner = new Scanner(System.in);
        String response = scanner.nextLine();
        switch(response) {
            case "RobotStop":
                RobotStop(30);
                break;
            case "NonagonInfinity":
                NonagonInfinity(30);
                break;
        }
    }
    public static void easyDifficultyTwo() {
        System.out.println("You wander into 'Billabong Valley' and encounter a man named Mr. Beat, who wields a gamma knife, what do you do?");
        System.out.println("Abilities: Lvl 0: RobotStop (25), Lvl 1: NonagonInfinity (30) (Case sensitive)");
        System.out.println("Player HP:" + playerHP + " Player Lvl:" + level);
        Scanner scanner = new Scanner(System.in);
        String response = scanner.nextLine();
        switch (response) {
            case "RobotStop":
                RobotStop(50);
                break;
            case "NonagonInfinity":
                NonagonInfinity(50);
                break;
        }
    }
    public static void easyDifficultyThree() {
        System.out.println("As you mosey along, you suddenly find yourself in the land known as 'Timeland' and encounter a man named Gondii, what do you do?");
        System.out.println("Abilities: Lvl 0: RobotStop (25), Lvl 1: NonagonInfinity (30) (Case sensitive)");
        System.out.println("Player HP:" + playerHP + " Player Lvl:" + level);
        Scanner scanner = new Scanner(System.in);
        String response = scanner.nextLine();
        switch (response) {
            case "RobotStop":
                RobotStop(75);
                break;
            case "NonagonInfinity":
                NonagonInfinity(75);
                break;
        }
    }
    public static void mediumDifficulty() {
        medDif = true;
        System.out.println("You begin the journey into Magenta Mountain with your newfound powers and encounter an enemy, what do you do?");
        System.out.println("Abilities: Lvl 0: RobotStop (25), Lvl 1: NonagonInfinity (30) (Case sensitive)");
        System.out.println("Player HP:" + playerHP + "Player Lvl:" + level);
        Scanner scanner = new Scanner(System.in);
        String response = scanner.nextLine();
        switch (response) {
            case "RobotStop":
                RobotStop(50);
                break;
            case "NonagonInfinity":
                NonagonInfinity(50);
                break;

        }
    }
    public static void mediumDifficultyTwo() {
        medDif = true;
        System.out.println("You wander into 'Billabong Valley' and encounter a man named Mr. Beat, who wields a gamma knife, what do you do?");
        System.out.println("Abilities: Lvl 0: RobotStop (25), Lvl 1: NonagonInfinity (30) (Case sensitive)");
        System.out.println("Player HP:" + playerHP + "Player Lvl:" + level);
        Scanner scanner = new Scanner(System.in);
        String response = scanner.nextLine();
        switch (response) {
            case "RobotStop":
                RobotStop(70);
                break;
            case "NonagonInfinity":
                NonagonInfinity(70);
                break;
        }
    }
    public static void mediumDifficultyThree() {
        System.out.println("As you mosey along, you suddenly find yourself in the land known as 'Timeland' and encounter a man named Gondii, what do you do?");
        System.out.println("Abilities: Lvl 0: RobotStop (25), Lvl 1: NonagonInfinity (30) (Case sensitive)");
        System.out.println("Player HP:" + playerHP + " Player Lvl:" + level);
        Scanner scanner = new Scanner(System.in);
        String response = scanner.nextLine();
        switch (response) {
            case "RobotStop":
                RobotStop(100);
                break;
            case "NonagonInfinity":
                NonagonInfinity(100);
                break;
        }
    }
        public static void hardDifficulty() {
        hardDif = true;
            System.out.println("You begin the journey into Magenta Mountain with your newfound powers and encounter an enemy, what do you do?");
            System.out.println("Abilities: Lvl 0: RobotStop (25), Lvl 1: NonagonInfinity (30) (Case sensitive)");
            System.out.println("Player HP:" + playerHP + "Player Lvl:" + level);
            Scanner scanner = new Scanner(System.in);
            String response = scanner.nextLine();
            switch(response) {
                case "RobotStop":
                    RobotStop(75);
                    break;
                case "NonagonInfinity":
                    NonagonInfinity(75);
                    break;

            }

    }
    public static void hardDifficultyTwo() {
        hardDif = true;
        System.out.println("You wander into 'Billabong Valley' and encounter a man named Mr. Beat, who wields a gamma knife, what do you do?");
        System.out.println("Abilities: Lvl 0: RobotStop (25), Lvl 1: NonagonInfinity (30) (Case sensitive)");
        System.out.println("Player HP:" + playerHP + "Player Lvl:" + level);
        Scanner scanner = new Scanner(System.in);
        String response = scanner.nextLine();
        switch (response) {
            case "RobotStop":
                RobotStop(100);
                break;
            case "NonagonInfinity":
                NonagonInfinity(100);
                break;
        }
    }
    public static void hardDifficultyThree() {
        System.out.println("As you mosey along, you suddenly find yourself in the land known as 'Timeland' and encounter a man named Gondii, what do you do?");
        System.out.println("Abilities: Lvl 0: RobotStop (25), Lvl 1: NonagonInfinity (30) (Case sensitive)");
        System.out.println("Player HP:" + playerHP + " Player Lvl:" + level);
        Scanner scanner = new Scanner(System.in);
        String response = scanner.nextLine();
        switch (response) {
            case "RobotStop":
                RobotStop(125);
                break;
            case "NonagonInfinity":
                NonagonInfinity(125);
                break;
        }
    }
    public static void main(String[] args) {
        System.out.println( "█░█░█ █▀▀ █░░ █▀▀ █▀█ █▀▄▀█ █▀▀   ▀█▀ █▀█   █▀█ █▄▄ █▀ █▀▀ █░█ █▀█ █ ▀█▀ █▄█ █");
        System.out.println("▀▄▀▄▀ ██▄ █▄▄ █▄▄ █▄█ █░▀░█ ██▄   ░█░ █▄█   █▄█ █▄█ ▄█ █▄▄ █▄█ █▀▄ █ ░█░ ░█░ ▄");
        System.out.println("Enter enemy difficulty: easy, medium, hard");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        switch(answer) {
            case "easy":
                int easyEnemyHP = 30;
                playerHP = 50;
                easyDifficulty();
                break;
            case "medium":
                enemyHP = 50;
                playerHP = 45;
                mediumDifficulty();
                break;
            case "hard":
                enemyHP = 75;
                playerHP = 40;
                hardDifficulty();
                break;
            default:
                System.out.println("Enter a valid difficulty");
        }
    }
}
