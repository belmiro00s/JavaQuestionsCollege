public class Exchange {

    private final double cotacaoDolar = 5.5;
    private final double iof = 0.0586;
    private final double taxaOperacaoEmPercentual = 1; // 1%

    @SuppressWarnings("unused")
    public double comprarDolar(double valorReal) {
        double valorDolar = valorReal / cotacaoDolar;
        double valorDolarComIOF = valorDolar + (valorDolar * iof);
        double valorFinal = valorDolarComIOF + (valorDolarComIOF * (taxaOperacaoEmPercentual / 100));

        return valorFinal;
    }

    public static void main(String[] args) {
        Exchange exchange = new Exchange();
        double valorReal = 1000;
        double valorDolar = exchange.comprarDolar(valorReal);
        System.out.println("Valor em dólar: " + valorDolar);
    }
}
