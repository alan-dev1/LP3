package aividade1;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
   
        List<Integer> numeros = new ArrayList<>();

 
        numeros.add(1032);
        numeros.add(654);
        numeros.add(56958);
        numeros.add(9854);
        numeros.add(560);
        
        System.out.println("Números na lista:");
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
    }
}
