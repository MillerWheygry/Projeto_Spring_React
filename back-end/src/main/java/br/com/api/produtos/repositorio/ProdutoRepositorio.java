package br.com.api.produtos.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.api.produtos.modelo.ProdutoModelo;

//essa notacao vai dizer para o spring que a interface é um repositorio
@Repository
//CrudRepository tenho que passar 2 parametro (Classe e tipo das variaveis)
public interface ProdutoRepositorio extends CrudRepository<ProdutoModelo, Long>{
    
}
