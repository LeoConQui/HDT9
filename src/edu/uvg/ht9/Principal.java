package edu.uvg.ht9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * Principal es la clase que interactua con el usuario. Tiene el metodo main
 * @author Leonel Contreras 18797
 * @version 1.0
 */
public class Principal {

    // creamos un objeto de tipo factory
    Factory fabrica = new Factory();

    // creamos una referencia de la interfaz que implementan todos los arboles
    // esto con la finalidad de ser un "contenedor" de las instancias que de el factory
    IEstructuraArbol<Palabra> arbol;

    // creamos un objeto ArrayList de Strings para guardar las palabras leidas del archivo
    ArrayList<String> lecturaSpanish = new ArrayList<String>();

    // leemos el documento Spanish.txt
    try {
        BufferedReader reader = new BufferedReader(new FileReader("Spanish.txt"));
        String line;
        while ((line = reader.readLine())!= null) {
            lecturaSpanish.add(line);
        }
        reader.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
    
    
    
}