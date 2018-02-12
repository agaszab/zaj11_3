import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ListaDouble {

    public static void main(String[] args) {

        Locale.setDefault(new Locale("en", "US"));
        Scanner scan = new Scanner(System.in);
        List<Double> lista = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.println("Wprowadź liczbę:");
            double liczba = scan.nextDouble();
            lista.add(liczba);
        }


        for (int i = lista.size() - 1; i >= 0; i--) {
            System.out.println(lista.get(i));
        }


        double suma=0;

        for(int i = 2; i< 10; i+=2){
            suma+=lista.get(i);

        }

        System.out.println("Suma parzystych elementów listy: "+suma);

        double iloczyn=1;

        for(int i = 0; i< 10; i+=2){
            iloczyn*=lista.get(i);

        }

        System.out.println("Iloczyn nieparzystych elementów listy: "+iloczyn);

        double max=Double.MIN_VALUE;  //najmniejsza możliwa wartość double

        for(int i = 0; i< 10; i++){
         max=Double.max(max,lista.get(i));
        }

        System.out.println("Największy lelement listy: "+max);

    }

            }
