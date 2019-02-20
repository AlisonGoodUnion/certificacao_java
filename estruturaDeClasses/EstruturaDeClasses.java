/**
  * Uma classe é composta de (Todas são opcionais!!!)
  * quando não informado package é utilizado package 'default'
  * 1º pacote que é opcional
  * 2º imports
  * 3º class
  * 4º interface
  * Obs: Comentarios podem ser inseridos em quaquer local, menos no meio de nomes de metodos e atritubos.
  * comentarios podem ser criados com // /* ou utilizando 2 *
*/
package estruturaDeClasses;
//ARQUIVO NAO COMPILA SE TIVER IMPORTS APOS DEFINICAO DE CLASSE!
import java.util.Date;
import java.io.*;

/** É possível criar atributo e classe contendo mesmo nome */
class carro { // ate mesmo não estando no padrão Java CamelCase o projeto compila
  int carro;
  carro() { // podemos tambem ter um metodo construtor onde, diferente 
            // do metodo ele nao cotém retorno conforme nosso exemplo a baixo o void.!
  }
  void carro() { // tambem e possivel ter um metodo contendo mesmo nome de classe

  }
}
class Carro {
  int Carro; // atributos contendo mesmo nome Compila com sucesso!
  int carro;
}

/**
 * JavaDoc
 */
class /* teste */ EstruturaDeClasses {

  /* variavel de classe static, independente de quantas instancias, a variavel sempre é epenas uma.
  independente de seu valor
  */
  static int totalEstruturas = 20;

  /** teste comentario*/

  String estrutura;
  EstruturaDeClasses(String estrutura) { // Construtor não possue retorno.
    this.estrutura = estrutura;
    return; /* é possível criar returns Vazios.... sem nada! em casos de if else,
     é possível dar return em qualquer fluxo de construtores.
     */
  }
  public String getEstrutura() {
    return estrutura;
  }
}

interface ESTRUTURA {
  /* interfaces podem ter:
        variaveis constantes;
        metodos abstratos publicos;

        por padrão em interfaces: metodos são abstracts 
        e os atributos são statics
  */

  public final static int PUBLIC_FINAL_STATIC_INT = 20;
  final int FINAL_INT = 20; // Sem public e static... compila com sucesso
  int INT = 20; // Sem final... compila com sucesso
  public abstract void publicAnstract(String nome, String sobreNome); // compila com sucesso
  void nomeEstrutura(String nome, String sobreNome); // Sem public e static... compila com sucesso
}

class C {
  C(){
    //ESTRUTURA.FINAL_INT = 15; // NAO COMPILA POIS NAO E POSSIVEL ALTERAR O ATRIBUTO PUBLIC STATIC FINAL
  }    
}

// interface classe ou tipo se publico a classe só pode ter um, já não publico pode ter vários!
// se publico, tem que ter o mesmo nome do arquivo! (se pode ser acessado de outro pacote 
// deve ser de facil acesso por isso deve ter o mesmo nome)

