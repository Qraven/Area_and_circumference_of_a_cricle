import java.util.*;

public class Main {

    public static void main(String[] args) {

        //Tworzenie instancji
        Koło kolo = new Koło();
        Scanner scanner = new Scanner(System.in);

        //Zmienne
        int zapytanie;

        //Zapytanie o promień
        System.out.println("Jaki jest promień twojego koła:");
        kolo.get_r();

        //Zapytanie o co chce sie policzyc
        System.out.println("Co chcesz policzyc? 0 = pole, 1 = obwód");
        zapytanie = scanner.nextInt();

        //Sprawdzanie co trzeba policzyć
        if(zapytanie == 0)
        {
            kolo.liczPole();
            System.out.println(kolo.pole);

        } else if(zapytanie == 1)
        {
            kolo.liczObwod();
            System.out.println(kolo.obwod);
        } else
        {
            System.out.println("Wybrałeś złą liczbę!");
        }
    }


}