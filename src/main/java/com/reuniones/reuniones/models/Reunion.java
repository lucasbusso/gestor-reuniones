package com.reuniones.reuniones.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;
import java.util.List;


@Entity
@Table(name = "reunion")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reunion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String asunto;

    private ZonedDateTime fecha;

    @ManyToMany
    @JoinTable(
            name="asistente",
            joinColumns = {@JoinColumn(name = "reunion_id")},
            inverseJoinColumns = {@JoinColumn(name = "persona_id")}
    )

    public List<Persona> asistentes;

    @Override
    public String toString() {
        return "Reunion{" +
                "fecha=" + fecha +
                ", asunto='" + asunto + '\'' +
                ", id=" + id +
                '}';
    }
}
