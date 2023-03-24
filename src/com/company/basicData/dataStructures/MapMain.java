package com.company.basicData.dataStructures;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {

        Map<String, String> personas = new HashMap<>();

        personas.put("123123123", "Nombre Apellido 1");
        personas.put("1214231", "Nombre Apellido 2");
        personas.put("124323234", "Nombre Apellido 3");

        System.out.println(personas);

        // iterar sobre el mapa para sacar claves
        for(String key:personas.keySet()){
            System.out.println(key);
        }
        // iterar sobre el mapa para sacar valores
        for(String value:personas.values()){
            System.out.println(value);
        }
        // iterar sobre el mapa para sacar clave y valor
        for(Map.Entry<String, String> pair: personas.entrySet()){
            System.out.println(pair.getKey() + ":" + pair.getValue());
        }
    }
}
