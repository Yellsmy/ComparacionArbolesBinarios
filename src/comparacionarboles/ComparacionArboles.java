
package comparacionarboles;

import java.util.Scanner;

public class ComparacionArboles {
    Scanner op = new Scanner(System.in);
    ArbolBinario Arbol = new ArbolBinario();
    
    public void menu(){
        boolean salir = false;
        int opcion;
        
        while(!salir){
           System.out.println("");
           System.out.println("|-----------**BIENVENIDO**-----------|"); 
           System.out.println("|     **COMPARACIÓN DE ÁRBOLES**     |");
           System.out.println("|  1. Agregar datos Árbol 1          |"); 
           System.out.println("|  2. Agregar datos Árbol 2          |");
           System.out.println("|  3. Comparar Árboles               |");
           System.out.println("|  4. Vaciar Árboles                 |");
           System.out.println("|  0. SALIR                          |");
           System.out.println("| -------Selecciona la opción------- |");
           opcion = op.nextInt();
           op.nextLine();
           switch(opcion){
            case 1:
                System.out.println("Ingrese dato: ");
                Arbol.addNodo1(op.nextInt());
                break;
            case 2:
                System.out.println("Ingrese dato: ");
                Arbol.addNodo2(op.nextInt());
                break;           
            case 3: 
                if( Arbol.raiz1 == null && Arbol.raiz2 == null){
                    System.out.println("El árbol está vacío");
                }else{
                    if(Arbol.comparar( Arbol.raiz1, Arbol.raiz2) == true){
                    System.out.println("          ¡¡FELICIDADES!!          ");
                    System.out.println("           (づ｡◕‿‿◕｡)づ            ");
                    System.out.println("Los Árboles ingresados son identicos");                   
                    }
                    else{
                        System.out.println("                ( ╥﹏╥)                 ");
                        System.out.println(" Los Árboles ingresados no son identicos");
                    }
                    System.out.println("El primer árbol es:");
                    Arbol.ImprimirInOrden1(Arbol.raiz1);
                    System.out.println("");
                    System.out.println("El segundo árbol es: ");
                    Arbol.ImprimirInOrden2(Arbol.raiz2);                         
                    }  
                              
                break;
            case 4:
                Arbol.vaciar();
                System.out.println("Los árboles están vacios");
                break;           
            case 0:
                salir = true;               
                break;
            default:
                System.out.println("La opción ingresada es incorrecta");          
            }
        }
    }
    public static void main(String[] args) {
        ComparacionArboles objeto = new ComparacionArboles();
        objeto.menu();
    }
    
}
