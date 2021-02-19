package adaitw.java;

import jdk.swing.interop.SwingInterOpUtils;
import javax.swing.*;
import java.util.*;
import java.util.Iterator;
import java.time.LocalDate;



public class DNRPA {

    public static void main(String[] args) {

        List<Seccional> seccionales = new ArrayList<>();
        List<AutoElectrico> autosElectricos = new ArrayList<>();
        List<Utilitario> utilitarios = new ArrayList<>();
        List<Colectivo> colectivos = new ArrayList<>();
        List<Camion> camiones = new ArrayList<>();
        List<Auto> autos = new ArrayList<>();
        List<Moto> motos = new ArrayList<>();

        //Seccionales de Registro Nacional
        seccionales.add(new Seccional("S1", "CABA"));
        seccionales.add(new Seccional("S2", "CORDOBA"));
        seccionales.add(new Seccional("S3", "TUCUMAN"));
        seccionales.add(new Seccional("S4", "CORRIENTES"));


        // -----SECCIONAL S1 CABA-----
        Auto a1 = new Auto(new Propietario("Andy", "CABA", "456"),
                false,  LocalDate.of(2019, 5, 23));
        a1.agregarAutorizado(new Autorizados("Marcos", "CABA", "333"));
        a1.agregarAutorizado(new Autorizados("Marcelo", "CABA", "873"));
        autos.add(a1);

        Auto a2 = new Auto(new Propietario("Charly", "CABA", "543"),
                false,  LocalDate.of(2020, 4, 03));
        a2.agregarAutorizado(new Autorizados("Carlitos", "CABA", "333"));
        autos.add(a2);

        Camion ca1 = new Camion(new Propietario("Juan", "CABA", "344"),
                3,true,  LocalDate.of(2018, 2, 22));
        ca1.agregarAutorizado(new Autorizados("Carlitos", "CABA", "993"));
        camiones.add(ca1);

        seccionales.get(0).agregarVehiculo(a1);
        seccionales.get(0).agregarVehiculo(a2);
        seccionales.get(0).agregarVehiculo(ca1);
        Seccional S1 = seccionales.get(0);


        // -----SECCIONAL S2 CORDOBA-----
        Auto a3 = new Auto(new Propietario("Adriana", "CORDOBA", "543"),
                true,  LocalDate.of(2021, 01, 10));
        a3.agregarAutorizado(new Autorizados("Caty", "CORDOBA", "773"));
        autos.add(a3);

        Camion ca2 = new Camion(new Propietario("Pepe", "CORDOBA", "454"),
                3, true,  LocalDate.of(2020, 07, 20));
        ca2.agregarAutorizado(new Autorizados("Pepito", "CORDOBA", "393"));
        camiones.add(ca2);

        Camion ca3 = new Camion(new Propietario("Antonio", "CORDOBA", "004"),
                3,true,  LocalDate.of(2019, 04, 27));
        ca3.agregarAutorizado(new Autorizados("Tito", "CORDOBA", "543"));
        camiones.add(ca3);

        seccionales.get(1).agregarVehiculo(a3);
        seccionales.get(1).agregarVehiculo(ca2);
        seccionales.get(1).agregarVehiculo(ca3);
        Seccional S2 = seccionales.get(1);


        // ---SECCIONAL S3 TUCUMAN
        Auto a4 = new Auto(new Propietario("Vero", "TUC", "223"),
                true,  LocalDate.of(2020, 9, 12));
        a4.agregarAutorizado(new Autorizados("Maria", "TUC", "703"));
        autos.add(a4);

        Camion ca4 = new Camion(new Propietario("Luis", "TUC", "114"),
                3, true,  LocalDate.of(2020, 5, 23));
        ca4.agregarAutorizado(new Autorizados("Miguel", "TUC", "983"));
        camiones.add(ca4);

        Camion ca5 = new Camion(new Propietario("Oscar", "TUC", "304"),
                3, true,  LocalDate.of(2018, 8, 14));
        ca5.agregarAutorizado(new Autorizados("Oscarcito", "TUC", "653"));
        ca5.cambiaPropietario(new Propietario("Lorenzo", "TUC", "123"));
        ca5.asignarAltaNuevoTitular(LocalDate.of(2021, 02,05));
        camiones.add(ca5);
//
        Camion ca6 = new Camion(new Propietario("Amancio", "TUC", "764"),
                3, true,  LocalDate.of(2020, 6, 06));
        ca6.agregarAutorizado(new Autorizados("Eduardo", "TUC", "093"));
        camiones.add(ca6);

        seccionales.get(2).agregarVehiculo(a4);
        seccionales.get(2).agregarVehiculo(ca4);
        seccionales.get(2).agregarVehiculo(ca5);
        seccionales.get(2).agregarVehiculo(ca6);
        Seccional S3 = seccionales.get(2);


        // ---SECCIONAL S4 CORRIENTES
        AutoElectrico ae1 = new AutoElectrico(new Propietario("Ignacio", "CORRIENTES", "332"),
                false, LocalDate.of(2020, 5, 23));
        ae1.agregarAutorizado(new Autorizados("Gonzalo", "CORRIENTES", "223"));
        autosElectricos.add(ae1);

        Moto m1 = new Moto(new Propietario("Gero", "CORRIENTES", "SAL332"),
                false, LocalDate.of(2021, 01, 31));
        m1.crear();
        motos.add(m1);

        Colectivo col1 = new Colectivo(new Propietario("TATA S.A", "CORRIENTES", "20-333222-1" ),
                3, "22",/* (JOptionPane.showInputDialog("Ingrese cantidad de asientos para COLECTIVO col1: ")),*/
                true, LocalDate.of(2018,05,30));
        col1.agregarAutorizado(new Autorizados("Francisco", "CORRIENTES", "223"));
        colectivos.add(col1);

        Utilitario u1 = new Utilitario(new Propietario("Santiago","" ,"" ),true,
                LocalDate.of(2018, 3,4));
        utilitarios.add(u1);

        seccionales.get(3).agregarVehiculo(ae1);
        seccionales.get(3).agregarVehiculo(m1);
        seccionales.get(3).agregarVehiculo(col1);
        seccionales.get(3).agregarVehiculo(u1);
        Seccional S4 = seccionales.get(3);

        //Turnos cargados
        Queue<String> turno = new LinkedList<>();
        turno.add("Diego");
        turno.add("Gabriel");
        turno.add("Mariana");
        turno.add("Fernando");
        turno.add("Hugo");
        turno.add("Horacio");
        turno.add("Sara");


        // ---- /// ---- FIN DE LA CARGA DE DATOS ---- /// ---- ///


        // **** Pantalla BIENVENIDA y CONSULTAS ****
        String usuario = JOptionPane.showInputDialog("   ***    Bienvenid@ a la D.N.R.P.A.   ***\n Introduce tu Nombre por favor: ");
        String consultas = JOptionPane.showInputDialog("*       BIENVENIDO "+usuario+"      * " +
                "\n Opciones de Consultas a DNRPA:" +
                "\n 0 ==> Listar Total Autos" +
                "\n 1 ==> Propietarios Camiones [A-Z] " +
                "\n 2 ==> Seccionales y Vehículos  " +
                "\n 3 ==> Solicitar Turno  " +
                "\n 4 ==> Seccional CABA " +
                "\n 5 ==> Seccional Córdoba " +
                "\n 6 ==> Seccional Tucumán " +
                "\n 7 ==> Seccional Corrientes " +
                "\n Escribe el NUMERO correspondiente:");

        switch (consultas){
            case "0":
                System.out.println("Listar Total AUTOS => "+Seccional.mostrarAutos(autosElectricos, autos));
                break;
            case "1":
                Collections.sort(camiones, Comparator.comparing(o -> o.propietario.nombre));
                Iterator<Camion> camionIterator = camiones.iterator();
                while(camionIterator.hasNext()) {
                    System.out.println(camionIterator.next());
                }
                break;
            case "2":
                Iterator<Seccional> se = seccionales.iterator();
                while(se.hasNext()) {
                    System.out.println(se.next());
                }
                break;
            case "3":
                turno.add(usuario);
                System.out.println("Muchas gracias, "+usuario+" por favor, aguarde y será atendido");
                System.out.println("Personas en espera: "+ turno.size());

                break;
            case "4":
                System.out.println("Total Vehículos "+S1);
                break;
            case "5":
                System.out.println("Total Vehículos "+S2);
                break;
            case "6":
                System.out.println("Total Vehículos "+S3);
                break;
            case "7":
                System.out.println("Total Vehículos "+S4);
                break;
        }

        //REQUERIMIENTOS INTEGRADOR ===> ===> ===> ===> ===>
        System.out.println("");
        System.out.println("");
        System.out.println(" <=== *** <=== *** <=== *** <=== *** <=== ***  INTEGRADOR  *** ===> *** ===> *** ===> *** ===> ");
        System.out.println("");

        // 1) Solicito la totalidad de autos a combustion o electricos:
        System.out.println(" ***  LISTAR TOTALIDAD AUTOS (Eléctricos y Combustión) ***  ");
        System.out.println("Listar Total Autos: "+Seccional.mostrarAutos(autosElectricos, autos));
        //System.out.println("Motor Combustión ==> "+autos+" Motor Eléctrico ==> "+autosElectricos);*/
        //Averiguar collections Iterable


        // 2) Ordeno alfabéticamente propietarios camiones:
        System.out.println("");
        System.out.println(" ***  LISTAR PROPIETARIOS DE CAMIONES ALFABÉTICAMENTE ***  ");

        //Segunda forma de ordenar
        Collections.sort(camiones, new Comparator<Camion>() {
            @Override
            public int compare(Camion o1, Camion o2) {
                return o1.propietario.nombre.compareTo(o2.propietario.nombre);
            }
        });
        camiones.forEach((camion)->{
            System.out.println("Listado CAMIONES [A-Z]: "+camion.getPropietario());
        });

        // 3) Registrar Fecha de alta: OK ===> localDate.of()


        // 4) Cambio de Propietario: OK ===>  Ver Camion ca5 como ejemplo
        System.out.println("");
        System.out.println(" ***   CAMBIO DE TITULARIDAD Y FECHA   ***  ");
        System.out.println(ca5.nuevoPropietario());

        // 5) Registrar Fecha cambio de Propietario: OK ===>  Ver Camion ca5 como ejemplo
        System.out.println("");
        System.out.println(" ***  FECHA DE CAMBIO DE TITULARIDAD  ***  ");
        System.out.println(ca5.fechaCambioTitular());
        System.out.println("DATOS COMPLETOS CAMION ca5: "+ca5);

        // 6) Asignar Patente Automáticamente:
           //System.out.println(m1.getDominio());

        // 7) Consultar si pasó un año o mas desde el registro o cambio de titular para un auto en particular.


        //  <= <= <=   OTRAS CONSULTAS   => => =>
        System.out.println("");
        System.out.println("");
        System.out.println(" ***    OTRAS CONSULTAS   ***  ");
        //TURNOS REGISTRO
        System.out.println("");
        System.out.println("   *** TURNOS DRNPA *** ");
        System.out.println("Personas en espera: "+ turno.size());
        System.out.println("Primer turno: "+ turno.poll());
        for(String persona: turno){
            System.out.println("En espera: "+persona);
        }
        System.out.println("");
        System.out.println("");
        System.out.println("Listar Todas las Seccionales: "+seccionales);

        System.out.println("");
        System.out.println("");
        System.out.println("Total de Autos Electricos: "+autosElectricos.size());
        System.out.println("Total de Camiones: "+camiones.size());
        System.out.println("Total de Colectivos: "+colectivos.size());
        System.out.println("Total de Autos: "+autos.size());
        System.out.println("Total de Motos: "+motos.size());

        System.out.println("");
        for(int cont=0; cont < autos.size(); cont++){
            System.out.println("Ficha Tecnica Alta en Registro: "+autos.get(cont).fichaTecnica());
        }
        System.out.println("");
        for(int cont=0; cont < colectivos.size(); cont++){
            System.out.println("Propietarios de Colectivos: "+colectivos.get(cont).getPropietario());
        }


        //(JOptionPane.showInputDialog("Ingrese: AUTO - MOTO - COLECTIVO - UTILITARIO - CAMION")),

        /*Forma Lambda 1
        Collections.sort(camiones, Comparator.comparing(o -> o.propietario));
        System.out.println("Listado propietarios camiones y nº dominio: "+camiones);

        /*Forma Lambda 2
        Collections.sort(camiones, (o1, o2) -> o1.propietario.compareTo(o2.propietario));
        System.out.println("Listado propietarios camiones y nº dominio: "+camiones);*/

         /*
        for(Camion c: camiones){
        c.getPropietario();
        }*/
    }
}


/*                         ******* ANOTACIONES *******

//Forma 2 agregar info:
//Auto autoAndy = new Auto("Andy", "Argentina", "123456", "Agus", "Quito", "123456", "abc123", false);
//autos.add(autoAndy);
//System.out.println("Nombre Propietario: "+autoAndy.getPropietario()+" - Nombre Autorizado: "+autoAndy.getAutorizado());


/*La DNRPA (Dirección Nac. Reg. Propiedad del Vehiculo) necesita un sistema para anotar todos
        los vehículos registrados en el país.
        La DNRPA tiene Registros seccionales.Ok
        Cada Registro tiene automotores registrados.Ok
        Los automotores pueden ser de uso particular o profesional. *** Ok ***
        Se registran motos eléctricas, autos eléctricos, motocicletas y automóviles a combustión, colectivos, utilitarios y camiones. *** Ok ***
        Todos los vehículos tienen un único propietario y uno o varios autorizados a conducir. *** Ok ***
        De los propietarios y autorizados se sabe el nombre, DNI y dirección. *** Ok ***

        1)Se desea poder listar todos los autos registrados en todas las seccionales = autos electricos y a combustion.  *** Ok ***
        2)Se desea poder listar a todos los propietarios (en orden alfabético) de camiones. *** Ok ***
        Opcionales:
        1) Cada automotor tiene una PATENTE unica que se asigna automáticamente al realizar el alta.
        2) Registrar fecha de alta. *** Ok ***
        3) Pueden cambiar de propietario. *** Ok ***
        4) Se debe registrar la fecha de cambio de propietario. *** Ok ***
        5) Se puede consultar si pasó un año o mas desde el registro o cambio de titular para un auto en particular.*/