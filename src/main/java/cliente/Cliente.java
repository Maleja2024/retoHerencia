package cliente;

import persona.Persona;

import java.util.ArrayList;

public class Cliente extends Persona {


    private boolean producto;
    private int idProducto;


    public Cliente(String nombre, String apellido, int cedula, boolean producto, int idProducto) {
        super(nombre, apellido, cedula);
        this.producto = producto;
        this.idProducto =  (int) (Math.random()*20+1);

    }

    @Override
    public void mostrarPersona(){
        super.mostrarPersona();
        System.out.println("producto="+producto);
        System.out.println("su numero de producto es: "+idProducto);





    }




}
