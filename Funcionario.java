class Funcionario extends Pessoa{
    public String nome;
    private String funcao;
    private double salario;
    private String dataAdmissao;
    private String horaEntrada;
    private String horaSaida;

    void setFuncionario(String nome, 
                        String funcao, 
                        double salario, 
                        String dataAdmissao, 
                        String entrada, String saida){
    this.nome = nome;
    this.funcao = funcao;
    this.salario = salario;
    this.dataAdmissao = dataAdmissao;
    this.horaEntrada = entrada;
    this.horaSaida = saida;
    }
    
    void getFuncionario(){
        this.getPessoa();
        System.out.println("Funcao: " +this.funcao);
        System.out.println("Salario: " +this.salario);
        System.out.println("Data de Admissao: " +this.dataAdmissao);
        System.out.println("Hora E/S: " +this.horaEntrada + " / " + this.horaSaida);
    }
}
