package lab1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
/**
 * � ���� �������� ������ ��������� ��������������� � ���. ����� �������.
 * @author Roman
 *
 */
public class labtest {
	private Vector A;
	private Vector B;
	/**
	 * A � B ������ � ����.
	 */
	@Before
	public void setUp() {
	 A=new Vector(2,-2);
	 B=new Vector(2,-2);
	}
	//���������
	/**
	 * ���� �� ��������������
	 */
	@Test
	public void equalsReflexive() {
		assertTrue(A.equals(A));
	}
	/**
	 * ���� ���������
	 */
	@Test
	public void equalsSymmetric() {
		Vector C=new Vector(2,-2);
		assertTrue(A.equals(B));
		assertTrue(B.equals(C));
		assertTrue(A.equals(C));	
	}
	/**
	 * ���� ��������������
	 */
	@Test
	public void equalsTransitivity() {
		assertTrue(A.equals(B));
	}
	/**
	 * ���� � null
	 */
	@Test
	public void equalsNull () {
	assertFalse (A.equals(null));
	}
	/**
	 * �������� ������� ���� �� ����
	 */
	@Test
	public void equalsNotEqual() {
		assertFalse(A.equals(new Vector(1,1)));
	}
	/**
	 * ���� � ������ ����������
	 */
	@Test
	@SuppressWarnings("unlikely-arg-type")
	public void equalsInt() {
		assertFalse("nope",A.equals(5));
	}

	/**
	 * �������� �����
	 */
	//�����
	@Test
	public void lenTest() {
		assertEquals(Math.sqrt(8),A.len(),0.00001);
	}
	
	
	
}
