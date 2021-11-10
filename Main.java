import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public class Main {
    static PhanTu<Integer> phanTu = new PhanTu();
    static int[] obj = new int[1000];

    public static void readFromFile(String pathInputFile, PhanTu<Integer> phanTu) {
        Path path = Path.of(pathInputFile);
        try {
            List<String> list = Files.readAllLines(path);
            String[] x = list.get(0).split(" ");
            for (int i = 0; i < x.length; i++) {
                obj[i] = Integer.valueOf(x[i]);
                phanTu.insert(obj[i]);
            }
            System.out.println("Successful!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void exportToFile(String pathOutputFile, PhanTu<Integer> phanTu) {
        try {
            FileWriter write = new FileWriter(pathOutputFile);
            for (int i = 0; i < phanTu.size(); i++) {
                write.write(phanTu.getData(i) + " ");
            }
            write.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void sort(PhanTu<Integer> phanTu) {
        List<Integer> obj = phanTu.toArr();
        Collections.sort(obj);
        phanTu.setList(obj);
    }

    public static void main(String[] args) {
        readFromFile(args[0], phanTu);
        /*phanTu.insert(5);
        phanTu.insert(2);
        phanTu.insert(1);
        phanTu.insert(4);
        phanTu.insert(3);
        phanTu.sort(phanTu);
        phanTu.print();
        phanTu.print();*/
        exportToFile(args[1], phanTu);
    }

}
