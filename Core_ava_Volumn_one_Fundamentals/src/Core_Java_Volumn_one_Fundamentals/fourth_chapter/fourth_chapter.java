package Core_Java_Volumn_one_Fundamentals.fourth_chapter;
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
		 /*1.Java�����Զ�����Ĺ涨��ÿ��Java�ļ�ֻ����һ�������� public class�����������ɵķǹ�����class��
		  *2.Javaһ�������ĳ�����Ŀ���������������һ��ֻ��һ��main����*/
		 
		 //4.3.1�����ǹ����û��Զ���������ӣ��ǳ���Ҫ���䣬����ǣ�����ܶ��﷨������������ʾ������
		 Employee staff_obj = new Employee("carl",75000,1987,12,15);//���д��벻������������ʾ��
		 /*���д���ֻΪ˵�������ഴ������ʱ������ͨ���Զ������еĹ��췽��Employee()����ʼ����������(������ı���)��
		  *������python����������__init__�������ڴ�������ʱ�Ϳ���ֱ�Ӵ���ʵ�Σ�
		 *ע�⣺python�еĹ��캯��__init__()��Ҫ��������ʼ��ʵ�����������(������)������û�й��캯��Ҳ�ܴ�������*/
		 Employee[] staff = new Employee[3];
		 /*����һ������������������Ԫ���������Զ����Employee����*/
		 staff[0] = new Employee("carl",75000,1987,12,15);
		 staff[1] = new Employee("harry",50000,1989,10,1);
		 staff[2] = new Employee("tony",40000,1990,3,15);
		 
		 for (Employee e : staff) {
			 e.raiseSalary(5);
		 }
		 
		 for (Employee e : staff) {
			 System.out.println(
					 "name=" + e.getName()+
					 ",salary=" + e.getSalary()+
					 ",hireDay=" + e.getHireday());
		 }
	 }
}

class Employee {//�ǹ�����Employee�͹�����fourth_chapter����ƽ��
	//�������˽������(�������ʵ����)
	private String name;
	private double salary;
	private Date hireday;
	
	public Employee(String n, double s, int year, int month, int day) {
		/*Employee()�ǹ��췽����Java�涨Ҫ��������ͬ�����ҿ��Բ���void���η��������ǳ�ʼ�������Ե�ֵ*/
		/**���췽������Ҫ���ص�����**/
		
		name = n;//Ҳ����this.name = n;
		salary = s;
		GregorianCalendar calendar = new GregorianCalendar(year,month-1,day);
		hireday = calendar.getTime();
	}
	
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public Date getHireday() {
		return hireday;
	}
			 
	public void raiseSalary(double byPersent) {
		double raise = salary * byPersent / 100;
		salary +=raise;
	}
}
//���������Զ���ʾ������ϸ������˵��

//4.3.2���Դ�ļ������Լ�����
/*1.�ڱ�Դ�ļ��а�����������fourth_chapter��Employee��Ҳ���԰�ÿ��������һ��������Դ�ļ��У���Employee��Employee.java�ļ��У�
 *2.����ʱ��ʹ������ javac fourth_chapter.java����Ȼû��Employee.javaԴ���ļ������Ǳ���ʱ��Employee������ı������
 *  Employee.class*/

//4.3.3����Employee��
/*1.���๲����һ��������������4���������ֱ��ǣ�Employee(),getName(),getSalary(),getHireday()��raiseSalary();
 *2.���з�����ʹ���˹ؼ���public����ζ�������κ�����κη��������Ե�����Щ������
 *3.**�ص㣺Employee���ʵ����(ע����ʵ����)��3��ʵ�����������Ҫ���������ݣ�ע�⣺��ΪҪ����Employee�ഴ��ʵ������
    *����������Ҫͨ��Employee���з���������Щʵ�������Դ�ʵ����ĸ�������⣬ʵ�����Ƕ����е����ݣ����������ʵ����
 *4.private�ؼ�����ȷ��ֻ��Employee������ķ������ܷ�����Щʵ����������ķ�������ֱ�ӷ�����Щʵ����
 *5.��������һ��������ķ�������η���ʵ����ģ���private String nameΪ����
 *	1)���ȣ�Employee����Ϊ��������˽��ʵ���򣻲���fourth_chapter���д���һ��staff[0]���󣬶����д��д����ʵ�Σ�
 *	2)Ȼ����Щʵ��ͨ�������������е�name = n;����ֵ��ʵ����
 *	3)�����Щ����ֵ��ʵ����ͨ��getName()���������ظ�staff[0]����
 *	**��ν����ֱ�ӷ���ʵ���򣬾���˵������ֱ�ӵõ�����ֵ��
 *	��ˣ�Employee��ʵ���˶�ʵ����ֵ�ı�������װ��Ŀ����Ϊ�˷�ֹ������ķ����޸Ķ����ʵ����ֵ�������Ƿ�ֹ�۸�ʵ������������***/

//4.3.6��װ���ŵ�
/*1.getName(),getSalary(),getHireday()������ֻ����ʵ�����ֵ����Ϊ����������
 *2.�ؼ�����name����ֻ�����ڹ�������������ɺ󣬾Ϳ��Է�ֹ�����ķ����ı�ʵ����ֵ��
 *3.��Ȼsalary����ֻ���򣬵���ֻ��Employee���з���raiseSalary()�ſ����޸���ֵ���������ֵ����ֻ�����raiseSalary()�������ɣ�
 *	���salary����public���е�ʵ������ô�κη����������ƻ���ֵ��
 *4.����ʵ����hireday��Υ����һ��ԭ�򣺷�����һ���ɱ��������ã����½���ǣ���ȻΪ˽�е�ʵ���򣬵����Իᱻ�ƻ���װ�ԣ�����ο����飻
 *5.���ϣ�ʹ��private���ʵ���򣬱ȶ���һ���򵥵�public�������ӣ������ŵ��ǣ�
 *	1)���Ըı��ڲ�ʵ�֣����˸���ķ����⣬����Ӱ����������
 *	2)����������(�糣�õ�set**)����ִ�д����飬��ֱ�Ӷ�����и�ֵ�����������Щ����*/

//4.3.4����������public Employee(String n, double s, int year, int month, int day)
/*1.��������һ������ķ���������������ͬ�����ڴ���Employee��Ķ���ʱ�������������У�����ʵ�����ʼ��Ϊ��ϣ����ֵ��
 *2.������������new�ؼ��ֵ�ִ�ж������ã������ö�����ù��������������������Ǵ���ģ�
 *	staff[0].Employee("carl",75000,1987,12,15);
 *3.�������������ص㣺
 *	����������ͬ��
 *	ÿ��������ж��������
 *	�����������ж������
 *	������û�з���ֵ
 *	new�ؼ��ֵĲ�������ù���������
 *4.ע�⣺��Ҫ�ڹ������ж�����ʵ���������ľֲ������������Ǵ���ģ�
 *	public Employee(String n, double s, int year, int month, int day) {
 *		String name = n;//��������������name���������ͣ���������ʵ�ʵ�Ч����������һ���µı�������private String name������;
 *	}*/

//4.3.5��ʽ��������ʽ����



/**4.4��̬��;�̬�������������Ǿ�̬���Ǿ�̬��������������������ೣ���ķ�Χ*/
//4.4.1��̬�򡪡���̬�򱻳�Ϊ����
/*�������׾�̬��ĸ����ָ����static�ؼ��ֵ�ʵ���򣬼����ж���ļ���static�ı���������ʵ������ʵ�����壻
    ע�⣺�����ڷ����еľֲ��������������ܼӹؼ���public private static���Σ�*/

//4.4.2��̬����
/*1.��̬��(�����Ϊ��̬����)ʹ�õıȽ��٣����Ǿ�̬����ʹ�õıȽ϶ࣻ
  2.����Java�ı�׼����е�Math�ඨ����һ��������
  public class Math
  {
 	...
 	public static final double PI = 3.1415926;
 	...
  }*/

/*2.����Ҫ****���κ���ľ�̬����������Ҫ ������.������ �ķ�ʽ��ȡ������
  3.���static�ؼ��ֱ�ʡ�ԣ���PI�ͳ���Math���һ��ʵ���򣬶�ʵ��������Ҫ����Math��Ķ����ͨ��������ʵ�ʵ�����(ʵ��Math���޹��캯��)��
  4.����ÿ����Ķ��󶼿��ԶԹ���������޸ģ��������Ҫ�������Ϊpublic��
	Ȼ�����г���(��public final��)ȴû�����⣻*/

//4.4.3��̬����
//main����������public��static�ؼ�������
//��Java�й�������Ҫ�������������󲢳�ʼ�������û�й������������󶼲��ܴ���
//Java��ʵ�������ָ�����е����ݱ�����ע�ⲻ�����еģ�����ʾ������Ȼ���������������Ա������������û�д������󣬾Ͳ���˵��ʵ����




