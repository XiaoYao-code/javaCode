package code622;

import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        String  name="D:\\062.java";
        File  file=new File(name);
        System.out.println(file.getAbsolutePath());


       boolean newFile=file.createNewFile();
        System.out.println(newFile);

    }

}
