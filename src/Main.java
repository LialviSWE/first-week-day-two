import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);

       //Övning 1.1

        /*System.out.println("Namn; Alexandra");
        System.out.println("Ålder; 33");
        System.out.println("Studerar: Systemutvecklare med testinriktning");
        System.out.println("Varför? : För att jag tycker det är intressant och vill prova något nytt.");
        */

        //Övning 1.2 - matematik

        /*double x = 6;
        double y= 8;
        double area = x*y;
        double omkrets = x*2+y*2;

        System.out.println("Arean är "+area+" kvm");
        System.out.println("Omkretsen är "+omkrets+ "m");
        */

        //Övning 1.3
        // Använd minst 5 olika variabler av olika datatyper:
        // - String för namn och favoritmat
        /*String namn = "Alexandra";
        String mat = "fiskbullar";

        // - int för ålder och antal syskon
        int alder = 33;
        int syskon = 2;

        // - double för längd i meter
        double langd = 1.67;

        // - boolean för om du gillar kaffe
        boolean kaffe = true;

        // Skriv ut en fin presentation av dig själv
        System.out.println("Mitt namn är "+namn+"och jag gillar "+mat+".");
        System.out.println("Jag är "+alder+" år gammal och har "+syskon+" syskon.");
        System.out.println("Jag är "+langd+" m lång och... gillar jag kaffe? ");
        System.out.println("That is "+kaffe); */

        //Övning 2.1 - input och output
        // Skapa ett program som:
        // 1. Frågar användaren vad de heter
        /*System.out.println("Vad heter du? ");
        String name = input.nextLine();

        // 2. Frågar hur gammal de är
        System.out.println("Hur gammal är du? ");
        int alder = input.nextInt();
        input.nextLine();

        // 3. Frågar var de bor
        System.out.println("Var bor du? ");
        String var = input.nextLine();

        System.out.println();
        */
        // 4. Skriver ut en personlig hälsning med all information


        //System.out.println("Vad trevligt att träffa dig "+name+"!");
        //System.out.println("Intressant att du är "+alder+" år gammal och bor i "+var);
        //System.out.println("Ha en bra dag!");

        //Övning 2.2
        // Skapa ett program som:
        // 1. Frågar efter två tal
        /*System.out.println("Vänligen skriv in två olika tal:");
        System.out.print("Tal 1: ");
        double tal1 = input.nextDouble();
        System.out.print("Tal 2: ");
        double tal2 = input.nextDouble();
        input.nextLine();

        // 2. Räknar ut summan
        double summan = tal1+tal2;
        // 3. Räknar ut produkten
        double produkt = tal1*tal2;
        // 4. Räknar ut genomsnittet
        double genomsnitt = summan/2;
        // 5. Skriver ut alla resultat
        System.out.println("Med de inskrivna talen blir summan; "+summan);
        System.out.println("Produkten blir: "+produkt);
        System.out.println("Och genomsnittet blir: "+genomsnitt);
        */

        //Övning 2.3
        // Skapa ett program som:
        // 1. Frågar efter ett belopp i SEK
        /*System.out.println("Var god ange ett belopp i SEK: ");
        double beloppSek = input.nextDouble();
        input.nextLine();

        // 2. Konverterar till EUR (ca 0.085)
        double beloppEur = beloppSek*1.085;

        // 3. Konverterar till USD (ca 0.091)
        double beloppUsd = beloppSek*1.091;

        // 4. Skriver ut alla belopp snyggt formaterat
        System.out.println("Belopp i SEK; "+beloppSek+" kr");
        System.out.println("Belopp i EUR; "+beloppEur+" £");
        System.out.println("Belopp i USD; "+beloppUsd+" $"); */

        //Övning 3.1
        // Skapa ett program som:
        // 1. Frågar efter användarens ålder
        System.out.println("Ålder: ");
        int age = input.nextInt();

        // 2. Talar om om de får köra bil (18+)
        if (age >18){
            System.out.println("Då får du köra bil!");
        } else  {
            System.out.println("Då är du för ung för att köra!");
        }

        // 3. Talar om om de får köpa alkohol (20+)
        if (age >20){
            System.out.println("Då får du köpa alkohol!");
        } else {
            System.out.println("Då är du för ung för att köpa alkohol");
        }

        // 4. Talar om om de får gå på Systembolaget (20+)
        if (age >20){
            System.out.println("Då får du handla på Systemet!");
        } else {
            System.out.println("Då är du för ung för att handla på systemet..");
        }

        // 5. Talar om om de är pensionärer (65+)
        if (age >65){
            System.out.println("Då är du ju pensionär!");
        } else {
            System.out.println("Då är du inte pensionär än..");
        }



    }
}