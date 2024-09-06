public class DP {

    private int[] numeros;

    public DP(int[] numeros){
        this.numeros = numeros;
    }

    public DP(){}

    private double retornarMedia(int[] numeros){
        double somatotal = 0;

        for (int i = 0; i < numeros.length; i++) {
            somatotal += numeros[i];
        }
        return somatotal / numeros.length;
    }

    public double calculoVari(int[] numeros){
        double media = retornarMedia(numeros);
        double soma = 0.0;
        for (int i = 0; i < numeros.length; i++) {
            soma += Math.pow(numeros[i] - media, 2);
        }
        double resultado = soma / numeros.length;
        return resultado;
    }

    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }
}
