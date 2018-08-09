class Programa{
    public static void main(String args[]) {
        Funcionario f1 = new Funcionario();
        HoraEntradaSaida hora = new HoraEntradaSaida();
        Estoque arroz = new Estoque();
        Cliente c1 = new Cliente();

        f1.setFuncionario("Tauan", "operador de caixa", 987, "15/05/2015", "10:50", "18:50");
        
        //setProduto(id, nome, marca, tipo, quantidade, valor)
        arroz.setProduto( 1, "Arroz", "Chines", "Esqueci", 585, 4.85);
        arroz.getProduto();

        //setCliente(nome, cpf, telefone, gasto)
        c1.setCliente("Roberto", "105.654.987", "87- 88428891", 5);
        c1.getCliente();
    }
}