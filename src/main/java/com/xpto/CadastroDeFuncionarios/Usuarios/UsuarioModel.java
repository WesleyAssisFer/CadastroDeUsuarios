package com.xpto.CadastroDeFuncionarios.Usuarios;


import com.xpto.CadastroDeFuncionarios.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    private int idade;

    // @ManyToOne um ninja tem uma unica missao, Many Usuarios para One missa
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Foreing Key(Chave Estrangeira)
    private MissoesModel missoes;

}
