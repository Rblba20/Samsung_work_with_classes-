public class Main {
    public static void main(String[] args) {
      //  System.out.println("Hello world!");
      //  Unit unit1 = new Unit();
      //  Unit unit2 = new Unit("2");

      //  unit1.print();
       // unit1.print("Smth:");

        Game game = new Game();
        Wizard wizard1 = new Wizard("1");
        Wizard wizard2 = new Wizard("2");
        System.out.println(wizard1);
        wizard2.attack(wizard1);
        System.out.println(wizard1);
        System.out.println(wizard2);
        System.out.println(Game.CountOfPlayers);

     //   Game game = new Game();


    }
}