import model.arvore.Arvore;
import model.arvore.No;

public class App {
    public static void main(String[] args) throws Exception {
        Arvore arvore = new Arvore("A");

        arvore.getPrimeiro().setFilhoDireita(new No("C"));
        arvore.getPrimeiro().setFilhoEsquerda(new No("B"));

        arvore.getPrimeiro().getFilhoEsquerda().setFilhoEsquerda(new No("D"));
        arvore.getPrimeiro().getFilhoEsquerda().setFilhoDireita(new No("E"));

        arvore.getPrimeiro().getFilhoDireita().setFilhoDireita(new No("F"));


        System.out.println("________________");
        System.out.println("Quantidade de Nos " + arvore.contarNo());
        System.out.println("Quantidade de Nos sem Resursao " + arvore.contarNoSemRecursao());
        System.out.println("________________");

        System.out.println();

        System.out.println("________________");
        System.out.println("Percorendo Pre Ordem");
        arvore.percorrerPreOrdem();
        System.out.println("________________");

        System.out.println();

        System.out.println("________________");
        System.out.println("Percorendo Em Ordem");
        arvore.percorrerEmOrdem();
        System.out.println("________________");

        System.out.println();

        System.out.println("________________");
        System.out.println("Percorendo Pos Ordem");
        arvore.percorrerPosOrdem();
        System.out.println("________________");

        System.out.println();

        System.out.println("________________");
        System.out.println("Percorrendo em nivel");
        arvore.percorrerEmNivel();
        System.out.println("________________");

        System.out.println();

        System.out.println("________________");
        System.out.println("Contar Nó folha");
        System.out.println("Nós folha: " + arvore.contarNoFolha());
        System.out.println("________________");

        System.out.println();

        System.out.println("________________");
        System.out.println("Contar Nó folha sem recursao");
        System.out.println("Nós folha: " + arvore.contarNoFolhaSemRecusao());
        System.out.println("________________");
    }
}
