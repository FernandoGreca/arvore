package model;

public class NoAVL {
    int chave, altura;
    NoAVL esquerdo, direito;

    NoAVL(int valor) {
        chave = valor;
        altura = 1;
    }
}
