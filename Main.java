public class Main {
    public static void main(String[] args) {
        DoisGrau a1 = new DoisGrau(1, 3, -4);
        
        System.out.println("Resultado Segundo Grau:");

        var contaGrau = a1.calcular();
        System.out.println(contaGrau + "\n");

        System.out.println("Devio Padrão:");

        int[] numerosArray = {1,2,3,4,5};
        DP a2 = new DP(numerosArray);

        var contaVari = a2.calculoVari(numerosArray);
        System.out.println("Variancia: " + contaVari + "\n");

        JurosComp a3 = new JurosComp(1000.0, 0.05, 5,12);

        System.out.println("Resultado de Juros: ");
        var contaJuros = a3.CalculoJuros();
        System.out.println("Juros Composto: " + contaJuros + "\n");
    }
}