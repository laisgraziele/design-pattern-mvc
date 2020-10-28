/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ProdutoController;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import projetomvc.ProdutoFx;

/**
 * FXML Controller class
 *
 * @author Lucas
 */
public class ProdutoViewController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private TextField descricaoProduto;

    @FXML
    private TextField precoProduto;

    @FXML
    private Button btnGravar;

    @FXML
    private Button btnCancelar;
    
    @FXML
    void btnGravarAction(ActionEvent event) {
        ProdutoController controller = new ProdutoController();
        controller.CriarProduto(descricaoProduto.getText(), Double.parseDouble(precoProduto.getText()));
        
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Informação");
        alert.setHeaderText("Cadastro criado");
        alert.setContentText("O cadastro do produto foi criado com sucesso");
        alert.showAndWait();
        
        descricaoProduto.setText("");
        precoProduto.setText("");
    }
    
    @FXML
    void btnCancelarAction(ActionEvent event) {
        ProdutoFx.getStage().close();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
