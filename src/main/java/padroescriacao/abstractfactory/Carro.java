package padroescriacao.abstractfactory;

public class Carro {

    private Modelo modelo;
    private Combustivel combustivel;

    public Carro (FabricaAbstrata fabrica) {
        this.combustivel = fabrica.createCombustivel();
        this.modelo = fabrica.createModelo();
    }

    public String emitirCombustivel() {
        return this.combustivel.emitir();
    }

    public String emitirModelo() {
        return this.modelo.emitir();
    }
}
