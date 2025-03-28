package Applications.Questao7;

import java.util.InputMismatchException;

public class Notas {
    private Double nota1;
    private Double nota2;
    private Double nota3;

    public Notas(Double nota1, Double nota2, Double nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    public Double mediasNotas(){
        return (nota1 + nota2 + nota3) / 3;
    }
    public void exibirMedias(){
        System.out.printf("A média das notas é: %.2f%n" , mediasNotas());
    }
}
