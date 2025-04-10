package Principal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ExpresionTest {

    // Prueba básica con paréntesis balanceados
    @Test
    public void testBalanceoCorrecto() {
        Expresion exp = new Expresion();
        assertTrue(exp.balanceo("(1 + 2) * (3 + 4)"));
    }

    // Prueba con paréntesis desbalanceados
    @Test
    public void testBalanceoIncorrecto1() {
        Expresion exp = new Expresion();
        assertFalse(exp.balanceo("(1 + 2 * (3 + 4)"));
    }

    // Prueba con paréntesis de cierre sin apertura
    @Test
    public void testBalanceoIncorrecto2() {
        Expresion exp = new Expresion();
        assertFalse(exp.balanceo("1 + 2) * (3 + 4)"));
    }

    // Prueba con paréntesis correctamente balanceados y otros caracteres
    @Test
    public void testBalanceoCorrectoConOtrosCaracteres() {
        Expresion exp = new Expresion();
        assertTrue(exp.balanceo("3 + (5 * (6 + 2)) - 7"));
    }

    // Prueba con cadena vacía (considerado balanceado)
    @Test
    public void testBalanceoVacio() {
        Expresion exp = new Expresion();
        assertTrue(exp.balanceo(""));
    }

    // Prueba con paréntesis vacíos (balanceados)
    @Test
    public void testBalanceoConParentesisVacios() {
        Expresion exp = new Expresion();
        assertTrue(exp.balanceo("()"));
    }

    // Prueba con un solo paréntesis de apertura (no balanceado)
    @Test
    public void testBalanceoConUnSoloParentesisAbierto() {
        Expresion exp = new Expresion();
        assertFalse(exp.balanceo("("));
    }

    // Prueba con un solo paréntesis de cierre (no balanceado)
    @Test
    public void testBalanceoConUnSoloParentesisCerrado() {
        Expresion exp = new Expresion();
        assertFalse(exp.balanceo(")"));
    }

    // Prueba con más paréntesis de cierre que de apertura
    @Test
    public void testBalanceoConMasCerradosQueAbiertos() {
        Expresion exp = new Expresion();
        assertFalse(exp.balanceo("(()))"));
    }

    // Prueba con paréntesis balanceados pero con espacios y operadores
    @Test
    public void testBalanceoConEspaciosYOperadores() {
        Expresion exp = new Expresion();
        assertTrue(exp.balanceo("((1 + 2) * 3) / 4"));
    }
}
