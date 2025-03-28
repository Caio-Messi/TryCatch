package Applications.Questao9;

public class VerificarTemp {
    private Double celsius;

    public VerificarTemp(Double celsius) throws TemperaturaInvalidaException {
        if (celsius < -273.15){
            throw new TemperaturaInvalidaException("Erro: Temperatura Inválida!");
        }
        this.celsius = celsius;
    }
    public Double celsiusFahrenheit (){
        return (celsius * 9 / 5);
    }
}
