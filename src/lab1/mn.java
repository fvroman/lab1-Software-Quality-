package lab1;
/**
 * Деревенское тестирование.
 * @author Roman
 *
 */
public class mn {

	public static void main(String[] args) {
		Vector v=new Vector(2,2);
		System.out.println(v.add(new Vector(1,-1)));
		System.out.println(v.substract(new Vector(1,-1)));
		System.out.println(v.len());
		System.out.println(v.scp(new Vector(1,1)));
		System.out.println(v.equals(v));
		System.out.println(v.hashCode());
		System.out.println(new Vector(2,2).hashCode());
	}

}
