public class Terminator extends Unit {
    protected int bullets = 200;
    public Terminator() {
        this.power = 10;
        this.defence = 150;
        this.type = "Terminator";
    }

    public void attack(Unit unit) {
        if (this.bullets != 0) {
            this.bullets -= 5;
            super.attack(unit);
        }
    }

    @Override
    public String toString() {
        return "Terminator{" +
                "bullets=" + bullets +
                ", health=" + health +
                ", defence=" + defence +
                ", power=" + power +
                '}';
    }
}