package adaitw.java;

import java.util.HashSet;
import java.util.Random;

public interface crearDominio {
    default void crear(){
        int dominio = (int)Math.floor(Math.random()*10000);
        //System.out.println("Dominio nª: " + dominio);

    }
}
