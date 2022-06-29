package br.com.cursojava.model.repository;

import br.com.cursojava.model.entity.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository  extends CrudRepository<Produto, Integer> {

}
