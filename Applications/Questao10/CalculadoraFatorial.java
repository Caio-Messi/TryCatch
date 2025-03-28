package Applications.Questao10;

public class CalculadoraFatorial {
    public static long calcularFatorial(int numero) throws NumeroNegativoException, LimiteFatorialExcedidoException {
        if (numero < 0) {
            throw new NumeroNegativoException("Erro: Não é possível calcular o fatorial de um número negativo.");
        }
        if (numero > 20) {
            throw new LimiteFatorialExcedidoException("Erro: O número é muito grande! O limite para cálculo é 20.");
        }
        if (numero == 0 || numero == 1) {
            return 1;
        }
        return numero * calcularFatorial(numero - 1);
    }
}
