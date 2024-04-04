package src.test.java;

import org.junit.api.Assertions;
import org.junit.Test;

import java.util.ArrayList;
public class test {public class Test {

    @Test
    public void alumnoPuedeInscribirseADiseño() {
        Materia aYED = new Materia("AyED");
        Materia discreta = new Materia("Discreta");
        Materia ads = new Materia("Analisis De Sistemas", aYED, discreta);
        Materia pdp = new Materia("Paradigmas de Programacion", aYED);
        Materia dds = new Materia("Diseño de sistemas", ads, pdp);

        Alumno pepito = new Alumno("Pepito", 2221, pdp, aYED);
        Inscripcion inscripcion = new Inscripcion(pepito, dds);
        Assertions.assertTrue(inscripcion.aprobada());
    }

    @Test
    public void alumnoNoPuedeInscribirsePorqueNoAproboNada() {
        Materia pdp = new Materia("Paradigmas de Programacion");
        Materia aYED = new Materia("AyED");
        Materia discreta = new Materia("Discreta");

        Alumno juan = new Alumno("Juan", 1);
        Inscripcion inscripcion = new Inscripcion(juan, pdp, aYED, discreta);
        Assertions.assertFalse(inscripcion.aprobada());
    }

    @Test
    public void alumnoNoPuedeInscribirseAAnalisisDeSistemas() {
        Materia aYED = new Materia("AyED");
        Materia ads = new Materia("Analisis De Sistemas", aYED);

        Alumno fede = new Alumno("Fede", 2, aYED);
        Inscripcion inscripcion = new Inscripcion(fede, ads);
        Assertions.assertFalse(inscripcion.aprobada());
    }
}
}
