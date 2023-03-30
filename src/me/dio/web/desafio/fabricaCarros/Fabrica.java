package me.dio.web.desafio.fabricaCarros;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Fabrica {

    private Set<Carro> estoque = new LinkedHashSet<>();
    private int capacidadeMaxima = 4;

    public void fabricarCarro(Carro novoCarro){
        if(estoque.size() >= capacidadeMaxima){
            System.err.println("A fábrica atingiu sua capacidade máxima, não é possível produzir mais carros");
            return;
        }
        double imposto = novoCarro.calcularImposto();
        double precoTotal = novoCarro.getValor() + imposto;
        novoCarro.setValor(precoTotal);
        estoque.add(novoCarro);
    }

    public void listaCarros(){
        for(Carro carro : estoque)
            System.out.println(carro);
    }

    public int getQuantidadeCarros(){return estoque.size();}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fabrica fabrica = (Fabrica) o;
        return capacidadeMaxima == fabrica.capacidadeMaxima && Objects.equals(estoque, fabrica.estoque);
    }

    @Override
    public int hashCode() {
        return Objects.hash(estoque, capacidadeMaxima);
    }
}
