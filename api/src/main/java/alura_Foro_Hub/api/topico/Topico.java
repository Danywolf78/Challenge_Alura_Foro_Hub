package alura_Foro_Hub.api.topico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Table(name="topicos")
@Entity(name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    private LocalDateTime fechadeCreacion;
    @Enumerated(EnumType.STRING)
    private Cursos curso;
    private  String autor;
    private String respuestas;
    private boolean status;


    public Topico(DatosRegistroTopico datosRegistroTopico) {
        this.titulo= datosRegistroTopico.titulo();
        this.curso=datosRegistroTopico.curso();
        this.mensaje= datosRegistroTopico.mensaje();
        this.autor= datosRegistroTopico.autor();
        this.fechadeCreacion=datosRegistroTopico.fechadeCreacion();
        this.respuestas= datosRegistroTopico.respuestas();
    }
}
