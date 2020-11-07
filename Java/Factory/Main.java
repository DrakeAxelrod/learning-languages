import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        EnemyShipFactory shipFactory = new EnemyShipFactory();
        EnemyShip theEnemy = null;
        Scanner s = new Scanner(System.in);
        System.out.println("What type of ship? (U/R/B)");
        if (s.hasNextLine()){

            String typeOfShip = s.nextLine();
            theEnemy = shipFactory.makeEnemyShip(typeOfShip);
            
        }

        if (theEnemy != null){
            doStuffEnemy(theEnemy);
        }
    }

    public static void doStuffEnemy(EnemyShip aEnemyShip){
        aEnemyShip.displayEnemyShip();
        aEnemyShip.followHeroShip();
        aEnemyShip.enemyShipShoots();
    }
}