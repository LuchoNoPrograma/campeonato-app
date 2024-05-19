package com.uap.campeonatoapp.modelo.entidad;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "usuario")
public class Usuario {
    @ManyToMany
    @JoinTable(
        name = "usuario_rol",
        joinColumns = @JoinColumn(name = "id_usuario", foreignKey = @ForeignKey(name = "usuario_tiene_un_rol")),
        inverseJoinColumns = @JoinColumn(name = "id_rol", foreignKey = @ForeignKey(name = "rol_asignado_a_usuario")),
        uniqueConstraints = @UniqueConstraint(columnNames = {"id_usuario", "id_rol"})
    )
    private List<Rol> roles;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_persona", foreignKey = @ForeignKey(name = "usuario_es_persona"), nullable = false)
    private Persona persona;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;

    @Column(length = 55, nullable = false)
    private String nombreUsuario;

    @Column(nullable = false)
    private String contrasena;

    @Column(nullable = false)
    private Boolean habilitado;
}