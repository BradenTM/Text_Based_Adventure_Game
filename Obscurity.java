package onePiece;
import java.util.Scanner;
import java.util.Random;


public class obscurity {
   static int enemyHP;
   static boolean isAlive = enemyHP >= 0;
   static boolean notAlive = enemyHP <= 0;

   public obscurity(int enemyHP) {
       this.enemyHP = enemyHP;
   }
   public static void RobotStop(int enemyHP) {
       isAlive = enemyHP >= 0;
           while (isAlive) {
               System.out.println("Your body feels overworked, but somehow you hit the enemy for 25 damage");
               enemyHP -= 25;
               System.out.println("Enemy Health: " + enemyHP + "HP");
               if (isAlive) {
                   System.out.println("The enemy still stands, what next?");
               }
               if (notAlive) {
                   System.out.println("The enemy is defeated, you are victorious!");
               }
           }
       }

   public static void easyDifficulty() {
       System.out.println("You start the journey into the cave and encounter an enemy, what do you do?");
       Scanner scanner = new Scanner(System.in);
       String response = scanner.nextLine();
       switch(response) {
           case "RobotStop":
               RobotStop(30);
               break;

       }

   }
   public static void main(String[] args) {
       System.out.println("Enter enemy difficulty: easy, medium, hard");
       Scanner sc = new Scanner(System.in);
       String answer = sc.nextLine();
       switch(answer) {
           case "easy":
               enemyHP = 30;
               easyDifficulty();
               break;
           case "medium":
               enemyHP = 50;
               break;
           case "hard":
               enemyHP = 75;
               break;
           default:
               System.out.println("Enter a valid difficulty");
       }
       //System.out.println(answer);
       //RobotStop(56);
   }
}

