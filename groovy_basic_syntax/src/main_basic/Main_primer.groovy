package main_basic

import main_basic.basic_Syntax
import org.codehaus.groovy.runtime.GStringUtil;

class Main_primer {
  static void main(String[] args) {   //��Javaһ����Ҳ��������Ϊmain�����Ĵ��Σ�
    println('Hello World');
    String aa = new String();
    aa.test01();

  }

  def GetString() { //def���庯����������ʽ���庯����ͬ�����ǣ�����ָ������ֵ���ͣ�����ͨ��������ֵreturn���ͣ����ɷ������;�����Ҳ����˵����ʲô���ͣ����ڶ��巽��ʱ���Ѿ��������˵ģ�����һ��Ϊ��˵����
    return "string"
  }
  public String test01() {  //���ﶨ��ķ�����String���͵ģ���ôreturn����ֵҲ��Ȼ��String���͵ģ��ٿ���������ӣ���Ȼû�����η�������groovy��Java�ǶԷ�����Ĭ�����η��ģ�
    return "abc"
  }
  public test02() {
    return "qwe"
  }

  def aa=1;
}