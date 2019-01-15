
class Pessoa {
    //enquanto o programa estivar em execucao a variavel static id estara na memoria.
    //ela sera compartilhada por toda instancia do objeto Pessoa
    static int id = 1;
}

class EscopoVariaveisEstaticas {

    public static void main (String[] args) {
        Pessoa p = new Pessoa();
        System.out.println(p.id);
        System.out.println(Pessoa.id);
    
    }
}