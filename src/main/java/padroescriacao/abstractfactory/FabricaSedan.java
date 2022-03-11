package padroescriacao.abstractfactory;

public class FabricaSedan implements FabricaAbstrata {

    @Override
    public Modelo createModelo() {
        return new ModeloSedan();
    }

    @Override
    public Combustivel createCombustivel() {
        return new CombustivelSedan();
    }
}
