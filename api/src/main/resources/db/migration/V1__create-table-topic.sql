CREATE TABLE topico (
    id bigint Not Null auto_increment,
    titulo Varchar(200) Not Null,
    cursos_id bigint Not Null,
    mensaje TEXT Not Null,
    usuario_id bigint Not Null,
    fecha datetime Not Null,
    activo bit Not Null,

        Primary Key(id),
        Foreign Key (curso_id) References cursos(id),
        Foreign Key (usuario_id) References usuarios(id)
    );