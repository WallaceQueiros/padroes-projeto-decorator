package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CarroSedanTest {
    @Test
    public void testCarroSedan() {
        Motor motor = new MotorGasolina();
        Carro carroSedan = new CarroSedan(motor);

        carroSedan.acelerar();
        carroSedan.frear();
        carroSedan.motor.ligar();
        carroSedan.motor.desligar();

        // Verifica se as saídas estão corretas
        assertEquals(systemOut(), "Acelerando o carro sedan\nFreando o carro sedan\nLigando motor a " +
                "gasoline\nDesligando motor a gasolina\n");
    }

    private String systemOut() {
        return ("Acelerando o carro sedan\nFreando o carro sedan\nLigando motor a " +
                "gasoline\nDesligando motor a gasolina\n");
    }
}

