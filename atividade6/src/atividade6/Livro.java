package atividade6;

public class Livro {
    private int numeroTotalPaginas;

    public Livro(int numeroTotalPaginas) {
        this.numeroTotalPaginas = numeroTotalPaginas;
    }

    public void lerPagina(int pagina) throws IllegalArgumentException {
        if (pagina < 1 || pagina > numeroTotalPaginas) {
            throw new IllegalArgumentException("Página inválida!");
        } else {
            System.out.println("Lendo a página " + pagina + " do livro.");
        }
    }

    public int getNumeroTotalPaginas() {
        return numeroTotalPaginas;
    }

    public void setNumeroTotalPaginas(int numeroTotalPaginas) {
        this.numeroTotalPaginas = numeroTotalPaginas;
    }
}