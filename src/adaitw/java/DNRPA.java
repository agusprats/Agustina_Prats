package adaitw.java;

import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DNRPA {

    public static void main(String[] args) {
        List<Seccional> seccionales = new ArrayList<>();
        List<AutoElectrico> autosElectricos = new ArrayList<>();
        List<Camion> camiones = new ArrayList<>();
        List<Colectivo> colectivos = new ArrayList<>();
        List<Auto> autos = new ArrayList<>();
        List<Moto> motos = new ArrayList<>();

        //Seccionales de Registro Nacional
        seccionales.add(new Seccional("S1", "CABA"));
        seccionales.add(new Seccional("S2", "CORDOBA"));
        seccionales.add(new Seccional("S3", "TUCUMAN"));
        seccionales.add(new Seccional("S4", "CORRIENTES"));


        // -----SECCIONAL S1 CABA-----
        Auto a1 = new Auto(new Propietario("Andy", "TUCUMAN", "TUC456"),
                false,  LocalDate.of(2019, 5, 23));
        a1.agregarAutorizado(new Autorizados("Marcos", "BSAS", "BSAS333"));
        a1.agregarAutorizado(new Autorizados("Marcelo", "BSAS", "BSAS873"));
        autos.add(a1);

        Auto a2 = new Auto(new Propietario("Charly", "BRASIL", "123543"),
                false,  LocalDate.of(2020, 4, 03));
        a2.agregarAutorizado(new Autorizados("Carlitos", "BRASIL", "BRA333"));
        autos.add(a2);

        Camion ca1 = new Camion(new Propietario("Juan", "CHILE", "443344"),
                3,true,  LocalDate.of(2018, 2, 22));
        ca1.agregarAutorizado(new Autorizados("Carlitos", "CHILE", "CHI3993"));
        camiones.add(ca1);

        seccionales.get(0).agregarVehiculo(a1);
        seccionales.get(0).agregarVehiculo(a2);
        seccionales.get(0).agregarVehiculo(ca1);
        Seccional S1 = seccionales.get(0);


        // -----SECCIONAL S2 CORDOBA-----
        Auto a3 = new Auto(new Propietario("Adriana", "BRASIL", "BRA543"),
                true,  LocalDate.of(2021, 01, 10));
        a3.agregarAutorizado(new Autorizados("Caty", "BRASIL", "BRA773"));
        autos.add(a3);

        Camion ca2 = new Camion(new Propietario("Pepe", "BOLIVIA", "BOL454"),
                3, true,  LocalDate.of(2020, 07, 20));
        ca2.agregarAutorizado(new Autorizados("Pepito", "BOLIVIA", "BOL393"));
        camiones.add(ca2);

        Camion ca3 = new Camion(new Propietario("Antonio", "VENEZUELA", "VEN004"),
                3,true,  LocalDate.of(2019, 04, 27));
        ca3.agregarAutorizado(new Autorizados("Tito", "VENEZUELA", "VEN543"));
        camiones.add(ca3);

        seccionales.get(1).agregarVehiculo(a3);
        seccionales.get(1).agregarVehiculo(ca2);
        seccionales.get(1).agregarVehiculo(ca3);
        Seccional S2 = seccionales.get(1);


        // ---SECCIONAL S3 TUCUMAN
        Auto a4 = new Auto(new Propietario("Vero", "PERU", "PER223"),
                true,  LocalDate.of(2020, 9, 12));
        a4.agregarAutorizado(new Autorizados("Maria", "PERU", "PER703"));
        autos.add(a4);

        Camion ca4 = new Camion(new Propietario("Luis", "MEXICO", "MEX114"),
                3, true,  LocalDate.of(2020, 5, 23));
        ca4.agregarAutorizado(new Autorizados("Miguel", "MEXICO", "MEX983"));
        camiones.add(ca4);

        Camion ca5 = new Camion(new Propietario("Oscar", "COLOMBIA", "COL304"),
                3, true,  LocalDate.of(2018, 8, 14));
        ca5.agregarAutorizado(new Autorizados("Oscarcito", "COLOMBIA", "COL653"));
        ca5.cambiaPropietario(new Propietario("Lorenzo", "CABA", "CABA123"));
        ca5.asignarAltaNuevoTitular(LocalDate.of(2021, 02,05));
        camiones.add(ca5);
//
        Camion ca6 = new Camion(new Propietario("Amancio", "COSTA RICA", "CRI764"),
                3, true,  LocalDate.of(2020, 6, 06));
        ca6.agregarAutorizado(new Autorizados("Eduardo", "COSTA RICA", "CRI093"));
        camiones.add(ca6);

        seccionales.get(2).agregarVehiculo(a4);
        seccionales.get(2).agregarVehiculo(ca4);
        seccionales.get(2).agregarVehiculo(ca5);
        seccionales.get(2).agregarVehiculo(ca6);
        Seccional S3 = seccionales.get(2);


        // ---SECCIONAL S4 CORRIENTES
        AutoElectrico ae1 = new AutoElectrico(new Propietario("Ignacio", "CORRIENTES", "COR332"),
                false, LocalDate.of(2020, 5, 23));
        ae1.agregarAutorizado(new Autorizados("Gonzalo", "CORRIENTES", "COR223"));
        autosElectricos.add(ae1);

        Moto m1 = new Moto(new Propietario("Gero", "SALTA", "SAL332"),
                false, LocalDate.of(2021, 01, 31));
        motos.add(m1);

        Colectivo col1 = new Colectivo(new Propietario("TATA S.A", "IBERA", "20-333222-1" ),
                3,
                (JOptionPane.showInputDialog("Ingrese cantidad de asientos: ")),
                true, LocalDate.of(2018,05,30));
        col1.agregarAutorizado(new Autorizados("Francisco", "IBERA", "IBE223"));
        colectivos.add(col1);

        seccionales.get(3).agregarVehiculo(ae1);
        seccionales.get(3).agregarVehiculo(m1);
        seccionales.get(3).agregarVehiculo(col1);
        Seccional S4 = seccionales.get(3);


        // ---- /// ---- FIN DE LA CARGA DE DATOS ---- /// ---- ///

        // 1) Solicito la totalidad de autos a combustion o electricos:
        System.out.println("Listar todos los autos. Autos a combustión: "+autos+" Autos Eléctricos: "+autosElectricos);


        // 2) Ordeno alfabéticamente propietarios camiones:
        Collections.sort(camiones, new Comparator<Camion>() {
            @Override
            public int compare(Camion o1, Camion o2) {
                return o1.propietario.nombre.compareTo(o2.propietario.nombre);
            }
        });
        System.out.println("Listado alfabético propietarios camiones: "+camiones);


        // 3) Registrar Fecha de alta: OK ===> localDate.of()


        // 4) Cambio de Propietario: OK ===>  Ver Camion ca5 como ejemplo
        System.out.println(ca5.nuevoPropietario());

        // 5) Registrar Fecha cambio de Propietario: OK ===>  Ver Camion ca5 como ejemplo
        System.out.println(ca5.fechaCambioTitular());

        // 6) Asignar Patente Automáticamente:


        // 7) Consultar si pasó un año o mas desde el registro o cambio de titular para un auto en particular.


        //  <= <= <=   OTRAS CONSULTAS   => => =>
        System.out.println("Listado Seccionales completo: "+seccionales);
        System.out.println("Vehiculos de Seccional S1: "+S1.vehiculos);
        System.out.println(ca5);

        camiones.forEach((camion)->{
            System.out.println("Propietario: "+camion.getPropietario()+" - Autorizados: "+camion.getAutorizados());
        });

        System.out.println("Total de Autos Electricos: "+autosElectricos.size());
        System.out.println("Total de Camiones: "+camiones.size());
        System.out.println("Total de Camiones: "+colectivos.size());
        System.out.println("Total de Autos: "+autos.size());
        System.out.println("Total de Motos: "+motos.size());


        for(int cont=0; cont < autos.size(); cont++){
            System.out.println("Categoria de autos: "+autos.get(cont).getCategoriaProfesional());
        }

        for(int cont=0; cont < camiones.size(); cont++){
            System.out.println("Propietarios de Camiones: "+camiones.get(cont).getPropietario());
        }

        for(int cont=0; cont < autos.size(); cont++){
            System.out.println("Ficha Tecnica Alta en Registro: "+autos.get(cont).fichaTecnica());
        }


        //(JOptionPane.showInputDialog("Ingrese: AUTO - MOTO - COLECTIVO - UTILITARIO - CAMION")),
        //import javax.swing.*;

        /*Forma Lambda 1
        Collections.sort(camiones, Comparator.comparing(o -> o.propietario));
        System.out.println("Listado propietarios camiones y nº dominio: "+camiones);

        /*Forma Lambda 2
        Collections.sort(camiones, (o1, o2) -> o1.propietario.compareTo(o2.propietario));
        System.out.println("Listado propietarios camiones y nº dominio: "+camiones);*/

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