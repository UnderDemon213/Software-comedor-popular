/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package botones;

/**
 *
 * @author Brayan
 */
public class Botones {

    private static frmformulario formulario;
    private static Persona persona[];
    private static int contador ;
    
    public static void main(String[] args) {
        formulario=new frmformulario();
        persona = new Persona[100];
        //creamos un arreglo para poder agregar los elementos 
        //todo dentro del arreglo persona
        
        for(int n1=0;n1<100;n1++){
            persona[n1]=new Persona();
        }
        contador=0;
        
        formulario.setVisible(true);
        //ahora crearemos los metodos guardar y buscar 
    }
    
    public static void guardar(String nombre,String apellido,String curso,int celular){
        //creamos las 4 variables (nombre,apellido,curso,celular)
        persona[contador].setNombre(nombre);
        persona[contador].setApellido(apellido);
        persona[contador].setCorreo(curso);
        persona[contador].setCelular(celular);
        
        contador++;
    }
    
    public static void buscar (String buscar){
        //creamos la variable buscar (buscar)
        for(int n2=0;n2<persona.length;n2++){
         if(persona[n2].getNombre().equals(buscar)){
            formulario.cargadatos(persona[n2]);
         }
        }
    }
    
}
