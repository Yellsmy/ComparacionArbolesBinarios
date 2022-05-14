
package comparacionarboles;


public class ArbolBinario {
    NodoArbol1 raiz1;
    NodoArbol2 raiz2;
    
    public ArbolBinario(){
        this.raiz1 = null;
        this.raiz2 = null;
    }
     //insertar un nodo en el primer árbol
    public void addNodo1(int dato1){
        NodoArbol1 nuevo1 = new NodoArbol1(dato1);
        if(raiz1 == null){
            raiz1 = nuevo1;
        }else{
            NodoArbol1 aux1 = raiz1;
            NodoArbol1 padre1;
            while(true){
                padre1=aux1;
                if(dato1<aux1.dato1){
                    //va a la izquierda
                    aux1= aux1.hijoIzquierdo1;
                    if(aux1==null){
                        padre1.hijoIzquierdo1 = nuevo1;
                        return;
                    }
                }else{
                    //va a la derecha
                    aux1 = aux1.hijoDerecho1;
                    if(aux1 == null){
                        padre1.hijoDerecho1 = nuevo1;
                        return;
                    }
                }
            }
        }       
    }
    
     //insertar un nodo en el segundo árbol
    public void addNodo2(int dato2){
        NodoArbol2 nuevo2 = new NodoArbol2(dato2);
        if(raiz2 == null){
            raiz2 = nuevo2;
        }else{
            NodoArbol2 aux2 = raiz2;
            NodoArbol2 padre2;
            while(true){
                padre2=aux2;
                if(dato2<aux2.dato2){
                    //va a la izquierda
                    aux2= aux2.hijoIzquierdo2;
                    if(aux2==null){
                        padre2.hijoIzquierdo2 = nuevo2;
                        return;
                    }
                }else{
                    //va a la derecha
                    aux2 = aux2.hijoDerecho2;
                    if(aux2 == null){
                        padre2.hijoDerecho2 = nuevo2;
                        return;
                    }
                }
            }
        }       
    }
    
    //Método para comparar los dos árboles
    public boolean comparar(NodoArbol1 r1, NodoArbol2 r2){
        if(r1 == null && r2 == null) return true;
        if(r1 == null && r2 != null || r1 != null && r2 == null ) return false; //Si los árboles no tienen el mismo número de nodos es porque no son iguales
        if(r1.dato1 != r2.dato2){ // Si los datos no son iguales retornará falso
            return false;
        }
        //Sino entra al if anterior es porque los datos son iguales y retornará la misma función para que lo recorra
        return comparar(r1.hijoIzquierdo1, r2.hijoIzquierdo2)&& comparar(r1.hijoDerecho1, r2.hijoDerecho2);
    }
       
    //Método para mostrar los datos InOrden del primer árbol
    public void ImprimirInOrden1(NodoArbol1 r1){
        if(r1.hijoIzquierdo1 != null){   //Entra a la posición izquierda del árbol siempre que no sea null
            ImprimirInOrden1(r1.hijoIzquierdo1);}  //Volvemos a llamar a la función hasta que la posición izquierda sea null
        System.out.print(" "+r1.dato1);     //Mostramos posición actual
        if(r1.hijoDerecho1 != null){ //Entramos a la posición derecha siempre que sea diferente de null, si es null continua con el resto del código
            ImprimirInOrden1(r1.hijoDerecho1); //Si tiene posición derecha se llama a la función nuevamente hasta que la posición derecha sea null
        }         
    }
    
    //Método para mostrar los datos InOrden del segundo árbol
    public void ImprimirInOrden2(NodoArbol2 r2){
        if(r2.hijoIzquierdo2 != null){   //Entra a la posición izquierda del árbol siempre que no sea null
            ImprimirInOrden2(r2.hijoIzquierdo2);}  //Volvemos a llamar a la función hasta que la posición izquierda sea null
        System.out.print(" "+r2.dato2);     //Mostramos posición actual
        if(r2.hijoDerecho2 != null){ //Entramos a la posición derecha siempre que sea diferente de null, si es null continua con el resto del código 
            ImprimirInOrden2(r2.hijoDerecho2); //Si tiene posición derecha se llama a la función nuevamente hasta que la posición derecha sea null
        }         
    }
    
    //Método para vaciar los árboles
    public void vaciar(){
        raiz1.hijoDerecho1 = raiz1.hijoIzquierdo1 = null;
        raiz1 = null;
        raiz2.hijoDerecho2 = raiz2.hijoIzquierdo2 = null;
        raiz2 = null;
    }

    
}
