package alura_Foro_Hub.api.controller;


import alura_Foro_Hub.api.topico.DatosRegistroTopico;
import alura_Foro_Hub.api.topico.TopicRepository;
import alura_Foro_Hub.api.topico.Topico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topic")
public class TopicController {
    @Autowired
    private TopicRepository topicRepository;

    @PostMapping
    public void registrarTopic(@RequestBody DatosRegistroTopico datosRegistroTopico){
topicRepository.save(new Topico(datosRegistroTopico));
        System.out.println(datosRegistroTopico);
    }

}
