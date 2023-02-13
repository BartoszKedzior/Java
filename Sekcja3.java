public class Sekcja3 {

    public static int domyslnyInt;
    public static float domyslnyFloat;
    public static char domyslnyChar;
    public static boolean domyslnyBollean;

    public static void main(String[] args)
    {
        System.out.println("11022023 Sekcja 3 - zmienne ang. variables.");
        System.out.println("Zmienna to taki kontener lub pojemnik danych gdzie wrzucamy i mieszamy informacje.");

        // typzmiennej nazwaZmiennej;
        int dowolnanazwadlaInteger;

        // przy nazewnictwem używamy tzw. camelCase
        // nazwa zmiennej powinna identyfikowac to co zmienna przechowuje, jakie wartosci przechowuje

        int dowolnaNazwaDlaInteger;
                // deklaracja zmiennej

        int liczbaOkienWDomku;
                // przypisanie wartosci do zmiennej

        liczbaOkienWDomku = 30;
        liczbaOkienWDomku = 32;

        // deklaracja zmiennej oraz inicjalizacja
        int liczbaDrzwiWDomku = 10;

        int zmiennaDlaLiczbCalkowitych = 111;
        double zmiennaDlaLiczbZmiennoprzecinkowych = 11.11;

        int sumaOtworowWDomku = liczbaDrzwiWDomku + liczbaOkienWDomku;

        // bledne laczenie roznych typow zmiennych;
        // int sumaKolejna = zmiennaDlaLiczbCalkowitych + zmiennaDlaLiczbZmiennoprzecinkowych;



        System.out.println("11022023 Sekcja 3 - typy proste + sciaga.");

        // typy proste, ang. primitive types

        // info: 1 bajt = 8 bitów

        // liczby całkowite

        byte zmiennaByte = 10; //2^8
        System.out.println("Byte: " + zmiennaByte);
        System.out.println(Byte.MIN_VALUE + " " + Byte.MAX_VALUE);

        short zmiennaShort = 200; //2^16
        System.out.println("Short: " + zmiennaShort);
        System.out.println(Short.MIN_VALUE + " " + Short.MAX_VALUE);

        int zmiennaInt = 1000000; //2^32
        System.out.println("Int: " + zmiennaInt);
        System.out.println(Integer.MIN_VALUE + " " + Integer.MAX_VALUE);

        long zmiennaLong = 1000000000000l; //2^64
        System.out.println("Long: " + zmiennaLong);
        System.out.println(Long.MIN_VALUE + " " + Long.MAX_VALUE);

        // Liczby zmiennoprzecinkowe

        float zmiennaFloat = 12.123456789f; // 32 bity
        System.out.println("Float: " + zmiennaFloat);

        double zmiennaDouble = 12.123456789; // 64 bity
        System.out.println("Double: " + zmiennaDouble);

        // Pojedyncze znaki ang. character

        char zmiennaChar = 'a';
        System.out.println("Char: " + zmiennaChar);

        // Wartosci logiczne

        boolean zmiennaBoolean = false;
        System.out.println("Boolean: " + zmiennaBoolean);

        System.out.println("11022023 Sekcja 3 - zmienne dodatek.");

        int nazwaZmiennej = 10;
        int a;
        int b;
        int c4 = 5;
        int d;

        int e = 10, f, g, h, nazwaZmiennjDwa = 5;

        // int a; // variable is already defined in this scope

        a = 10;
        nazwaZmiennej = 101;

        System.out.println("11022023 Sekcja 3 - wartosci domyslne.");

        /*
        byte    0
        short   0
        int     0
        long    0L
        float   0.0f
        double  0.0d
        char    '\u0000'
        boolean false
         */
        System.out.println("domyslnyInt: " + domyslnyInt);
        System.out.println("domyslnyFloat: " + domyslnyFloat);
        System.out.println("domyslnyChar: " + domyslnyChar);
        System.out.println("domyslnyBollean: " + domyslnyBollean);

        System.out.println("Sekcja 3 - typy proste - konwertowanie.");

        int i = 6;
        double d2 = 2.2;
        // double d3 = i;

        System.out.println(i / d2);

        byte by = 100;
        int i3 = by;
        // by = i3;

        System.out.println("Rzutowanie, czyli konwertowanie niejawne, nie trzeba pisać typ danej w nawiasie.");

        double d3 = i;
        // int i2 = d;

        float fl = 123.22f;
        d2 = fl;
        // f = d2;

        System.out.println("Rzutowanie, czyli konwertowanie jawne, trzeba pisac typ danej w nawiasie.");

        long zmiennaLong2 = 123;
        int zmiennaInt2 = (int) zmiennaLong2;

        //konwertowanie niejawne
        zmiennaLong = zmiennaInt;
        zmiennaLong = 1234;
        zmiennaLong = 123456788445L;

        byte bajt = 102;
        // byte bajt2 = 1023;
        short shor = 10022;
        // short shor2 = 100220;
        int in = 12345674;
        // int in2 = 12345678901;

        in = bajt;
        in = shor;

        shor = bajt;

        //konwertowanie jawne (rzutowanie)
        zmiennaInt = (int) zmiennaLong;

        bajt = (byte) in;
        System.out.println("bajt: " + bajt);
        // przy konwertowaniu jawnym konwertujemy wieksze liczby do mniejszych, gdzie nastepuje uciecie, ponieważ brakuje danych

        System.out.println("Obliczanie konwertowanie niejawne.");

        int intObliczenia = 6;
        double doubleObliczenia = 2.2;

        double wynik = intObliczenia / doubleObliczenia;
        System.out.println("Obliczanie konwertowanie niejawne - wynik: " + wynik);

        System.out.println("Obliczanie konwertowanie jawne.");

        // int wynik2 = intObliczenia / doubleObliczenia;

        int wynik2 = intObliczenia / (int) doubleObliczenia;
        System.out.println("Obliczanie konwertowanie jawne - wynik: " + wynik2);

        System.out.println("Powazne roznice przy konwertowaniu typow zmiennych.");
        double doublePierwszy = 1.2;
        double doubleDrugi = 12.4;
        double wynikDouble = doubleDrugi / doublePierwszy;
        System.out.println("wynik double: " + wynikDouble);

        // int wynikInt = doubleDrugi / doublePierwszy;

        int wynikInt = (int) doubleDrugi / (int) doublePierwszy;
        System.out.println("Wynik int: " + wynikInt);

        int wynikInt2 = (int) (doubleDrugi / doublePierwszy);
        System.out.println("Wynik int2: " + wynikInt2);

        char c = 'C';
        int czyMogeZaczarowacInta = c;
        System.out.println("zaczarowany int: " + czyMogeZaczarowacInta);
        //ASCII codes













    }
}
