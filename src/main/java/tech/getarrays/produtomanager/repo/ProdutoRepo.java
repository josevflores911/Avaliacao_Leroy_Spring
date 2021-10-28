package tech.getarrays.produtomanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.getarrays.produtomanager.model.Produto;

import java.util.List;
import java.util.Optional;

//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;


//@Repository
public interface ProdutoRepo extends JpaRepository<Produto, Long> {
    void deleteProdutoById(Long id);

    Produto findProdutoById(Long id);
    
    List<Produto> findProdutoByNome(String nome);
}
