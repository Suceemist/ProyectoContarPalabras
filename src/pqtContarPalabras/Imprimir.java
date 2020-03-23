package pqtContarPalabras;
/**
 *
 * @author Ana
 */
public class Imprimir {
    
    final static String TEXTO_LETRAS = "Las letras y car�cteres que hay y se repiten son: ";
    final static String TEXTO_PALABRAS = "Se han ingresado ";
    final static String TEXTO_FINAL_PALABRAS = " palabras.";
    final static String TEXTO_TOTAL_CARACTERES_SIN_BLANCOS = "Se han introducido un total de ";
    final static String TEXTO_FINAL_TOTAL_CARACTERES_SIN_BLANCOS = " caracteres(sin contar los blancos).";
    
    protected static String mostrarCaracteresTotal(int numCaracteresSinBlancos) {
        String texto = TEXTO_TOTAL_CARACTERES_SIN_BLANCOS + numCaracteresSinBlancos + TEXTO_FINAL_TOTAL_CARACTERES_SIN_BLANCOS;
        System.out.println(texto);
        return texto;
    }

    protected static String mostrarNumPalabras(int numPalabras) {
        String texto = TEXTO_PALABRAS + numPalabras + TEXTO_FINAL_PALABRAS;
        System.out.println(texto);
        return texto;
    }

    protected static String mostrarCaracteres(int[] contador) {
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
}
