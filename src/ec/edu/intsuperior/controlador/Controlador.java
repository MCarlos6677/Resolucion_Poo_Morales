/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.intsuperior.controlador;

import ec.edu.intsuperior.modelo.Cliente;
import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author Lenovo
 */
public class Controlador {
    
   public void menu(){
        Scanner leer = new Scanner (System.in);
        int op=0;
        Cliente c1 = new Cliente();
        
        do {  
            System.out.println("Sean bienvenidos al sistema de facturacion\n"
                +"Escoja una de las siguientes opciones\n"
                + "1 - Registrar Cliente\n"
                + "2 - Registrar Producto\n"
                + "3 - Registrar Proveedor\n"
                + "4 - Registrar Tipo Producto\n"
                + "5 - Salir"); 
            op = leer.nextInt();
            switch(op){
                case 1:
                    
                System.out.println("Ingrese el numero de cédula");
                c1.setCedula(leer.next());
                System.out.println("Ingrese el primer nombre del cliente : ");
                c1.setNombre1(leer.next());
                System.out.println("Ingrese el primer segundo del cliente : ");
                c1.setNombre2(leer.next());
                break;
            case 2: 
                System.out.println("Ingrese el primer nombre del cliente : ");
                c1.setNombre1(leer.next());
                
                break;
            case 3:
               
                break;
            case 4:
               
                break;
            case 5:
                System.out.println("La cédula del cliente es : " + c1.getCedula());
                break;
            case 6:
               
                break;
            case 7:
                
                break;
            case 12:
                JOptionPane.showMessageDialog(null,"Gracias por usar el sistema de facturacion");
                break;
        
        }
            
        } while (op != 12);
    
       
    }
    
}
