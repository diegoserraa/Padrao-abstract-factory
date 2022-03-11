package padroescriacao.abstractfactory;

public interface FabricaAbstrata {
    Modelo createModelo();
    Combustivel createCombustivel();
}
