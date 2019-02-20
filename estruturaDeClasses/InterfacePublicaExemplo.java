class InterfacePublicaExemplo implements B { //A
}
public interface B { //B //Erro de compilacao pois a classe InterfacePublicaExemplo
}
class C extends InterfacePublicaExemplo { //C
}
class D extends InterfacePublicaExemplo, implements B { //D //erro de compilacao pois nao e necessario virgula 
}