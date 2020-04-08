public  class TestDemo {
	public static  void main1(String[] args){
		for (int i=0;i<args.length; i++) {
			System.out.println(args[i]);
		}
		System.out.println("chenghangshiguapi");
	}


	 public static void main2(String[] args) {
	 	long i=10L;
	 	System.out.println("i的值："+i);
	 	System.out.println("最大值："+Long.MAX_VALUE);
	 	System.out.println("最小值："+Long.MIN_VALUE);
	}
	public static void main3(String[] args) {
    	// byte a=127;
    	byte i=127;//不兼容的类型: 从int转换到byte可能会有损失，编译失败，在计算时存在整形提升
    	System.out.println("i的值："+i);
    	System.out.println("最大值："+Byte.MAX_VALUE);
	 	System.out.println("最小值："+Byte.MIN_VALUE);
    }
   public static void main4(String[] args)  {
    	int i=2147483647+1;//等于-2147483648，可编译通过
    	System.out.println("i的值："+i);
    	System.out.println("最大值："+Integer.MAX_VALUE);
	 	System.out.println("最小值："+Integer.MIN_VALUE);
	
    }
    public static void main5(String[] args) {
    	short i=30;
    	System.out.println("i的值："+i);
    	System.out.println("最大值："+Short.MAX_VALUE);
	 	System.out.println("最小值："+Short.MIN_VALUE);
    }
    public static void main6(String[] args) {
    	byte a=10;
    	byte b=20;
    	System.out.println(a+" "+b);
    	System.out.println(Byte.MAX_VALUE+1);//此时就是Byte.MAX_VALUE+1就是整形计算 所以输出结果为128
    }
    public static void main7(String[] args) {
    	boolean a=true;//Boolean的字节数不确定，且只能有两个取值一个时true一个false
    	System.out.println(a);
    }
    public static void main8(String[] args) {
    	double a=1.1;
    	System.out.println("a的值："+a);
    	System.out.println("最大值："+Double.MAX_VALUE);
	 	System.out.println("最小值："+Double.MIN_VALUE);
    	int b=5;
    	int c=2;
    	System.out.println(b/c);//5/2=2
    	System.out.println(a/c);//类型转换,a=6.0   6.0/2=3.0  int型转化为double
        System.out.println(a*a);//1.2100000000000002
    }
    /*public static void main9(String[] args) {
    	final   int a=0;//最终变量  类似c++中的const  不可修改 定义时要赋初值
    	a=100;
    }*/

    public static void main(String[] args) {
	double a=5.5;
	int b=(int)a;
	System.out.println(b);
	int c=5;
	//boolean d=（boolean）c; //根本是两种类型，强制转换也没用
	//System.out.println(d);
	String num="99";
	int str1= Integer.parseInt(num);
	System.out.println(num);
	System.out.println(str1);
    System.out.println("最大值："+Integer.MAX_VALUE);

}
}   