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

    // Listar missoes
    public List<MissoesModel> listarMissoes(){
        return missoesRepository.findAll();
    }

    // Listar Missoes por Id
   public MissoesModel listarPorId(Long id){
       Optional<MissoesModel> missoesModelPorId = missoesRepository.findById(id);
       return missoesModelPorId.orElse(null);
   }

   // Criar uma Missao
    public MissoesModel criarMissao(MissoesModel missaoModel){
        return missoesRepository.save(missaoModel);
    }

    // Deletar uma Missao
    public void deletarMissao(Long id){
         missoesRepository.deleteById(id);
    }

}
