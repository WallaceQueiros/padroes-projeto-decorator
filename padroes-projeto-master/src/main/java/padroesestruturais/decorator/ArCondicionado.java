package padroesestruturais.decorator;

public class ArCondicionado extends CarroDecorator {
    private final double precoAdicional;

    public ArCondicionado(Carro carro) {
        super(carro);
        this.precoAdicional = 1000.0;
    }

    public void montar() {
        super.montar();
        System.out.println("Adicionando ar condicionado");
    }

    public double getPreco() {
        return super.getPreco() + precoAdicional;
    }
}
