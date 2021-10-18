package AntiElite.com;

import java.io.File;

public class Main {

    public static void main(String[] args) {
	// write your code here
        File file = new File("C:\\Users\\Nametsego\\FileReader_TerminalApp");

        if(file.exists()){
            System.out.println("That file exists :0 !");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            file.delete();
        }else{
            System.out.println("Path file non-existent :(");
        }
    }
}
