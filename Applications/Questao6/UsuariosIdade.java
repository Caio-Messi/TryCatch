package Applications.Questao6;

public class UsuariosIdade {
    private String nome;
    private Integer idade;

    public void setDados (String nome, Integer idade)
            throws DadosInvalidosException{
        if (nome == null || nome.isEmpty()){
            throw new DadosInvalidosException("Erro: Nome não pode ser vazio");
        }
        if (idade < 0){
            throw new DadosInvalidosException("Erro: Idade não pode ser negativa");
        }
        this.nome = nome;
        this.idade = idade;
    }

    public void exibirDados(){
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }
}
