class Funcionario{
    public String nome;
    private String funcao;
    private double salario;
    private String dataAdmissao;
    HoraEntradaSaida horario;

    void setFuncionario(String nome, 
                        String funcao, 
                        double salario, 
                        String dataAdmissao, 
                        String entrada, String saida){
    this.nome = nome;
    this.funcao = funcao;
    this.salario = salario;
    this.dataAdmissao = dataAdmissao;
    this.horario.entrada = entrada;
    this.horario.saida = saida;
    }
    
    void getFuncionario(){
        System.out.println("Nome: " +this.nome);
        System.out.println("Funcao: " +this.funcao);
        System.out.println("Salario: " +this.salario);
        System.out.println("Data de Admissao: " +this.dataAdmissao);
        System.out.println("Entrada: " +this.horario.entrada);
        System.out.println("Saida: " +this.horario.saida);
    }

    void setHorario(String entrada, String saida){
        this.horario.entrada = entrada;
        this.horario.saida = saida;
    }
}

class HoraEntradaSaida{
    String entrada;
    String saida;
}
