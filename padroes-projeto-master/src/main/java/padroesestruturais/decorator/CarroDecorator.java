package padroesestruturais.decorator;

public abstract class CarroDecorator implements Carro {
    protected Carro carro;

    public CarroDecorator(Carro carro) {
        this.carro = carro;
    }

    public void montar() {
        carro.montar();
    }

    public double getPreco() {
        return carro.getPreco();
    }
}


