package alura_Foro_Hub.api.controller;


import alura_Foro_Hub.api.topico.DatosRegistroTopico;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topic")
public class TopicController {

    @PostMapping
    public void registrarTopic(@RequestBody DatosRegistroTopico datosRegistroTopico){

        System.out.println(datosRegistroTopico);
    }

}
