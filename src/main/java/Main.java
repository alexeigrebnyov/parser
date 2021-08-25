import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Parser parser = new Parser();
        Reporter reporter = new Reporter();
        List<Contngent> contngents = new ArrayList<>();
        List<Contngent> notNull = new ArrayList<>();

        List<Contngent> nul = new ArrayList<>();

//        contngents = parser.getList();
//        List<Contngent> dist = new ArrayList<>();
//        for (Contngent cont:contngents) {
//            if (cont.getCode() != null) {dist.add(cont);}
//
//        }
//        System.out.println(dist.size());
//        System.out.println(contngents.size());
//        dist = parser.getList()
//                .stream()
//                .map(e -> e.getEmc())
//                .distinct()
//        .collect(Collectors.toList());
//        for (String disty:dist) {
//            for (Contngent cont:contngents ) {
//                if (cont.getEmc().equals(disty)) {distcontngents.add(cont);}
//
//
//            }
//            List<Contngent> temp = new ArrayList<>();
//            temp = distcontngents
//                    .stream()
//                    .distinct()
//                    .collect(Collectors.toList());
//            System.out.println(temp.bg);
////            distcontngentsfinal.addAll(distcontngents
////                    .stream()
////                    .distinct()
////                    .collect(Collectors.toList()));
//
//
//        }

//              distcontngentsfinal
//                .forEach(System.out::println);
////        dist
////                .forEach(System.out::println);
//        System.out.println((long) parser.getList()
////                .forEach(System.out::println);
//                .size());
//        System.out.println((long) distcontngentsfinal
//                .size()
//        );
        contngents = parser.getList();
//        System.out.println(parser.getList().size());
//        System.out.println(contngents.size());
//        parser.getList()
//                .forEach(System.out::println);
        for (Contngent cont: contngents) {
            if (cont.getCode()== null) {
                nul.add(cont);
            }
            else {notNull.add(cont);}

        }
        List<Contngent> distnotNull = notNull
                .stream()
                .distinct()
                .collect(Collectors.toList());

        List<Contngent> distnul =
                nul
                        .stream()
                        .distinct()
                        .collect(Collectors.toList());

        for (Contngent nn:distnotNull) {
            //                    System.out.println(n);
            distnul.removeIf(n -> nn.getEmc().equals(n.getEmc()));

        }
        distnotNull.addAll(distnul);
        for (Contngent dist: distnotNull) {
            if (dist.getCode()== null) {
                dist.setCode("116");
            }

        }
//      distnul.forEach(System.out::println);
//        System.out.println();
//        System.out.println();
//      distnotNull.forEach(System.out::println);
//    System.out.println(contngents.size());
//    System.out.println(distnul.size());
//    System.out.println(distnotNull.size());

        Reporter.generate(distnotNull);
//        distnotNull.forEach(System.out::println);
    }


}
