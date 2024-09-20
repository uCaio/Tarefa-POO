
public class Main {

    public static void main(String[] args) {
        Produto veiculo1 = new Produto();
        veiculo1.setVeiculo("Porsche");

        Produto veiculo2 = new Produto();
        veiculo2.setVeiculo("Ferrari");

        Concessionaria c1 = new Concessionaria();
        c1.setNome("Caio Multimarcas");
        c1.setCnpj("12345-6");
        c1.addVeiculo(veiculo1);
        c1.addVeiculo(veiculo2);

        Vendedor vendedor1 = new Vendedor();
        vendedor1.setNome("Rafael");
        vendedor1.setCpf("21234689");
        vendedor1.setMatricula("099");
        vendedor1.setConcessionaria(c1);

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Gerson");
        cliente1.setCpf("54654846");

        // Cliente comprando um veículo da concessionária
        cliente1.compraVeiculo(c1, veiculo1);

        // Exibindo informações
        System.out.println("Concessionária: " + c1.getNome());
        System.out.println("CNPJ: " + c1.getCnpj());

        System.out.println("Vendedor: " + vendedor1.getNome());
        System.out.println("CPF: " + vendedor1.getCpf());
        System.out.println("Matrícula: " + vendedor1.getMatricula());

        vendedor1.verificaProduto();

        System.out.println("Cliente: " + cliente1.getNome());
        System.out.println("CPF: " + cliente1.getCpf());
        System.out.println("Veículo comprado: " + cliente1.getVeiculoComprado().getVeiculo());
    }
}
