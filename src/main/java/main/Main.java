package main;

import banco.Banco;
import cliente.Cliente;
import menu.Menu;
import persona.Persona;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public Main(){

    }
    public static void main(String[] args) {


       /* Persona cliente = new Cliente("aleja","rami",4,true,0);
        System.out.println("Registro cliente nuevo");
        System.out.println("************************");
        cliente.mostrarPersona();
        System.out.println("Ingrese el nombre de la persona:");
        System.out.println("Ingrese el apellido de la persona:");
        System.out.println("Ingrese la cedula");*/
        Menu menu = new Menu();
        Banco banco = new Banco(" "," ",1,true,0);

        int entrada;

        entrada = menu.ejecutarMenu();
        List<String> listaClientes = new ArrayList<String>();





        while (entrada!= 5) {
            switch (entrada) {
                case 1:

                    listaClientes = menu.registrarCliente();
                    entrada = menu.ejecutarMenu();


                    break;

                case 2:

                        System.out.println("listar cliente");
                    banco.totalCliente();

                    break;
                case 3:
                    System.out.println("buscar cliente");

                    banco.buscarCliente();
                    break;
                case 4:
                    System.out.println("Actualizar cliente");


                    break;
                case 5:
                    System.out.println("Finalizado exitosamente");
                default:
                    break;
            }
        }



    }
}
