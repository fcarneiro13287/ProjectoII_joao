import java.util.ArrayList;
import java.util.Scanner;

public class BibliotecaDeMusicas {
    private String nomeAlbum;
    private String titulo;
    private String compositor;
    private String interprete;
    private int ano;


    //contrutor sem parametros
    public BibliotecaDeMusicas() {
        this("Nenhum", "Nenhum", "Nenhum", "Nenhum", 0);
    }

    //construtor com parametros
    public BibliotecaDeMusicas(String nomeAlbum, String titulo, String compositor, String interprete, int ano) {
        setNomeAlbum(nomeAlbum);
        setTitulo(titulo);
        setCompositor(compositor);
        setInterprete(interprete);
        setAno(ano);

    }

    //getters e setters
    public String getNomeAlbum() {
        return nomeAlbum;
    }

    public void setNomeAlbum(String nomeAlbum) {
        this.nomeAlbum = nomeAlbum;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCompositor() {
        return compositor;
    }

    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }

    public String getInterprete() {
        return interprete;
    }

    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    //impressão do tipo de musica
    public String getTipo(){
        return "Biblioteca de: ";
    }

    //conteudo dos campos em forma de String
    public String getDetalhes()
    {
        return "Nome do album: " + getNomeAlbum() + "\n" +
                "Titulo da musica: " + getTitulo() + "\n" +
                "Compositor: " + getCompositor() + "\n" +
                "Interprete: " + getInterprete() + "\n" +
                "Ano: " + getAno() + "\n";
    }

    // Função para impressao dos dados via getDetalhes().
    public void printDados()
    {
        String s = getTipo() + "\n" + getDetalhes() + "\n";
        System.out.println(s);
    }

    // Função para leitura dos dados via teclado.
    public void inserirDados()
    {
        Scanner in = new Scanner(System.in);

        // Leitura dos dados do teclado.
        System.out.println("Nome do Album: ");
        String alb = in.nextLine();
        System.out.println("Titulo da Musica: ");
        String t = in.nextLine();
        //in.nextLine(); // Leitura do enter.
        System.out.println("Compositor: ");
        String c = in.nextLine();
        System.out.println("Interprete: ");
        String i = in.nextLine();
        System.out.println("Ano: ");
        int a = in.nextInt();

        // Enviando os dados lidos para as funcoes set.
        setNomeAlbum(alb);
        setTitulo(t);
        setCompositor(c);
        setInterprete(i);
        setAno(a);
    }
    //Pesquisas
    //Pesquisa por titulo de musica

    public void buscarTitulo(BibliotecaDeMusicas[] lista){
        System.out.println("Inserir o titulo da musica:");
        Scanner in = new Scanner(System.in);
        String idBuscar = in.nextLine();
        BibliotecaDeMusicas album = new BibliotecaDeMusicas();

        for (int i=0; i< lista.length; i++) {
            if(lista[i].getTitulo()==idBuscar){
               lista[i].printDados();
            }
        }
    }


}
