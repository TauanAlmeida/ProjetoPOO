import java.util.ArrayList;

class Programa{
    public static void main(String args[]) {
        Caixa cx = new Caixa();
        Funcionario f1 = new Funcionario();
        Cliente c1 = new Cliente();
        ArrayList<Estoque> estoqueProdutos = new ArrayList<>();
        Estoque arroz = new Estoque();
        Estoque feijao = new Estoque();
        Estoque acucar = new Estoque();
        Estoque macarrao = new Estoque();
        
        //cadastro do estoque
        //setProduto(id, nome, marca, tipo, quantidade, valor)
        arroz.setProduto( 1, "Arroz", "Chines", "Alimenticio", 585, 3.25);
        feijao.setProduto( 2, "Feijao", "Imperial", "Alimenticio", 455, 3.85);
        acucar.setProduto( 3, "acucar", "pillar", "Alimenticio", 355, 1.79);
        macarrao.setProduto( 4, "macarrao", "vitarella", "Alimenticio", 414, 1.19);
        estoqueProdutos.add(arroz);
        estoqueProdutos.add(feijao);
        estoqueProdutos.add(acucar);
        estoqueProdutos.add(macarrao);

        ArrayList<Carrinho> listaProdutos = new ArrayList<Carrinho>();
        //inserindo produtos no carrinho 
        Carrinho produto1 = new Carrinho(); 
        Carrinho produto2 = new Carrinho();
        produto1.setCarrinho("acucar", 15);
        produto2.setCarrinho("macarrao", 5);
        listaProdutos.add(produto1); 
        listaProdutos.add(produto2);
        
     
        //cx.debitarCarrinho(listaProdutos, estoqueProdutos);
            for(int i = 0; i < estoqueProdutos.size(); i++){
                for(int j = 0; j < listaProdutos.size(); j++){
                    if (listaProdutos.get(j).getNomeProdutoCarrinho().equalsIgnoreCase(estoqueProdutos.get(i).getProdutoNome())){
                        estoqueProdutos.get(i).setDescontarEstoque(listaProdutos.get(j).getQuantidadeProduto());
                        System.out.println("Estoque "+listaProdutos.get(j).getNomeProdutoCarrinho()+ ": " +  estoqueProdutos.get(i).getEstoque());
                    } 
                } 
            }
            cx.setMetododePagamento("asdasd");
            System.out.println(cx.getMetodoPagamento());
        

        f1.setFuncionario("Tauan", "operador de caixa", 987, "15/05/2015", "10:50", "18:50");
        //setCliente(nome, cpf, telefone, endereco, gasto)
        c1.setCliente("Roberto", "105.654.987", "87- 88428891","Rua onze n261 vila debora");
       // c1.getCliente();
    }
}