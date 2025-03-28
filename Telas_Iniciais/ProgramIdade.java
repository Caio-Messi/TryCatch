package Telas_Iniciais;

import Applications.Questao8.IdadeInvalidaExepcion;
import Applications.Questao8.VerificarIdade;

import java.util.Scanner;

public class ProgramIdade {
    public static void main(String[] args) throws IdadeInvalidaExepcion {
        Scanner sc = new Scanner(System.in);
        Integer idade;

        try{
            System.out.println("Insira sua idade: ");
            idade = sc.nextInt();
            VerificarIdade age = new VerificarIdade(idade);
            age.exibirIdade();
        }catch (IdadeInvalidaExepcion e){
            System.out.println(e.getMessage());
        }

    }
}
