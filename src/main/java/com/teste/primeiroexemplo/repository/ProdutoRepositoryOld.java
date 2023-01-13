// package com.teste.primeiroexemplo.repository;

// import java.util.ArrayList;
// import java.util.List;
// import java.util.Optional;

// import org.springframework.stereotype.Repository;

// import com.teste.primeiroexemplo.model.Produto;
// import com.teste.primeiroexemplo.model.exception.ResourceNotFoundException;

// @Repository
// public class ProdutoRepositoryOld {
//     // Simulando o banco de dados.
//     private ArrayList<Produto> produtos = new ArrayList<Produto>();
//     private Integer ultimoId = 0;

//     /**
//      * Método para retornar uma lista de produtos
//      * 
//      * @return Lista de produtos.
//      */
//     public List<Produto> obterTodos() {
//         return produtos;
//     }

//     /**
//      * Método que retorna o produto encontrado pelo seu Id
//      * 
//      * @param id do produto que será localizado
//      * @return Retorna um produto específico caso encontrado.
//      */
//     public Optional<Produto> obterPorId(Integer id) {
//         return produtos
//                 .stream()
//                 .filter(produto -> produto.getId() == id)
//                 .findFirst();
//     }

//     /**
//      * Metodo para adicionar produto na lista.
//      * 
//      * @param produto que será adicionado
//      * @return Retorna o produto que foi adicionado na lista.
//      */
//     public Produto adicionar(Produto produto) {
//         ultimoId++;

//         produto.setId(ultimoId);
//         produtos.add(produto);

//         return produto;
//     }

//     /**
//      * Metodo para Deletar o produto por Id.
//      * 
//      * @param id do produto que será deletado.
//      */
//     public void deletar(Integer id) {
//         produtos.removeIf(produto -> produto.getId() == id);
//     }

//     /**
//      * Metodo para atualizar um produto na lista.
//      * 
//      * @param produto que será atualizado.
//      * @return Retorna o produto após ser atualizado.
//      */
//     public Produto atualizar(Produto produto) {

//         // Encontrar um produto na lista
//         Optional<Produto> produtoEncontrado = obterPorId(produto.getId());

//         if (produtoEncontrado.isEmpty()) {
//             throw new ResourceNotFoundException("Produto não encontrado");
//         }

//         // Eu tenho que remover o produto antigo da lista
//         deletar(produto.getId());

//         // Depois adicionar o produto atualizado na lista.
//         produtos.add(produto);

//         return produto;
//     }
// }
