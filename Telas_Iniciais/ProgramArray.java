package Telas_Iniciais;

import Applications.Questao5.AcessoInvalidoArray;

import java.util.Scanner;

public class ProgramArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho do array: ");
        Integer tamanho = sc.nextInt();

        AcessoInvalidoArray array = new AcessoInvalidoArray();
        array.setNumeros(tamanho, sc);

        System.out.println("Digite o índice a ser acessado: ");
        Integer indice =  sc.nextInt();

        array.getElementoIndice(indice);

        sc.close();
    }

}
