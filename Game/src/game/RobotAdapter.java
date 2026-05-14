package game;
import external.robo.EnemyRobot;

public class RobotAdapter implements Enemy {
    private EnemyRobot enemyRobot;
    
    public RobotAdapter(EnemyRobot enemyRobot){
        this.enemyRobot = enemyRobot; 
    }
    

    private int life=100;
    private int posx;
    private int posy; 

    @Override
    public void move() {
        posx = (int)(Math.random() * 100);
        posy = (int)(Math.random() * 100);
    }

    @Override
    public int attack(Enemy enemy) {
        int golpe = (int)(Math.random() * 10); 
        return enemy.getHealth() - golpe;
    }

    @Override
    public void takeDamage(int damage) {
        life=damage;
    }

    @Override
    public int getHealth() {
        return life;
    }

    public int getPosx(){
        return this.posx;
    }
    public void setPosx(int x){
        this.posx=x;
    }
    
    public int smash(Enemy enemy){
        enemyRobot.bootSequence();
        int smash = (int)(Math.random() * 10);
        enemyRobot.smash(smash);
        return enemy.getHealth() - smash;
    }
    
    public int energyLevel(){
        return enemyRobot.energyLevel();
    }

    


}
