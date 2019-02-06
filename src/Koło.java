import java.util.Scanner;
import java.math.*;

public class Koło {

    //Tworzenie instancji klas
    Main main = new Main();
    Scanner scanner = new Scanner(System.in);

    //Tworzenie zmiennych
    public double r;
    double pole;
    double obwod;
    public final double PI = 3.141;

    //Definiowanie funkcji
    public double liczPole()
    {
        pole = PI*Math.pow(r, 2);
        return pole;
    }

    public double liczObwod()
    {
        obwod = (2*PI)*r;

        return obwod;
    }

    public void get_r()
    {
        r = scanner.nextDouble();
    }
}
