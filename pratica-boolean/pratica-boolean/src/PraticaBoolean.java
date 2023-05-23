// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class PraticaBoolean {
    public static void main(String[] args) {

        boolean fimDeSemana = true;
        boolean diaEnsolarado = true;
        boolean vamosAPraia = fimDeSemana && diaEnsolarado;

        System.out.println(vamosAPraia);
        String mensagem = fimDeSemana ? "É fim de semana:D" : "Não é fim de semana:(";
        System.out.println(mensagem);



        // Tabela verdade (AND)
        // true && true = true
        // true && false = false
        // false && true = false
        // false && false = false

        // Tabela verdade (OR)
        // true || true = true
        // true || false = true
        // false || true = true
        // false || false = false

    }
}