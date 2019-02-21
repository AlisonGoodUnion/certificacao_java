class InterfacePublicaExemplo implements B { //A
}
<<<<<<< HEAD
public interface B { //B //Erro de compilacao pois o arquivo só permite um item publico, neste caso a class já contém o nome do arquivo.java
=======
public interface B { //B //Erro de compilacao pois a classe InterfacePublicaExemplo
>>>>>>> ac6388de39d52b5e912a78074c0bb887360118cd
}
class C extends InterfacePublicaExemplo { //C
}
class D extends InterfacePublicaExemplo, implements B { //D //erro de compilacao pois nao e necessario virgula 
}