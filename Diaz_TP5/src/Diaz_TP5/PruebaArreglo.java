package Diaz_TP5;

public class PruebaArreglo {

    public static void main(String[] args) {
        double[] xd= {14,15,3,5,6,7};
        double[][] listado = {{1},{3,4},{5,6},{7},{0,9}};
        Arreglo.sumarLista(xd);
        Arreglo.buscarMayor(listado);
        Arreglo.cuentaVocales("Supercalifragilisticoespialidoso");
        Arreglo.cuentaCaracter("Supercalifragilisticoespialidoso", 'i');
        Arreglo.cuentaCaracter("Supercalifragilisticoespialidoso", 'r');
        Arreglo.cuentaCaracter("Supercalifragilisticoespialidoso", 'S');
    }
}