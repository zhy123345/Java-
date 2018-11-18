package read_write_xml;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.Element;
import java.util.ArrayList;
import java.util.List;
import org.dom4j.io.XMLWriter;

public class Main {
	
	public static void main(String[] args) throws IOException {
		//String Ciconfig = args[0];
		//String task = args[1];
		String CIconfig = "CIconfig.xml";
		String cicloud_task = "task.xml";
		
		//����CIconfig.xml�ļ�������ڵ�
		ArrayList<String> CI_Task_pclint_list = analysis_CIconfig(CIconfig);
		
		//����cicloud_task.xml�ļ�������ڵ�
		ArrayList<String> Actual_Task_pclint_list = analysis_cicloud_task(cicloud_task);
		
		//�ƹ����������������Ƚϣ�������������ڵ�
		Update_Node(CI_Task_pclint_list,Actual_Task_pclint_list,cicloud_task);
		
	}
	
	public static ArrayList<String> analysis_CIconfig(String CIconfig) {
		ArrayList<String> CI_Task_pclint_list = new ArrayList<String>();
		
		try {
			SAXReader reader = new SAXReader();
			File CIconfig_file = new File(CIconfig);
			Document document = reader.read(CIconfig_file);//����xml�ļ�����ȡdocument����
			Element root_node = document.getRootElement();//��ȡdocument������ڵ�
			System.out.println("CIconfig.xml���ڵ����� " + root_node.getName());

			List<Element> OneLayer_NodesList = root_node.elements();//��ȡ���ڵ�������һ���ӽڵ��б�
			for (Element OneLayer_SubNode : OneLayer_NodesList) {
				//System.out.println("һ���ӽڵ�: " + OneLayer_SubNode.getName());
				String attr_value = OneLayer_SubNode.attributeValue("name");
				/*�ӽڵ����attributeValue()����������������������ֱ�ӻ������ֵ*/
				CI_Task_pclint_list.add(attr_value);
				//System.out.println("�����ļ�pclint�ڵ�����ֵ: " + attr_value);
			}
			System.out.println("�����ļ�����pclint�ڵ�: " + CI_Task_pclint_list);
			
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CI_Task_pclint_list;
	}
	
	
	public static ArrayList<String> analysis_cicloud_task(String cicloud_task) {
		//List��һ���ӿ��࣬���ܹ�����󣻶�ArrayList��һ���࣬���Դ�������
		ArrayList<String> Actual_Task_pclint_list = new ArrayList<String>();
		
		try {
			SAXReader reader = new SAXReader();
			File task_file = new File(cicloud_task);
			Document document = reader.read(task_file);//����xml�ļ�����ȡdocument����
			Element root_node = document.getRootElement();//��ȡdocument������ڵ�
			System.out.println("cicloud_task���ڵ���" + root_node.getName());
			
			/*
			//���ã�element()��������ȡĳ��ڵ���һ���ӽڵ㣻�������ֱ�ӱĵ���2�㼶�ڵ����forѭ��
			Element sub_node = root_node.element("agenttask");
			System.out.println("�õ�һ���ӽڵ�" + sub_node.getName());
			Element sub_sub_node = sub_node.element("task");
			System.out.println("�õ����������ӽڵ�" + sub_sub_node.getName());
			List<Element> OneLayer_List = sub_node.elements();
			for (Element SubNode : OneLayer_List) {
				System.out.println("ֻ�ܵõ���һ��agenttask�µ��ӽڵ����� "+SubNode.getName());
			}
			*/
			
			List<Element> OneLayer_NodesList = root_node.elements();//��ȡ���ڵ�������һ���ӽڵ��б�
			for (Element OneLayer_SubNode : OneLayer_NodesList) {
				//System.out.println("һ���ӽڵ�: " + OneLayer_SubNode.getName());
				
				List<Element> TwoLayer_NodesList = OneLayer_SubNode.elements();//��ȡһ���ӽڵ������ж����ӽڵ��б�
				for (Element TwoLayer_SubNode : TwoLayer_NodesList) {
					//System.out.println("�����ӽڵ�: " + TwoLayer_SubNode.getName());
					//����ָ����ĳ������������ȡ��Ӧ������ֵ�����ַ�ʽ�����ڻ�ȡ�ڵ��²���������Ϣ
					/*�ӽڵ����attributeValue()����������������������ֱ�ӻ������ֵ*/
					String attr_value = TwoLayer_SubNode.attributeValue("node_task");
					//System.out.println("ʵ��pclint�ڵ�����ֵ: " + attr_value);
					Actual_Task_pclint_list.add(attr_value);
					
					/*
					//�������ã��������forѭ���ǻ�ȡĳ���ڵ�������������Ϣ�������ڻ�ȡ�ڵ���ȫ��������Ϣ
					List<Attribute> Attr_list = TwoLayer_SubNode.attributes();
					for (Attribute attr : Attr_list) {
						if (attr.getName() == "node_task") {
							Actual_Task_pclint_list.add(attr.getValue());
						}
					}
					*/
				}
			}
			System.out.println("ʵ������pclint�ڵ�: " + Actual_Task_pclint_list);
			
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Actual_Task_pclint_list;
	}
	
	public static void Update_Node(ArrayList<String> CI_Task_pclint_list,
			ArrayList<String> Actual_Task_pclint_list,String cicloud_task
			) throws IOException {
		//DOM4J����XML�ļ�����ע�͵Ľڵ㲻���������
		ArrayList<String> delete_list = new ArrayList<String>();
		for (String task_name : Actual_Task_pclint_list) {
			if (!CI_Task_pclint_list.contains(task_name)) {
				delete_list.add(task_name);
			}
		}
		System.out.println("����ڵ��Ѿ���ɾ���� " + delete_list);
		
		try {
			SAXReader reader = new SAXReader();
			File task_file = new File(cicloud_task);
			Document document = reader.read(task_file);//����xml�ļ�����ȡdocument����
			Element root_node = document.getRootElement();//��ȡdocument������ڵ�
			System.out.println("cicloud_task���ڵ���" + root_node.getName());
			//���ϴ��뵥������һ�������������ظ���
			
			List<Element> OneLayer_NodesList = root_node.elements();
				for (Element OneLayer_SubNode : OneLayer_NodesList) {
					List<Element> TwoLayer_NodesList = OneLayer_SubNode.elements();
					
					for (Element TwoLayer_SubNode : TwoLayer_NodesList) {
						String attr_value = TwoLayer_SubNode.attributeValue("node_task");
						//System.out.println("ʵ������ֵ: " + attr_value);
						if (delete_list.contains(attr_value)) {
							System.out.println("����ɾ���� " + attr_value);//��ֻ�����ڴ���ɾ������Ҫд��ԭ�ļ�
							
							//ɾ��task����Ľڵ�
							TwoLayer_SubNode.getParent().remove(TwoLayer_SubNode);
							OutputFormat format = OutputFormat.createPrettyPrint();
							format.setEncoding("UTF-8");
							XMLWriter writer = new XMLWriter(new OutputStreamWriter
									(new FileOutputStream("task.xml")), format);
							writer.write(document);
							writer.close();
						}
					}
				}
				
				//ɾ��agenttask����Ĵ�ڵ㣬�ж��������ڲ�ڵ���Ϊ0
				for (Element OneLayer_SubNode : OneLayer_NodesList) {
					List<Element> TwoLayer_NodesList = OneLayer_SubNode.elements();
					if (TwoLayer_NodesList.size()==0) {
						OneLayer_SubNode.getParent().remove(OneLayer_SubNode);
						OutputFormat format = OutputFormat.createPrettyPrint();
						format.setEncoding("UTF-8");
						XMLWriter writer = new XMLWriter(new OutputStreamWriter
								(new FileOutputStream("task.xml")), format);
						writer.write(document);
						writer.close();
					}
				}

		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
