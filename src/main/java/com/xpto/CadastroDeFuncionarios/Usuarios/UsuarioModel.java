package com.xpto.CadastroDeFuncionarios.Usuarios;


import com.xpto.CadastroDeFuncionarios.Missoes.MissoesModel;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_cadastro")
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

    //Construtor no args
    public UsuarioModel(){
    }

    // Construtor all args
    public UsuarioModel(String nome, String email, int idade){
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    // Get e Set
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

}
