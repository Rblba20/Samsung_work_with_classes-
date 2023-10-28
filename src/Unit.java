public class Unit {
    protected String name ="0";
    protected int health = 100;
    protected int defence = 100;
    protected int power = 10;

    protected float CriticalChance = 0.1f;
    protected float ParryChance = 0.1f;

    public Unit(String name) {
        Game.CountOfPlayers++;
        this.name = name;
    }

    public Unit() {
    }

    public int getHealth(){//getter
        return health;
    }
    public void setHealth(int health){
        this.health = health;
    }
//Alt+Insert
    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public float getCriticalChance() {
        return CriticalChance;
    }

    public void setCriticalChance(float criticalChance) {
        CriticalChance = criticalChance;
    }

    public float getParryChance() {
        return ParryChance;
    }

    public void setParryChance(float parryChance) {
        ParryChance = parryChance;
    }

    public void attack(Unit unit){
        unit.getDamage(power);
    }
    public void getDamage(int damage){
        this.health -= damage;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "health=" + health +
                ", defence=" + defence +
                ", power=" + power +
                '}';
    }

    public void print(){
        System.out.println(this);
    }

    public void print(String str){
        System.out.println(str+" "+this);
    }
}
