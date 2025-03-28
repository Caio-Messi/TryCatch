package Applications.Questao4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Soma {
    private Integer valor1;
    private Integer valor2;

    public Soma() {
        try {
            Integer valor1, valor2;

            Scanner sc = new Scanner(System.in);
            System.out.println("Insira o primero número: ");
            valor1 = sc.nextInt();
            System.out.println("Insira o segundo número: ");
            valor2 = sc.nextInt();
            this.valor1 = valor1;
            this.valor2 = valor2;
            System.out.println(resultSoma());

        } catch (InputMismatchException e) {
            System.out.println("Insira um valor válido para a realização da soma");
        }


    }
    public Integer resultSoma(){
        return valor1 + valor2;
    }
}