package Applications.Questao5;

import java.util.Scanner;

public class AcessoInvalidoArray {
    private Integer [] numeros;

    public void setNumeros(Integer tamanho, Scanner sc){
        numeros = new Integer[tamanho];
        System.out.println("Digite " + tamanho + " números inteiros: ");
        for (int i =  0; i < tamanho; i++){
            numeros [i] = sc.nextInt();
        }
    }
    public void getElementoIndice (Integer indice){
        try {
        System.out.println("Elemento no indíce " + indice + " : " + numeros [indice]);
        }catch (ArrayIndexOutOfBoundsException e ){
            System.out.println("Erro: Índice fora dos limites do array.");
        }
    }
}
