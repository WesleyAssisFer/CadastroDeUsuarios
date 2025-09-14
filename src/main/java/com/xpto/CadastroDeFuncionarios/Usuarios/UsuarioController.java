package com.xpto.CadastroDeFuncionarios.Usuarios;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")

public class UsuarioController {

    @GetMapping("/boas-vindas")
    public String boasVindas(){
        return "Mensagem dessa rota";
    }


    // Adicionar Usuario (CREATE)
    @PostMapping("/criar")
    public String criarUsario(){
        return "Usuario Criado";
    }

    // Mostrar todos os Usuario (READ)
    @GetMapping("/listar")
    public String motrarTodosUsuario(){
        return "Mostrando o Usuario";
    }

    // Mostrar Usuarios por ID (READ)
    @GetMapping("/listarID")
    public String mostrarTodosUsuariosPorId(){
        return "Motrar Usuario por id";
    }

    // Alterar dados dos Usuarios (UPDATE)
    @PutMapping("/alterarID")
    public String alterarUsuarioPorId(){
        return "Alterar Usuario por id";
    }


    // Deletar Usuario (DELETE)
    @DeleteMapping("/deletarID")
    public String deletarUsuarioPorId(){
        return "Usuario deletado por id";
    }

}