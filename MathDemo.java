/*
��ϰ������һ��С����������С���ĺ���λ��
*/
import java.util.*;
class MathDemo 
{
	public static void main(String[] args) 
	{
		Random r = new Random();
		for (int x=0; x<10; x++)
		{
//			int d = (int)(Math.random()*10+1);
			int d = r.nextInt(10)+1;
			sop(d);
		}
	}

	public static void show()
	{
		double d = Math.ceil(16.34);//ceil���ش���ָ�����ݵ���С������
		double d1 = Math.floor(12.34);//floor����С��ָ�����ݵ����������

		long l = Math.round(12.54);//��������
		sop("d="+d);
		sop("d1="+d1);
		sop("l="+l);

		double d2 = Math.pow(2,3);
		sop("d2="+d2);
	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
