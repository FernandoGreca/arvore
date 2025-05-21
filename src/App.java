import model.Arvore;
import model.No;

public class App {
    public static void main(String[] args) throws Exception {
        Arvore arvore = new Arvore("A");

        arvore.getPrimeiro().setFilhoDireita(new No("C "));
        arvore.getPrimeiro().setFilhoEsquerda(new No("B"));

        arvore.getPrimeiro().getFilhoEsquerda().setFilhoEsquerda(new No("D"));
        arvore.getPrimeiro().getFilhoEsquerda().setFilhoDireita(new No("E"));

        arvore.getPrimeiro().getFilhoDireita().setFilhoDireita(new No("F"));

        System.out.println(arvore.contarNo());
        arvore.percorrerPreOrdem();
    }
}
