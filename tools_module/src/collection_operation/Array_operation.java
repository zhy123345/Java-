package collection_operation;

import java.util.ArrayList;

public class Array_operation {
	
	public static void main(String[] args) {
		ArrayList<String> List_1 = new ArrayList<String>();
		List_1.add("q");
		List_1.add("w");
		List_1.add("e");
		List_1.add("r");
		
		ArrayList<String> List_2 = new ArrayList<String>();
		List_2.add("q");
		List_2.add("w");
		List_2.add("a");
		List_2.add("s");
		
		List_1.removeAll(List_2);//removeAll()�����������������б�Ĳ�����ص��ǲ���ֵ��
		
		ArrayList<String> List_3 = new ArrayList<String>();
		List_3 = List_1;
		/*List_3 = List_1 �ǽ�List_3�ĵ�ֵַָ��List_1,��List_3ԭ�ȵĶ���ᱻ�������գ�
		 *Ӧ��������ķ�������һ��ArrayList������ֵ����һ��ArrayList������*/
		
		ArrayList<String> List_4 = new ArrayList<String>(List_1);//ͨ���´�������ķ�ʽ��ֵ
		ArrayList<String> List_5 = (ArrayList<String>)List_1.clone();//ͨ����¡�ķ�����ֵ
		
		StringBuilder new_array = new StringBuilder();
		System.out.println(new_array);
	}
}
