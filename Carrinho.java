public class Carrinho extends Estoque{

    public String getNomeProdutoCarrinho(){
        return this.nomeProduto;
    }

    public void setNomeProdutoCarrinho(String nome){
        this.nomeProduto = nome;
    }
    
    public int getQuantidadeProduto(){
        return this.quantidade;
    }

    public int setQuantidadeProduto(int qntd){
        return this.quantidade = qntd;
    }

    public void setCarrinho(String nome, int qntd){
        this.setNomeProdutoCarrinho(nome);
        this.setQuantidadeProduto(qntd);
    }

}