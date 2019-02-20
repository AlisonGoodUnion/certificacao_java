class InterfacePublicaExemplo implements B { //A
}
public interface B { //B //Erro de compilacao pois o arquivo só permite um item publico, neste caso a class já contém o nome do arquivo.java
}
class C extends InterfacePublicaExemplo { //C
}
class D extends InterfacePublicaExemplo, implements B { //D //erro de compilacao pois nao e necessario virgula 
}