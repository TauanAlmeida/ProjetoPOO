public class Pessoa{
    public String nome;
    public String cpf;
    public String telefone;
    
    public void setCadastro(String nome, String cpf, String telefone){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public void getCadastro(){
        System.out.println("Nome: " +this.nome);
        System.out.println("Cpf: " +this.cpf);
        System.out.println("Telefone: " +this.telefone);
    }
}