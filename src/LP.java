import java.util.Scanner;

public class LP extends BibliotecaDeMusicas{
    private int rotacoes;
    private int nFaixas;

    //construtor sem parametros
    public LP() {
        this("Nenhum", "Nenhum", "Nenhum", "Nenhum", 0,0,0);
    }

    //construtor com parametros
    public LP(String nomeAlbum, String titulo, String compositor, String interprete, int ano, int rotacoes, int nFaixas) {
        super(nomeAlbum, titulo, compositor, interprete, ano);
        setRotacoes(rotacoes);
        setnFaixas(nFaixas);

    }

    //Metodo para impressao do tipo.
    public String getTipo() {
        return "LP: ";
    }

    // Metodo que retorna o conteúdo do campos desta classe e da classe BibliotecaDeMusicas (usando super !).
    public String getDetalhes()
    { return super.getDetalhes() + "\n" +
            "Rotações do LP: " + rotacoes + "\n" +
            "Numero de musicas do LP: " + nFaixas + "\n";
    }

    public void setRotacoes(int rot){
        rotacoes = (rot > 0) ? rot : 0;
    }

    public void setnFaixas(int nfaixas) {
        nFaixas = (nfaixas > 0) ? nfaixas : 0;
    }

    // Metodo para leitura dos dados via teclado dos campos desta classe e dos campos da classe BibliotecasDeMusica (usando super !).
    public void inserirDados() {
        // Leitura dos dados contidos nos campos pertencentes a classe BilliotecaDeMusicas.
        super.inserirDados();
        Scanner in = new Scanner(System.in);

        // Leitura dos dados do teclado.
        System.out.println("Inserir valor das Rotações do LP: ");
        int rot = in.nextInt();

        System.out.println("Inserir numero de Faixas do LP: ");
        int nfaixas = in.nextInt();

        // Enviando os dados lidos para as funcoes set.
        setRotacoes(rot);
        setnFaixas(nfaixas);
    }
    public void buscarTitulo(BibliotecaDeMusicas[] lista){
        super.buscarTitulo(lista);
    }

}
