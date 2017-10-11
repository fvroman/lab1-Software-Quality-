package lab1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
/**
 * В этом тестовом классе проверяем Эквивалентность и опр. длины вектора.
 * @author Roman
 *
 */
public class labtest {
	private Vector A;
	private Vector B;
	/**
	 * A и B всегда с нами.
	 */
	@Before
	public void setUp() {
	 A=new Vector(2,-2);
	 B=new Vector(2,-2);
	}
	//Сравнение
	/**
	 * Тест на Рефлексивность
	 */
	@Test
	public void equalsReflexive() {
		assertTrue(A.equals(A));
	}
	/**
	 * Тест симметрии
	 */
	@Test
	public void equalsSymmetric() {
		Vector C=new Vector(2,-2);
		assertTrue(A.equals(B));
		assertTrue(B.equals(C));
		assertTrue(A.equals(C));	
	}
	/**
	 * Тест транзитивности
	 */
	@Test
	public void equalsTransitivity() {
		assertTrue(A.equals(B));
	}
	/**
	 * Тест с null
	 */
	@Test
	public void equalsNull () {
	assertFalse (A.equals(null));
	}
	/**
	 * Название говорит само за себя
	 */
	@Test
	public void equalsNotEqual() {
		assertFalse(A.equals(new Vector(1,1)));
	}
	/**
	 * Тест с другой переменной
	 */
	@Test
	@SuppressWarnings("unlikely-arg-type")
	public void equalsInt() {
		assertFalse("nope",A.equals(5));
	}

	/**
	 * Проверка длины
	 */
	//Длина
	@Test
	public void lenTest() {
		assertEquals(Math.sqrt(8),A.len(),0.00001);
	}
	
	
	
}
