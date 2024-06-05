public class FormatadorCep {
    public static void main(String[] args) {
        try {
            String meuCep = formatarCep("73100300");
            System.out.println(meuCep);
        } catch (CepInvalidoException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("Formato invalido");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          //simulando um cep formatado
          return "23.765-064";
    }
}
