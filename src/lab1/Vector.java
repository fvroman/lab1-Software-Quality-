package lab1;

import java.util.Objects;
/**
 * Vector class.
 * Определены операции сложения, вычитания, скалярного произведения и длины.
 * Перегрузка equals() и hashcode() бонусом.
 * @author Roman
 *
 */
public class Vector {
	private double x;
	private double y;
	Vector(double x,double y){
		this.x=x;
		this.y=y;
	}
	/**
	 * Сложение векторов.
	 * Соответствующие координаты векторов складываются и все.
	 * @param v - прибавляемый вектор
	 * @return Вектор, полученный в результате сложения
	 */
	public Vector add(Vector v) {
		return new Vector(this.x+v.x,this.y+v.y);
	}
	/**
	 * Вычитание векторов.
	 * Как сложение, только с минусом
	 * @param v - прибавляемый вектор
	 * @return Вектор, полученный в результате вычитания
	 */
	public Vector substract(Vector v) {
		return new Vector(this.x-v.x,this.y-v.y);
	}
	/**
	 * Скалярное произведение векторов.
	 * Координаты перемножаются и результаты складываются
	 * @param v - тоже самое, что и везде
	 * @see #add(Vector)
	 * @return Результат СКП - число
	 */
	public double scp(Vector v) {
		return this.x*v.x+this.y*v.y;
	}
	/**
	 * Длина вектора
	 * @return длину
	 */
	public double len() {
		return Math.sqrt(x*x+y*y);
	}
	/**
	 * Проверка на эквивалентность.
	 * Если координаты совпадут - тру, если нет - фолс
	 * Если что-нить другое то тоже фолс.
	 * @return Тру или фолс
	 */
	 @Override
	 public boolean equals (Object obj) {
	 if (obj instanceof Vector) {
		 if (x==((Vector)obj).x&&y==((Vector)obj).y) {
			 return true;}
		  else return false;
	 	} 
	 	return false;
	 }
	 /**
	  * Хэшкод.
	  */
	 public int hashCode () {
	 return Objects.hash(x,y);
	 }
	 public String toString() {
		 return "Вектор ( "+x+" : "+y+")";
	 }

	
}
