package model.arvore_red_black;

enum Color {
    RED, BLACK
}

public class NoRB {
    int key;
    Color color;
    NoRB left, right, parent;

    NoRB(int key) {
        this.key = key;
        this.color = Color.RED;
        this.left = null;
        this.right = null;
        this.parent = null;
    }
}
