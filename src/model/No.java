package model;

public class No {
    private String conteudo;
    private No filhoEsquerda;
    private No filhoDireita;
    private int fatorDeBalanceamento;

    public No(String conteudo) {
        this.conteudo = conteudo;
        this.filhoEsquerda = null;
        this.filhoDireita = null;
        this.fatorDeBalanceamento = 0;
    }

    public String getConteudo() {
        return conteudo;
    }
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
    public No getFilhoEsquerda() {
        return filhoEsquerda;
    }
    public void setFilhoEsquerda(No filhoEsquerda) {
        this.filhoEsquerda = filhoEsquerda;
    }
    public No getFilhoDireita() {
        return filhoDireita;
    }
    public void setFilhoDireita(No filhoDireita) {
        this.filhoDireita = filhoDireita;
    }
    public int getFatorDeBalanceamento() {
        return fatorDeBalanceamento;
    }
    public void setFatorDeBalanceamento(int fatorDeBalanceamento) {
        this.fatorDeBalanceamento = fatorDeBalanceamento;
    }
}
