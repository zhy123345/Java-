package modules;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class File_Deal {
	
	/*1.Java��FileInputStream()������������ֽ�����ȡ�ļ���ʽ�����InputStreamReder()��ת�������ַ�����ȡ��
	 * 	Ҳ����˵��InputStreamReder()�������ֽ�����ȡ���ַ�����ȡת����������
	 *2.Java��FileInputStream()�������BufferedReader()������InputStreamReder()���ͱ���˰��ж�ȡ��
	 *3.Java��FileReader()�������BufferedReader()������Ҳ�ǰ��ж�ȡ��
	 *	ע�⣺�������ְ��ж�ȡ����������ݵ�Ԫ�����ַ����������ֽڣ�
	 *4.Java��FileInputStream()Ĭ�ϵı��뷽ʽ�����ļ��ı��뷽ʽ������ϵͳĬ�ϵĵı��뷽ʽ��һ��ΪGBK��
	 *5.Java��ȡ�ļ����ַ����������⣬��ϸ���ܲ����Լ���github�ĵ���
	 *6.����˵�����ֳ��ö�ȡ��ʽ��ʵ����*/
	
	//InputStreamReder()��FileInputStream()��BufferedReader()���ַ�����϶�ȡ�����ַ������ж�ȡ
	public static void Read_File_ByteStream() {
		//��ȡ�ļ�
		StringBuffer buffer_obj = new StringBuffer("");
		ArrayList<String> file_content = new ArrayList<String>();
		
		String filename = "Haproxy_Keepalived.txt";
		File file = new File(filename);
		String tempStr = "";
		
		try {
			InputStreamReader isr_obj = new InputStreamReader(new FileInputStream(file),"UTF-8");
			BufferedReader reader_obj = new BufferedReader(isr_obj);
			while ((tempStr = reader_obj.readLine()) != null) {
				buffer_obj.append(tempStr + "\n");//��ȡ�����ݴ洢��StringBuffer������
				file_content.add(tempStr);//��ȡ�����ݴ洢�������б���
			}
			reader_obj.close();
			isr_obj.close();
			}catch (IOException e) {
				//IOException e ������Ϊ�������ܵ��쳣
				e.printStackTrace();
			}
		System.out.println(buffer_obj.toString());
		System.out.println(file_content);
		
		//д���µ��ļ�
		String aa = "MD5_" + file.getPath();
		File new_file = new File(aa);
		try {
			OutputStreamWriter osw_obj = new OutputStreamWriter(new FileOutputStream(new_file),"GBK");
			BufferedWriter bw = new BufferedWriter(osw_obj);
			bw.write(buffer_obj.toString());
			bw.close();
			osw_obj.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
}
