package Applications.Questao8;

public class VerificarIdade {
    private Integer idade;

    public VerificarIdade(Integer idade) throws IdadeInvalidaExepcion {
        if (idade >= 18){
            System.out.println("Maior de Idade");
        } else if (idade > 0 && idade < 18) {
            System.out.println("Menor de Idade");
        }else {
            throw new IdadeInvalidaExepcion("Erro: Insira uma idade maior que 0");
        }
        this.idade = idade;
    }
    public void exibirIdade(){
        System.out.println("Idade: " + idade + " anos");
    }
}
