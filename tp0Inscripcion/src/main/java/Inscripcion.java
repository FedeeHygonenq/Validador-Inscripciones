package src.main.java;

import java.util.ArrayList;
import java.util.List;

public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materiasAInscribirse;

    public Inscripcion(Alumno alumno) {
        this.alumno = alumno;
        this.materiasAInscribirse = new ArrayList<>();
    }

    public void agregarMateriaAInscribirse(Materia materia) {
        materiasAInscribirse.add(materia);
    }

    public boolean aprobada() {
        return materiasAInscribirse.stream().allMatch(this::validarMateria);
    }

    private boolean validarMateria(Materia materia) {
        return alumno.aproboCorrelativas(materia.getCorrelativas());
    }
}