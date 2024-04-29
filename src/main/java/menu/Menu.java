package menu;

import banco.Banco;
import cliente.Cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    public int ejecutarMenu() {

        int entrada;
        Scanner opcion = new Scanner(System.in);

        do {
            System.out.println("Ingresa el numero de la opcion que quieres realizar");
            System.out.println("1.Registrar cliente nuevo");
            System.out.println("2.Listar cliente");
            System.out.println("3.Buscar cliente");
            System.out.println("4.Actualizar clientes");
            System.out.println("5.Salir");
            entrada = opcion.nextInt();

        } while (entrada > 5 || entrada < 1);
        return entrada;
    }

    public List<String> registrarCliente() {
        Banco banco = new Banco(" "," ",1,true,0);
        int indice=0;
        String datos;
        List<String> listaClientes = new ArrayList<String>();

        Scanner crear = new Scanner(System.in);

        do {


            System.out.println("Registro cliente nuevo");
            System.out.println("************************");
            System.out.println("Ingrese el nombre de la persona:");
            String nombre = crear.nextLine();
            listaClientes.add(nombre);

            System.out.println("Ingrese el apellido de la persona:");
            String apellido = crear.nextLine();
            listaClientes.add(apellido);
            System.out.println("Ingrese la cedula");
            int cedula = Integer.parseInt(crear.nextLine());

            listaClientes.add(String.valueOf(cedula));

            Cliente cliente = new Cliente(nombre,apellido,cedula,true,0);
            cliente.mostrarPersona();

            System.out.println("mostrar array"+listaClientes );
            datos=nombre+"["+apellido+" "+cedula+"]";
            listaClientes.add(datos);
            banco.registrarClientes(" "," ",1,true,0);
            System.out.println("¿Deseas ingresar otro cliente? S/N");
            System.out.println("Digita 1 = Si, Digita 2 = No");
            String respuesta = crear.nextLine();


            if (!respuesta.equalsIgnoreCase("S") && !respuesta.equals("1")) {
                break; // Salir del bucle si la respuesta no es 'S' o '1'
            }

            }while (indice<listaClientes.size());

            indice++;

        return listaClientes;
    }



}
