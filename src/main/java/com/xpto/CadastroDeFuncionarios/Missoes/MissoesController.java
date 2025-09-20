package com.xpto.CadastroDeFuncionarios.Missoes;

import jakarta.persistence.ManyToOne;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/missoes")

public class MissoesController {
    private MissoesService missoesService;

    public MissoesController(MissoesService missoesService){
        this.missoesService = missoesService;
    }

    //  Post -- mandar uma requisão para criar as missoes
    // Create
    @PostMapping("/criar")
    public String criarMissao(){
        return "Criando Missão";
    }

    //  Get -- mandar uma requisão para mostrar as missoes
    // Read
    @GetMapping("/listar")
    public List<MissoesModel> listarMissao(){
        return missoesService.listarMissoes() ;
    }

    // Read - por ID
    @GetMapping("/listarID/{id}")
    public MissoesModel listarId(@PathVariable Long id){
        return missoesService.listarPorId(id);
    }

    //  Put -- mandar uma requisão para atualizar as missoes
    // Update
    @PutMapping("/alterar")
    public String atualizarMissao(){
        return "Atualiza Missão";
    }

    // Delete -- mandar uma requisão para deletar as missoes
    // Delete
    @DeleteMapping("/deletar")
    public String apagarMissao(){
        return "Apaga a Missão";
    }


}
