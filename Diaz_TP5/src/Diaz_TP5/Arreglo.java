package Diaz_TP5;

public class Arreglo {
    
    Arreglo(){
    }
    
    public static double sumarLista(double[] lista){
        double contador = lista.length;
        double sumTotal = 0;
        for(int i = 0; i<lista.length;i++){
            sumTotal =sumTotal + lista[i] ;
        }
        System.out.println("El promedio de los número que ingreso es " + sumTotal/contador + ".");
        System.out.println("La suma de todos los elementos es: " + sumTotal);
        return sumTotal/contador;
    }
    
    public static double buscarMayor(double[][] lista){
        double variable = 0;
        for(int i=0;i<lista.length;i++){
            for(int j=0;j<lista[i].length;j++){
                if(variable <lista[i][j]){
                    variable = lista[i][j];
                }
            }
        }
        System.out.println(variable);
        return variable;
    }
    
    public static int cuentaVocales(String palabra){
        int contador = 0;
        for(int i=0;i<palabra.length();i++) {
            if ((palabra.charAt(i)=='a') || (palabra.charAt(i)=='á') || (palabra.charAt(i)=='A') || (palabra.charAt(i)=='Á') || (palabra.charAt(i)=='e') || (palabra.charAt(i)=='é') || (palabra.charAt(i)=='E') || (palabra.charAt(i)=='É') || (palabra.charAt(i)=='i') || (palabra.charAt(i)=='í') || (palabra.charAt(i)=='I') || (palabra.charAt(i)=='Í') || (palabra.charAt(i)=='o') || (palabra.charAt(i)=='ó') || (palabra.charAt(i)=='O') || (palabra.charAt(i)=='Ó') || (palabra.charAt(i)=='u') || (palabra.charAt(i)=='ú') || (palabra.charAt(i)=='U') || (palabra.charAt(i)=='Ú') || (palabra.charAt(i)=='ü') || (palabra.charAt(i)=='Ü')){ 
                contador++;
            }
        }
        System.out.println("La cantidad de vocales son: " + contador);
        return contador;
    }
    
    public static int cuentaCaracter(String palabra, char car){
            int contador = 0;
        for(int i=0;i<palabra.length();i++) {
            if ((palabra.charAt(i)==car)){ 
                contador++;
            }
        }
        System.out.println("La cantidad de caracteres " + car + " que tiene la palabra: " + palabra + " son: " + contador + ".");
        return contador;
    }
}

/*
a) Método sumarLista que reciba por parámetro un arreglo unidimensional de enteros 
y muestre por pantalla la suma y promedio de los mismos.

b) Método buscarMayor que reciba por parámetro un arreglo bidimensional e 
irregular de enteros y retorne el entero más grande que se encuentra en el arreglo.

c) Método cuentaVocales, que reciba por parámetro un String 
y retorne la cantidad de vocales que tiene la cadena.

d) Método cuentaCaracter que reciba por parámetro un String y un caracter, 
luego retorne la cantidad de veces que se repite en la cadena el carácter recibido.

Luego desde el método main de una clase de nombre PruebaArreglo, 
invocar los métodos de la clase Arreglo creada por usted.
*/