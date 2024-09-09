package src.test.java;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({PrimeiroTeste.class, SegundoTeste.class, ClienteServiceTest.class, ContratoServiceTest.class, TesteClienteTest.class})
public class AllTests {
}
// Aqui deu um erro