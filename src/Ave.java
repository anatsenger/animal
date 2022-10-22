public class Ave extends Animal{
    private boolean voa;

    private boolean voar(){
        return voa;
    }

    public Ave(String nome,
    String cor,
    String ambiente,
    Double velocidadeMedia,
    boolean voa) {
        super(nome, cor, ambiente, velocidadeMedia);
        this.voa = voa;
    }

    public boolean getVoa() {
        return voa;
    }

    public void setVoa(boolean voa) {
        this.voa = voa;
    }

    @Override
    public String toString() {
        return "Ave{" + super.toString() +" "+
                "voa=" + voa +
                '}';
    }
}
