package padroescriacao.builder;

public class CarroBuilder {
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private int numPortas;

    // Construtor padrão do Builder
    public CarroBuilder() {}

    // Métodos do Builder para definir as propriedades do objeto Carro
    public CarroBuilder marca(String marca) {
        this.marca = marca;
        return this;
    }

    public CarroBuilder modelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public CarroBuilder ano(int ano) {
        this.ano = ano;
        return this;
    }

    public CarroBuilder cor(String cor) {
        this.cor = cor;
        return this;
    }

    public CarroBuilder numPortas(int numPortas) {
        this.numPortas = numPortas;
        return this;
    }

    // Método para construir o objeto Carro
    public Carro build() {
        Carro carro = new Carro();
        carro.marca = marca;
        carro.modelo = modelo;
        carro.ano = ano;
        carro.cor = cor;
        carro.numPortas = numPortas;
        return carro;
    }
}
