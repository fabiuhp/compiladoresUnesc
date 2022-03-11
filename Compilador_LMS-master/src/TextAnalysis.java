public class TextAnalysis {
    public static final char ASPAS_SIMPLES = '\'';

    private void findCorrectTypeOfToken(String palavra) {
//        if (isNumeral(palavra)) {
//            info.setToken(Token.numeral());
//            return;
//        }

        if (isLiteral(palavra)) {
            System.out.println("É palavra");
        }

//        info.setToken(Token.identificador());
    }

    boolean isLiteral(String palavra) {
        String conteudo = palavra.trim();
        char posicaoInicial = conteudo.charAt(0);
        char posicaoFinal = conteudo.charAt(conteudo.length() - 1);
        return posicaoInicial == ASPAS_SIMPLES && posicaoFinal == ASPAS_SIMPLES;
    }

//    private boolean isNumeral(String palavra) {
//        try {
//            int isNumero = Integer.parseInt(palavra);
//            return true;
//        } catch (Exception e) {
//            return false;
//        }
//    }
}
