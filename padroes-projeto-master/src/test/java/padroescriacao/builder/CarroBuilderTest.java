package padroescriacao.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarroBuilderTest {
   @Test
   public void testCarroBuilder() {
      Carro carro = new CarroBuilder()
         .marca("Chevrolet")
         .modelo("Chevrolet")
         .ano(2010)
         .cor("Prata")
         .numPortas(4)
         .build();
      
      assertEquals(carro.getMarca(), "Chevrolet");
      assertEquals(carro.getModelo(), "Chevrolet");
      assertEquals(carro.getAno(), 2010);
      assertEquals(carro.getCor(), "Prata");
      assertEquals(carro.getNumPortas(), 4);
   }
}