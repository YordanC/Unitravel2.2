package co.edu.uniquindio.unitravel.entidades;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(onlyExplicitlyIncluded = true)
public class Ciudad implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    @ToString.Include
    private int codigo;

    @ToString.Include
    @Column(length = 50, nullable = false)
    private String nombre;

    @OneToMany(mappedBy = "ciudad")
    private List <Hotel> hoteles;

    @OneToMany(mappedBy = "ciudad")
    private List<Usuario> usuarios;

    @OneToMany(mappedBy = "ciudadOrigen")
    private  List<Vuelo> vuelosOrigen;

    @OneToMany(mappedBy = "ciudadDestino")
    private List<Vuelo> vuelosDestino;
}
