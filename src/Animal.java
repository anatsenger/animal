public class Animal {
    private String nome;
    private String cor;
    private String ambiente;
    private Double velocidadeMedia;

    public Animal(String nome, String cor, String ambiente, Double velocidadeMedia) {
        this.nome = nome;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidadeMedia = velocidadeMedia;
    }

    public void comer(){
        System.out.printf("comendo");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public Double getVelocidadeMedia() {
        return velocidadeMedia;
    }

    public void setVelocidadeMedia(Double velocidadeMedia) {
        this.velocidadeMedia = velocidadeMedia;
    }

    @Override
    public String toString() {
        return "nome= '" + nome + '\'' +
                ", cor= '" + cor + '\'' +
                ", ambiente= '" + ambiente + '\'' +
                ", velocidadeMedia= " + velocidadeMedia;
    }
}
