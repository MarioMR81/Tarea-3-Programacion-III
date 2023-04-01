
package arboles;

import javax.swing.JOptionPane;


public class Arboles {


    public static void main(String[] args) {
        
        int opcion=0, elemento;
        String nombre;
        ArbolBinario tree = new ArbolBinario();
        do{
            try{
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, """
                                                                            1. Agregar un Nodo
                                                                            2. Buscar un nodo en el Arbol
                                                                            3. Eliminar Nodo del Arbol
                                                                            4. Salir
                                                                            Eliga una opcion""", "Arboles",JOptionPane.QUESTION_MESSAGE));
                switch(opcion){
                    case 1: {
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero del Nodo", "Ingresando Nodo", JOptionPane.QUESTION_MESSAGE));
                        nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre del Nodo" , "Ingresando Nodo", JOptionPane.QUESTION_MESSAGE);
                        tree.agregarNodo(elemento, nombre);
                    }
                        break;
                    case 2: {
                        if(!tree.estaVacio()){
                            elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero del Nodo para buscar", "Buscando Nodo", JOptionPane.QUESTION_MESSAGE));
                            if(tree.buscarNodo(elemento)==null){
                                System.out.println("Nodo no encontrado en el Arbol");
                            }else{
                                System.out.println("Nodo Encontrado , el nombre del nodo es: " + tree.buscarNodo(elemento));
                            }
                        }else{
                            System.out.println("El Arbol Esta Vacio");
                        }
                    }
                        break;
                    case 3:
                        
                        if(!tree.estaVacio()){
                            elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero del Nodo para Eliminar", "Eliminando Nodo", JOptionPane.QUESTION_MESSAGE));
                            if(tree.eliminar(elemento)==false){
                                System.out.println("Nodo no encontrado en el Arbol");
                            }else{
                                System.out.println("Nodo Encontrado, el nodo a sido eliminado");
                            }
                        }else{
                           System.out.println("El Arbol Esta Vacio");
                        }

                        break;
                    case 4: 
                    System.out.println("Cerrando Aplicaion");
                    default:
                        System.out.println("Opcion Incorrecta");
                }
            }catch(NumberFormatException n){
                System.out.println("Error");
            }
        }while(opcion!=4);
    }
}

