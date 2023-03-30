package me.dio.web.desafio.fabricaCarros;

public class CarroEsportivo extends Carro{

    private double potenciaMotor;
    private int velocidadeMaxima;
    private static final double TAXA_IMPOSTO = 0.15;

    public CarroEsportivo(String modelo, String cor, double valor) {
        super(modelo, cor, valor);
    }

    public CarroEsportivo(String modelo, String cor, double valor, double potenciaMotor, int velocidadeMaxima) {
        super(modelo, cor, valor);
        setPotenciaMotor(potenciaMotor);
        setVelocidadeMaxima(velocidadeMaxima);
    }

    @Override
    public double calcularImposto() {
        double imposto = 0.0;
        if(this.getPotenciaMotor() > 200)
            imposto += TAXA_IMPOSTO * getValor();
        return imposto;
    }

    public double getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(double potenciaMotor){
        if(potenciaMotor < 0)
            throw new IllegalArgumentException("A potência do motor não pode ser negativa");
        this.potenciaMotor = potenciaMotor;

    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima){
        if(velocidadeMaxima < 0)
            throw new IllegalArgumentException("A velocidade máxima não pode ser negativa");
        this.velocidadeMaxima = velocidadeMaxima;
    }
    @Override
    public String toString() {
        return "Carro Esportivo -> [" +
                "Modelo = " + getModelo() +
                ", Valor = R$" + getValor() +
                ", Cor = " + getCor() +
                ", Potencia Motor = " + getPotenciaMotor() + "cv" +
                ", Velocidade Maxima = " + getVelocidadeMaxima() + "km/h" +
                ']';
    }
}
