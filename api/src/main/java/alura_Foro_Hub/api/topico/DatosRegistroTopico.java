package alura_Foro_Hub.api.topico;

import java.time.LocalDateTime;

public record DatosRegistroTopico(
        Long id,
        String titulo,
        Cursos curso,
        String mensaje,
        String respuestas,
        String autor,
        LocalDateTime fechadeCreacion

) {
}
