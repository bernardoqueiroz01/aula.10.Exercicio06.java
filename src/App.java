//Nome:Bernardo Candido de Queiroz 
//RA:1261948200
public class App {
    public static void main(String[] args) throws Exception {
        Filme filme = new Filme();
        filme.titulo = "Interestelar";
        filme.diretor = "Christopher Nolan";
        filme.anoLancamento = 2014;
        filme.duracao = 169;
        filme.nota = 9.2;

        filme.exibirDetalhes();
    }
}
