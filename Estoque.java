public class Estoque{
    public int quantidade;
    public String nomeProduto;
    private int produtoId;
    private String marca;
    private String tipoProduto;
    private double preco;

    public int getEstoque(){
        return this.quantidade;
    }

    public void setDescontarEstoque(int quantidade){
        if (quantidade <= getEstoque()){
            this.quantidade -= quantidade;
        }else{
            System.out.println("Erro, Estoque insuficiente");
        }   
    }

    public String getProdutoNome(){
        return this.nomeProduto; 
    }

    public void setProduto(int id, String nome, String marca, String tipoProduto, int quantidade, double valor){
        this.produtoId = id;
        this.nomeProduto = nome;
        this.marca = marca;
        this.tipoProduto = tipoProduto;
        this.quantidade = quantidade;
        this.preco = valor;
    }

    public void getProduto(){
        System.out.println("\nProduto id: " +this.produtoId);
        System.out.println("Nome: " +this.nomeProduto);
        System.out.println("Marca: " +this.marca);
        System.out.println("Tipo do Produto: " +this.tipoProduto);
        System.out.println("Quantidade: " +this.quantidade);
        System.out.println("Preço Unidade: R$ " +this.preco);
    }
    
    public double getValorProduto(){
        return this.preco;
    }
}