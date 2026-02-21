public class Gerente extends Empleado {

    public Gerente(double salario) {
        super(salario);
    }

    public void mostrarSalario() {
        System.out.println("Salario: " + salario); // ✅ permitido El salario no es público, pero el hijo sí puede verlo.
    }
}
