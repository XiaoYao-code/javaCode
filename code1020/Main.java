package code1020;
class Rect{
    float  x;   //矩形左上角纵坐标
    float  y;//横坐标
    float   width;//宽
    float    height;//高

}
public class Main {
    public  static  String  encoder(char [] arr){
        int s=arr.length;
        StringBuilder str=new StringBuilder();
        for (int i = 0; i <s ; i++) {
            str.append(arr[i]);
        }
        return str.toString();
    }
    public static Boolean Overlap( Rect rect1,Rect rect2){
        if (rect1.x+rect1.width>rect2.x&&
        rect2.x+rect2.width>rect1.x&&
        rect1.y+rect1.height>rect2.y&&
        rect2.y+rect2.height>rect1.y){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {


    }
}
