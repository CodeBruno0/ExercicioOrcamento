package App;

import java.util.Scanner;
import Model.Mecanico;
import Model.Motorista;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Mecanico mecanico = new Mecanico();
        mecanico.setNome("Fera");
        mecanico.setOrcamento("2580,00");
        Motorista cliente = new Motorista();
        cliente.setNome(" Hon Dojo");
        cliente.setModeloCarro("Ninja Fury 3.0L");

        cliente.setMecanico(mecanico);

        
        System.out.println("\n" + cliente.getMecanico());
        System.out.printf("Cliente: %s\nCarro e modelo: %s", cliente.getNome(), cliente.getModeloCarro());

    }

}
