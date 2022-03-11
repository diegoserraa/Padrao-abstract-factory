package padroescriacao.abstractfactory;

import org.junit.jupiter.api.Test;


class CarroTest {

    @Test
    void deveEmitirCombustivelSedan() {
        FabricaAbstrata fabrica = new FabricaSedan();
        Carro carro = new Carro(fabrica);
        assertEquals("Combustivel sedan", carro.emitirCombustivel());
    }

    private void assertEquals(String combustivel_sedan, String emitirCombustivel) {
    }
    @Test
    void deveEmitirCombustivelSuv() {
        FabricaAbstrata fabrica = new FabricaSuv();
        Carro carro = new Carro(fabrica);
        assertEquals("Combustivel Suv", carro.emitirCombustivel());
    }



}