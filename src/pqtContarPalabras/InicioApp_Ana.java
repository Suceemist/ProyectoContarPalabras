package pqtContarPalabras;

import java.util.Scanner;

public class InicioApp_Ana {

    //int [] contador;
    char caracter;

    final String TEXTO_LETRAS = "Las letras y car�cteres que hay y se repiten son: ";
    final String TEXTO_PALABRAS = "Se han ingresado ";
    final String TEXTO_FINAL_PALABRAS = " palabras.";
    final String TEXTO_TOTAL_CARACTERES_SIN_BLANCOS = "Se han introducido un total de ";
    final String TEXTO_FINAL_TOTAL_CARACTERES_SIN_BLANCOS = " caracteres(sin contar los blancos).";
    static final String TEXTO_PEDIR_CADENA = "Introduzca un conjunto de caracteres:";

    public InicioApp_Ana() {

    }

    private int contarNumCaracteres(String cadena) {
        int numCaracteresSinBlancos = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (caracter != ' ') {
                numCaracteresSinBlancos++;
            }
        }
        return numCaracteresSinBlancos;
    }

    private int contarNumPalabras(String cadena) {
        int palabras = 1;
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (caracter == ' ') {
                palabras++;
            }
        }
        return palabras;
    }

    private int[] contarCaracteresRepetidos(String cadena) {
        int[] contador = new int[65536];
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            int ascii = caracter;
            contador[ascii]++;
        }
        return contador;
    }

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
        InicioApp_Ana ia = new InicioApp_Ana();
        Scanner scan = new Scanner(System.in);
        System.out.println(TEXTO_PEDIR_CADENA);
        String cadena = scan.nextLine().trim();

        int numCaracteresSinBlancos = ia.contarNumCaracteres(cadena);
        int numPalabras = ia.contarNumPalabras(cadena);
        int[] contador = ia.contarCaracteresRepetidos(cadena);

        ia.mostrarCaracteresTotal(numCaracteresSinBlancos);
        ia.mostrarNumPalabras(numPalabras);
        ia.mostrarCaracteres(contador);

        scan.close();
    }

}
