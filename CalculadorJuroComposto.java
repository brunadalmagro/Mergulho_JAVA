public class CalculadorJuroComposto {
    public static void main(String[] args) {
        double valorAcumulado = 10_000;
        double taxaJurosMensal = 0.8;
        int periodoemMeses = 12;
        for (int mes = 1; mes <= periodoemMeses; mes++ ) {
            valorAcumulado = valorAcumulado + valorAcumulado * taxaJurosMensal / 100;
            System.out.println("mes: " + mes + " = " + valorAcumulado);
        }
    }
}
