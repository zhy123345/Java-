package read_write_xml;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.Element;
import java.util.ArrayList;
import java.util.List;
import org.dom4j.io.XMLWriter;

import com.sun.beans.decoder.DocumentHandler;

public class Main {
	
	public static void main(String[] args) throws IOException {
		//String new_sync_dir = args[0];
		String new_sync_dir = ";q/x";
		//String Ciconfig = args[1];
		//String task = args[2];
		String CIconfig = "CIconfig.xml";
		String cicloud_task = "cicloud_task.xml";
		
		//����CIconfig.xml�ļ�������ڵ�
		ArrayList<String> CI_Task_pclint_list = analysis_CIconfig(CIconfig);
		
		//����cicloud_task.xml�ļ�������ڵ�
		ArrayList<String> Actual_Task_pclint_list = analysis_cicloud_task(cicloud_task);
		
		//ɾ�������ڵ�����ڵ�
		ArrayList<String> Require_NodeList = Delete_Node(CI_Task_pclint_list,Actual_Task_pclint_list,cicloud_task);
		
		//�����µ�����ڵ�
		Add_Node(cicloud_task,Require_NodeList);
		
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
			System.out.println("cicloud_task���ڵ����� " + root_node.getName());
			
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
			
			Element agentTasks_SubNode = root_node.element("agentTasks");
			List<Element> agentTask_NodeList = agentTasks_SubNode.elements();//��ȡ���ڵ�������һ���ӽڵ��б�
			for (Element agentTask_SubNode : agentTask_NodeList) {
				//System.out.println("һ���ӽڵ�: " + OneLayer_SubNode.getName());
				
				List<Element> task_NodeList = agentTask_SubNode.elements();//��ȡһ���ӽڵ������ж����ӽڵ��б�
				for (Element task_SubNode : task_NodeList) {
					//System.out.println("�����ӽڵ�: " + TwoLayer_SubNode.getName());
					//����ָ����ĳ������������ȡ��Ӧ������ֵ�����ַ�ʽ�����ڻ�ȡ�ڵ��²���������Ϣ
					/*�ӽڵ����attributeValue()����������������������ֱ�ӻ������ֵ*/
					
					String plugin_AttrValue = task_SubNode.attributeValue("plugin");
					String name_AttrValue = task_SubNode.attributeValue("name");
					if (plugin_AttrValue.equals("pclint")) {
						Actual_Task_pclint_list.add(name_AttrValue);
					}
					
					/*
					�������ã��������forѭ���ǻ�ȡĳ���ڵ�������������Ϣ�������ڻ�ȡ�ڵ���ȫ��������Ϣ
					List<Attribute> all_attr_list = task_SubNode.attributes();
					for (Attribute attr : all_attr_list) {
						if (attr.getName().equals("node_task")) {
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
	
	public static ArrayList<String> Delete_Node(ArrayList<String> CI_Task_pclint_list,
			ArrayList<String> Actual_Task_pclint_list,String cicloud_task
			) throws IOException {
		
		//DOM4J����XML�ļ�����ע�͵Ľڵ㲻���������
		ArrayList<String> Delete_NodeList = new ArrayList<String>();
		for (String task_name : Actual_Task_pclint_list) {
			if (!CI_Task_pclint_list.contains(task_name)) {
				Delete_NodeList.add(task_name);
			}
		}
		System.out.println("�Ѿ���ɾ������ڵ��б� " + Delete_NodeList);
		Actual_Task_pclint_list.removeAll(Delete_NodeList);
		ArrayList<String> Available_NodeList = new ArrayList<String> (Actual_Task_pclint_list);
		
		CI_Task_pclint_list.removeAll(Available_NodeList);
		ArrayList<String> Require_NodeList = new ArrayList<String> (CI_Task_pclint_list);
		
		try {
			SAXReader reader = new SAXReader();
			File task_file = new File(cicloud_task);
			Document document = reader.read(task_file);//����xml�ļ�����ȡdocument����
			Element root_node = document.getRootElement();//��ȡdocument������ڵ�
			System.out.println("cicloud_task���ڵ����� " + root_node.getName());
			//���ϴ��뵥������һ�������������ظ���
			
			Element agentTasks_SubNode = root_node.element("agentTasks");
			List<Element> agentTask_NodeList = agentTasks_SubNode.elements();//��ȡ���ڵ�������һ���ӽڵ��б�
			for (Element agentTask_SubNode : agentTask_NodeList) {
				
				List<Element> task_NodeList = agentTask_SubNode.elements();//��ȡһ���ӽڵ������ж����ӽڵ��б�
				for (Element task_SubNode : task_NodeList)  {
					String name_AttrValue = task_SubNode.attributeValue("name");
						if (Delete_NodeList.contains(name_AttrValue)) {
							System.out.println("����ɾ���� " + name_AttrValue);//��ֻ�����ڴ���ɾ������Ҫд��ԭ�ļ�
							
							//ɾ��task����Ľڵ�
							task_SubNode.getParent().remove(task_SubNode);
							OutputFormat format = OutputFormat.createPrettyPrint();
							format.setEncoding("UTF-8");
							XMLWriter writer = new XMLWriter(new FileWriter
									(new File("cicloud_task.xml")), format);
							//XMLWriter writer = new XMLWriter(new OutputStreamWriter
								//	(new FileOutputStream("cicloud_task.xml")), format);
							writer.write(document);
							writer.close();
						}
					}
				}
				
				//ɾ��agenttask����Ĵ�ڵ㣬�ж��������ڲ�ڵ���Ϊ0
				for (Element agentTask_SubNode : agentTask_NodeList) {
					List<Element> task_NodeList = agentTask_SubNode.elements();
					if (task_NodeList.size()==0) {
						agentTask_SubNode.getParent().remove(agentTask_SubNode);
						OutputFormat format = OutputFormat.createPrettyPrint();
						format.setEncoding("UTF-8");
						XMLWriter writer = new XMLWriter(new FileWriter
								(new File("cicloud_task.xml")), format);
						writer.write(document);
						writer.close();
					}
				}
				
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return Require_NodeList;
	}
	
	public static void Add_Node(String cicloud_task, ArrayList<String> Require_NodeList) throws IOException {
		
		try {
			SAXReader reader = new SAXReader();
			File task_file = new File(cicloud_task);
			Document document = reader.read(task_file);
			Element root_node = document.getRootElement();
			System.out.println("cicloud_task�������������ڵ����� " + root_node.getName());
			
			Element agentTasks_SubNode = root_node.element("agentTasks");
			List<Element> agentTask_NodeList = agentTasks_SubNode.elements();
			
			//�õ������ڵ�Ĳ���λ��
			//ʵ��Ŀ�ģ�ÿ3��С�ڵ�洢��һ��agenttask��ڵ���
			int i = 0;
			for (Element agentTask_SubNode : agentTask_NodeList) {
				String bigtask_AttrValue = agentTask_SubNode.attributeValue("bigtask"); 
				if (bigtask_AttrValue.startsWith("code") 
						|| bigtask_AttrValue.startsWith("res") 
						|| bigtask_AttrValue.startsWith("pclint")) {
					i++;
				}
			}
			
			Element new_agentTask_SubNode = DocumentHelper.createElement("agentTask");//����ֻ�Ǵ����ڵ�Ԫ�أ���û����ӵ�xml�У���Ϊ����Ҫָ�����λ��
			new_agentTask_SubNode.addAttribute("bigtask", "pclint_4");
			new_agentTask_SubNode.addAttribute("rsyncdir", "V8R6C00/");//����ڵ�����ʱ���������ֱ�ӻ��Զ��ÿո���
			agentTask_NodeList.add(i,new_agentTask_SubNode);
			
			for (String Require_Node : Require_NodeList) {
			Element task_node = new_agentTask_SubNode.addElement("task");
			task_node.addAttribute("plugin", "pclint");
			task_node.addAttribute("name", Require_Node);
			task_node.addAttribute("module", Require_Node);
			}
			
			OutputFormat format = OutputFormat.createPrettyPrint();
			format.setEncoding("UTF-8");
			//format.setNewlines(true);//���û���
			//format.setIndent(true);
			//format.setIndent("	");//��������������Ϊһ��tab�ַ�
			//format.setLineSeparator("\n");
			//format.setTrimText(true);
			

			
			XMLWriter writer = new XMLWriter(new FileWriter
					(new File("cicloud_task.xml")), format);
			writer.write(document);
			writer.close();
			
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void change_attr(String cicloud_task, String new_sync_dir) {

		try {
			SAXReader reader = new SAXReader();
			File task_file = new File(cicloud_task);
			Document document = reader.read(task_file);
			Element root_node = document.getRootElement();
			System.out.println("cicloud_task���ڵ���" + root_node.getName());
			List<Element> OneLayer_NodesList = root_node.elements();
			for (Element OneLayer_SubNode : OneLayer_NodesList) {
				String attr_value = OneLayer_SubNode.attributeValue("dir");
				Attribute attr = OneLayer_SubNode.attribute("dir");
				attr.setValue(attr_value + attr.getValue());
				System.out.println("ͬ��Ŀ¼: " + attr.getValue());

			}
			
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
