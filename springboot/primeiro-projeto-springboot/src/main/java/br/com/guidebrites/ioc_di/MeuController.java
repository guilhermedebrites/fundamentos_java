package br.com.guidebrites.ioc_di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/component")
public class MeuController {

    @Autowired
    MeuComponent meuComponent;

    @GetMapping("/")
    public String chamandoComponente(){
        String resultado = meuComponent.chamarMeuComponent();
        return resultado;
    }
}
