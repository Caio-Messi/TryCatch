package Telas_Iniciais;

import Applications.Questao1.DivPorZero;

import java.util.Locale;
import java.util.Scanner;

public class Program_DivPorZero {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Double dividendo, divisor;

        System.out.println("Insira o valor do dividendo: ");
        dividendo = sc.nextDouble();
        System.out.println("Insira o valor do divisor: ");
        divisor = sc.nextDouble();
        try {
            DivPorZero div = new DivPorZero(dividendo, divisor);
            System.out.println(div.divResultado());
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }


    }
}
