package padroesestruturais.decorator;

public class CarroBasico implements Carro {

    public float cargaHoraria;

    public CarroBasico() {
    }

    public CarroBasico(float cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public CarroBasico(String sedan, double v) {
    }

    public float getCargaHoraria() {
        return cargaHoraria;
    }

    public String getEstrutura() {
        return "Graduação";
    }

    @Override
    public void montar() {

    }

    @Override
    public double getPreco() {
        return 0;
    }
}
