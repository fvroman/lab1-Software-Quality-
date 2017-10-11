package lab1;

import java.util.Objects;
/**
 * Vector class.
 * ���������� �������� ��������, ���������, ���������� ������������ � �����.
 * ���������� equals() � hashcode() �������.
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
	 * �������� ��������.
	 * ��������������� ���������� �������� ������������ � ���.
	 * @param v - ������������ ������
	 * @return ������, ���������� � ���������� ��������
	 */
	public Vector add(Vector v) {
		return new Vector(this.x+v.x,this.y+v.y);
	}
	/**
	 * ��������� ��������.
	 * ��� ��������, ������ � �������
	 * @param v - ������������ ������
	 * @return ������, ���������� � ���������� ���������
	 */
	public Vector substract(Vector v) {
		return new Vector(this.x-v.x,this.y-v.y);
	}
	/**
	 * ��������� ������������ ��������.
	 * ���������� ������������� � ���������� ������������
	 * @param v - ���� �����, ��� � �����
	 * @see #add(Vector)
	 * @return ��������� ��� - �����
	 */
	public double scp(Vector v) {
		return this.x*v.x+this.y*v.y;
	}
	/**
	 * ����� �������
	 * @return �����
	 */
	public double len() {
		return Math.sqrt(x*x+y*y);
	}
	/**
	 * �������� �� ���������������.
	 * ���� ���������� �������� - ���, ���� ��� - ����
	 * ���� ���-���� ������ �� ���� ����.
	 * @return ��� ��� ����
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
	  * ������.
	  */
	 public int hashCode () {
	 return Objects.hash(x,y);
	 }
	 public String toString() {
		 return "������ ( "+x+" : "+y+")";
	 }

	
}
