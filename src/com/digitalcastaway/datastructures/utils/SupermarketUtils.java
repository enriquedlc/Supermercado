package com.digitalcastaway.datastructures.utils;

import java.lang.reflect.Array;

public class SupermarketUtils {
    private static final String []NOMBRES_PERSONA = {
          "Goyo",
          "Lucrecia",
          "Moncho",
          "Montse",
          "Lionel",
          "Francisco",
          "Nicolas",
          "Yolanda",
          "Matias",
          "Rasputín",
          "Igor"
    };

    public static final String []NOMBRES_PRODUCTO = {
            "Pistacho",
            "Millo",
            "Leche",
            "Tortilla precocinada",
            "Pasticho",
            "Gofio",
            "Plátano",
            "Plan de pipas",
            "Merengue",
            "Tacos salmón",
            "Takis",
            "Cheetos Pelotazo"
    };

    public static String generarNombrePersonaAleatorio() {
        return NOMBRES_PERSONA[(int) (Math.random() * NOMBRES_PERSONA.length)];
    }

    public static String generarNombreProductoAleatorio() {
        int indice = (int) Math.random() * NOMBRES_PRODUCTO.length; //manera mas legible
        return NOMBRES_PRODUCTO[indice];
    }
}


