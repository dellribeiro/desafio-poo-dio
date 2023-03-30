package me.dio.web.desafio.fabricaCarros;

public abstract class Carro {

    private String modelo;
    private String cor;
    private double valor;

    public abstract double calcularImposto();

    public Carro(String modelo, String cor, double valor) {
        setModelo(modelo);
        setCor(cor);
        setValor(valor);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.trim().isEmpty())
            throw new IllegalArgumentException("Modelo não pode estar vazio ou nulo.");
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        if (cor == null || cor.trim().isEmpty())
            throw new IllegalArgumentException("Cor não pode estar vazia ou nula.");
        this.cor = cor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (valor < 0)
            throw new IllegalArgumentException("O valor não pode ser negativo.");
        this.valor = valor;
    }
}
