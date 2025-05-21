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
    
    // Contar No
    public int contarNo() {
        No aux = this.primeiro;
        percorrerContanto(aux);
        return this.contador;
    }

    private void percorrerContanto(No aux) {
        if (aux.getFilhoEsquerda() != null) {
            this.contador++;
            percorrerContanto(aux.getFilhoEsquerda());
        }

        if (aux.getFilhoDireita() != null) {
            this.contador++;
            percorrerContanto(aux.getFilhoDireita());
        }
    }

    // Percorrer Pre Ordem
    public void percorrerPreOrdem() {
        chamadoPercorrerPreOrdem(this.primeiro);
    }

    private void chamadoPercorrerPreOrdem(No aux) {
        System.out.println("Conteudo No " + aux.getConteudo());

        if (aux.getFilhoEsquerda() != null) {
            chamadoPercorrerPreOrdem(aux.getFilhoEsquerda());
        }

        if (aux.getFilhoDireita() != null) {
            chamadoPercorrerPreOrdem(aux.getFilhoDireita());
        }
    }

    // Percorrer Em Ordem
    public void percorrerEmOrdem() {
        chamadoPercorrerEmOrdem(this.primeiro);
    }

    public void chamadoPercorrerEmOrdem(No aux) {
        if (aux.getFilhoEsquerda() != null) {
            chamadoPercorrerEmOrdem(aux.getFilhoEsquerda());
        }

        System.out.println("Conteudo No " +aux.getConteudo());

        if (aux.getFilhoDireita() != null) {
            chamadoPercorrerEmOrdem(aux.getFilhoDireita());
        }
    }
}
