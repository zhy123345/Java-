package read_write_xml;

import java.io.File;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.dom4j.Element;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		//String Ciconfig = args[0];
		//String task = args[1];
		String Ciconfig = "CIconfig.xml";
		String task = "task.xml";
		
		//����CIconfig.xml�ļ���pclint����ڵ�
		ArrayList<String> BaseLine_task = analysis_cicloud_task(Ciconfig,task);
		
		//����cicloud_task.xml�ļ�������
		
		
		//�ƹ����������������Ƚϣ�������������ڵ�
		
		
	}
	
	public static ArrayList<String> analysis_cicloud_task(String Ciconfig,String task) {
		//List��һ���ӿ��࣬���ܹ�����󣻶�ArrayList��һ���࣬���Դ�������
		ArrayList<String> BaseLine_task = new ArrayList<String>();
		
		try {
			SAXReader reader = new SAXReader();
			File task_file = new File(task);
			Document document = reader.read(task_file);//����xml�ļ�����ȡdocument����
			Element root_node = document.getRootElement();//��ȡdocument������ڵ�
			System.out.println("���ڵ���" + root_node.getName());
			
			List<Element> sub_nodes_list = root_node.elements();//��ȡ���ڵ��������ӽڵ㣬�����ӽڵ�����м�¼�洢���б�
			for (Element sub_node : sub_nodes_list) {
				System.out.println("�ӽڵ�: " + sub_node.getName());
				List<Element> pclint_nodes_list = sub_node.elements();
				for (Element pclint_node : pclint_nodes_list) {
					System.out.println("�ӽڵ�: " + pclint_node.getName());
					
					
				}
					
					//System.out.println("������: " + attr.getName());
					//System.out.println("����ֵ: " + attr.getValue());
					//����while��forѭ���Ľ�����ʽ������ӽڵ������Խ�������
					
					
				}
				


		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return BaseLine_task;
	}
	
}
