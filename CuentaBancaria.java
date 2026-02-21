public class CuentaBancaria {

    private double saldo; // 🔒 nadie más puede tocarlo

    public CuentaBancaria(double saldoInicial) {
        saldo = saldoInicial;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        }
    }

    public double consultarSaldo() {
        return saldo;
    }
}
