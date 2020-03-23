package pqtContarPalabras;

import java.util.Scanner;

public class LeerMain {
    //int [] contador;
    char caracter;
    final String TEXTO_LETRAS = "Las letras y car�cteres que hay y se repiten son: ";
    final String TEXTO_PALABRAS = "Se han ingresado ";
    final String TEXTO_FINAL_PALABRAS = " palabras.";
    final String TEXTO_TOTAL_CARACTERES_SIN_BLANCOS = "Se han introducido un total de ";
    final String TEXTO_FINAL_TOTAL_CARACTERES_SIN_BLANCOS = " caracteres(sin contar los blancos).";
    static final String TEXTO_PEDIR_CADENA = "Introduzca un conjunto de caracteres:";

    private String mostrarCaracteresTotal(int numCaracteresSinBlancos) {
        String texto = TEXTO_TOTAL_CARACTERES_SIN_BLANCOS + numCaracteresSinBlancos + TEXTO_FINAL_TOTAL_CARACTERES_SIN_BLANCOS;
        System.out.println(texto);
        return texto;
    }

    private String mostrarNumPalabras(int numPalabras) {
        String texto = TEXTO_PALABRAS + numPalabras + TEXTO_FINAL_PALABRAS;
        System.out.println(texto);
        return texto;
    }

    private String mostrarCaracteres(int[] contador) {
        System.out.println(TEXTO_LETRAS);
        String texto = "";
        for (int i = 0; i < contador.length; i++) {
            char letra = (char) i;
            if (contador[i] > 0 && letra != ' ') {
                if (contador[i] == 1) {
                    texto += "" + letra + "-->" + contador[i] + " vez. \n";
                } else {
                    texto += "" + letra + "-->" + contador[i] + " veces.\n";
                }
            }
        }
        System.out.println(texto);
        return texto;
    }

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