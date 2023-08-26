package files;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        // file = An abstract representation of file and directory pathnames

        File file = new File("test.txt");

        if (file.exists()) {
            System.out.println("That file exists! :o!");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
//            file.delete();
        } else {
            System.out.println("That file doesn't exists :(");
        }
    }
}
