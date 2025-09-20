package com.xpto.CadastroDeFuncionarios.Missoes;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MissoesService {

    private MissoesRepository missoesRepository;

    public MissoesService(MissoesRepository missoesRepository){
        this.missoesRepository = missoesRepository;
    }

    public List<MissoesModel> listarMissoes(){
        return missoesRepository.findAll();
    }

   public MissoesModel listarPorId(Long id){
       Optional<MissoesModel> missoesModelPorId = missoesRepository.findById(id);
       return missoesModelPorId.orElse(null);
   }

}
