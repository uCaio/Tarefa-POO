
public class Cliente implements Pessoa {

    private String nome;
    private String cpf;
    private String score;
    private Produto veiculoComprado;

    public void setNome(String oNome) {
        this.nome = oNome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setCpf(String oCpf) {
        this.cpf = oCpf;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setScore(String oScore) {
        this.score = oScore;
    }

    public String getScore() {
        return this.score;
    }

    // Cliente compra um veículo específico de uma concessionária
    public void compraVeiculo(Concessionaria concessionaria, Produto veiculo) {
        if (concessionaria.getVeiculos().contains(veiculo)) {
            this.veiculoComprado = veiculo;
            concessionaria.removeVeiculo(veiculo);  // Remover veículo da concessionária após a compra
            System.out.println("O cliente " + this.nome + " comprou o veículo: " + veiculo.getVeiculo());
        } else {
            System.out.println("Veículo não disponível na concessionária.");
        }
    }

    public Produto getVeiculoComprado() {
        return this.veiculoComprado;
    }
}
