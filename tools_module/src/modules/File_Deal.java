package modules;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.util.ArrayList;

public class File_Deal {
	/**�������ֶ�ȡ��ʽ��BufferedReade�඼��Ϊ�����û���������߶�ȡ�ٶ�*/
	/*1.Java��FileInputStream�౾������ֽ�����ȡ�ļ���ʽ�����InputStreamReder�࣬ת�������ַ�����ȡ��
	 * 	Ҳ����˵��InputStreamReder�����ֽ�����ȡ���ַ�����ȡת����������
	 *2.Java��FileInputStream�����BufferedReader���InputStreamReder�࣬�ͱ���˰��ж�ȡ��
	 *	ע�⣺�������ְ��ж�ȡ����������ݵ�Ԫ�����ַ����������ֽڣ�
	 *3.Java��FileInputStream��Ĭ�ϵı��뷽ʽ�����ļ��ı��뷽ʽ������ϵͳĬ�ϵĵı��뷽ʽ��һ��ΪGBK��
	 *4.Java��ȡ�ļ����ַ����������⣬��ϸ���ܲ����Լ���github�ĵ���
	 *5.����˵�����ֳ��ö�ȡ��ʽ��ʵ����*/
	
	//InputStreamReder��FileInputStream��BufferedReader��������϶�ȡ�����ַ������ж�ȡ
	public static void Read_File_Character_Stream() {
		//��ȡ�ļ�
		StringBuffer buffer_obj = new StringBuffer("");
		ArrayList<String> file_content = new ArrayList<String>();
		String filename = "test.txt";
		//String filename = "MD5_test.txt";
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
		
		//д���µ��ļ���������д����ַ������룬��Ϊ�ַ���д�룬����һ��ֱ����BufferedWriter��д��ķ�ʽ�����油�����
		//https://www.cnblogs.com/x_wukong/p/4679116.html
		String aa = "MD5_" + file.getPath();
		File new_file = new File(aa);
		
		try {
			new_file.createNewFile();
			OutputStreamWriter osw_obj = new OutputStreamWriter(new FileOutputStream(new_file),"GBK");
			BufferedWriter bw = new BufferedWriter(osw_obj);
			bw.write(buffer_obj.toString());
			bw.close();
			osw_obj.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/*1.FileReader����InputStreamReader������࣬���еķ������Ӹ���InputStreamReader�м̳У�
	 *2.����InputStreamReader�����ַ���ת������������FileReader���ȡҲ���ַ�����ȡ�ļ�*/
	//FileReader�ఴ�ж�ȡ�ļ�
	public static void Read_File_FileReader_readline() {
		
		StringBuffer buffer_obj = new StringBuffer("");
		ArrayList<String> file_content = new ArrayList<String>();
		String filename = "Haproxy_Keepalived.txt";
		File file = new File(filename);
		String tempStr = "";
		
		try {
			//FileReader fr_obj_1 = new FileReader(filename);
			FileReader fr_obj_2 = new FileReader(file);//FileReader�ȿ�����File���ʹ��Σ�Ҳ������String���ʹ���
			BufferedReader br_obj = new BufferedReader(fr_obj_2);
			while ((tempStr = br_obj.readLine()) != null) {
				buffer_obj.append(tempStr + "\n");
				file_content.add(tempStr);//��ȡ���ļ����ݣ�������ӵ�һά�����б�
			}
			br_obj.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(buffer_obj.toString());
		System.out.println(file_content);
	}
	
	//����������ȡ�ļ�
	public static void Binary_Stream() throws FileNotFoundException {
		
		//String filename = "test.txt";
		String filename = "MD5_test.txt";
		File file = new File(filename);
		byte[] byteread = new byte[100];
		int tempbyte = 0;
		InputStream in = null;
		try {
			in = new FileInputStream(filename);
			while ((tempbyte = in.read(byteread)) != -1) {
				System.out.write(byteread, 0, tempbyte);
			}
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
