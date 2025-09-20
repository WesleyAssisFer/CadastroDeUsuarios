package com.xpto.CadastroDeFuncionarios.Usuarios;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")

public class UsuarioController {

    private UsuariosService usuariosService;

    public UsuarioController(UsuariosService usuariosService){
        this.usuariosService = usuariosService;
    }

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
    public List<UsuarioModel> listarUsuario(){
        return usuariosService.listarUsuarios();
    }

    // Mostrar Usuarios por ID (READ)
    @GetMapping("/listarID/{id}")
    public UsuarioModel mostrarTodosUsuariosPorId(@PathVariable Long id){
        return usuariosService.listarUsuarioId(id);
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