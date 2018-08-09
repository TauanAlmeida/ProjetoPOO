class Cliente extends Funcionario{
    String cpf;
    String telefone;
    double gastoTotal;

    void setCliente(String nome, String cpf, String telefone, double gasto){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.gastoTotal = (gasto > 0) ? gasto = 0 : gasto;
    }

    void getCliente(){
        System.out.println("Cliente Nome: " +this.nome);
        System.out.println("Cpf: " +this.cpf);
        System.out.println("Telefone: " +this.telefone);
        System.out.println("Gasto Total: " +this.gastoTotal);
    }
}