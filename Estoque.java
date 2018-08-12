public class Estoque{
    private int produtoId;
    public String nomeProduto;
    public String marca;
    private String tipoProduto;
    public int quantidade;
    private double preco;

    int getEstoque(){
        return this.quantidade;
    }

    void setDescontarEstoque(int quantidade){
        this.quantidade = this.quantidade - quantidade;
    }

    public String getProdutoNome(){
        return this.nomeProduto; 
    }

    void setProduto(int id, String nome, String marca, String tipoProduto, int quantidade, double valor){
        this.produtoId = id;
        this.nomeProduto = nome;
        this.marca = marca;
        this.tipoProduto = tipoProduto;
        this.quantidade = quantidade;
        this.preco = valor;
    }

    void getProduto(){
        System.out.println("\nProduto id: " +this.produtoId);
        System.out.println("Nome: " +this.nomeProduto);
        System.out.println("Marca: " +this.marca);
        System.out.println("Tipo do Produto: " +this.tipoProduto);
        System.out.println("Quantidade: " +this.quantidade);
        System.out.println("Preço Unidade: R$ " +this.preco);
    }
    
}