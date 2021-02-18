package adaitw.java;

public interface crearDominio {
    default void crear(){
        int dominio = (int)Math.floor(Math.random()*10000);
        //System.out.println("Dominio nª: " + dominio);
    }
}
