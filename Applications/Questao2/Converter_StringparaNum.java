package Applications.Questao2;

import java.util.Scanner;

public class Converter_StringparaNum {
        public void lerNumero() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Por favor, insira um número:");

            try {
                String input = scanner.nextLine();
                int numero = Integer.parseInt(input); // Tenta converter para inteiro
                System.out.println("Você inseriu o número: " + numero);
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido! Por favor, insira um número inteiro.");
            } finally {
                scanner.close();
            }
        }
    }
