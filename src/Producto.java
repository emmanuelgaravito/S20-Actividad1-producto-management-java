public class Producto {
    protected String nombre, categoria, tamanno;
    protected int cantidad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTamanno() {
        return tamanno;
    }

    public void setTamanno(String tamanno) {
        this.tamanno = tamanno;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto(String nombre, String categoria, int cantidad, String tamanno) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.cantidad = cantidad;
        this.tamanno = tamanno;
    }

    public int costoDeEnvio(){
        //Costo de envio por mas de dos productos es gratis
       return cantidad > 2 ? 0 : 70000;
    };
}