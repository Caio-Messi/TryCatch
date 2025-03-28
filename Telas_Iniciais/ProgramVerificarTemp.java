package Telas_Iniciais;


import Applications.Questao9.TemperaturaInvalidaException;
import Applications.Questao9.VerificarTemp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramVerificarTemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        try{
            System.out.println("Digite a temperatura em Celsius: ");
            Double celsius = sc.nextDouble();

            VerificarTemp verificarTemp = new VerificarTemp(celsius);

            Double fahrenheit = verificarTemp.celsiusFahrenheit();
            System.out.println("Temperatura em Celsius: " + celsius);
            System.out.println("Temperatura em Fahrenheit: " + verificarTemp.celsiusFahrenheit());
        }catch (InputMismatchException e) {
            System.out.println("Erro: Você inseriu um valor inválido.");
        }
        catch (TemperaturaInvalidaException e){
            System.out.println(e.getMessage());
        }finally {
            sc.close();
        }
    }
}
