package cl.praxis.miprimerspring.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="estudiantes")
public class Student {
    @Id //indica que la columna es PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) //esto genera el id autoincremental
    @Column(name = "id_estudiante", nullable = false, unique = true)//indica que es columna en la BD y su nombre
    private long id;
    @Column(name="nombre", nullable = false, length = 50)
    private String name;
    @Column(name = "apellido", nullable = true, length = 50)
    private String surname;
    @Column(name = "fecha_nacimiento", nullable = false)
    private LocalDate birthDate;
    @Column(nullable = false, unique = true)
    private String email;
    //TODO Crear clase super persona

}
