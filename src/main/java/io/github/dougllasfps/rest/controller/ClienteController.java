package io.github.dougllasfps.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/clientes") // define rota base da api
public class ClienteController {

    @RequestMapping(
            value = {"/hello/{nome}", "/hellow/{nome}"},
            method = RequestMethod.GET
            // consumes = {"application/json", "application/xml"} // para métodos POST
            // produces = {"application/json", "application/xml"}
    )
    @ResponseBody
    public String helloClientes(@PathVariable("nome") String nomeCliente) {
        return String.format("Hello %s!", nomeCliente);
    }

}
