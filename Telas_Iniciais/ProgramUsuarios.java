package Telas_Iniciais;

import Applications.Questao6.DadosInvalidosException;
import Applications.Questao6.UsuariosIdade;

import java.util.Scanner;

public class ProgramUsuarios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UsuariosIdade users = new UsuariosIdade();

        try {
            System.out.println("Digite seu nome: ");
            String nome = sc.nextLine().trim();

            System.out.println("Digite sua idade: ");
            Integer idade = Integer.parseInt(sc.nextLine());

            users.setDados(nome, idade);
            users.exibirDados();
        } catch (DadosInvalidosException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Erro: A idade deve ser um número inteiro válido.");
        } finally {
            sc.close();
        }
    }
}
