package com.edteam.curso.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "role")
public class Role extends BaseEntity  {

    @Column(name = "nombre")
    @Getter @Setter
    private String nombre;

    /**
     * permisos
     */
    @OneToMany(cascade = CascadeType.ALL
            , fetch = FetchType.EAGER, mappedBy = "role")
    @Getter @Setter
    private Set<Permiso> permisos;
}
