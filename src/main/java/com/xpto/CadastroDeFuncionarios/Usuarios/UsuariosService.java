package com.xpto.CadastroDeFuncionarios.Usuarios;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UsuariosService {

    private UsuarioRepository usuarioRepository;
    private UsuarioMapper usuarioMapper;

    public UsuariosService(UsuarioRepository usuarioRepository, UsuarioMapper usuarioMapper){
        this.usuarioRepository = usuarioRepository;
        this.usuarioMapper = usuarioMapper;
    }

    // Listar Usuarios
    public List<UsuarioModel> listarUsuarios(){
        return usuarioRepository.findAll();
    }
    // Listar Usuario por Id
    public UsuarioModel listarUsuarioId(Long id){
        Optional<UsuarioModel> userModelPorId = usuarioRepository.findById(id);
        return userModelPorId.orElse(null);
    }
    // Criar um novo Usuario
    public UsuarioDTO criarUsuario(UsuarioDTO usuarioDTO){
        UsuarioModel usuario = usuarioMapper.map(usuarioDTO);
        usuario = usuarioRepository.save(usuario);
        return usuarioMapper.map(usuario);
    }

    // Atualizar Usuario(Update)
    public UsuarioModel atualizarUsuario(Long id, UsuarioModel usuarioAtualizado) {
     if(usuarioRepository.existsById(id)){
         usuarioAtualizado.setId(id);
         return usuarioRepository.save(usuarioAtualizado);
     }
        return null;
    }

    // Delatar Usuario
    public void deletarPorId(Long id){
        usuarioRepository.deleteById(id);
    }


}
