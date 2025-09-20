package com.xpto.CadastroDeFuncionarios.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {

}
