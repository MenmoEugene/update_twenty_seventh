/*
������ϰ��
1����ȡ������Ķ����ж�����
		˼·������ָ��������һ��ʱ��:
		c.set(year,2,1);//ĳһ���3��1�ա�
		c.add(Calendar.DAY_OF_MONTH,-1);//3��1�գ���ǰ��һ�����2�����һ�졣

2����ȡ������������ʱ�̡�
		c.add(Calendar.DAY_OF_MONTH,-1);


*/

import java.util.*;
class CalendarDemo2 
{
	public static void main(String[] args) 
	{
		Calendar c = Calendar.getInstance();

//		c.set(2017,12,27);
		
//		c.add(Calendar.MONTH,-1);
		c.add(Calendar.DAY_OF_MONTH,18);

		printCalendar(c);
	}
	public static void printCalendar(Calendar c)
	{
		String[] months = {"һ��","����","����","����",
			"����","����","����","����",
			"����","ʮ��","ʮһ��","ʮ����"};

		String[] weeks = {"","������","����һ","���ڶ�",
			"������","������","������","������"}; 

		int index = c.get(Calendar.MONTH);

		int index1 = c.get(Calendar.DAY_OF_WEEK);

		sop(c.get(Calendar.YEAR)+"��");
//		sop((c.get(Calendar.MONTH)+1)+"��");
		sop(months[index]);
		sop(c.get(Calendar.DAY_OF_MONTH)+"��");
		//sop("����"+c.get(Calendar.DAY_OF_WEEK));
		sop(weeks[index1]);
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
