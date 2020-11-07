import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        
        EnemyShip ufoShip = new UFOEnemyShip();
        
        Scanner userInput = new Scanner(System.in);

        String enemyShipOption = "";
        if (userInput.hasNextLine()){
            enemyShipOption = userInput.nextLine();
        }

        if (enemyShipOption("U"))
        doStuffEnemy(ufoShip);
    }

    public static void doStuffEnemy(EnemyShip aEnemyShip){
        aEnemyShip.displayEnemyShip();
        aEnemyShip.followHeroShip();
        aEnemyShip.enemyShipShoots();
    }
}