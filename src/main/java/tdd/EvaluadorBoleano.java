package tdd;

public class EvaluadorBoleano {
    public boolean eval(String expresion) {
        if( "verdadero".equals(expresion.trim().replace("y",""))) {
            return true;
        } else {
            return false;
        }
    }
}
