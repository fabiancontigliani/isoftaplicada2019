package tdd;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PruebaTest
{

    EvaluadorBoleano evaluador;

    @BeforeClass
    public void setUp() {
        evaluador = new EvaluadorBoleano();
    }

    @Test
    void testFalse() {
        assert evaluador.eval("falso") == false;
    }

    @Test
    void testVerdadero() {
        assert evaluador.eval("verdakdero") == true;
    }

    @Test
    void testVerdaderoConEspacios() {
        assert evaluador.eval("verdadero ") == true;
        assert evaluador.eval("  verdadero ") == true;
        assert evaluador.eval(" falso ") == false;
    }

    @Test(enabled=false)
    public void testY() {
        assert evaluador.eval("verdadero y verdadero");
        assert !evaluador.eval("verdadero y falso");
    }

    public void testO(){
        assert evaluador.eval("verdadero o verdadero");
        assert evaluador.eval("falso o verdadero");
    }
}
