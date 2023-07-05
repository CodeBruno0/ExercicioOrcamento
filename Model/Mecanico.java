package Model;

public class Mecanico {
    
    private String nome;
    private String orcamento;


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getOrcamento() {
        return orcamento;
    }
    public void setOrcamento(String orcamento) {
        this.orcamento = orcamento;
    }
    @Override
    public String toString() {
        return "Mecanico " + nome + "\nOrcamento = R$ " + orcamento;
    }

    //public void gerarOrcamento(){
        //System.out.printf("Valor do orcamento: R$ %s", getOrcamento());
    //}
}
