package com.xpto.CadastroDeFuncionarios.Usuarios;

import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UsuariosService {

    private UsuarioRepository usuarioRepository;

    public UsuariosService(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;

    }

    // Listar Usuarios
    public List<UsuarioModel> listarUsuarios(){
        return usuarioRepository.findAll();
    }

    public UsuarioModel listarUsuarioId(Long id){
        return usuarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario não encontrado"));
    }

}
