package read_write_xml;

import java.io.File;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.dom4j.Element;
import java.util.Iterator;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		//String Ciconfig = args[0];
		//String task = args[1];
		String Ciconfig = "CIconfig.xml";
		String task = "task.xml";
		File Ciconfig_file = new File(Ciconfig);
		File task_file = new File(task);
		
		try {
			SAXReader reader = new SAXReader();
			Document document = reader.read(Ciconfig_file);//����xml�ļ�����ȡdocument����
			Element project_Numbers = document.getRootElement();//��ȡdocument������ڵ�
			Iterator it = project_Numbers.elementIterator();//��ȡ������
			
			//������ڵ������ɣ��򷵻ظ�whileѭ��false
			while (it.hasNext()) {
				Element project = (Element) it.next();//next()������ָ��(���)ָ����һ����¼���൱�ڱ����ӽڵ�
				List<Attribute> project_attr_list = project.attributes();//���ӽڵ�����м�¼�洢���б�
				for (Attribute attr : project_attr_list) {
					System.out.println("������: " + attr.getName());
					System.out.println("����ֵ: " + attr.getValue());
					//����while��forѭ���Ľ�����ʽ������ӽڵ������Խ�������
					
					
				}
				
				
				
			}

		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
	}
	
}
