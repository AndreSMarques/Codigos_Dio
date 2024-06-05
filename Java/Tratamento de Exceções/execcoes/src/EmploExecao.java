import java.text.NumberFormat;
import java.text.ParseException;

public class EmploExecao {
    public static void main(String[] args) throws ParseException {
        Number valor;
        try{
        //Number valor = Double.valueOf("a1.75");
        valor = NumberFormat.getInstance().parse("a1.75");
       }catch(ParseException exception){
            exception.printStackTrace();
       }
        
        
    }
}
