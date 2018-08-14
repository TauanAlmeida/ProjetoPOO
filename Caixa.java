import java.util.ArrayList;

public class Caixa extends Carrinho{
    double valorDaCompra;
    boolean aVista;
    boolean cartao;

    public void setMetododePagamento(String tipoPagamento){
        this.cartao = (tipoPagamento.equalsIgnoreCase("cartao")) ? true : false;
        this.aVista = (!this.cartao) ? true : false;
    }
   
    public String getMetodoPagamento(){
        String pagamento = (this.cartao) ? "Cartao" : (this.aVista) ? "Avista" : "Pagamento Indefinido"; 
        return pagamento; 
    }

    public double getValordaCompra(){
        return this.valorDaCompra;
    }

    public void setValorDaCompra(double valor){
        this.valorDaCompra = valor;
    }
    
  //  ArrayList<Estoque> estoqueProdutos = new ArrayList<>();
  /*   String nomeCar;
    public void debitarCarrinho(ArrayList carrinho, ArrayList estoque){
         for(int i = 0; i < carrinho.size(); i++){
            System.out.println(carrinho.get(i) + "" + estoque.get(i));
           // System.out.println(carrinho.get(i).getNomeProdutoCarrinho());
            if (carrinho.get(i).getNomeProdutoCarrinho().equalsIgnoreCase(estoque.get(i).getProdutoNome())){
                System.out.println("deu Certo");
            }else{
                System.out.println("não deu Certo");
            }
    
        } 
    } */
   
}