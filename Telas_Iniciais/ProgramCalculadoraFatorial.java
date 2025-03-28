package Telas_Iniciais;

import Applications.Questao10.CalculadoraFatorial;
import Applications.Questao10.LimiteFatorialExcedidoException;
import Applications.Questao10.NumeroNegativoException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramCalculadoraFatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite um número inteiro para calcular o fatorial: ");
            int numero = sc.nextInt();

            // Chama o método de cálculo do fatorial e trata exceções
            long resultado = CalculadoraFatorial.calcularFatorial(numero);
            System.out.printf("O fatorial de %d é: %d%n", numero, resultado);
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Digite um número inteiro.");
        } catch (NumeroNegativoException | LimiteFatorialExcedidoException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
