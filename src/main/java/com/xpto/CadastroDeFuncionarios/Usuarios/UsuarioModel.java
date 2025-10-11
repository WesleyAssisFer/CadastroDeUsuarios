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
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(unique = true)
    private String email;

    @Column(name = "img_url")
    private String imgUrl;

    @Column(name = "rank")
    private String rank;

    @Column(name = "idade")
    private int idade;

    // @ManyToOne um ninja tem uma unica missao, Many Usuarios para One missa
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Foreing Key(Chave Estrangeira)
    private MissoesModel missoes;

}
