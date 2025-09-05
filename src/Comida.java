public class Comida extends Producto {
    public Comida(String nombre, int cantidad, String tamanno) {
        super(nombre, "Comida",cantidad, tamanno);
    }
    @Override
    public int costoDeEnvio() {
         if(tamanno == "Grande" & cantidad > 2){
             return 0;
         }
         return 70000;
    }
}
