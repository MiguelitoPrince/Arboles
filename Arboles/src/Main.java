import abb_arbol.ArbolBinarioBusqueda;

public class Main {
    public static void main(String[] args) {
        ArbolBinarioBusqueda Abb = new ArbolBinarioBusqueda();

        Abb.insertar(2);
        Abb.insertar(4);
        Abb.insertar(1);
        Abb.insertar(3);
        Abb.insertar(5);
        Abb.insertar(7);
        Abb.insertar(6);

        Abb.mostrarInOrden();

        Abb.insertar(8);
        Abb.insertar(11);
        Abb.insertar(2);

        Abb.mostrarInOrden();

    }

}
