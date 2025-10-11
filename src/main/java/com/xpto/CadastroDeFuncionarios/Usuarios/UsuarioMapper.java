package com.xpto.CadastroDeFuncionarios.Usuarios;

import org.hibernate.annotations.Comment;
import org.springframework.stereotype.Component;

@Component
public class UsuarioMapper {

    public UsuarioModel map(UsuarioDTO usuarioDTO) {
        UsuarioModel usuarioModel = new UsuarioModel();
        usuarioModel.setId(usuarioDTO.getId());
        usuarioModel.setNome(usuarioDTO.getNome());
        usuarioModel.setEmail(usuarioDTO.getEmail());
        usuarioModel.setIdade(usuarioDTO.getIdade());
        usuarioModel.setImgUrl(usuarioDTO.getImgUrl());
        usuarioModel.setRank(usuarioDTO.getRank());
        usuarioModel.setMissoes(usuarioDTO.getMissoes());
        return usuarioModel;
    }

    public UsuarioDTO map(UsuarioModel usuarioModel) {
        UsuarioDTO usuarioDTO = new UsuarioDTO();
        usuarioDTO.setId(usuarioModel.getId());
        usuarioDTO.setNome(usuarioModel.getNome());
        usuarioDTO.setEmail(usuarioModel.getEmail());
        usuarioDTO.setIdade(usuarioModel.getIdade());
        usuarioDTO.setImgUrl(usuarioModel.getImgUrl());
        usuarioDTO.setRank(usuarioModel.getRank());
        usuarioDTO.setMissoes(usuarioModel.getMissoes());
        return usuarioDTO;
    }
}
