package model;

import java.util.LinkedList;
import java.util.Queue;

public class Arvore {
    private No primeiro;
    private int contador;
    private int contadorNoFolha;

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
        this.contador++;
        chamadoContarNoRecursivo(aux);
        return this.contador;
    }

    private void chamadoContarNoRecursivo(No aux) {
        if (aux.getFilhoEsquerda() != null) {
            this.contador++;
            chamadoContarNoRecursivo(aux.getFilhoEsquerda());
        }

        if (aux.getFilhoDireita() != null) {
            this.contador++;
            chamadoContarNoRecursivo(aux.getFilhoDireita());
        }
    }

    public int contarNoSemRecursao() {
        chamadoContarNoSemRecursao(this.primeiro);
        return this.contador;
    }

    private int chamadoContarNoSemRecursao(No aux) {
        Queue<No> fila = new LinkedList<No>();
        
        fila.add(aux);
        int cont = 1;

        while (aux != null) {
            cont++;
            if (aux.getFilhoEsquerda() != null) {
                fila.add(aux.getFilhoEsquerda());
            }
    
            if (aux.getFilhoDireita() != null) {
                fila.add(aux.getFilhoDireita());
            }

            fila.poll();
            aux = fila.peek();
        }
        return cont;
    }

    // Percorrer Pre Ordem
    public void percorrerPreOrdem() {
        chamadoPercorrerPreOrdemRecursivo(this.primeiro);
    }

    private void chamadoPercorrerPreOrdemRecursivo(No aux) {
        if (aux == null) return;

        System.out.println("Conteudo No " + aux.getConteudo());

        if (aux.getFilhoEsquerda() != null) {
            chamadoPercorrerPreOrdemRecursivo(aux.getFilhoEsquerda());
        }

        if (aux.getFilhoDireita() != null) {
            chamadoPercorrerPreOrdemRecursivo(aux.getFilhoDireita());
        }
    }

    // Percorrer Em Ordem
    public void percorrerEmOrdem() {
        chamadoPercorrerEmOrdemRecursivo(this.primeiro);
    }

    public void chamadoPercorrerEmOrdemRecursivo(No aux) {
        if (aux == null) return;

        if (aux.getFilhoEsquerda() != null) {
            chamadoPercorrerEmOrdemRecursivo(aux.getFilhoEsquerda());
        }

        System.out.println("Conteudo No " +aux.getConteudo());

        if (aux.getFilhoDireita() != null) {
            chamadoPercorrerEmOrdemRecursivo(aux.getFilhoDireita());
        }
    }

    // Percorrer Pos Ordem
    public void percorrerPosOrdem() {
        chamadoPercorrerPosOrdemRecursivo(this.primeiro);
    }

    private void chamadoPercorrerPosOrdemRecursivo(No aux) {
        if (aux == null) return;

        if (aux.getFilhoEsquerda() != null) {
            chamadoPercorrerPosOrdemRecursivo(aux.getFilhoEsquerda());
        }

        if (aux.getFilhoDireita() != null) {
            chamadoPercorrerPosOrdemRecursivo(aux.getFilhoDireita());
        }

        System.out.println("Conteudo No " + aux.getConteudo());
    }

    // Em nivel 
    public void percorrerEmNivel() {
        chamadoPercorrerEmNivel(this.primeiro);
    }
    
    private void chamadoPercorrerEmNivel(No aux) {
        Queue<No> fila = new LinkedList<No>();

        fila.add(aux);

        while (aux != null) {
            System.out.println("Conteudo No" + aux.getConteudo());
            if (aux.getFilhoEsquerda() != null) {
                fila.add(aux.getFilhoEsquerda());
            }
    
            if (aux.getFilhoDireita() != null) {
                fila.add(aux.getFilhoDireita());
            }

            fila.poll();
            aux = fila.peek();
        }
    }

    // Contar nó folha
    public int contarNoFolha() {
        contarNoFolhaRecursivo(this.primeiro);
        return this.contadorNoFolha;
    }
    private void contarNoFolhaRecursivo(No aux) {
        if (aux == null) return;

        if (aux.getFilhoEsquerda() != null) {
            contarNoFolhaRecursivo(aux.getFilhoEsquerda());
        }

        if (aux.getFilhoDireita() != null) {
            contarNoFolhaRecursivo(aux.getFilhoDireita());
        }

        if (aux.getFilhoEsquerda() == null && aux.getFilhoDireita() == null) {
            this.contadorNoFolha++;
        }
    }

}
