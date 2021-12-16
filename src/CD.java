import java.util.Scanner;

public class CD extends BibliotecaDeMusicas {

    private int nMusicas;

    //construtor sem parametros
    public CD() {
        this("Nenhum", "Nenhum", "Nenhum", "Nenhum", 0, 0);
    }

    //construtor com parametros
    public CD(String nomeAlbum, String titulo, String compositor, String interprete, int ano, int nMusicas) {

        super(nomeAlbum, titulo, compositor, interprete, ano);
        setMusica(nMusicas);
    }

    //Metodo para impressao do tipo.
    public String getTipo() {
        return "CD: ";
    }

    // Metodo que retorna o conteúdo do campos desta classe e da classe Biblioteca de Musicas (usando super !).
    public String getDetalhes()
    { return super.getDetalhes() + "\nNumero de musicas: " + nMusicas + "\n";
    }

    public void setMusica(int nmus) {
        nMusicas = (nmus > 0) ? nmus : 0;
    }

    // Metodo para leitura dos dados via teclado dos campos desta classe e dos campos da classe Biblioteca de musicas (usando super !).
    public void inserirDados() {

        // Leitura dos dados contidos nos campos pertencentes a classe BilliotecaDeMusicas.
        super.inserirDados();
        Scanner in = new Scanner(System.in);

        // Leitura dos dados do teclado.
        System.out.println("Inserir o numero de musicas: ");
        int nmus = in.nextInt();

        // Enviando os dados lidos para as funcoes set.
        setMusica(nmus);
    }

    public void buscarTitulo(BibliotecaDeMusicas[] lista){
        super.buscarTitulo(lista);
    }

}
