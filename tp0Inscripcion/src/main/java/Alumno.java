package src.main.java;

import java.util.ArrayList;
import java.util.List;

class Alumno {
    private String nombre;
    private Integer legajoAlumno;
    private List<Materia> materiasAprobadas;

    public Alumno(Integer legajoAlumno) {
        this.legajoAlumno = legajoAlumno;
        this.materiasAprobadas = new ArrayList<>();
    }

    public void agregarMateriaAprobada(Materia materia) {
        materiasAprobadas.add(materia);
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public boolean aproboCorrelativas(List<Materia> correlativas) {
        return materiasAprobadas.containsAll(correlativas);
    }

}
