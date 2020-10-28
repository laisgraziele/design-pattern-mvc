/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Produto;

/**
 *
 * @author Lais
 */
public class ProdutoController {
    public void CriarProduto(String descricao, double preco){
        // Aqui ficaria a chamado para comunicação com o banco de dados
        // como o projeto não está comunicando com o banco, o mesmo é
        // apenas criado em memória
        Produto produto = new Produto(descricao, preco);
    }
}
