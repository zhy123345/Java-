package Core_Java_Volumn_one_Fundamentals.third_chapter;//��Java�У������һ������Ҫ����������Java�ĳ���ṹ�ǣ�srcĿ¼Ϊ����Ŀ¼�ļ���
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.io.Console;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.System;//ʹ�õ����ڻ���java.lang���У����Բ���import���룬��Java��Ĭ�ϵ���
import java.math.BigInteger;

/*Java��Ŀ�ṹ�У�����һ��src�����ϣ�src�¿ɰ��������(�������ļ���)��
 *������ĿʱĬ�ϰ���Ϊ��Ŀ�������������Java�ļ�������Java�ļ�ʱ��ʵ�Ǵ���һ����
*/
//import Core_Java_Volumn_��_Fundamentals.java_base.base;//ע�⣬���Java�ļ��е�����ģ�飬һ��Ҫ���������������֮����
public class third_chapter {

	public static String start_third_chapter() {

	/***3.6�ڡ����ַ���***/
	//�Ӵ�
	/*����Ҫ֪��Java����8�ֻ�����������(ע���ǻ������͹���8��)�����е�char���ַ�����(�����ַ���)�����ǳ��˻��������⻹�кܶ��������������ݣ�
	 *Java��ǿ�������ԣ�����������ʱ����ָ���������ͣ�������8�ֻ������͵ı���ʱ����ʹ�ùؼ���char��int�ȣ���������String�������������͵�������
	 *��8������������Java�����õģ�
	 *
	 *Java�ַ������;����ɱ�׼����е�Ԥ������String�ṩ�ģ�Javaû�����õ��ַ������ͣ�
	 *Java�����κα�׼��������͵ı���ʱ�������Ǹ����ഴ����һ��������String greeting = "Hello"��
	 *����Hello����String���һ��ʵ������ʵ�κ���˫�������������ַ�������String���һ��ʵ������
	 *���£�ʹ�ùؼ���new Ҳ��Java�����ഴ��ʵ�������һ�ֳ��÷�ʽ
	 */
		String new_obj = new String("ss");
		
		String greeting = "";//��ӡ�յ��ַ����ܵ���������Ϊ����
		System.out.println(greeting);//Java�е��÷���ʱ����ӡ�õ��Ľ������ʵҲ�Ƿ�����return����ֵ����
		greeting = "old";
		greeting = "Hello";//���¸�ֵͬ������ʱ���������������������ͣ�
		
		/*
		 ******Java�����ʹ���˸���ĳ����Ķ����˱������ߴ�����ʵ��������ô�����������ʹ���������еķ���******��
		 ******ע�⣺Java����'ֱ��'�޸��ַ���******������ע�⣬����˵���ǲ���ֱ���޸��ַ����������ǲ���ֱ���޸ı���ֵ��
		 *���Java��String�ǲ��ɱ����йأ�Java�ڶ����ַ�������ʱ�������и�ֵ�����ַ����洢��һ���������У������غ��ڴ�Ķ�ջ�йأ�
		 *����ֵ�ı�󣬱���greetingָ��(ͨ���ڴ��ַ)�ڴ�����е��½���Hello����ԭ��old�ַ�������û��û���ģ����������ֱ���޸��ַ�����
		 *��������ο����ӣ�https://zhidao.baidu.com/question/253995346.html
		 */
		/*������˵����ֱ���޸��ַ������󣬵��ǿ���ʹ��substring()��������޸ģ��޸ĺ������о�û����Hello�����£�
		 *greeting = greeting.substring(0,3)";
		 *System.out.println(greeting);
		 *String���е�substring()���������ַ�������ȡ�Ӵ���������λָ���ַ�λ�÷�Χ��greeting��ֵΪHel!
		 */
		
		//�ж������ַ����Ƿ���ȣ�ʹ��equals()����������򷵻ز���ֵtrue��������򷵻ز���ֵfalse����shell�ű��෴��shellʹ��==�жϣ�
		/*Java�ж�������ֵ���͵������Ƿ���ȺͲ��ȣ�ʹ��== �ͣ�=��
		 */
		String test1 = "ok";
		test1.equals(greeting);
		boolean aa = "Hello".equals(greeting);
		System.out.println(aa);
		
		//�����ʹ��뵥Ԫ����⣻�����漰���ַ�����������ݣ����������о�
		/*Java����unicode��16�ַ������룬����16λ�����Ʊ�ʾһ���ַ�(һ���ַ������Ǽ����ϵ���ĸ�����֡���㣬������������)
		 *��2��ʮ�����Ʊ�ʾλ8λ�����ƣ�����Java��2��ʮ�����Ʊ�ʾһ���ַ���
		 *��Java����ν���뵥Ԫ������������ʾһ���ַ���16λ�����ƣ���������unicode�ַ����������ĳ���ַ���Ӧ�ı��(������ֵ)
		 *����ο���������:
		 *https://zhidao.baidu.com/question/74466416.html
		 *https://blog.csdn.net/u010411264/article/details/45258629
		 *https://blog.csdn.net/u014028027/article/details/78180827
		 *https://www.cnblogs.com/benbenalin/p/6921553.html
		 *�ܽᣬ�����������ַ������룬���ն�Ҫת���ɶ����ƹ������ʶ��
		 */
		int n = greeting.length();
		System.out.println("length()���������õ����뵥Ԫ���� "+n);
		int count = greeting.codePointCount(0, n);
		System.out.println("codePointCount()����������ȡ�������������ʵ�ʳ��� "+count);
		char point = greeting.charAt(0);
		System.out.println("charAt()���������õ�ĳ������λ�Ĵ��뵥Ԫ��Ӧ���ַ� "+point);
		int number = greeting.codePointAt(0);
		System.out.println("codePointAt()���������õ�ĳ������λ�Ĵ���� "+number);
		
		//�����ַ���
		/*String����+ƴ���ַ����ķ�ʽЧ�ʵͣ�ÿ�������ַ���ʱ�������һ���µ�String���󣬼Ⱥ�ʱ���˷��ڴ�ռ䣬
		 *����һ��ʹ��StringBuilder�� �����ַ����Ϳ����Ż��������⣬��ΪStringBuilder���ǲ����޸��ַ�����ʽ�����£�
		 *stringbuilder���ַ�����string���ַ�������https://www.cnblogs.com/mrxy/p/8057657.html
		 */
		StringBuilder builder = new StringBuilder("start:");//StringBuilder()����һ���յ��ַ�����������builderΪ���ַ���
		builder.append("[submodule ");//StringBuilder���append()�������Ѷ��С���ַ�����ӵ��������У�����һ���µ��ַ���
		builder.append("\"");
		builder.append(test1);
		System.out.println("��֤ "+builder);//����builder��StringBuilder�����ַ���
		String chara = builder.toString();//StringBuilder���toString()�������ѹ������е��ַ���ת��ΪString�����ַ���
		System.out.println("д���ļ���һ��"+chara);
		
		
		/***3.7�ڡ����������***/
		//��ȡ����
		/*��ȡ������Ҫ�õ�Scanner���System�ࣻ
		 *����Ҫʹ��Scanner()�๹��һ��Scanner����Ȼ�����׼������ System.in����
		Scanner input = new Scanner(System.in);
//		System.out.println(input);
		String name1 = input.nextLine();//Scanner����(��input)����nextLine()�����������û�������ַ������ַ������԰����հ׷�
		System.out.println(name1);
		String name2 = input.next();//next()�����������û�������ַ���ʱ�������հ׷����Զ������հ׷�������ַ���
		System.out.println(name2);
		int age = input.nextInt();//nextInt()�����������û����������
		System.out.println(age);
		float numbers = input.nextFloat();//nextFloat()�����������û�����ĸ�����
		System.out.println(numbers);
		*/

		//���ڶ�ȡ������������룬�������о�
//		Console ininput = System.console();//����˵����ֱ�����룬����Ҫ����Ĵ���������У�һ����˵��
//		String username = ininput.readLine("user name: ");
//		char[] passwd = ininput.readPassword("pass wd: ");
//		System.out.println(username);
//		System.out.println(passwd);
		
		//��ʽ���������Java��ʽ�����Ҳ��ռλ��
		/*����System���ڻ�����java.lang���У���ͨ�����print()����println()��������ʽ�����������printf()������
		 *��ʽ��������%Ϊ��ʽ˵�����ģ���ʽ˵����β����ת����������ʾҪ����ʽ����������ֵ���ͣ�f��ʾ��������s��ʾ�ַ�����d��ʾʮ����������
		 *����ת�������������ֵ���͵ģ�������ַ������͵ģ��������ʱ�����͵ģ�
		 *printf()��print()����һ���������ܻ�������������������Ҫ�ֶ��ӻ��з�\n;
		 */
		double quotient = 10000 / 3.0;
		System.out.printf("%8.2f\n", quotient);//��ӡ���ռ8���ַ��Ŀ�ȣ���ȷ��С�����2λ������1���ַ���������ǰ��Ŀո�
		System.out.printf("Hello, %s Next year, you'll be %d\n","andi",24);
		String message = String.format("\nHello, %s Next year, you'll be %d","andi",24);
		System.out.println(message);//format()����������һ����ʽ�����ַ�����������һ�����󣻲������������д���Ҳ�ܴ�ӡ
		
		//ʱ��ĸ�ʽ���������������ȷJava����ʱ��Ĳ������� Date()����
		/*ʱ�����ͨ��ʽ��������ڸ�ʽ˵����%��Ҫ��t��Ȼ���ټ�ת����
		 */
		Date shijian = new Date();
		System.out.println("ԭʼ��ʱ���ʽ "+shijian);
		System.out.printf("������ʱ���ʽ "+"%tc\n",shijian);
		/*ʱ�䱻��ʽ���Ĳ���������������ĳЩʱ���ʽ����ת����ֻ�ܸ�ʽ��ʱ���һ����(���ꡢ�¡���)���������ʹ�ò�������һ���Ը�ʽ������ʱ�䣻
		 *���£�����������˵����%���棬����$�������京���ǣ�1��ʾ��һ������ʽ���Ķ���2��ʾ�ڶ�����ʽ���Ķ���(��ʱ��)��
		 *���ֻ��һ��ʱ�����Ҫ����ʽ������ô��������ֻ��1���ɣ�
		 */
		System.out.printf("%1$s %2$tB %2$te, %2$tY\n","Due date:",shijian);
		System.out.printf("%1$tB %1$te, %1$tY\n",shijian);//����һ�д���Աȣ���֪��%�������λ��ʲô��˼��
		 
		//�ļ������������
		/*���ļ���ȡ������Ҫ��Scanner�๹��һ��Scanner����Ȼ������File�๹����ļ����������ע�����¼��㣺
		 *1����ȡ�ļ�ʱ���ܻ��Ҳ����ļ��������ڶ��巽��ʱ��throws FileNotFoundException�����ڹ���Scanner����ʱ��try��catch�����쳣��
		 *2���ļ���Ĭ�����λ����Java���������·�������λ��(������������ĵ�ǰ·��)�����ʹ��IDE�����ɿ����������ƣ�eclipse����ļ���
		 *���·����Ϊ��Ŀ�ļ��еĸ�Ŀ¼�£�����src��binĿ¼ƽ����λ�ã���ʹ��String dir = System.getProperty("user.dir");
		 *�ҵ��ļ������·��
		 *3��File����Թ����ļ�����Ҳ�ɰ�һ���ַ������͵��ļ�����ת��ΪFile���͵��ļ�
		 */
		System.out.println(System.getProperty("user.dir"));
		File fileobj_1 = new File("one_file.txt");
		try {
			Scanner read_file = new Scanner(fileobj_1);
			System.out.println("���Ǵ�ӡ�ļ����� "+read_file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//д���ļ�
		/*д���ļ���Ҫ����һ��PrintWriter��������ļ������ڣ���ᴴ�����ļ���
		 *PrintWriter�����ļ�������Ҫ���쳣�����ԭ�򣺿����ǲ��ܱ��������ļ������������ļ���������&����
		 */
		try {
			PrintWriter out_file = new PrintWriter("one_test_file.txt");
			System.out.println("�ļ����ڴ��λ�� "+out_file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/**3.8�ڡ����������̣��������ж�����ѭ�����*/
		//�������򡪡�������ܿ�ĸ���
		/*"��"������������䣻��Java������Ľ�������һ�Ի�������������������Java���룬����Java���巽��ʱ�����ŵĴ�����䣬Ҳ���ǿ飻
		 *����һ���ܹ���ĸ������������κ�һ������ĳ�������Ĵ�����䣬���ɳ�֮Ϊ�飻����python�еĺ����壬�������ں����Ŀ���䣻
		 *�����������ԣ�ѭ�������ж���䶼�õ��飻����shell����python��for���Ĵ��룬��������for���Ŀ飻
		 *�������֮һ����ȷ���˱���������(variable scope)�����ڿ��ж���ı���ֻ�����ڱ�����ʹ�ã���������������ʹ�ã�
		 *������Ϊһ�������Ƕ������һ�����У������ڲ�����ʹ������ı�������֮�򲻿��ԣ�Ƕ�׹�ϵ���������У���������ͬ��������
		 */
		String var_out = "waiceng  ";
//		int var_out_num = 2;//������������ͬ���������򱨴�
		{
			String var_in = "neiceng";
			int var_out_num = 6;
			System.out.println(var_in);
			System.out.println(var_out + var_out_num);
		}
//		System.out.println(var_in);//�����������ڲ�������ı������򱨴�
		
		//if...else if...else ��䡪����ʽ���£�
		/*if (condition) {
		 *	statement1;
		 *	statement2;
		 * }
		 *else if {
		 *	statement3;
		 *	statement4;
		 * }
		 *else {
		 *	statement5;
		 * }
		 *Java��û��elif�����ǲ�д�ɵ�else if��Ҳ����˵Java���Ƕ�if...else��䣻������������{}�еĿ���һ�У��Ͳ���д{}�ˣ���ԭ�飻
		 */
		
		//while ѭ���ж���䡪����ʽ���£�
		/*while (condition) {
		 *	statement1;
		 *	statement2;
		 * }
		 *����while�����һ����÷��������ѭ��������ʼ�Ͳ���������ôѭ����(��)�е����д��벻��ִ�У�
		 *���ϣ��while���д�������ִ��һ�Σ���ʹ��do/whileѭ����䣬�Ժ󽲽⣻whileһ���÷���������
		 */
		double goal_1 = 9999999.88;
		System.out.println("����ʱ�ʲ�Ŀ�꣺ " + goal_1);
		double payment_1 = 999999.88;
		System.out.println("ÿ��������룺" + payment_1);
		double interestrate_1 = 1.7;
		System.out.println("ÿ����������ʣ�" + interestrate_1);
		
		double balance_1 = 0;
		int years_1 = 0;
		//��ʼ����ÿ�����ƽ��
		while (balance_1 < goal_1) {
			balance_1 += payment_1;
			double interest_1 = balance_1 * interestrate_1 / 100;
			balance_1 += interest_1;
			years_1++;
		}
		System.out.println("���������ô����֮������г���ı������ݣ� " + years_1);
		/*1.years_1������Ȼ��while�ڲ�鱻�ӹ�������������������������ı������������һ��������ʹ��years_1��
		 *2.����ǰ�����������while���������жϲ�������while��Ĵ��벻ִ�У����ϣ������ִ��һ�Σ���ʹ��do/while��䣬���£�
		 
		Scanner in_while = new Scanner(System.in);
		
		double payment_2 = 999999.88;
		System.out.println("ÿ��������룺" + payment_2);
		double interestrate_2 = 1.7;
		System.out.println("ÿ����������ʣ�" + interestrate_2);
		
		double balance_2 = 0;
		int years_2 = 0;
		String input_determine;
		do {
			balance_2 += payment_2;
			double interest_2 = balance_2 * interestrate_2 / 100;
			balance_2 += interest_2;
			years_2++;
			System.out.printf("\nafter year %d,your balance is %.2f\n", years_2,balance_2);
			System.out.println("Ready to resire? (Y/N)");
			input_determine = in_while.next();
		}
		while (input_determine.equals("N"));
		*/
		/*�ж�while�����Ƿ����֮ǰ��do�����������Ѿ�ִ����һ�Σ�while��������ж������������do��������ִ�У�����ֹͣѭ��*/
		 
		
		//ȷ��ѭ������forѭ����䣬forѭ������while�ж�ѭ���ļ���ʽ��forѭ�����ýṹ�����֣�
		/*��һ���Ǿ���ĵ�����ʽ*/
		//int i;
		for (int i=1; i<=4; i++) {
			System.out.println(i);
		}
		
		/*�ڶ����Ǳ���Ԫ�صķ�ʽ����������for j in ��ʽ�����ڱ�����潲��for eachѭ��*/
		/*for eachѭ��������һ���ݴ漯����ÿ��Ԫ�صı��������ڱ���������Ԫ�أ����Ͽ����Ǻ��潲�����飬�����б��ֵ�����������͵�Ԫ�ؼ���*/
		String[] strlist = {"\na","b","c","d"};
		for (String j : strlist) {
			System.out.println(j);
		}
		/*�������ַ�ʽ��������for��������()�������ı�������Ȼ����һ�ַ�ʽ������for���֮ǰ����������i��
		 * ��for�������()�������ı�����ֻ����for����ʹ��(���ֲ�����)��for���֮ǰ�����ı������ڷ������κ�λ�ö���ʹ�� 
		*/
		
		//switch��䡪��������shell��case���
		/*switch���������shell��case��䣬Ҳ��if-else���ĸ߼������÷���**����Java�м�������**���÷�ʾ�����£�*/
		/*
		Scanner in_switch = new Scanner(System.in);
		int choice = in_switch.nextInt();
		switch (choice) {
			case 1:
				System.out.println("This is a number one");
				break;
			case 2:
				System.out.println("This is a number two");
				break;
			case 3:
				System.out.println("This is a number Three");
				break;
			case 4:
				System.out.println("This is a number four");
				break;
			default :
				System.out.println("�������������������������ĸ�case��ǩ����ִ��default��ǩ��֧���");
				break;
		}
		*/
		/*1.case �����1��2����case��ǩ��ֻ������������ö�ٳ��������������ַ���������case "asd"�ͻᱨ��
		 *2.default �ؼ���������������shell�ű�case���� *) ����˼������������κ�case ��ǩ����ִ��default����֧�Ĵ���飻
		 *3.����Ҫ�ģ����ĳ��case����֧��û��break����case�������ִ����ɺ󣬻����ִ����һ��case����֧����������ش���
		 */
		
		//ѭ�������ơ�break��continue����������ѭ�����
		/*һ���ǲ�����ǩ��breakѭ�����ƣ������ڲ�Ƕ��ѭ�����ߺ�ǳ��Ƕ��ѭ��������break֮��ֱ�����������ѭ��*/
		double goal_3 = 9999999.88;
		System.out.println("����ʱ�ʲ�Ŀ�꣺ " + goal_3);
		double payment_3 = 999999.88;
		System.out.println("ÿ��������룺" + payment_3);
		double interestrate_3 = 1.7;
		System.out.println("ÿ����������ʣ�" + interestrate_3 + "%");
		
		double balance_3 = 0;
		int years_3 = 0;
		//��ʼ����ÿ�����ƽ��
		while (years_3 <=20) {
			balance_3 += payment_3;
			double interest_3 = balance_3 * interestrate_3 / 100;
			balance_3 += interest_3;
			years_3++;
			if (balance_3 > goal_3) {//����if (balance_3 > goal_3) break;
				System.out.println("Ŀ���ɣ�");
				break;//break֮���������κδ���
//				System.out.println("���д���û���壬Ҳ���������");
			}
//			System.out.println("���д��빲ѭ��"+ years_3 +" ��");
		}
		System.out.println("���������ô����֮������г���ı������ݣ� " + years_3);

		/*��һ���Ǵ���ǩ��break���ƣ���Ƕ�׺���ѭ�����ã���ĳ��ѭ������һ����ǩ����break����ʱָ���������ñ�ǩ��ε�ѭ��*/
		int j = 1;
		inner_stop:
		while (j <=20) {
			j++;
			int i;
			for (i = 1;i <= 6;i++) {
				if (i==5) {//�����жϱ����Ƿ�������� ��==
					//i = 5;
					System.out.println("\n��ѭ��" + i +"�δﵽĿ��");
					break inner_stop;
				}
			}
		}
		/*continue����ѭ���󣬻�������ѭ����ʼ����ִ�У�continueҲ�д���ǩ�ģ���breakֱ�Ӵ��ѭ�������������ѭ������㿪ʼִ��*/
		/*����break��continueѭ�������ƣ���Java�����м������ã������ص�����*/
		
		/**3.9����ֵ*/
		/*��Ҫʹ�ñ�׼���java.math���е������ࣺBigInteger��BigDecimal
		 *BigInteger��ʵ�������⾫�ȵ��������㣻BigDecimal��ʵ�������⾫�ȵĸ��������㣻
		 */
		int a_int = 10; int b_int = 26;
		BigInteger a = BigInteger.valueOf(a_int);//��Щ����Բ�ʹ������������������ֱ�ӵ����౾��ķ���
		BigInteger b = BigInteger.valueOf(b_int);
		BigInteger c1 = a.add(b);
		BigInteger c2 = b.subtract(a);
		BigInteger c3 = a.multiply(b);
		BigInteger c4 = b.divide(a);
		BigInteger c5 = b.mod(a);
		/*��̬��valueOf()�����ǰ�������ֵת���ɴ���ֵ��add() subtract() multiply() divide() mod()���ַ�����
		 *�ǶԴ���ֵ���� �͡�������̡����� �����㣬����ֵ���㲻��ʹ�� + - *  / ���������ֻ��ʹ����ķ����������㣻
		 *��������BigInteger��Ϊ��������,BigDecimal��Ҳ������Ч���ķ�����
		 */
		
		/**3.10 ���顪������Ҫ��һ����������*/
		/*1.����(��Array)�������洢ͬһ������(����String��int��boolean������)�����ݼ��ϣ���Java��һ�����ݽṹ��ֻ�ܴ洢ͬһ���������ͣ�
		 *2.ͨ������λ����������ĳ��Ԫ�ص�ֵ������int[0] String[2]������λ��0��ʼ��Java�������и�Ԫ����ʽ������{ }�������ģ������������ʼ����
		 *3.�����������ʱ��Ҫָ������Ԫ�ص����ͣ����ͺ����[ ]���Լ����������������int [] array_int������ֻ�������˱�������������������,����
		 *	������ÿ��Ԫ�ر�����int���ͣ�
		 *4.int[] array_int = new int[10]�������new int[10]��ʾ�����������10������10��Ԫ�أ�
		 *5.���鴴���󣬿��Ըı�ĳ��Ԫ�ص�ֵ,���ǲ��ܸı䳤�ȣ������潲�������б�Array list���Ըı䳤�ȣ�
		 */
		
		//����Ļ������巽ʽ�ͱ�����ʽ
		/*�ַ������͵�����*/
		String[] aarr = new String[2];
		aarr[1] = "ww";//�����������Ԫ�صľ���ֵ��ǰ�治�������������
		/*�������͵�����*/
		int[] zero = new int[0];//�����峤��Ϊ0�����飬����������������
		int[] array_int = new int[4];//���ִ������������  ��̬����
		/*���鴴��������Ԫ���Ǳ���ʼ��״̬��int[]��String[]��boolean[]����Ԫ�س�ʼ��Ϊ0 null false*/
		/*������forѭ��Ϊ����ÿ��Ԫ�ظ�ֵ�����£�*/
		for (int i=0; i < 4; i++) {
			array_int[i] = i;
			System.out.println(array_int[i]);
		}
		System.out.println(array_int[2]);//ͨ������λ����������ĳ��Ԫ�ص�ֵ
		System.out.println(array_int);//��ӡ���鲢�������{0,1,2,3}�ṹ��ʽ
		
		String[] array_Str = new String[4];//����һ��String���������������������ʼ���˵�����ʵ������
		for (String i : array_Str) {//for eachѭ��������������Ԫ�أ�ѭ�������ж�����ݴ����iҪ����������ƥ��
			i = "qwe";//���ﲢû�и�������ÿ��Ԫ�ظ�ֵ�����Ǹ�ֵ���˶���ı���i�������ӡarray_Str�Ϳ�֤��
			System.out.println(i);
		}
		System.out.println("\n����ĳ��ȣ� "+array_Str.length);//array_Str.length���õ����鳤�ȣ���Ԫ�ظ���
		System.out.println(Arrays.toString(array_Str));
		/*Arrays���е�toString()������Ҳ�Ǳ�����������Ԫ�أ�����ӡ�����ʽ���б���ʽ[" "," "," "," "]*/
		
		//�����ʼ���Լ��������顪������2��֪ʶ��
		/*1.��ν�����ʼ����ָ����������ʵ������󲢸����ֵ�����ִ������������  ��̬����  */
		int[] array_small = {2,4,6,8};//�����ֶ���ֵԪ�صķ�ʽ
		System.out.println("��ʼ������Ҳ�������{0,1,2,3}�ṹ��ʽ "+array_small);
		/*2.�����������飬��ָ���������µ����������ֱ�����³�ʼ��һ���������ֵ(��ʵ������)�����£�*/
		array_small = new int[] {10,12,14};//ע������ʵ�������Ǿ�̬�ģ��ǿ��Ըı�ģ������ڴ�ջ������ֵ�Ѿ��ı䣻
		System.out.println(Arrays.toString(array_small));
		/*Java�У������������ݽṹ������ArrayList��ֻҪ������Ԫ�ر��ֶ���ֵ����������ʼ��*/
		
		//���鿽��
		/*���鿽�����ǰ�һ�����������������һ���������������ֵ(��ʵ������)��û�п�����
		 *�������������õ���ͬһ�����飬�����ڴ����������������ͬ����ջ����ͬһ������ֵ��
		 */
		int[] new_array_small_1 = array_small;
		System.out.println(Arrays.toString(new_array_small_1));
		new_array_small_1[1] = 16;//�ı������������ĳ��Ԫ�أ��ɵ��������ֵҲ��ı䣬���������������õ���ͬһ���������ֵ
		System.out.println("�ɵ��������ֵ�Ѿ��ı� "+Arrays.toString(array_small));
		
		/*���ϣ����������������������Ұ��������ֵҲ��������ô��Ҫʹ��Arrays���е�copyOf()�������ɰ汾jdk��copyTo()������
		 *copyOf()������Ŀǰ��ѧϰ���ȿ������ֳ�����ʽ��һ��ͨ��length ���������鳤�ȣ�����ͨ������λ�Ŀ�ʼ���յ���������鳤��*/
		int[] new_array_small_2 = Arrays.copyOf(array_small, 2*array_small.length);
		System.out.println(Arrays.toString(new_array_small_2));
		/*��һ��������ԭ����������ڶ��������������鳤�ȣ��������鳤�ȴ��ھ����飬����Ԫ�ص�ֵ����ʼ����������С��ԭʼ���飬��ֻ������ǰ���Ԫ��*/
		int[] new_array_small_3 = Arrays.copyOfRange(array_small, 1,4);
		System.out.println("����ԭ�����������Χ "+Arrays.toString(new_array_small_3));
		/*��һ��������ԭ����������ڶ�������ԭ��������λ��ʼ���յ㣬�������ԭ���鷶Χ��ͬ�������Ԫ�صĻᱻ��ʼ����ע�ⷶΧ������ҿ�����*/
		new_array_small_2[1] = 68;
		System.out.println("�ɵ��������ֵû�иı� "+Arrays.toString(array_small));
		/*�ܽ᣺����copyOf()�����������飬���ϸ�������ʽ��ͬ��������ջ���½�һ����������¾ɱ�������������ͬ�������ֵ*/
		
		//main���������鴫�Σ�����Main_book�ඨ���main����
		
		//��������
		/*����ֵ������������Arrays���sort()����������Ϊ����*/
		int[] sort_array = {2,3,9,8,6};
		Arrays.sort(sort_array);//����ֻ�Ƕ�ԭ�������Ԫ�����򣬲���������µ��������
		System.out.println("���������� "+Arrays.toString(sort_array));
		
		/*��ֵ����֮��int float double ǿ��ת������������()��ͬһ���������������ִ�У��������������������ڵ�*/
		double n1 = Math.random();
		System.out.println(n1);
		/*Math���random()�������������һ����(0,1)�����double���͵���ֵ*/
		int n2 = (int) 0.34*10;//int(n2)��ǿ��ת��Ϊ������ֵ
		System.out.println(n2);
		/*��ִ������ǿ��ת��(int) 0.34��Ȼ��ִ�г���10 */
		int n3 = (int) (0.34*10);//������ͬ������ֵ���㣬10�ᱻ�Զ�ǿ��ת��Ϊdouble���ͣ�ת������Googleһ�£�
		System.out.println(n3);
		/*��ִ��0.34*10��Ȼ��ѽ����������ǿ��ת��*/
		
		//��ά���顪�����ʾ���Ƕ�����飬����������ڵ�Ԫ���õ�һ���������ʣ��ڶ��������ڵ�Ԫ���õڶ������������ڼ��һ�£�����������
		double[][] dimension_array_1 = new double[4][2];
		System.out.println("Ԫ�ر���ʼ��Ϊ0�Ķ�ά���� "+Arrays.deepToString(dimension_array_1));
		double[][] dimension_array_2 = {{1,2},{3,4},{5,6},{7,8}};
		System.out.println("Ԫ�ر�����ֵ�Ķ�ά���� "+Arrays.deepToString(dimension_array_2));
		/*Arrays.deepToString()��������ӡ��ά����*/
		
		String content = "\n�����Ǳ���������������";
		return content;
	}
}

