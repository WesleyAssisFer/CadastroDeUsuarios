package com.xpto.CadastroDeFuncionarios.Usuarios;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class UsuarioController {

    @GetMapping("/boas-vindas")
    public String boasVindas(){
        return "Mensagem dessa rota";
    }

}