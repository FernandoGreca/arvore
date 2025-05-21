package model;

public class Arvore {
    private No primeiro;
    private int contador;

    public Arvore(String conteudo) {
        this.primeiro = new No(conteudo);
    }

    public No getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(No primeiro) {
        this.primeiro = primeiro;
    }
    
    public int contarNo() {
        No aux = this.primeiro;
        percorrerContanto(aux);
        return this.contador;
    }

    public void percorrerContanto(No aux) {
        if (aux.getFilhoEsquerda() != null) {
            this.contador++;
            percorrerContanto(aux.getFilhoEsquerda());
        }

        if (aux.getFilhoDireita() != null) {
            this.contador++;
            percorrerContanto(aux.getFilhoDireita());
        }
    }
}
