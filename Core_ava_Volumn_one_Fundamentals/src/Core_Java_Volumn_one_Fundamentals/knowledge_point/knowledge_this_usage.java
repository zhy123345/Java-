package Core_Java_Volumn_one_Fundamentals.knowledge_point;

public class knowledge_this_usage {
    int i = 0;
    public knowledge_this_usage(int i) {    //���Ǵ������Ĺ��췽�������췽����������ʼ��һ���µĶ�����new����֮���Զ����ã�
        this.i = i;
        System.out.println(this);
    }
    public knowledge_this_usage increament() {
        i++;
        System.out.println(i);
        System.out.println(this);
        return this;//���д˴����ͨ����������֪���ĸ�ʵ�����ô˷�����this����ָ�ĸ�ʵ�������ʵ��������ͨ����ǰ��knowledge_this_usage�����ģ����Դ�ʵ��������knowledge_this_usage���ͣ�������Ϊreturn�������ͱ���ͷ�������һ�£�����ֻ��������knowledge_this_usage���η�����
                    //�����ڲ���һ�·������ͺ���Ĺ�ϵ����ʵ��������������п��Կ����������ʹ����˷��������ͣ�
    }
    public void print() {
        System.out.println("i = " + 1);
    }
}