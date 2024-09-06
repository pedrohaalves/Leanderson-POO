public class JurosComp {

    private double capitalInicial;
    private double taxaJuros;
    private int tempo;
    private int frequencia;

    public JurosComp(double capitalInicial, double taxaJuros, int tempo, int frequencia) {
        this.capitalInicial = capitalInicial;
        this.taxaJuros = taxaJuros;
        this.tempo = tempo;
        this.frequencia = frequencia;
    }

    public double Montante() {
        return capitalInicial * Math.pow(1 + (taxaJuros / frequencia), frequencia * tempo);
    }

    public double CalculoJuros() {
        return Montante() - capitalInicial;
    }

    public double getCapitalInicial() {
        return capitalInicial;
    }

    public void setCapitalInicial(double capitalInicial) {
        this.capitalInicial = capitalInicial;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public int getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }
}