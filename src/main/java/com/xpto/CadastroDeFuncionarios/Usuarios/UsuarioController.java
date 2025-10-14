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

    // Adicionar Usuario (CREATE)
    @PostMapping("/criar")
    public UsuarioDTO criarUsario(@RequestBody UsuarioDTO usuario){
        return usuariosService.criarUsuario(usuario);
    }

    // Mostrar todos os Usuario (READ)
    @GetMapping("/listar")
    public List<UsuarioDTO> listarUsuario(){
        return usuariosService.listarUsuarios();
    }

    // Mostrar Usuarios por ID (READ)
    @GetMapping("/listarID/{id}")
    public UsuarioDTO mostrarUsuariosPorId(@PathVariable Long id){
        return usuariosService.listarUsuarioId(id);
    }

    // Alterar dados dos Usuarios (UPDATE)
    @PutMapping("/alterar/{id}")
    public UsuarioDTO alterarUsuarioPorId(@PathVariable Long id, @RequestBody UsuarioDTO atualizarUsuario){
        return usuariosService.atualizarUsuario(id,atualizarUsuario);
    }


    // Deletar Usuario (DELETE)
    @DeleteMapping("/deletarID/{id}")
    public void deletarUsuarioPorId(@PathVariable Long id){
       usuariosService.deletarPorId(id);
    }

}