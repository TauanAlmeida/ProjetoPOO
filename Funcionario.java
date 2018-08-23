public class Funcionario extends Pessoa{
    private String funcao;
    private double salario;
    private String dataAdmissao;
    private String horaEntrada;
    private String horaSaida;

    public void setCadastro(String nome, 
                            String funcao, 
                            double salario, 
                            String dataAdmissao, 
                            String entrada, 
                            String saida){
    this.nome = nome;
    this.funcao = funcao;
    this.salario = salario;
    this.dataAdmissao = dataAdmissao;
    this.horaEntrada = entrada;
    this.horaSaida = saida;
    }
    
    public void getCadastro(){
      System.out.println("\nFuncionario\nNome: "+this.nome);
        System.out.println("Funcao: " +this.funcao);
        System.out.println("Salario: " +this.salario);
        System.out.println("Data de Admissao: " +this.dataAdmissao);
        System.out.println("Hora E/S: " +this.horaEntrada + " / " + this.horaSaida);
    }

    public void setSalario(double valor){
        this.salario = valor;
    }

    public double getSalario(){
        return this.salario;
    }

    //Bonus em 8%
    public double getBonifica(){
        return 1.08;
    }
}
