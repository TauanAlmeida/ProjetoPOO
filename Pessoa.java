class Pessoa{
    private String nome;
    private String cpf;
    private String telefone;

    public void setPessoa(String nome, String cpf, String telefone){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    } 
    
    public void getPessoa(){
        System.out.println("\nNome: " +this.nome);
        System.out.println("Cpf: " +this.cpf);
        System.out.println("Telefone: " +this.telefone);
    }
}