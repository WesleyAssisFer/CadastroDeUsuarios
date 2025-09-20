package com.xpto.CadastroDeFuncionarios.Usuarios;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


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
        Optional<UsuarioModel> userModelPorId = usuarioRepository.findById(id);
        return userModelPorId.orElse(null);
    }

}
