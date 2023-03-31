package padroesestruturais.bridge;

public class MotorGasolina implements Motor {
    @Override
    public void ligar() {
        System.out.println("Ligando motor a gasolina");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando motor a gasolina");
    }
}

