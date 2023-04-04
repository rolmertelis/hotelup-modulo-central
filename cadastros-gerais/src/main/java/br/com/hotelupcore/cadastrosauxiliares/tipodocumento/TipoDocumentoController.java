package br.com.hotelupcore.cadastrosauxiliares.tipodocumento;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tipodocumento")
public class TipoDocumentoController {

    @GetMapping(path = ("/{id}"))
    String listaTiposDocumentos(@PathVariable Integer id){
        return "Deu certo " + id;
    }

}
