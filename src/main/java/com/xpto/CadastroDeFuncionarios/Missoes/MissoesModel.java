package com.xpto.CadastroDeFuncionarios.Missoes;

import com.xpto.CadastroDeFuncionarios.Usuarios.UsuarioModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String rank;

    // @OneToMany Uma missao, para varios Usuarios
    @OneToMany(mappedBy = "missoes")
    private List<UsuarioModel> usario;


    // Construtor no args
    public MissoesModel(){

    }

    // Construtor all args
    public MissoesModel(String nomeMissao, String rank, UsuarioModel usuario){
        this.nome = nomeMissao;
        this.rank = rank;

    }

    public String getNomeMissao(){
        return this.nome;
    }
    public void setNomeMissao(String nomeMissao){
        this.nome = nomeMissao;
    }

    public String getRank(){
        return this.rank;
    }
    public void setRank(String rank){
        this.rank = rank;
    }


}
