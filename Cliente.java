public class Cliente extends Pessoa{
    private String logradouro;
    private double gastoTotal;
    private boolean aVista;
    private boolean cartao;

    public void setCadastro(String nome, String cpf, String telefone, String endereco){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.logradouro = endereco;
        this.gastoTotal = 0;
    }

    public void getCadastro(){
        System.out.println("\nCliente\nNome: "+this.nome);
        System.out.println("CPF: " +this.cpf);
        System.out.println("Telefone: "+this.telefone);
        System.out.println("Logradouro: " +this.logradouro);
        System.out.println("Gasto Total: " +this.gastoTotal);
        getGasto();
        System.out.println(getMetodoPagamento()); 
    }

    public void setGasto(double gasto) {
        this.gastoTotal = gasto;
    }

    public double getGasto() {
        return this.gastoTotal;
    }

    public void setMetododePagamento(String tipoPagamento){
        this.cartao = (tipoPagamento.equalsIgnoreCase("cartao")) ? true : false;
        this.aVista = (!this.cartao) ? true : false;
    }
   
    public String getMetodoPagamento(){
        String pagamento = (this.cartao) ? "Cartao" : (this.aVista) ? "Avista" : "Pagamento Indefinido"; 
        return pagamento; 
    }

}