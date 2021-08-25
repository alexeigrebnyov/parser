import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Parser {
    File file = new File(getPath());
    private String getPath() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
    private Contngent getString(String line) {
        Contngent contngent = new Contngent();
        Scanner scaner = new Scanner(line);
//        contngent.setEmc(scaner.next());
//        contngent.setDate(scaner.next());
//        contngent.setSex(scaner.next());
//        try {
//            contngent.setCode(scaner.next());
//
//        } catch (Exception ignored) {}
//
////        try {
////            if (scaner.next()=="б") { contngent.setCode(contngent.getCode()+"б");}
////
////        } catch (Exception ignored) {}
//

        contngent.setEmc(scaner.next());
        contngent.setDate(scaner.next());
        try {
            contngent.setSex(scaner.next());
        } catch (Exception ignored) {}
        try {
            contngent.setCode(scaner.next());
        } catch (Exception ignored) {}

        return contngent;
    }

    public List<Contngent> getList() throws FileNotFoundException {
        List<Contngent> items = new ArrayList<>();

        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            items.add(getString(scanner.nextLine()));
        }
        return items;
    }


}
