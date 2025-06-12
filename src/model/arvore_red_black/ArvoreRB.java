package model.arvore_red_black;

public class ArvoreRB {
    private NoRB raiz;
    private final NoRB NIL;

    ArvoreRB () {
        this.NIL = new NoRB(-1);
        this.NIL.color = Color.BLACK;
        this.NIL.left = NIL.right = NIL.parent = null;
        this.raiz = NIL;
    }

    private void leftRotate(NoRB x) {
        NoRB y = x.right;
        x.right = y.left;
        if (y.left != this.NIL) y.left.parent = x;

        y.parent = x.parent;

        if (x.parent == null) this.raiz = y;
        else if (x == x.parent.left) x.parent.left = y;
        else x.parent.right = y;

        y.left = x;
        x.parent = y;
    }

    private void rightRotate(NoRB y) {
        NoRB x = y.right;
        y.right = x.left;
        if (x.left != this.NIL) x.left.parent = y;

        x.parent = y.parent;

        if (y.parent == null) this.raiz = x;
        else if (y == y.parent.left) y.parent.left = x;
        else y.parent.right = x;

        x.left = y;
        y.parent = x;
    }

    private void inserir(int key) {
        NoRB node = new NoRB(key);
        node.left = node.right = node.parent = NIL;

        NoRB y = null;
        NoRB x = this.raiz;
    }
}
