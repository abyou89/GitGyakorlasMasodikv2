
package gitgyakorlas2;

public class GitGyakorlas2 {


    public static int[] szamok = {1,4,9,5,6};

    public static void main(String[] args) {
        feladatok();
        kiir();
    }

    private static void feladatok() {
        szamokTombKiir();
        osszegzes();
        megszamlalas();
        maximumKivalasztas();
        minimumKivalasztas();
        kivalasztas();
        eldontes_1_vanLegalabbEgy();
        eldontes_2_mind();
        linearisKereses();
    
    }
    
     private static void szamokTombKiir() {
        System.out.print("A tomb elemei: ");
        for (int i = 0; i < szamok.length; i++) {
            System.out.print(szamok[i] + " ");
        }
        System.out.println("");
     
     }

    private static int osszegzes() {
        int osszeg = 0;
        for (int i = 0; i < szamok.length; i++) {
            osszeg += szamok[i];
        }
        return osszeg;
    }

    private static int megszamlalas() {
        int darab = 0;
        for (int i = 0; i < szamok.length; i++) {
            if(szamok[i] % 2 == 0){
                darab++;
            }
        }
        return darab;
    }

    private static int maximumKivalasztas() {
        int maxIndex = 0;
        for (int i = 0; i < szamok.length; i++) {
            if(szamok[i] > szamok[maxIndex]){
                maxIndex = i;
            }
        }    
        
        return maxIndex;
    }
    

    private static int minimumKivalasztas() {
       int minIndex = 0;
        for (int i = 0; i < szamok.length; i++) {
            if(szamok[i] < szamok[minIndex]){
                minIndex = i;
            }
        }
        return minIndex;
    
    }

    private static int kivalasztas() {
       
    return 0;
    }

    private static boolean eldontes_1_vanLegalabbEgy() {
       
    return false;
    }

    private static boolean eldontes_2_mind() {
        
    return false;
    }

    private static int linearisKereses() {
        
    return 0;
    }

    private static void kiir() {
        System.out.println("A szamok összege: " + osszegzes());
        System.out.println("Párosak száma: " + megszamlalas());
        System.out.println("A sorozat legnagyobb eleme: " + szamok[maximumKivalasztas()]);
        System.out.println("A legnagyobb elem helye: " + maximumKivalasztas());
        System.out.println("A sorozat legnagyobb eleme: " + szamok[minimumKivalasztas()]);
        System.out.println("A legnagyobb elem helye: " + minimumKivalasztas());
    }
}
