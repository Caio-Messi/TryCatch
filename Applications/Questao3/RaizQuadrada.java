package Applications.Questao3;

public class RaizQuadrada {
    private Integer num;

    public RaizQuadrada(Integer num) {
        if (num < 0) {
            throw new IllegalArgumentException ("Não existe raiz de números negativos");
        }
        this.num = num;
    }
    public Double raizQuadrada(){
        return Math.sqrt(num);
    }
}
