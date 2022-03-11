package padroescriacao.abstractfactory;

public class FabricaSuv implements FabricaAbstrata {

    @Override
    public Modelo createModelo() {
        return new ModeloSuv();
    }

    @Override
    public Combustivel createCombustivel() {
        return new CombustivelSuv();
    }
}
