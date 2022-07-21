
package comparacionarboles;
/***********************************************
* <ComparacionArboles.java>
* <Yellsmy Toj >
*
* <Esta clase funciona como un driver para la clase ArbolBinario>
***********************************************/
import java.util.Scanner;

public class ComparacionArboles 
{
    Scanner op = new Scanner(System.in);       // Capturar la opción ingresada
    ArbolBinario Arbol = new ArbolBinario();   // Objeto de tipo ArbolBinario
    
    //**************************************************************
    
    // Método menú que mostrará las funciones en éste programa y ejecutará
    // según la opción deseada
    public void menu()
    {
        boolean salir = false;
        int opcion;
        
        // Ciclo que mostrará las opciones disponibles
        while (!salir)
        {
           System.out.println("");
           System.out.println("|-------------**BIENVENIDO**------------|"); 
           System.out.println("|     **COMPARACIÓN DE ÁRBOLES**        |");
           System.out.println("|  1. Agregar datos al Árbol 1          |"); 
           System.out.println("|  2. Agregar datos al Árbol 2          |");
           System.out.println("|  3. Comparar Árboles                  |");
           System.out.println("|  0. SALIR                             |");
           System.out.println("| ---------Selecciona la opción-------- |");
           opcion = op.nextInt();   // Capturamos el dato ingresado
           op.nextLine();
           switch (opcion)
           {
               
               // Si seleccionamos la opción 1, se ejecutará el método para agregar datos al árbol 1
                case 1:
                    System.out.println("Ingrese dato: ");
                    Arbol.addNodo1(op.nextInt());
                    break;
                    
                // Si seleccionamos la opción 2, se ejecutará el método para agregar datos al árbol 2
                case 2:
                    System.out.println("Ingrese dato: ");
                    Arbol.addNodo2(op.nextInt());
                    break;           
                
                // Al ingresar el número 3, primero se consultará que los árboles no estén vacíos
                // sino se ejecutará el método para comparar los árboles
                case 3: 
                    if ( Arbol.raiz1 == null && Arbol.raiz2 == null)
                        System.out.println("El árbol está vacío");
                    else
                    {
                        if (Arbol.compararArbol(Arbol.raiz1, Arbol.raiz2) == true)
                        {
                        System.out.println("          ¡¡FELICIDADES!!          ");
                        System.out.println("           (づ｡◕‿‿◕｡)づ            ");
                        System.out.println("Los Árboles ingresados son identicos");                   
                        }  //end if anidado
                        else
                        {
                            System.out.println("                ( ╥﹏╥)                 ");
                            System.out.println(" Los Árboles ingresados no son identicos");
                        }  // end else anidado
                        System.out.println("El primer árbol es:");
                        Arbol.imprimirInOrden1(Arbol.raiz1);      // Mostrará el árbol 1
                        System.out.println("");
                        System.out.println("El segundo árbol es: ");
                        Arbol.imprimirInOrden2(Arbol.raiz2);      // Mostrará el árbol 2                   
                        }  // end else                              
                    break;
                case 0:
                    salir = true;               
                    break;
                    
                default:
                    System.out.println("La opción ingresada es incorrecta");          
            }  // end switch
        }  // end while
    }  // end menú
    
    //**************************************************************
    
    public static void main(String[] args)
    {
        ComparacionArboles objeto = new ComparacionArboles();  // Iniciamos un objeto para ejecutar el menú
        objeto.menu();
    }  // end main    
}  // end class ComparacionArboles
