public class Sekcja4 {

    public static void main(String[] args)    {
        System.out.println("Sekcja 4: operatory relacyjne, ang. relational operators.");

        int zmienna = 5;
        System.out.println(3 == 8);
        System.out.println(8 == 8);

        boolean wynik;
        wynik = 8 == 8;
        System.out.println("8 == 8: " + wynik);

        wynik = 3 == 8;
        System.out.println("3 == 8: " + wynik);

        // != rozne od
        wynik = 3 != 8;
        System.out.println("3 rozne od 8: " + wynik);

        wynik = 3 < 8;
        System.out.println("3 < 8: " + wynik);

        wynik = 3 <= 8;
        System.out.println("3 <= 8: " + wynik);

        wynik = 3 > 8;
        System.out.println("3 > 8: " + wynik);

        wynik = 3 >= 8;
        System.out.println("3 >= 8: " + wynik);

        int a = 5;
        int b = 7;
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        wynik = a == b;
        System.out.println("a == b: " + wynik);

        wynik = a < b;
        System.out.println("a < b: " + wynik);

        wynik = a > b;
        System.out.println("a > b: " + wynik);

        wynik = a <= b;
        System.out.println("a <= b: " + wynik);

        wynik = a >= b;
        System.out.println("a >= b: " + wynik);
        System.out.println("");
        System.out.println("Sekcja 4: operatory logiczne, ang. logical operators.");

        int wiek = 20;

        System.out.println("koniunkcja (AND - &&)");
        System.out.println(wiek >= 18 && wiek < 30);
        System.out.println(wiek > 30 && wiek < 40);

        System.out.println("alternatywa (OR - ||)");
        System.out.println(wiek < 18 || wiek > 40);
        System.out.println(wiek <= 20 || wiek > 65);

        System.out.println("negacja (przez dodanie !variable)");
        boolean prawda = true;
        System.out.println("!prawda: " + !prawda);

        boolean falsz = false;
        System.out.println("!falsz: " + !falsz);
        System.out.println("");

        System.out.println("Sekcja 4: Operatory arytmetyczne, ang. arithmetic operators.");

        System.out.println(3 + 5);
        System.out.println(3 - 5);
        System.out.println(2 * 4);
        System.out.println(4 / 2);
        System.out.println(10 / 3);
        System.out.println(10 % 3);
        System.out.println(10 % 5);
        System.out.println("");
        System.out.println("Dodawanie typu integer");

        int c = 9;
        int d = 2;

        int dodawanie = c + d;
        System.out.println("Dodawanie: " + dodawanie);

        int odejmowanie = c - d;
        System.out.println("Odejmowanie: " + odejmowanie);

        int mnozenie = c * d;
        System.out.println("Mnozenie: " + mnozenie);

        int dzielenie = c / d;
        System.out.println("Dzielenie: " + dzielenie);

        int resztaZDzielenia = c % d;
        System.out.println("Reszta z dzielenia: " + resztaZDzielenia);
        System.out.println("");
        System.out.println("Dodawanie typu double");

        double e = 9;
        double f = 2;

        double dodawanieDo = e + f;
        System.out.println("Dodawanie: " + dodawanieDo);

        double odejmowanieDo = e - f;
        System.out.println("Odejmowanie: " + odejmowanieDo);

        double mnozenieDo = e * f;
        System.out.println("Mnozenie: " + mnozenieDo);

        double dzielenieDo = e / f;
        System.out.println("Dzielenie: " + dzielenieDo);

        double resztaZDzieleniaDo = e % f;
        System.out.println("Reszta z dzielenia: " + resztaZDzieleniaDo);
        System.out.println("");

        c = 9;
        d = 2;
        e = 9;
        f = 2;

        c = c + d;
        System.out.println("c = c + d: " + c);

        e += f;
        System.out.println("e += f: " + e);

        e -= f;
        System.out.println("e -= f: " + e);

        e *= f;
        System.out.println("e *= f: " + e);

        e /= f;
        System.out.println("e /= f: " + e);

        e %= f;
        System.out.println("e %= f: " + e);
        System.out.println("");

        System.out.println("e: " + e + " f: " + f);
        System.out.println("");
        System.out.println("Zwiekszanie o 1 - inkrementacja, dekrementacja");

        a = 1;
        System.out.println("a: " + a);

        a = a + 1;
        System.out.println("a + 1: " + a);

        a += 1;
        System.out.println("a += 1: " + a);

        a ++;
        System.out.println("a++: " + a);
        a --;
        System.out.println("a--: " + a);

        ++ a;
        System.out.println("++a: " + a);
        -- a;
        System.out.println("--a: " + a);
    }

}
