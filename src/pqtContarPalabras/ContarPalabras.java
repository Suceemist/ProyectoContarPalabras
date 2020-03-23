package pqtContarPalabras;

/**
 *
 * @author Ana
 */
public class ContarPalabras {
    
        protected static int contarNumCaracteres(String cadena) {
        int numCaracteresSinBlancos = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (caracter != ' ') {
                numCaracteresSinBlancos++;
            }
        }
        return numCaracteresSinBlancos;
    }

    protected static int contarNumPalabras(String cadena) {
        int palabras = 1;
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (caracter == ' ') {
                palabras++;
            }
        }
        return palabras;
    }

    protected static int[] contarCaracteresRepetidos(String cadena) {
        int[] contador = new int[65536];
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            int ascii = caracter;
            contador[ascii]++;
        }
        return contador;
    }
}
