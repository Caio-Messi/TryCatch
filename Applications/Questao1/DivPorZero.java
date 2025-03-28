package Applications.Questao1;

public class DivPorZero {
    private Double dividendo;
    private Double divisor;

    public DivPorZero(Double dividendo, Double divisor) {
        if (divisor == 0 || dividendo == 0){
            throw new ArithmeticException("Não é possível realizar uma divisão por zero");
        }
        this.dividendo = dividendo;
        this.divisor = divisor;
    }
    public Double divResultado (){
        return dividendo / divisor;
    }
}

