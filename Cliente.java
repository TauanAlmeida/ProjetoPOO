public class Cliente extends Pessoa{
    String logradouro;
    double gastoTotal;
    boolean aVista;
    boolean cartao;


    public void setCliente(String nome, String cpf, String telefone, String endereco){
        this.setPessoa(nome, cpf, telefone);
        this.logradouro = endereco;
        this.gastoTotal = 0;
    }

    public void getCliente(){
        this.getPessoa();
        System.out.println("Logradouro: " +this.logradouro);
        System.out.println("Gasto Total: " +this.gastoTotal);
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