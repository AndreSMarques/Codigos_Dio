package veiculo;

public class Carro extends Veiculo{

    public void ligar(){
        conferirCombustivel();
        conferirCambio();
        System.out.println("Carro ligado brubrubru...");
    }

    private void conferirCombustivel() {
        System.out.println("Conferindo combustivel!");
    }

    private void conferirCambio() {
        System.out.println("Conferindo cambio!");
    }
}
