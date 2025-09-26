package com.xpto.CadastroDeFuncionarios.Usuarios;

import com.xpto.CadastroDeFuncionarios.Missoes.MissoesModel;
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
    public UsuarioModel criarUsario(@RequestBody UsuarioModel usuario){
        return usuariosService.criarUsuario(usuario);
    }

    // Mostrar todos os Usuario (READ)
    @GetMapping("/listar")
    public List<UsuarioModel> listarUsuario(){
        return usuariosService.listarUsuarios();
    }

    // Mostrar Usuarios por ID (READ)
    @GetMapping("/listarID/{id}")
    public UsuarioModel mostrarUsuariosPorId(@PathVariable Long id){
        return usuariosService.listarUsuarioId(id);
    }

    // Alterar dados dos Usuarios (UPDATE)
    @PutMapping("/alterar/{id}")
    public UsuarioModel alterarUsuarioPorId(@PathVariable Long id, @RequestBody UsuarioModel atulizarUsuario){
        return usuariosService.atualizarUsuario(id,atulizarUsuario);
    }


    // Deletar Usuario (DELETE)
    @DeleteMapping("/deletarID/{id}")
    public void deletarUsuarioPorId(@PathVariable Long id){
       usuariosService.deletarPorId(id);
    }

}