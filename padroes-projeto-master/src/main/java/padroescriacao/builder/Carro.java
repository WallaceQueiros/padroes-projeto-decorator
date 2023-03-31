package padroescriacao.builder;

public class Carro {
    String marca;
    String modelo;
    int ano;
    String cor;
    int numPortas;

    // Construtor privado para evitar instância direta da classe
    Carro() {}

    // Getters para as propriedades da classe
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public String getCor() {
        return cor;
    }

    public int getNumPortas() {
        return numPortas;
    }
    }
