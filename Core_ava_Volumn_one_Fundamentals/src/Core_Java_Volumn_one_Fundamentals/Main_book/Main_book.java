package Core_Java_Volumn_one_Fundamentals.Main_book;
import java.util.ArrayList;
import Core_Java_Volumn_one_Fundamentals.fourth_chapter.fourth_chapter;
import Core_Java_Volumn_one_Fundamentals.knowledge_point.knowledge_static_modifier_usage;
import Core_Java_Volumn_one_Fundamentals.knowledge_point.knowledge_this_usage;
import java.lang.String;
public class Main_book {	//һ��Java�ļ�ֻ����һ��public�࣬��public������ж��
	public final static String final_1="haha";
	/*final�ؼ��ֶ��峣������ʾfinal_1ֻ�ܱ���ֵһ�Σ���ĳ��������ڷ����ⲿ��static��ʾ��̬��*/
	//final_1 = "hhhh";//�Ѿ�����õĳ���final_1���ܸ���ֵ������ٱ���ֵ�ͻᱨ��
	
	/*һ����Ŀ�������ж��main���������Զ����ĸ�Ϊ��Ҫ��main����main������������Ϊpublic*/
	public static void main(String[] args) {	//������Ϊmain�����Ĵ��Σ�����������Java xxx.java����ʱ����Ҫ����Ĳ�����
		//args = new String[1];
		//args[0] = "wer";
		/*1.�����������()�������������������֮��Ҫ�ö��Ÿ���(��������������ѭ��������÷ֺŸ���)���������һ���������治���κη���
		 *2.�������������args���ڷ����������ֻ������������������ͣ���û�д����������(��û�г�ʼ���������)��
		 *3.args����ĳ��ȣ�ֻ�������������г���ʱ�����������ȷ������������ٸ����������Ⱦ�ȷ��Ϊ����
		*/
		
		System.out.println(final_1);//ʹ�ó���ֻ���ڷ�����ʹ�ã������ӡ�����

		/**  ������   */
		/*
		third_chapter use_third_chapter = new third_chapter(); 
		String third_content = use_third_chapter.start_third_chapter();
		System.out.println(third_content);
		*/
		
		/**  ������   */
		/*
		fourth_chapter.start_fourth_chapter();//������Ϊstart_fourth_chapter()�Ǿ�̬��������˷�������ֱ�ӱ���������ã������ش�������ʵ��������ȻҲ���Դ��������ٵ��÷���
		*/

		/**	 static ���η�(modifier) �÷�  */
		/*
		int i = knowledge_static_modifier_usage.i;
		System.out.println(i);

		knowledge_static_modifier_usage kn = new knowledge_static_modifier_usage();
		int j = kn.j;
		System.out.println(j);

		int ii = knowledge_static_modifier_usage.getNumber();
		System.out.println(ii);
		int jj = kn.getDealNumber(10);
		System.out.println(jj);
		*/


		/**	 this ���÷�  */
		knowledge_this_usage kn = new knowledge_this_usage(100);
		kn.increament().print();

	}
	
	public static void aa() {
		ArrayList<String> Test = new ArrayList<String>();
		Test.add("dd");
		Test.add("eee");
		Test.get(1);
	}

	//��ǰ����һ��ʲô��ʵ�ֽӿڣ���νʵ�ֽӿڵĸ�����ǣ��ӿھ��������˷�������ȥʵ�֣�����ĳ����ȥʵ������ӿڵķ���
	
}
