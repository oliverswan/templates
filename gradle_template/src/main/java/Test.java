import java.io.File;

public class Test {


    public static void main(String[] args) {

        Test test = new Test();
        File file  = new File("./x");
        System.out.println(file.getAbsolutePath());
    }
}
