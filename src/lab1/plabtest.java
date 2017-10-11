package lab1;

import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
/**
 * Параметризированное тестирование.
 * Тестируем операции сложения и вычитания векторов + СКП.
 * @author Roman
 *
 */
@RunWith(Parameterized.class)
public class plabtest {

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object [][] {
		{ new Vector(2,2), new Vector(2,2), new Vector(4,4),new Vector(0,0), 8 } ,
		{ new Vector(2,2), new Vector(0, 0), new Vector (2, 2),new Vector (2,2), 0} ,
		{ new Vector(2, 2), new Vector(-2, -2), new Vector (0, 0),new Vector(4,4),-8 }
		});
		}
	private Vector pA,pB,pC,pD;
	private double scpresult;
	 
	public plabtest(Vector pA,Vector pB,Vector pC,Vector pD,double scpresult) {
		this.pA=pA;
		this.pB=pB;
		this.pC=pC;
		this.pD=pD;
		this.scpresult=scpresult;
	}
		@Test
		public void ptest() {
			assertEquals(pC,pA.add(pB)); //Сложение
			assertEquals(pD,pA.substract(pB)); //Вычитание
			assertEquals(scpresult,pA.scp(pB),0.00001); //СКП
		}

}
