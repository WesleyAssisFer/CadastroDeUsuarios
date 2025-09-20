package com.xpto.CadastroDeFuncionarios.Missoes;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MissoesService {

    private MissoesRepository missoesRepository;

    public MissoesService(MissoesRepository missoesRepository){
        this.missoesRepository = missoesRepository;
    }

    public List<MissoesModel> listarMissoes(){
        return missoesRepository.findAll();
    }

    public MissoesModel listarPorId(Long id) {
        return missoesRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Missão não encontrada"));
    }

}
