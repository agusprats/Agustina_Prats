package adaitw.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DNRPA {

    private static Object Camion;

    public static void main(String[] args) {

        Seccional seccional = new Seccional();
        /*               ****AUTOS****              */
        List <Auto> autos = seccional.getAutos();
        List<Propietario> propietarios = new ArrayList<>();
        List<Autorizado> autorizados = new ArrayList<>();
        propietarios.add(new Propietario("Agus", "Brasil", "654321"));
        autorizados.add(new Autorizado("Andy", "Brasil", "123456"));
        autos.add(new Auto(propietarios, autorizados, "ABC123", false));
        propietarios.add(new Propietario("Josefina", "Argentina", "654321"));
        autorizados.add(new Autorizado("Francisco", "Argentina", "673456"));
        autos.add(new Auto(propietarios, autorizados, "QQW123", false));


        /*               **** CAMIONES ****              */
        List <Camion> camiones = seccional.getCamiones();
        propietarios.add(new Propietario("Juan", "Uruguay", "98765"));
        autorizados.add(new Autorizado("Marcelo","Uruguay", "444555"));
        camiones.add(new Camion(propietarios, autorizados, "ZZX232", true));
        propietarios.add(new Propietario("Oscar", "Paraguay", "887444"));
        autorizados.add(new Autorizado("Oscarcito","Paraguay", "908443"));
        camiones.add(new Camion(propietarios, autorizados, "OUJ334", true));
        propietarios.add(new Propietario("Pepe", "Paraguay", "887444"));
        autorizados.add(new Autorizado("Pepito","Paraguay", "908443"));
        camiones.add(new Camion(propietarios, autorizados, "LVC334", true));
        //seccional.setAutos(new ArrayList<>()); No hace falta porque en Seccional tengo (autos = new ArrayList<>();) en el constructor


        camiones.forEach((camion)->{
            System.out.println("Dominio nº: "+camion.getDominio()+" Propietario: "+camion.getPropietarios());
        });

        System.out.println(camiones);


        //Falta unir al listado autos eléctricos con Casting
        System.out.println("Cantidad total de camiones: "+camiones.size());


        System.out.println("Cantidad total de autos: "+autos.size());
        for(int cont=0; cont < autos.size(); cont++){
            System.out.println(autos.get(cont).fichaTecnica());
        }




        // Collections.sort() method is used here
        /*Collections.sort(camiones, new Comparator<Camion>() {
            @Override
            public int compare(Camion o1, Camion o2) {
                return (int) o1.propietarios.compareTo(o2.propietarios);
            }
        });
        System.out.println("Listado alfabético propietarios camiones y nº dominio : "+camiones);

        //Forma Lambda 1
        Collections.sort(camiones, Comparator.comparing(o -> o.getPropietarios()));
        System.out.println("Listado propietarios camiones y nº dominio: "+camiones);

        //Forma Lambda 2
        Collections.sort(camiones, (o1, o2) -> o1.propietarios.compareTo(o2.propietarios));
        System.out.println("Listado propietarios camiones y nº dominio: "+camiones);*/

    }



}




/*La DNRPA (Dirección Nac. Reg. Propiedad del Vehiculo) necesita un sistema para anotar todos
 los vehículos registrados en el país.
 La DNRPA tiene Registros seccionales.
 Cada Registro tiene automotores registrados.
 Los automotores pueden ser de uso particular o profesional.
 Se registran motos eléctricas, autos eléctricos, motocicletas y automóviles a combustión, colectivos, utilitarios y camiones.
 Todos los vehículos tienen un único propietario y autorizados a conducir.
 De los propietarios y autorizados se sabe el nombre, DNI y dirección.

 1)Se desea poder listar todos los autos registrados en todas las seccionales = autos electricos y a combustion.
 2)Se desea poder listar a todos los propietarios (en orden alfabético) de camiones.*/
