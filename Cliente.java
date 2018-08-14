public class Cliente extends Pessoa{
    String logradouro;
    double gastoTotal;

    void setCliente(String nome, String cpf, String telefone, String endereco){
        this.setPessoa(nome, cpf, telefone);
        this.logradouro = endereco;
        this.gastoTotal = 0;
    }

    void getCliente(){
        this.getPessoa();
        System.out.println("Logradouro: " +this.logradouro);
        System.out.println("Gasto Total: " +this.gastoTotal);
    }

    public void setGasto(double gasto) {
        this.gastoTotal = gasto;
    }
}