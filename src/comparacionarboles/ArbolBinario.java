
package comparacionarboles;

/***********************************************
* <ArbolBinario.java>
* <Yellsmy Toj >
*
* <Esta clase contiene los métodos para ingresar datos a los árboles y compararlos>
***********************************************/

public class ArbolBinario
{
    NodoArbol1 raiz1;
    NodoArbol2 raiz2;
    
    //**************************************************************
    
    // Método constructor se inicializan las raíces de los árboles
    public ArbolBinario()
    {
        this.raiz1 = null;
        this.raiz2 = null;
    }
    
    //**************************************************************
    
    // Método para insertar dato al primer árbol
    public void addNodo1(int dato1)
    {
        NodoArbol1 nuevo1 = new NodoArbol1(dato1);
        if (raiz1 == null)
        {     // Si es el primer dato que lo ingrese como raíz
            raiz1 = nuevo1;
        }
        else
        {
            NodoArbol1 aux1 = raiz1;
            NodoArbol1 padre1;
            while (true)
            {
                padre1=aux1;
                
                // Si el dato ingresado es menor a la raíz lo ingresa al hijo izquierdo
                if (dato1<aux1.dato1)
                {    
                    aux1= aux1.hijoIzquierdo1;
                    if (aux1==null)
                    {
                        padre1.hijoIzquierdo1 = nuevo1;
                        return;
                    }   // end if aux1
                }   // end if dato1
                
                // Sino es menor, lo ingresa en el hijo derecho
                else
                {
                    aux1 = aux1.hijoDerecho1;
                    if (aux1 == null)
                    {
                        padre1.hijoDerecho1 = nuevo1;
                        return;
                    }   // end if aux1
                }   // end else anidado
            }   // end while
        }   // end else       
    }  // end addNodo1
    
    //**************************************************************
    
    // Método para insertar dato al segundo árbol
    public void addNodo2(int dato2)
    {
        NodoArbol2 nuevo2 = new NodoArbol2(dato2);
        if (raiz2 == null)
            raiz2 = nuevo2;
        else
        {
            NodoArbol2 aux2 = raiz2;
            NodoArbol2 padre2;
            while (true)
            {
                padre2=aux2;
                
                // Si el dato ingresado es menor a la raíz lo ingresa al hijo izquierdo
                if (dato2<aux2.dato2)
                {
                    aux2= aux2.hijoIzquierdo2;
                    if (aux2==null)
                    {
                        padre2.hijoIzquierdo2 = nuevo2;
                        return;
                    }  // end if aux2
                }  // end if dato2
                
                // Sino es menor, lo ingresa en el hijo derecho
                else
                {
                    aux2 = aux2.hijoDerecho2;
                    if (aux2 == null)
                    {
                        padre2.hijoDerecho2 = nuevo2;
                        return;
                    }  // end if aux2
                }  // end else anidado
            }  //end while
        }  // end else       
    }  //end addNodo2
    
    //**************************************************************
    
    //Método recursivo para mostrar los datos de forma in orden del primer árbol
    public void imprimirInOrden1(NodoArbol1 r1)
    {
        
        // Entra a la posición izquierda y se ejecuta la recursividad
        // ingresando como parámetro la posición izquierda hasta que sea nulo
        if (r1.hijoIzquierdo1 != null)
        {
            imprimirInOrden1(r1.hijoIzquierdo1);
        }
        System.out.print(" "+r1.dato1);   // Mostramos el dato de la  posición actual
        
        // Entra a la posición derecha y se ejecuta la recursividad
        // ingresando como parámetro la posición derecha hasta que sea nulo
        if (r1.hijoDerecho1 != null)
        {
            imprimirInOrden1(r1.hijoDerecho1);
        }         
    }  // end imprimirInOrden1
    
    //**************************************************************
    
    // Método recursivo para mostrar los datos de forma in orden del segundo árbol
    public void imprimirInOrden2(NodoArbol2 r2)
    {
        
        // Entra a la posición izquierda y se ejecuta la recursividad
        // ingresando como parámetro la posición izquierda hasta que sea nulo
        if (r2.hijoIzquierdo2 != null)
        {
            imprimirInOrden2(r2.hijoIzquierdo2);
        }
        System.out.print(" "+r2.dato2);     //Mostramos el dato de la posición actual
        
        // Entra a la posición derecha y se ejecuta la recursividad
        // ingresando como parámetro la posición derecha hasta que sea nulo
        if (r2.hijoDerecho2 != null)
        {
            imprimirInOrden2(r2.hijoDerecho2);
        }         
    }  // end imprimirInOrden2
    
    //**************************************************************
    
    // Método que retorna la altura del primer árbol
    public int alturaArbol1(NodoArbol1 r1)
    {
        
        //Compara ambos lados y saca el máximo, a eso se le suma 1 que es el nivel donde está la raíz 
        if (r1 != null)
        {
            return 1 + Math.max(alturaArbol1(r1.hijoIzquierdo1), alturaArbol1(r1.hijoDerecho1));  
       }  
        return -1;         
    }  // end alturaArbol1
    
    //**************************************************************
    
    // Método que retorna la altura del segundo árbol
    public int alturaArbol2(NodoArbol2 r2)
    {
        
        // Compara ambos lados y saca el máximo, a eso se le suma 1 que es el nivel donde está la raíz 
        if (r2 != null)
        {
            return 1 + Math.max(alturaArbol2(r2.hijoIzquierdo2), alturaArbol2(r2.hijoDerecho2));
       }   
        return -1;         
    }  // end alturaArbol2
    
    //**************************************************************
    
    // Método que retorna el número de nodos del primer árbol
    public int nElementos1(NodoArbol1 r1)
    {
        int cont = 1; // El contador inicia en 1 porque inicia contando la raíz
        
        // cuenta todos los nodos del lado izquierdo utilizando la recursiidad
        if (r1.hijoIzquierdo1 != null)
        {  
            cont += nElementos1(r1.hijoIzquierdo1);
        }
        
        // cuenta todos los nodos del lado dereco utilizando la recursividad
        if (r1.hijoDerecho1 != null)
        {
            cont += nElementos1(r1.hijoDerecho1);
        }
        return cont;
    }  // end nElementos1
    
    //**************************************************************
    
    // Método que retorna el número de nodos del segundo árbol
    public int nElementos2(NodoArbol2 r2)
    {
        int cont = 1; // Contador que almacenará el número de elementos que se vaya sumando
        
        // cuenta todos los nodos del lado izquierdo utilizando la recursiidad
        if (r2.hijoIzquierdo2 != null)
        {  
            cont += nElementos2(r2.hijoIzquierdo2);
        }
        
        // cuenta todos los nodos del lado derecho utilizando la recursiidad
        if (r2.hijoDerecho2 != null)
        {
            cont += nElementos2(r2.hijoDerecho2);
        }
        return cont;
    }  // end nElementos2
    
    //**************************************************************
    
    // Método auxiliar recursivo: Servirá para saber si los datos de árbol 1 y árbol 2 son iguales
    public boolean compararDatos(boolean bandera, NodoArbol1 r1, NodoArbol2 r2)
    {
        boolean acceso = bandera;
        
        // cuando ambos datos sean nulos significará que se ha rrecorrido todo el árbol
        // entonces retornará un valor verdadero y saldrá del método
        if (r1 == null && r2 == null)
            return true;
        else
        {
            acceso = true;
            
            // Si los datos del árbol 1 y 2 no son iguales, retornara falso
            // y saldrá del método
            if (r1.dato1!= r2.dato2)
            {
                return false;
            }  // end if anidado
        }  // end else
        
        // Recorrerá todo el árbol 1 y 2 hasta que una de las condiciones anteriores se ejecute
        return compararDatos(acceso,r1.hijoIzquierdo1, r2.hijoIzquierdo2)&& compararDatos(acceso,r1.hijoDerecho1, r2.hijoDerecho2);               
    }  //end compararDatos
  
    //**************************************************************
    
    //Método para comparar la estructura y datos de árbol 1 y árbol 2
    public boolean compararArbol(NodoArbol1 r1, NodoArbol2 r2)
    {
        boolean bandera = false;
        
        // Se ejecutarán los métodos para comparar la altura de ambos árboles
        // si ambos tienen la misma altura, ingresará a la siguiente condición
        if (alturaArbol1(r1) == alturaArbol2(r2))
        {
            
            // Se ejecutarán los métodos para contar la cantidad de nodos de ambos árboles
            // si ambos tienen la misma cantidad de nodos, se compararán los datos con el 
            // método compararDatos y lo alamcenará en la variable bandera
            if (nElementos1(r1) == nElementos2(r2))
            {
                bandera = compararDatos(false, r1, r2);
            }  // end if anidado
        }  // end if
        
        // Si los datos son iguales retornará true y sino retornará false
        return bandera;
    }  //end compararArbol     
}  //end class ArbolBinario