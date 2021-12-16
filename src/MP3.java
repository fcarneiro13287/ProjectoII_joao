import java.util.Scanner;

public class MP3 extends BibliotecaDeMusicas{

    private float tamBytes;
    private int nMP3;

    //construtor sem parametros
    public MP3() {
        this("Nenhum", "Nenhum", "Nenhum", "Nenhum", 0,0,0);
    }

    //construtor com parametros
    public MP3(String nomeAlbum, String titulo, String compositor, String interprete, int ano, float tamBytes, int nMP3) {
        super(nomeAlbum, titulo, compositor, interprete, ano); //chamada ao construtor da classe BibliotecaDeMusicas
        setTamBytes(tamBytes);
        setMusica(nMP3);
    }

    //Metodo para impressao do tipo.
    public String getTipo() {
        return "MP3: ";
    }

    // Metodo que retorna o conteúdo do campos desta classe e da classe BibliotecaDeMusicas (usando super !).
    public String getDetalhes()
    { return super.getDetalhes() + "\n" + "Tamanho em Bytes: " + tamBytes +  "\n" + "Numero musicas MP3: " + nMP3;
    }



    public void setTamBytes(float tbytes){
        tamBytes = (tbytes > 0) ? tbytes : 0;
    }

    public void setMusica(int mp3) {
        nMP3 = (mp3 > 0) ? mp3 : 0;
    }

    // Função para leitura dos dados via teclado dos campos desta classe e dos campos da classe BibliotecaDeMusica (usando super !).
    public void inserirDados() {
        // Leitura dos dados contidos nos campos pertencentes a classe BilliotecaDeMusicas.
        super.inserirDados();
        Scanner in = new Scanner(System.in);

        // Leitura dos dados do teclado.
        System.out.println("Insira tamanho em Bytes: ");
        float tbytes = in.nextFloat();


        System.out.println("Entre com o numero de musicas em MP3: ");
        int mp3 = in.nextInt();

        // Enviando os dados lidos para as funcoes set.
        setTamBytes(tbytes);
        setMusica(mp3);

    }
    public void buscarTitulo(BibliotecaDeMusicas[] lista){
        super.buscarTitulo(lista);
    }

}