package padroesestruturais.decorator;

public class VidrosEletricos extends CarroDecorator {
    private final double precoAdicional;

    public VidrosEletricos(Carro carro) {
        super(carro);
        this.precoAdicional = 1500.0;
    }

    public void montar() {
        super.montar();
        System.out.println("Adicionando vidros elétricos");
    }

    public double getPreco() {
        return super.getPreco() + precoAdicional;
    }
}
