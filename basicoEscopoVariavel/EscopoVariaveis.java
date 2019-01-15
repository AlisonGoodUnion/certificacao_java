class EscopoVariaveis {

    public void escopoFor() {
        // e possivel executar o for mesmo sem as chaves
        //e os atributos do for não podem ser acessador fora do seu escopo.
        for(int i = 0, j = 0; i<=10; i++) { 
            j++;
        }
        //Ocorre erro 'annot find symbol'
        //System.out.println(i);
        //System.out.println(j);
    }

    public void atributoSimples() {
        //variavel local existe dentro do bloco m1
        int x = 10;

        if (x >= 10) {
            // y existe apenas nesse bloco! fora não existe, 
            // então se declarar fora ocorre erro.
            int y = 20;
            System.out.println(y);
        }

        System.out.println(x);
    }


    //Exemplos de acesso ao atributo de escopo utilizando em outro metodo
    public void m1(String nome) {
        System.out.println(nome);
    }

    public void m2() {
        // se descomentar esse system ocorre erro 
        // pois nome não existe e também não é possível acessar nome
        // passado por parametro no metodo m1
        // System.out.println(nome);
    }
    //------------
        

    public static void main(String[] args) {
        EscopoVariaveis ev = new EscopoVariaveis();

        ev.atributoSimples();
        ev.escopoFor();
        ev.m1("Nome");
    }
}
