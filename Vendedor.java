
public class Vendedor implements Pessoa {

    private String nome;
    private String cpf;
    private String matricula;
    private Concessionaria concessionaria;

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

    public void setMatricula(String aMatricula) {
        this.matricula = aMatricula;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setConcessionaria(Concessionaria concessionaria) {
        this.concessionaria = concessionaria;
    }

    public void verificaProduto() {
        if (concessionaria.getVeiculos().isEmpty()) {
            System.out.println("Estoque sem veículos.");
        } else {
            System.out.println("Há veículos disponíveis.");
        }
    }
}
