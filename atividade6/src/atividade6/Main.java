package atividade6;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro(100);
        try {
            livro.lerPagina(50); 
            livro.lerPagina(110); 
        } catch (IllegalArgumentException e) {
            System.out.println("Exceção: " + e.getMessage());
        }
    }
}
