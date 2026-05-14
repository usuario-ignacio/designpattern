package game;
import external.robo.EnemyRobot;
//import external.robo.EnemyRobot;

public class Main {
    public static void main(String[] args) {
        Enemy enemy1 = new Player();
        Enemy enemy2 = new Player();
        EnemyRobot enemyRobot = new EnemyRobot();
        Enemy robotEnemy = new RobotAdapter(enemyRobot);
        

        enemy2.takeDamage(enemy1.attack(enemy2));
        System.out.println(enemy2.getHealth());
        
        enemy2.takeDamage(robotEnemy.attack(enemy2));
        System.out.println(enemy2.getHealth());
        
        enemy2.takeDamage(robotEnemy.smash(enemy2));
        System.out.println(enemy2.getHealth());
        
        System.out.println("Energia del robot: "+robotEnemy.energyLevel());
        
        
        
        
        
        //robotEnemy.attack(enemy2); --> Objetivo

        }
}