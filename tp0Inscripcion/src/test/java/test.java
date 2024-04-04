package src.test.java;

import org.junit.Test;
import src.main.java.Materia;
import src.main.java.Inscripcion;
import src.main.java.Alumno;
import static org.junit.Assert.*;

public class InscripcionTest {
    @Test
    public void testInscripcionAprobada() {
        Alumno alumno = new Alumno(123);
        Materia algoritmos = new Materia("Algoritmos y Estructuras de Datos");
        Materia paradigmas = new Materia("Paradigmas de Programación");
        Materia diseño = new Materia("Diseño de Sistemas");

        paradigmas.agregarCorrelativa(algoritmos);
        diseño.agregarCorrelativa(paradigmas);
        alumno.agregarMateriaAprobada(paradigmas);
        alumno.agregarMateriaAprobada(algoritmos);

        Inscripcion inscripcion = new Inscripcion(alumno);
        inscripcion.agregarMateriaAInscribirse(diseño);

        assertTrue(inscripcion.aprobada());
    }

    @Test
    public void testInscripcionNoAprobada() {
        Alumno alumno = new Alumno(456);
        Materia algoritmos = new Materia("Algoritmos y Estructuras de Datos");
        Materia pdep = new Materia("Paradigmas de Programación");
        Materia dds = new Materia("Diseño de Sistemas");
        
        pdep.agregarCorrelativa(algoritmos);
        dds.agregarCorrelativa(pdep);


        Inscripcion inscripcion = new Inscripcion(alumno);
        inscripcion.agregarMateriaAInscribirse(dds);

        assertFalse(inscripcion.aprobada());
    }

}
