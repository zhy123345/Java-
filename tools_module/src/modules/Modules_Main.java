package modules;

import java.io.IOException;

public class Modules_Main {
	
	public static void main(String[] args) {
		
		/**1.�����б�ĲArrayList_operation*/
		//ArrayList_operation.Differential_Set();
		
		/**2.��ȡ�ļ��ķ�ʽ�����ֽ������ַ������Լ���Ӧ���ַ�����������*/
		//�ֽ���ת��Ϊ�ַ������ж�ȡ���Լ�д���µ��ļ����ֽ���ת��Ϊ�ַ���д�룬������д����ַ�������
		FileDeal.TransformationCharacterStream();
		
		//FileReader�ఴ�ж�ȡ����ֱ���ַ�����ȡ
		FileDeal.CharacterStream();
		
		//�ֽ�����ȡ��һ�ζ�ȡ����ֽڣ�Ҳ�Ƕ����ƶ�ȡ�ļ�
		try {
			FileDeal.BinaryStream();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
