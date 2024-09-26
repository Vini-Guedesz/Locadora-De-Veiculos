package entities.veiculo;

public class Moto extends Veiculo {

    private int cilindradas;

    public Moto(String modelo, String placa, int ano, String cor, int cilindradas) {
        super(modelo, placa, ano, cor);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public String toString() {
        return "Moto{" + "Cilindradas = " + cilindradas + '}';
    }
}
