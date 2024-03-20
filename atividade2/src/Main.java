import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> listaDeCompras = new ArrayList<>();

        listaDeCompras.add("Maçã");
        listaDeCompras.add("Banana");
        listaDeCompras.add("Leite");
        listaDeCompras.add("Pão");

        System.out.println("Itens na lista de compras:");
        for (String item : listaDeCompras) {
            System.out.println(item);
        }

     
        listaDeCompras.remove("Banana");

        System.out.println("\nLista de compras após remover 'Banana':");
        for (String item : listaDeCompras) {
            System.out.println(item);
        }
    }
}