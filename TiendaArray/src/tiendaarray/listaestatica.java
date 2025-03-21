package tiendaarray;

import java.util.Scanner;

public class listaestatica {
    private String[] listaCliente;
    // constructor
    public listaestatica(){
        this.listaCliente = new String[3];
    } 
    
    public void mostrarDatos(){
        for(int i=0; i<this.listaCliente.length; i++){
            System.out.println("Cliente:" + this.listaCliente[i]);
        }
    }
    
    public void mostrarCliente(){
        for(String dato : this.listaCliente){
            System.out.println("cliente: " + dato);
        }
    }
    
    public void tomarDatos(){
        for(int i=0; i<this.listaCliente.length; i++){
            Scanner objTeclado = new Scanner(System.in);
            System.out.println("Digite el nombre :)");
            this.listaCliente[i] = objTeclado.nextLine();
            
        }
    }
    
}
