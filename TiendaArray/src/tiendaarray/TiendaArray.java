package tiendaarray;

public class TiendaArray {

    public static void main(String[] args) {
        listaestatica listica = new listaestatica();
        listica.mostrarCliente();
        listica.tomarDatos();
        listica.mostrarDatos();
        
        ListaDinamica dinamic = new ListaDinamica();
        dinamic.tomarDatos();
        dinamic.mostrarCliente();
        
    }
    
}
