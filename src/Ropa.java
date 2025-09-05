public class Ropa extends Producto{
    public Ropa(String nombre, int cantidad, String tamanno) {
        super(nombre, "Ropa",cantidad, tamanno);
    }

    @Override
    public int costoDeEnvio() {
        return cantidad > 5 ? 0 : 20000;
    }
}
