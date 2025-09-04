package com.xpto.CadastroDeFuncionarios.Missoes;

import com.xpto.CadastroDeFuncionarios.Usuarios.UsuarioModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String rank;

    // @OneToMany Uma missao, para varios Usuarios
    @OneToMany(mappedBy = "missoes")
    private List<UsuarioModel> usario;



}
