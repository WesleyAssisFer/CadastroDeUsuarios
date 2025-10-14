package com.xpto.CadastroDeFuncionarios.Usuarios;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class UsuariosService {

    private UsuarioRepository usuarioRepository;
    private UsuarioMapper usuarioMapper;

    public UsuariosService(UsuarioRepository usuarioRepository, UsuarioMapper usuarioMapper){
        this.usuarioRepository = usuarioRepository;
        this.usuarioMapper = usuarioMapper;
    }

    // Listar Usuarios
    public List<UsuarioDTO> listarUsuarios(){
        List<UsuarioModel> usuarios = usuarioRepository.findAll();
        return usuarios.stream()
                .map(usuarioMapper::map)
                .collect(Collectors.toList());
    }
    // Listar Usuario por Id
    public UsuarioDTO listarUsuarioId(Long id){
        Optional<UsuarioModel> userModelPorId = usuarioRepository.findById(id);
        return userModelPorId.map(usuarioMapper::map).orElse(null);
    }
    // Criar um novo Usuario
    public UsuarioDTO criarUsuario(UsuarioDTO usuarioDTO){
        UsuarioModel usuario = usuarioMapper.map(usuarioDTO);
        usuario = usuarioRepository.save(usuario);
        return usuarioMapper.map(usuario);
    }

    // Atualizar Usuario(Update)
    public UsuarioDTO atualizarUsuario(Long id, UsuarioDTO usuarioDTO) {
         Optional<UsuarioModel> userExistente = usuarioRepository.findById(id);
         if(userExistente.isPresent()){
           UsuarioModel usuarioAtualizado = usuarioMapper.map(usuarioDTO);
           usuarioAtualizado.setId(id);
           UsuarioModel userSalvo = usuarioRepository.save(usuarioAtualizado);
           return usuarioMapper.map(userSalvo);
         }
         return null;
    }

    // Delatar Usuario
    public void deletarPorId(Long id){
        usuarioRepository.deleteById(id);
    }


}
