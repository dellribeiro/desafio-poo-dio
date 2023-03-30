package me.dio.web.desafio.fabricaCarros;

public class CarroPopular extends Carro{

    private double tipoMotor;
    private int quantidadePortas;
    private static final double TAXA_IMPOSTO = 0.1;

    public CarroPopular(String modelo, String cor, double valor) {
        super(modelo, cor, valor);
    }

    public CarroPopular(String modelo, String cor, double valor, double tipoMotor, int quantidadePortas) {
        super(modelo, cor, valor);
        setTipoMotor(tipoMotor);
        setQuantidadePortas(quantidadePortas);
    }

    @Override
    public double calcularImposto() {
        double imposto = 0.0;
        if(this.getTipoMotor() > 1.0)
            imposto += TAXA_IMPOSTO * getValor();
        return imposto;
    }

    public double getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(double tipoMotor) {
        if(tipoMotor < 1d)
            throw new IllegalArgumentException("O tipo do motor não pode ser menor que 1.0");
        this.tipoMotor = tipoMotor;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        if(quantidadePortas < 2)
            throw new IllegalArgumentException("O numero de portas não pode ser menor que 2");
        this.quantidadePortas = quantidadePortas;
    }

    @Override
    public String toString() {
        return "Carro Popular -> [" +
                "Modelo = " + getModelo() +
                ", Valor = R$" + getValor() +
                ", Cor = " + getCor() +
                ", Tipo Motor = " + getTipoMotor() +
                ", Quantidade Portes = " + getQuantidadePortas() +
                ']';
    }

}
