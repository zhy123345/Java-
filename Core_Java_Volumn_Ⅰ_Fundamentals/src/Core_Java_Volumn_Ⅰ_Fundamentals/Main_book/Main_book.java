package Core_Java_Volumn_��_Fundamentals.Main_book;
import Core_Java_Volumn_��_Fundamentals.fourth_chapter.fourth_chapter;

public class Main_book {
	public final static String final_1="haha";
	/*final�ؼ��ֶ��峣������ʾfinal_1ֻ�ܱ���ֵһ�Σ���ĳ��������ڷ����ⲿ��һ��Ҫ��static�ؼ���*/
	//final_1 = "hhhh";//�Ѿ�����õĳ���final_1���ܸ���ֵ������ٱ���ֵ�ͻᱨ��
	
	/*һ����Ŀ�������ж��main���������Զ����ĸ�Ϊ��Ҫ��main����main������������Ϊpublic*/
	public static void main(String[] args) {//������Ϊmain�����Ĵ��Σ�
		//args = new String[1];
		//args[0] = "wer";
		/*1.�����������()�������������������֮��Ҫ�ö��Ÿ���(��������������ѭ��������÷ֺŸ���)���������һ���������治���κη���
		 *2.�������������args���ڷ����������ֻ�����������������û�д����������(��û�г�ʼ���������)��
		 *3.args����ĳ��ȣ�ֻ�������������г���ʱ�����������ȷ������������ٸ����������Ⱦ�ȷ��Ϊ����*/
		
		System.out.println(final_1);//ʹ�ó���ֻ���ڷ�����ʹ�ã������ӡ�����

		/**  ������   */
		/*
		third_chapter use_third_chapter = new third_chapter(); 
		String third_content = use_third_chapter.start_third_chapter();
		System.out.println(third_content);
		*/
		
		/**  ������   */
		fourth_chapter.start_fourth_chapter();//������ΪJava�ಢ���Ƕ���������������������Կ�ֱ�ӵ������еķ���
		
	}
	
}
