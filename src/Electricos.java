public class Electricos extends Producto {

    

    public Electricos(String nombre, int cantidad, String tamanno) {
        super(nombre, "Electricos",cantidad, tamanno);
    }

    @Override
    public int costoDeEnvio() {
        return 0;
    }
}
