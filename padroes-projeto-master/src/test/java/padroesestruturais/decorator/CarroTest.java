package padroesestruturais.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarroTest {
    @Test
    public void testCarroBasico() {
        Carro carro = new CarroBasico("Sedan", 50000.0);
        assertEquals(50000.0, carro.getPreco(), 0.001);
    }

    @Test
    public void testArCondicionado() {
        Carro carro = new CarroBasico("Sedan", 50000.0);
        carro = new ArCondicionado(carro);
        assertEquals(51000.0, carro.getPreco(), 0.001);
    }

    @Test
    public void testVidrosEletricos() {
        Carro carro = new CarroBasico("Sedan", 50000.0);
        carro = new VidrosEletricos(carro);
        assertEquals(50500.0, carro.getPreco(), 0.001);
    }
}
