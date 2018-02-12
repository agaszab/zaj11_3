import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Listy {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        List<String> listaAr = new ArrayList<>();
        List<Integer> listaLn = new LinkedList<>();

        listaAr.add("sdfa");
        listaAr.add("sdfgsffa");

        listaLn.add(35);
        listaLn.add(44);


    //    String o = listaAr.get(0);
    //    String o1 = listaAr.get(1);

     //   String sum = o + o1;
     //   System.out.println(sum);

     //   boolean istnieje = listaAr.contains("sdfa");

     //   int size = listaAr.size();

        String element;
        int liczba;

        do {
            System.out.println("Wprowadź element listy w postaci znaków:");
            element=scan.nextLine();
            listaAr.add(element);

        } while (!element.equals("stop"));



        do {
            System.out.println("Wprowadź element listy w postaci liczby lub napisz <stop> jeśli chcesz skończyć:");

         try {
             element = scan.nextLine();
             liczba = Integer.valueOf(element);

             listaLn.add(liczba);

         } catch (NumberFormatException n){

             System.out.println("nie podales liczby");
         }

        } while (!element.equals("stop"));



    }
}
