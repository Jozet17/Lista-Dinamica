package tiendaarray;
import java.util.Scanner;
import java.util.ArrayList;

public class ListaDinamica {
    ArrayList<String> objLista;
    
    public ListaDinamica(){
        this.objLista = new ArrayList<>();
    }
    
    public void tomarDatos(){
        Scanner objTeclado = new Scanner(System.in);
        System.out.println("Digite el nombre xd");
        String Nombre = objTeclado.nextLine();
        this.objLista.add(Nombre);
    }
    
    public void mostrarCliente(){
        for(String dato : this.objLista){
            System.out.println("Cliente:" + dato);
        }
    }
}
