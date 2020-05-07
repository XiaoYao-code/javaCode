package code507;

import java.lang.reflect.Field;//导入这个包，反射需要

public class TestDemo {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        String str = "hello";
        Class cl = String.class;//反射的第一步 拿到Class对象
        Field field=cl.getDeclaredField("value");//通过getDeclaredField方法拿到私有的字段value，这个方法的返回值是Field
        // 声明一个异常 NoSuchFieldException
        field.setAccessible(true);//相当于打开修改的方法
         char []value= (char[]) field.get(str);  //通过field的set方法拿到str，并且用一个字符数组接受
        //声明一个异常 IllegalAccessException
        value[0]='g';
        System.out.println(str);
    }

}
  /*      String str="zifuchuan";
        int  str1=str.compareTo(str);*/