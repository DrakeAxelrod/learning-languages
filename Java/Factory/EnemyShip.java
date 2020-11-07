public abstract class EnemyShip {
    private String name;
    private double amountDamage;

    public String getName(){
        return name;
    }
    public void setName(String newName){ 
        name = newName;
    }

    public double getDamage(){
        return amountDamage;
    }

    public void setDamage(double newDamage) {
        amountDamage = newDamage;
    }

    public void followHeroShip(){
        System.out.println(getName() + " is following the hero");
    }

    public void displayEnemyShip(){
        System.out.println(getName() + " is on the screen");
    }

    public void enemyShipShoots(){
        System.out.println(getName() + " attacks and does " + getDamage());
    }
}
