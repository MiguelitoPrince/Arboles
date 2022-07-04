package abb_arbol;

public class Nodo {
    private abb_arbol.Nodo izquierdda;
    private int dato;
    private abb_arbol.Nodo derecha;

    public Nodo(abb_arbol.Nodo izquierdda, int dato, abb_arbol.Nodo derecha) {
        this.setIzquierdda(izquierdda);
        this.setDato(dato);
        this.setDerecha(derecha);
    }

    public abb_arbol.Nodo getIzquierdda() {
        return izquierdda;
    }

    public void setIzquierdda(abb_arbol.Nodo izquierdda) {
        this.izquierdda = izquierdda;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public abb_arbol.Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(abb_arbol.Nodo derecha) {
        this.derecha = derecha;
    }
}
