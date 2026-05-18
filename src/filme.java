public class Filme {
    String titulo;
    String diretor;
    int anoLancamento;
    int duracao;
    double nota;
    


    public void exibirDetalhes(){
        System.out.println("Título: " + titulo + "\nDiretor: " + diretor + "\nDuração: " + duracaoFormatada(duracao) + "\nNota: " + nota + "\nRecomendado: " + recomendacao(false)  );
    }


    public String duracaoFormatada(int duracao){
        
        int x = duracao/60;
        int y = duracao%60;
        return x + "h "+ y + "m";
    }



    public boolean recomendado(double nota){
        if (nota >= 7) {
            return true;
        } else{
            return false;
        }
    }

    public String recomendacao(boolean nota){
        if (nota = true) {
            return "Sim";
        } else{
            return "Não";
        }
    }
}
    