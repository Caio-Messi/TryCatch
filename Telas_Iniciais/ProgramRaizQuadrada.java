package Telas_Iniciais;

import Applications.Questao3.RaizQuadrada;

import java.util.Locale;
import java.util.Scanner;

public class ProgramRaizQuadrada {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Integer num;

        System.out.println("Insira um número: ");
        num = sc.nextInt();
        try {
            RaizQuadrada raiz =  new RaizQuadrada(num);
            System.out.println(raiz.raizQuadrada());
        }catch (IllegalArgumentException e){
            System.out.println( e.getMessage());
        }finally {
            sc.close();
        }





    }
}
