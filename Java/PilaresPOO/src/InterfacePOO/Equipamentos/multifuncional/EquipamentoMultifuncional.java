package InterfacePOO.Equipamentos.multifuncional;

import InterfacePOO.Equipamentos.Impressora.Impresora;
import InterfacePOO.Equipamentos.copiadora.Copiadora;
import InterfacePOO.Equipamentos.digitalisadora.Digitalizadora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impresora {

    @Override //Sobrescrita do metodo
    public void coipiar() {
       System.out.println("COPIANDO VIA EQUIPAMENTO MULTIFUNIONAL");
    }

    @Override
    public void Imprimir() {
        System.out.println("IMPRIMINDO VIA EQUIPAMENTO MULTIFUNIONAL");
    }

    @Override
    public void digitalizar() {
        System.out.println("DIGITALIZANOD VIA EQUIPAMENTO MULTIFUNIONAL");
    }
    
}
