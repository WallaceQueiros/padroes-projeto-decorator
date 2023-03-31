package padroesestruturais.bridge;

public abstract class Carro {
    protected Motor motor;

    public Carro(Motor motor) {
        this.motor = motor;
    }

    public abstract void acelerar();
    public abstract void frear();
}
