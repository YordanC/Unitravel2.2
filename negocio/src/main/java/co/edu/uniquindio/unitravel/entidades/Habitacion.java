package co.edu.uniquindio.unitravel.entidades;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(onlyExplicitlyIncluded = true)
public class Habitacion implements Serializable {

    @Id
    @ToString.Include
    @EqualsAndHashCode.Include
    private int numero;

    @ToString.Include
    private Double precio;

    @ToString.Include
    private int capacidad;

    @ManyToOne
    private Hotel hotel;

    @OneToMany(mappedBy = "habitacion")
    private List<Reserva_Habitacion> reserva_habitaciones;

    @OneToMany (mappedBy = "habitacion")
    private List<Caracteristica> caracteristicas;

    @OneToMany(mappedBy = "habitacion")
    private List<Foto> fotos;

    @ManyToMany(mappedBy = "habitaciones")
    private List<Cama> camas;

}
