package Core_Java_Volumn_��_Fundamentals.fourth_chapter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class fourth_chapter {
	
	 public static void start_fourth_chapter() {
		 
		 /**4.1 ���������򡪡����OOP*/
		 /*�����ࡢ���󡢷�װ�ĸ���Լ���Ͷ�����֮��Ĺ�ϵ���뿴���б��µ�һ�ڣ��˴����ĵ�ֱ�ӽ���ʾ������*/
		 /*1.ʵ����ĸ����ǣ������е����ݾ���ʵ��������������Ƕ����еı���������ʵ����Ĺ��̳�Ϊ������
		  *2.Java�����������඼��������������������˼�ǲ��ذ�����·�Ե����̡������ȸ����ഴ��ʵ������Ȼ�����������еķ�����
		  *	��Щ��׼�����ֱ�ӵ��ñ���ķ���������Math�����ֱ�ӵ���random()������double n1 = Math.random();
		  *	�û������һЩ��Ҳ���Բ�ʹ����������������
		  *	���籾�µ�fourth_chapter�࣬��main�����б����ã�ֱ�ӵ���start_fourth_chapter()������*/

		 /**4.2ʹ�������ࡪ������׼���*/
		 //������������
		 /*������Ҫ�ܽ�����½��ۣ���
		   *1.��׼���ʲô��������£�����ֱ����������Լ��ķ�����
		   *2.��׼����У�ʲô�����಻�ܴ���ʵ������*/
		 
		 /*Java���󲿷�����Ƕ�����������������ģ���Ҫ��ʹ�ö��󣬾������ù����������µ�ʵ������Ȼ���ʵ��ʩ�ӷ�������Date��Ϊ�������£�*/
		 /*1.�����������е�һ�����ⷽ����ר���ڹ�����󣬲��������й�����Ӧ����public���ͣ�
		  *2.�����������һ������֤�Ĵ𰸣�û�������������಻�ܴ���ʵ������*/
		 new Date();
		 System.out.println("Date���͵���������� " + new Date());
		 new Date().toString();
		 /*
		 try {
			Thread.sleep(5000);
			System.out.println("�ַ���Sting���͵�����ʱ������� " + new Date().toString());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 */
		 /*���������ʵ�Ǵ�����4��ʵ�����󣬴���ʱ5��ִ�оͿ���֤��������˵����
		  *1.��������Date()����������������Date����������ͬ���ڹ�����ǰ����new�ؼ��֣����´�����һ��Date���͵Ķ���
		  *2.����Ķ��������Ϊ�������ݸ��������з������βΣ���System.out.println(new Date());
		  *3.����Ķ���������Ȼ���ܹ�����Date���еķ�������new Date().toString()*/
		 
		 Date time_1 = new Date();
		 Date time_2;
		 time_2 = time_1;
		 /*����Ͷ������ ��Ҫ����
		  *1.����Ķ�����Դ����һ�������У����ѹ���Ķ���ֵ�������������������ͨ����һ�������Ƕ�ֵ(ֵ���Ƕ���)��һ�����ã�
		  *2.���������һ���µı�����Ҳ���������������������һ���Ѿ������˶���ı�������time_2 = time_1;
		  *	 ʵ���ϣ�time_2��time_1���õ���ͬһ�����󣬴��ڴ�Ķ�ջ��ϵ�Ϳ���֤����*/
		 
		 //Java��׼����е� GregorianCalendar��
		 /*�����ഴ������ʱ�ܹ�������д��Σ�����Ϊ�����й��췽����������this�ؼ��֣�������python�е�__init__(self,var1,var2)��*/
		 /*Date��ֻ�ܵõ��ͱ��浱ǰʱ��㣻GregorianCalendar����֮�⣬�����趨��ʷ����ʱ��㣬���һ�����ֻ���������գ�*/
		 GregorianCalendar Calendar_1 = new GregorianCalendar();
		 GregorianCalendar Calendar_2 = new GregorianCalendar(1991,10,10);
		 GregorianCalendar Calendar_3 = new GregorianCalendar(1991,Calendar.DECEMBER,31);
		 /*1.�������ʱ������Ӳ������õ���ʱ����ǵ�ǰʱ�䣻������봫�Σ��õ�ʱ�����趨����ʷʱ�䣻
		  *2.������ε��·���int����ֵ��ʾ��ת����Date�������������ֱ�ӵõ��趨�ĵ��·ݣ���Ϊ�·ݴ�0��ʼ����������10��ʾʮһ��november��
		  *3.�����Ҫֱ�ӵõ��趨�·ݣ���Ҫ����Calendar��ĳ�������Calendar.DECEMBER���ೣ��(��������)����ֱ�����������ʣ�*/
		 
		 Date Calendar_1_value = Calendar_1.getTime();
		 Date Calendar_2_value = Calendar_2.getTime();
		 Date Calendar_3_value = Calendar_3.getTime();
		 /*getTime()������GregorianCalendar���еķ�������ö����е�ʱ��㣬����ת��ΪDate���͵����ݣ�*/
		 
		 Calendar_1.setTime(Calendar_2_value);
		 int new_year = Calendar_1.get(Calendar.YEAR);
		 /*setTime()�������������������ʾ��ʱ��㣻setTime()��void���ͣ�û�з���ֵ��
		  *��������������ǣ���ȡ���������ʱ�䣬�趨���µ�GregorianCalendar�����ʱ�䣻*/
		 
		 System.out.println("��ǰʱ�䣺 				" + Calendar_1_value);
		 System.out.println("����int�͵õ���ʷʱ�䣺 		" + Calendar_2_value);
		 System.out.println("����Calendar�����õ���ʷʱ�䣺 	" + Calendar_3_value);

		 //�����������͸���������
		 System.out.println(Calendar_1);//��ӡ������󣬲�����ֱ�ӵõ�ʱ���
		 int now_1 = Calendar_1.get(Calendar.MONTH);
		 int now_2 = Calendar_1.get(Calendar.DAY_OF_WEEK);
		 Calendar_2.set(Calendar.YEAR, 2001);//1991����2001��
		 Calendar_2.set(Calendar.MONTH, Calendar.SEPTEMBER);//11�±��12��
		 Calendar_2.add(Calendar.YEAR, 2);//add()������GregorianCalendar���еķ�����2001���2�ꣻ
		 /*1.����˵����������int����ֵ���·ݣ����ʱ��1���෴��������Calendar�ೣ�������ʱ���1��
		  *2.get()������set()������Calendar���еķ���������GregorianCalendar����Calendar�����չ�࣬���Կ��Ե��ã�
		  *3.get()��������Ӳ������õ����������в��ֻ�ȫ����Ϣ��getTime()�ǻ�ȡȫ��ʱ�����Ϣ*/
		 System.out.println("�õ��·��ǣ� " + now_1);
		 System.out.println("�õ�һ�ܵĵڼ��죺 " + now_2);
		 
		 /**4.3�û��Զ�����*/
		 //Java�����Զ�����Ĺ涨��
		 /*1.ÿ��Java�ļ�ֻ����һ�������� public class�����������ɵķǹ�����class
		  *2.
		  * */
		 class employee {
			 
			 
		 }
		 
	}

}