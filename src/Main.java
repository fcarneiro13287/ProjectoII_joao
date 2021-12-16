import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Cria um vetor de elementos que são objetos da classe Biblioteca de Musicas.
        BibliotecaDeMusicas[] lista = new BibliotecaDeMusicas[30];
        int opcao, i=15;
        boolean cond_while = true;

        //lista de 5 CDs
        lista[0]=new CD("Oceano","Novelas","DJavan","DJavan",1989,12);
        lista[1]=new CD("Cigano","Ao Vivo (vol. 1)", "DJavan","DJavan",1990,12);
        lista[2]=new CD("Sorri","Ao Vivo (vol. 2)", "DJavan","DJavan",1996,13);
        lista[3]=new CD("Infinito Particular","Infinito Particular", "Marisa Monte","Marisa Monte",2006,10);
        lista[4]=new CD("Universo ao meu redor","Universo ao meu redor", "Marisa Monte","Marisa Monte",2006,8);
        //lista de 5 MP3s
        lista[5]=new MP3("Here I go again","White Album","White Snake","White Snake",1987,47,3);
        lista[6]=new MP3("With or Without You","The Joshua Tree","U2","U2",1987, 51,12);
        lista[7]=new MP3("In the Air Tonight","Face Value","Phil Collins","Phil Collins",1981,58,13);
        lista[8]=new MP3("Total Eclipse of the Heart","Faster than the speed of Night","Jim Steinman","Bonnie Tyler",1983, 58,10);
        lista[9]=new MP3("Time after time","She is so Unusual","Cyndi Lauper","Cyndi Lauper",1984, 42,14);
        //lista de 5 LPs
        lista[10]=new LP("Smells Like Teen Spirit","Nevermind","Nirvana","Nirvana",1991,33,10);
        lista[11]=new LP("Come as you are","Nevermind", "Nirvana","Nirvana",1992,33,10);
        lista[12]=new LP("Lithium","Nevermind","Nirvana","Nirvana",1992,33,10);
        lista[13]=new LP("In Bloom","Nevermind","Nirvana","Nirvana",1992,33,10);
        lista[14]=new LP("Bettlebum","Blur","Blur","Blur",1992,45,12);

        while (cond_while)
        {
            // Utilizador escolhe que opcao pertende executar na BD.
            System.out.println("1. Registro de CD");
            System.out.println("2. Registro de MP3");
            System.out.println("3. Registro de LP");
            System.out.println("4. Pesquisa por Titulo de Musica");
            System.out.println("5. Pesquisa por Compositor");
            System.out.println("6. Pesquisa por Interprete");
            System.out.println("7. Pesquisa por Periodo");
            System.out.println("8. Pesquisa por Tamanho de MP3");
            System.out.println("9. Ver Lista de Musicas");

            Scanner in = new Scanner(System.in);
            opcao = in.nextInt();

            switch (opcao){
                case 0: //Sair do menu
                    cond_while=false;
                    break;
                case 1:// Criar CD.
                    lista[i] = new CD(); // Inserir dados no objeto criado seja CD, LP ou MP3
                    lista[i].inserirDados();
                    break;
                case 2: // Criar MP3.
                    lista[i] = new MP3();
                    lista[i].inserirDados(); // Inserir dados no objeto criado seja CD, MP3 ou LP.
                case 3: //Criar LP
                    lista[i] = new LP();
                    lista[i].inserirDados(); // Inserir dados no objeto criado seja CD, LP ou MP3.
                    break;
                case 4: //pesquisa por titulo de musica
                    //System.out.println("pesquisa titulo de musica- under work");
                    //BibliotecaDeMusicas alb1 = new BibliotecaDeMusicas();
                    alb1.buscarTitulo(lista);
                    lista[1].buscarTitulo()
                    break;
                case 5: //pesquisa por compositor
                    System.out.println("pesquisa por compositor - under work");
                    break;
                case 6: //pesquisa por interprete
                    System.out.println("pesquisa por interprete - under work");
                    break;
                case 7: //pesquisa por periodo
                    System.out.println("pesquisa por periodo - under work");
                    break;
                case 8: //pesquisa por tamanho mp3
                    System.out.println("pesquisa por tamanho mp3 - under work");
                    break;
                case 9: //imprimir lista de musicas
                    for(int j=0;j<14;j++) {
                        lista[j].printDados();
                    }
                    break;
                default:
                    System.out.println("Opção inválida!!");
            }
        }

    }
}

