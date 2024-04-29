package banco;

import cliente.Cliente;
import persona.Persona;

import java.util.ArrayList;
import java.util.Scanner;

public class Banco extends Cliente {

    public Banco(String nombre, String apellido, int cedula, boolean producto, int idProducto) {
        super(nombre, apellido, cedula, producto, idProducto);
    }

    private static ArrayList<Persona> listaClientes = new ArrayList<>();

    public void registrarClientes(String nombre, String apellido, int cedula, boolean producto, int idProducto) {

        listaClientes.add(new Persona(nombre, apellido, cedula));

    }

    public static void totalCliente() {
        String Persona = "";
        Persona persona = new Persona(" "," ",1);
        if (listaClientes.isEmpty()) {
            System.out.println("no hay datos para listar");
        } else {

            System.out.println("Listado");


            for (int i=0;i<listaClientes.size();i++) {

                Persona = listaClientes + "" + persona.getNombre() + " " + persona.getApellido() + "" + persona.getCedula();
                break;
            }


        }

    }

    public static void buscarCliente() {
        String Persona = "";
        int cod;
        boolean res;
        Scanner crear = new Scanner(System.in);
        if (listaClientes.isEmpty()) {
            System.out.println("no hay datos para buscar");
        } else {

            System.out.println("digite la cedula a buscar");
            cod = crear.nextInt();
            res=false;
            Persona persona = new Persona(" "," ",1);

            for (int i=0;i<listaClientes.size();i++) {
                Persona = String.valueOf(listaClientes.get(i));

                if (cod== persona.getCedula()){

                    res=true;
                    Persona = listaClientes + "" + persona.getNombre() + " " + persona.getApellido() + "" + persona.getCedula();
                    break;
                }

            }

if (res == false){
    System.out.println("no encontrado");
}
        }

    }

}