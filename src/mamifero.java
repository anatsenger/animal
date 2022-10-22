public class mamifero extends Animal{
    private Integer quantidadeDePatas;

    private void amamentar(){
        System.out.printf("amamentando");
    }

    public mamifero(String nome,
    String cor,
    String ambiente,
    Double velocidadeMedia,
    Integer quantidadeDePatas) {
        super(nome, cor, ambiente, velocidadeMedia);
        this.quantidadeDePatas = quantidadeDePatas;
    }

    @Override
    public String toString() {
        return "mamifero{" + super.toString() + " "+
                "quantidadeDePatas=" + quantidadeDePatas +
                '}';
    }

    public Integer getQuantidadeDePatas() {
        return quantidadeDePatas;
    }

    public void setQuantidadeDePatas(Integer quantidadeDePatas) {
        this.quantidadeDePatas = quantidadeDePatas;
    }
}
