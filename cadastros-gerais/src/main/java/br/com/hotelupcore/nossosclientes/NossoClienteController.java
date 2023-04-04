package br.com.hotelupcore.nossosclientes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nossosclientes")
public class NossoClienteController {

    @GetMapping
    public String teste(){
        return "Deu certo ";
    }

}
