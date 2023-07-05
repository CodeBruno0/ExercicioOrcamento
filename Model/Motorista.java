package Model;

public class Motorista {
    
    private String nome;
    private String modeloCarro;
    private Mecanico mecanico;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getModeloCarro() {
        return modeloCarro;
    }
    public void setModeloCarro(String modeloCarro) {
        this.modeloCarro = modeloCarro;
    }
    public Mecanico getMecanico() {
        return mecanico;
    }
    public void setMecanico(Mecanico mecanico) {
        
        this.mecanico = mecanico;
    }

    
}
