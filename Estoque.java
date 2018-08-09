class Estoque{
    double produtoId;
    String nomeProduto;
    String marca;
    String tipoProduto;
    int quantidade;
    double preco;

    void setProduto(double id, String nome, String marca, String tipoProduto, int quantidade, double valor){
        this.produtoId = id;
        this.nomeProduto = nome;
        this.marca = marca;
        this.tipoProduto = tipoProduto;
        this.quantidade = quantidade;
        this.preco = valor;
    }

    void getProduto(){
        System.out.println("Produto id: " +this.produtoId);
        System.out.println("Nome: " +this.nomeProduto);
        System.out.println("Marca: " +this.marca);
        System.out.println("Tipo do Produto: " +this.tipoProduto);
        System.out.println("Quantidade: " +this.quantidade);
        System.out.println("Preço Unidade: R$ " +this.preco);
    }
    
}