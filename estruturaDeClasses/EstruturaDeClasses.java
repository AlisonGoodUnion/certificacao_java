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
  /** teste comentario*/

  String estrutura;
  EstruturaDeClasses(String estrutura) {
    this.estrutura = estrutura;
  }
  public String getEstrutura() {
    return estrutura;
  }
}

interface estrutura {
}

