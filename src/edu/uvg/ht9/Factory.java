package edu.uvg.ht9;

import structure5.Association;

/**
 * Factory es la clase que implementa el diseno creacional factory
 * @author Leonel Contreras 18797
 * @version 1.0
 */
public class Factory {
    // metodos
    /**
     * Factory es el constructor de la clase
     */
    public  Factory() {
        
    }

    /**
     * Factoria es el metodo que retorna objetos que implementan la interfaz IEstructuraArbol
     * @param opcion
     * @return un objeto de tipo IEstructuraArbol
     */
    public IEstructuraArbol<Palabra> Factoria(int opcion) {
        // validamos la opcion
        if (opcion == 1) {
            return new ArbolSplay<Palabra>();
        } else if(opcion == 2) {
            return new ArbolRedBlack<Palabra>();
        } else {
            return new BinarySearchTree<Palabra>();
        }

        /**if (opcion == 1) {
            return new ArbolSplay<Palabra>();
        } else {
            return new ArbolRedBlack<Palabra>();
        }**/
    }
}
