import java.util.Stack;

public class AnalisadorLexico {
    public static void main(String[] args) {
        TextAnalysis textAnalysis = new TextAnalysis();
        Stack<String> fila = new Stack<>();
        String teste = """
                PROGRAM TESTE123;
                    VAR X, Y, Z : INTEGER;
                BEGIN
                    READLN(X);
                    READLN(Y);
                    
                    
                    X := 1000
                    Z := [(X * Y) + 15 * X];
                    WRITELN 'ORESULTADODEHOJE' ;
                END;
                """;

        String[] s = teste.split("(\\s+)|(\\n+)");
        int count = 0;

        for (String nova : s) {
            System.out.println(textAnalysis.isLiteral(nova));
        }

//        fila.forEach(System.out::println);
    }
}

