package pqtContarPalabras;

import java.util.Scanner;

public class LeerMain {
    //int [] contador;
   char caracter;
   static final String TEXTO_PEDIR_CADENA = "Introduzca un conjunto de caracteres:";


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(TEXTO_PEDIR_CADENA);
        String cadena = scan.nextLine().trim();

        int numCaracteresSinBlancos = ContarPalabras.contarNumCaracteres(cadena);
        int numPalabras = ContarPalabras.contarNumPalabras(cadena);
        int[] contador = ContarPalabras.contarCaracteresRepetidos(cadena);

        Imprimir.mostrarCaracteresTotal(numCaracteresSinBlancos);
        Imprimir.mostrarNumPalabras(numPalabras);
        Imprimir.mostrarCaracteres(contador);

        scan.close();
    }
}