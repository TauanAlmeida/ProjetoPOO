import java.util.ArrayList;

public class Caixa extends Carrinho{
    double valorTemp;
    
    //Seta o valor da compra feita pelo cliente: Ex: valor * quantidade = valor da compra. 
    public void setValorTemp(double valor, double quantidade){
        this.valorTemp += valor * quantidade;
    }

    public double getValorTemp(){
        return this.valorTemp;
    }
  
    public void debitarCarrinho(ArrayList<Carrinho> listaProdutos, ArrayList<Estoque> estoqueProdutos, Cliente cl , String tipoPagamento){
        System.out.println("NOTA FISCAL!");
        System.out.println("Produtos Comprados");
        for(int i = 0; i < estoqueProdutos.size(); i++){
            for(int j = 0; j < listaProdutos.size(); j++){
                if (listaProdutos.get(j).getNomeProdutoCarrinho().equalsIgnoreCase(estoqueProdutos.get(i).getProdutoNome())){
                    estoqueProdutos.get(i).setDescontarEstoque(listaProdutos.get(j).getQuantidadeProduto());
                    setValorTemp(estoqueProdutos.get(i).getValorProduto(), listaProdutos.get(j).getQuantidadeProduto());
                    cl.setGasto(getValorTemp());
                    System.out.println(listaProdutos.get(j).getQuantidadeProduto() + "x " + listaProdutos.get(j).getNomeProdutoCarrinho() + ", Preço UND: R$" +estoqueProdutos.get(i).getValorProduto());
                } 
            } 
        }
        System.out.println("Valor Total: R$" + getValorTemp());
        cl.setMetododePagamento(tipoPagamento);
        System.out.println("Tipo pagamento: " +cl.getMetodoPagamento());

        //Zerando o valor temporario para a compra seguinte.
        setValorTemp(0, 0);
    }
   
}