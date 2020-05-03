package book;

public class Book {// 创建了一个Book类
    private  String name;   //Book的属性
    private  String author;
    private  double price;
    private  String type;
    private  String  borrowed="未借出";

    public Book(String name, String author, double price, String type) {//constructor  构造方法
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
    }
//set()是给属性赋值的，get()是取得属性值的
//被设置和存取的属性一般是私有
//主要是起到封装的作用，不允许直接对属性操作
//set()和get()不一定同时存在，看程序需求
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

   /* public String getBorrowed() {
        return borrowed;
    }

    public void setBorrowed(String borrowed) {
        this.;
    }*/

    public String getBorrowed() {
        return borrowed;
    }

    public void setBorrowed(String borrowed) {
        this.borrowed = borrowed;
    }

    @Override
    public String toString() {
        //如果不重写toString方法 那么打印的是Object 类的 toString 方法返回一个字符串
        // 该字符串由类名（对象是该类的一个实例）、at 标记符“@”和此对象哈希码的无符号十六进制表示组成。
        //重写前打印的是对象的地址值，重写后打印的是对象的属性
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", isBorrowed=" + borrowed +
                '}';
    }
}
