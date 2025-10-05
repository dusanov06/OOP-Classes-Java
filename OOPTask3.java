import java.util.Scanner;

class Human{
    boolean isAlive;
    boolean isMale;
    boolean isFemale;
    boolean isStrong;
}


public class OOPTask3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Human person = new Human();

        person.isAlive = in.nextBoolean();
        person.isMale = in.nextBoolean();
        person.isFemale = !person.isMale;
        person.isStrong = in.nextBoolean();

        in.close();
    }
}
