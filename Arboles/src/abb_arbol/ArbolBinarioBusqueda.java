package abb_arbol;

public class ArbolBinarioBusqueda {
    private Nodo raiz;
    public ArbolBinarioBusqueda(){

    }
    /*
    Arbol esta vacio o no
    */
    public Boolean estaVacio() {
        return raiz == null ;
    }
    /*
    Metodo recursivo para insertar un nodo a nuestro Abb
     */
    public  void insertar( Nodo padre, Nodo hijo, int dato){
        if(hijo==null){//base
            Nodo nuevo =new Nodo(null, dato,null);
            if (dato >= padre.getDato()){
                padre.setDerecha(nuevo);
            }else{
                padre.setIzquierdda(nuevo);
            }
        }else{
            if (dato >= padre.getDato()){
                insertar(hijo, hijo.getDerecha(), dato);
            }else{
                insertar(hijo, hijo.getIzquierdda(), dato);
            }
        }

    }

    public void insertar(int dato){
        if (estaVacio()){
            Nodo nuevo = new Nodo(null, dato, null);
            raiz = nuevo;
        }else{
            if (dato >= raiz.getDato()){
                insertar(raiz, raiz.getDerecha(), dato);
            }else{
                insertar(raiz, raiz.getIzquierdda(), dato);
            }
        }

    }

    private void mostrarInOrden(Nodo nodo){
        if (nodo == null){

        }else{
            mostrarInOrden(nodo.getIzquierdda());
            System.out.print(nodo.getDato()+ "  ");
            mostrarInOrden(nodo.getDerecha());
        }
    }

    public void mostrarInOrden(){
        Nodo temp = raiz;
        mostrarInOrden(raiz);
        System.out.println();
    }
}
