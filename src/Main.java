import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Produse>produses=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("""
                         Meniul este urmatorul:
                1-Afişarea tuturor echipamentelor
                2-Afişarea imprimantelor
                3-Afişarea copiatoarelor
                4-Afişarea sistemelor de calcul
                5-Modificarea stării în care se află un echipament\s
                6-Setarea unui anumit mod de scriere pentru o imprimantă
                7-Setarea unui format de copiere pentru copiatoare\s
                8-Instalarea unui anumit sistem de operare pe un sistem de calcul\s
                9-Afişarea echipamentelor vândute
                
                
                """);
        while (true){
            System.out.println("Alegeti o optiune din meniu : ");
            int optMeniu= scanner.nextInt();
            switch (optMeniu){
                case 1:
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 6:
                    break;

                case 7:
                    break;

                case 8:
                    break;

                case 9:
                    break;
            }
        }
    }
}