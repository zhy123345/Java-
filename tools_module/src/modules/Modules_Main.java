package modules;

import java.io.FileNotFoundException;

public class Modules_Main {
	
	public static void main(String[] args) {
		
		/**1.�����б�ĲArrayList_operation*/
		//ArrayList_operation.Differential_Set();
		
		/**2.��ȡ�ļ��ķ�ʽ�����ֽ������ַ������Լ���Ӧ���ַ�����������*/
		//�ֽ���ת��Ϊ�ַ������ж�ȡ
		File_Deal.Read_File_Character_Stream();
		//FileReader�ఴ�ж�ȡ
		//File_Deal.Read_File_FileReader_readline();
		//�ֽ�����ȡ��һ�ζ�ȡ����ֽڣ�Ҳ�Ƕ����ƶ�ȡ�ļ�
		/*
		try {
			File_Deal.Binary_Stream();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
	}
	
}
