
import java.util.ArrayList;
import java.util.List;

public class Concessionaria {

    private String nome;
    private String cnpj;
    private final List<Produto> veiculos = new ArrayList<>();

    public void setNome(String oNome) {
        this.nome = oNome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setCnpj(String oCnpj) {
        this.cnpj = oCnpj;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public List<Produto> getVeiculos() {
        return this.veiculos;
    }

    public void addVeiculo(Produto veiculo) {
        this.veiculos.add(veiculo);
    }

    public void removeVeiculo(Produto veiculo) {
        this.veiculos.remove(veiculo);
    }
}
