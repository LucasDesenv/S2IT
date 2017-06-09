package br.com.s2it.number;

/**
 * @author lucas.souza
 */
public class NumberLogic {

    public static Integer findTheMysteriousNumber(Integer a, Integer b) {
        final String primeiroNumeroDeC = "" + String.valueOf(a).charAt(0);
        final String segundoNumeroDeC = "" + String.valueOf(b).charAt(0);
        final String terceiroNumeroDeC = "" + String.valueOf(a).charAt(1);
        final String quartoNumeroDeC = "" + String.valueOf(b).charAt(1);
        final StringBuilder cString = new StringBuilder()
                .append(primeiroNumeroDeC)
                .append(segundoNumeroDeC)
                .append(terceiroNumeroDeC)
                .append(quartoNumeroDeC);

        if (String.valueOf(a).length() != String.valueOf(b).length()) {
            cString.append(a > b ? a.toString().substring(2) : b.toString().substring(2));
        }

        final Integer numeroDesvendado = Integer.valueOf(cString.toString());
        final int umMilhao = 1000000;
        return numeroDesvendado > umMilhao ? -1 : numeroDesvendado;
    }

}
