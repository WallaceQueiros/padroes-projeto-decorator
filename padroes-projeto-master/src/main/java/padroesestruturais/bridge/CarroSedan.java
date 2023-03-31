package padroesestruturais.bridge;

public class CarroSedan extends Carro {
    public CarroSedan(Motor motor) {
        super(motor);
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando sedan");
    }

    @Override
    public void frear() {
        System.out.println("Freando sedan");
    }
}
