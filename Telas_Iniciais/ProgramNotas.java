package Telas_Iniciais;

import Applications.Questao7.Notas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double nota1, nota2, nota3;

        System.out.println("Insira a primeira nota: ");
        nota1 = sc.nextDouble();
        System.out.println("Insira a segunda nota: ");
        nota2 = sc.nextDouble();
        System.out.println("Insira a terceira nota: ");
        nota3 = sc.nextDouble();

        try{
            Notas nota = new Notas(nota1, nota2, nota3);
            nota.exibirMedias();
        }catch (InputMismatchException e ){
            System.out.println("Erro: Um dos valores inseridos é inválido. Certifique - se de inserir um número.");
        }finally {
            sc.close();
        }
    }
}
