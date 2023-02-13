public class Sekcja8 {
    public static void main(String[] args) {

        System.out.println("Sekcja 8: instrukcje warunkowe, ang. conditional statements.");

        if(true) {
            System.out.println("Warunek zostal spelniony.");
        }
        if(false) {
            System.out.println("Warunek zostal spelniony.");
        }

        int wiek = 15;
        if(wiek >= 18) {
            System.out.println("Osoba moze dokonac zakupu.");
        }

        int wiek1 = 20;
        if(wiek1 >= 18) {
            System.out.println("Osoba moze dokonac zakupu.");
        }
        int wiek2 = 15;
        if(wiek2 >= 18) {
            System.out.println("Osoba moze dokonac zakupu.");
        } else {
            System.out.println("Wypros osobe ze sklepu.");
        }

        int wiek3 = 18;
        if(wiek3 >= 18) {
            System.out.println("Osoba moze dokonac zakupu.");
        } else {
            System.out.println("Wypros osobe ze sklepu.");
        }

        System.out.println("");

            int wiek4 = 15;
            boolean przyszedlTata = true;
            if(wiek4>=18) {
                System.out.println("Osoba moze dokonac zakupu.");
            } else if(przyszedlTata == true) {
                System.out.println("Podaj towar.");
            }
            else {
                System.out.println("Wypros osobe ze sklepu.");
            }
            System.out.println("");

            int wiek5 = 15;
            boolean przyszedlTata2 = true;
            boolean przyszlaMama = true;

            if(wiek5>=18) {
                System.out.println("Moze dokonac zakupu");
            }
            else if (przyszedlTata2 == true) {
                System.out.println("Podaj towar Tacie.");
            }

            else if(wiek5 >= 18 && przyszlaMama == true) {
                System.out.println("Podaj towar Mamie");
            }

            else {
                System.out.println("Wypros osobe ze sklepu.");
            }

        int wiek6 = 15;
        boolean przyszedlTata3 = false;
        boolean przyszlaMama2 = true;

        if(wiek6 >=18) {
            System.out.println("Moze dokonac zakupu");
        }
        else if (przyszedlTata3 == true) {
            System.out.println("Podaj towar Tacie.");
        }

        else if(wiek6 < 18 && przyszlaMama2 == true) {
            System.out.println("Podaj towar Mamie");
        }

        else {
            System.out.println("Wypros osobe ze sklepu.");
        }
        System.out.println("");
        System.out.println("Sekcja 8: instrukcja wielokrotnego wyboru, ang. switch.");


        }


}

