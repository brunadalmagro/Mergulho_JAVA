public class CalcJurosCompostosMeta {
    public static void main(String[] args) {
        double valorAcumulado = 10000;
        double taxaJuroMensal = 0.8;
        double metaViagem = 20000;
        int mes = 1;

        while (valorAcumulado < metaViagem) {
            mes++;

            valorAcumulado += valorAcumulado * taxaJuroMensal / 100;
            System.out.println("mes " + mes + " = " + valorAcumulado);
        }

    }
}
