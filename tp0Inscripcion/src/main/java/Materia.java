package src.main.java;

import java.util.ArrayList;
import java.util.List;

class Materia {
    private String nombre;
    private List<Materia> correlativas;

    public Materia(String nombre) {
        this.nombre = nombre;
        this.correlativas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarCorrelativa(Materia correlativa) {
        correlativas.add(correlativa);
    }

    public List<Materia> getCorrelativas() {
        return correlativas;
    }
}