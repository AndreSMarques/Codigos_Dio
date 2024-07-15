package InterfacePOO.estabelecimento;

import InterfacePOO.Equipamentos.Impressora.Deskjet;
import InterfacePOO.Equipamentos.Impressora.Impresora;
import InterfacePOO.Equipamentos.copiadora.Copiadora;
import InterfacePOO.Equipamentos.digitalisadora.Digitalizadora;
import InterfacePOO.Equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        Impresora Impresora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        Impresora.Imprimir();
        digitalizadora.digitalizar();
        copiadora.coipiar();
    }
}
