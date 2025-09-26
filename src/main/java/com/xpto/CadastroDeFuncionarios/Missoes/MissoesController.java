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
    public MissoesModel criarMissao(@RequestBody MissoesModel missoesDados){
        return missoesService.criarMissao(missoesDados);
    }

    //  Get -- mandar uma requisão para mostrar as missoes
    // Read
    @GetMapping("/listar")
    public List<MissoesModel> listarMissao(){
        return missoesService.listarMissoes() ;
    }

    // Read - por ID
    @GetMapping("/listarID/{id}")
    public MissoesModel listarMissoePorId(@PathVariable Long id){
        return missoesService.listarPorId(id);
    }

    //  Put -- mandar uma requisão para atualizar as missoes
    // Update
    @PutMapping("/alterar/{id}")
    public MissoesModel atualizarMissao(@PathVariable Long id, @RequestBody MissoesModel missaoAtulizada){
        return missoesService.missaoAtualizado(id, missaoAtulizada);
    }

    // Delete -- mandar uma requisão para deletar as missoes
    // Delete
    @DeleteMapping("/deletarID/{id}")
    public void apagarMissao(@PathVariable Long id){
         missoesService.deletarMissao(id);
    }


}
