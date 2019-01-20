package modules;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.util.ArrayList;

public class FileDeal {
	/**�������ֶ�ȡ��ʽ��BufferedReade�඼��Ϊ�����û���������߶�ȡ�ٶȣ�����˵�����ֳ��ö�ȡ��ʽ��ʵ����*/

	//InputStreamReder��FileInputStream��BufferedReader��������϶�ȡ�����ַ������ж�ȡ
	/*1.Java��FileInputStream�౾������ֽ�����ȡ�ļ���ʽ�����InputStreamReder�࣬ת�������ַ�����ȡ��
	 * 	Ҳ����˵��InputStreamReder�����ֽ�����ȡ���ַ�����ȡת����������
	 *2.Java��FileInputStream�����BufferedReader���InputStreamReder�࣬�ͱ���˰��ж�ȡ��
	 *	ע�⣺�������ְ��ж�ȡ����������ݵ�Ԫ�����ַ����������ֽڣ�
	 *3.Java��FileInputStream��Ĭ�ϵı��뷽ʽ�����ļ��ı��뷽ʽ������ϵͳĬ�ϵĵı��뷽ʽ��һ��ΪGBK��
	 *4.Java��ȡ�ļ����ַ����������⣬��ϸ���ܲ����Լ���github�ĵ���*/
	public static void TransformationCharacterStream() {
		//��ȡ�ļ�
		StringBuffer buffer_obj = new StringBuffer("");
		ArrayList<String> file_content = new ArrayList<String>();
		String filename = "write_Haproxy_Keepalived.txt";
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
		
		//д���µ��ļ����ֽ���ת��Ϊ�ַ���д�룬������д����ַ������룻
		String NewFilePath = "MD5_" + file.getPath();
		File NewFilePathObj = new File(NewFilePath);
		
		try {
			NewFilePathObj.createNewFile();
			OutputStreamWriter osw_obj = new OutputStreamWriter(new FileOutputStream(NewFilePathObj),"GBK");
			BufferedWriter bw = new BufferedWriter(osw_obj);
			bw.write(buffer_obj.toString());
			bw.close();
			osw_obj.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//FileReader�ఴ�ж�ȡ�ļ���FileWriter��ֱ��д���ļ��Լ��ֽ���д�����ļ�
	/*1.FileReader����InputStreamReader������࣬���еķ������Ӹ���InputStreamReader�м̳У�
	 *2.����InputStreamReader�����ַ���ת������������FileReader���ȡҲ���ַ�����ȡ�ļ�*/
	public static void CharacterStream() {
		//��ȡ�ļ�
		StringBuffer buffer_obj = new StringBuffer("");
		ArrayList<String> file_content = new ArrayList<String>();
		String filename = "Haproxy_Keepalived.txt";
		File file = new File(filename);
		String tempStr = "";
		try {
			//FileReader fr_obj_1 = new FileReader(filename);
			FileReader fr_obj_2 = new FileReader(file);//FileReader�ȿ�����File���ʹ��Σ�Ҳ������String���ʹ���
			BufferedReader reader_obj = new BufferedReader(fr_obj_2);
			while ((tempStr = reader_obj.readLine()) != null) {
				buffer_obj.append(tempStr + "\n");
				file_content.add(tempStr);//��ȡ���ļ����ݣ�������ӵ�һά�����б�
			}
			reader_obj.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(buffer_obj.toString());
		System.out.println(file_content);
		
		//FileWriter��ֱ��д���ļ�
		String NewFilePath = "MD5_" + file.getPath();
		File NewFilePathObj = new File(NewFilePath);
		try {
			FileWriter Fw = new FileWriter(NewFilePathObj);
			BufferedWriter Bw = new BufferedWriter(Fw);
			Bw.write(buffer_obj.toString());
			Bw.close();
			Fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//�ֽ���д���ļ�
		String BinaryMD5Path = "BinaryMD5_" + file.getPath();
		File BinaryMD5PathObj = new File(BinaryMD5Path);
		try {
			FileOutputStream fos = new FileOutputStream(BinaryMD5PathObj);
			byte[] contentbyte = buffer_obj.toString().getBytes();
			fos.write(contentbyte);
			fos.flush();
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//FileInputStream�����������ȡ�ļ�
	/*ע�⣺Java��ȡ�ļ����ݲ�������д�뵽�µ��ļ������ܲ�ȡ�ֽ�����ȡ�ļ�����д�룻��Ϊ��ȡ�������Ǳ�����Ӧ��ʮ�������У�*/
	public static void BinaryStream() throws FileNotFoundException {
		//String filename = "test.txt";
		String filename = "write_Haproxy_Keepalived.txt";
		File file = new File(filename);
		byte[] byteread = new byte[100];
		int tempbyte = 0;
		InputStream in = null;
		try {
			in = new FileInputStream(filename);
			while ((tempbyte = in.read(byteread)) != -1) {
				System.out.write(byteread, 0, tempbyte);//write(byte������,���鿪ʼλ,�������λ)
				//����Ҫ���ף��ֽ�����ȡ��GBK��������ֽڶ�Ӧ��ʮ�������У�������0101111100�Ķ����ƴ�
			}
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
