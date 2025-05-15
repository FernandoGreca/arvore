package model;

public class Arvore {
    private No primeiro;

    public Arvore(String conteudo) {
        this.primeiro = new No(conteudo);
    }

    public No getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(No primeiro) {
        this.primeiro = primeiro;
    }
    
}
