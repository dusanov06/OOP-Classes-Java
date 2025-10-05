import java.util.Scanner;

class Triangle{
    double a;
    double b;
    double c;

    public void show(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

public class OOPTask2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Triangle t = new Triangle();

        t.a = in.nextDouble();
        t.b = in.nextDouble();
        t.c = in.nextDouble();

        t.show();

        in.close();
    }
}
