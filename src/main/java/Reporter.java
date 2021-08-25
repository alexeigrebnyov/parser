import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.stream.Collectors;

public class Reporter {
    public static void generate(List<Contngent> contngents) throws ParseException {

        List<Contngent> filterreps = new ArrayList<>();
        List<Contngent> contsoff = new ArrayList<>();
        List<Date> dates = new ArrayList<>();
        DateFormat format = new SimpleDateFormat("dd.MM.yyyy");

        long sum = 0L;
        for (int amount = 0; amount < 31; amount++) {
            Date date = format.parse("26.06.2021");
            Calendar cal = GregorianCalendar.getInstance();
            cal.setTime(date);
            cal.add(GregorianCalendar.DATE, amount);
            String newDate = format.format(cal.getTime());
            filterreps = contngents
            .stream()
            .filter(e ->e.getDate().equals(newDate))
            .collect(Collectors.toList());

            long cont116M = 0L;
            long cont116F = 0L;
            long cont109a = 0L;
            long cont109b = 0L;
            long cont1262a = 0L;
            long cont108b = 0L;
            long cont132b = 0L;

            String infoM = null;
            String infoF = null;
            String info109A = null;
            String info109B = null;
            String info1262A = null;
            String info108B = null;
            String info132B = null;
            try {
                cont116M = filterreps.stream().filter(e -> e.getCode().equals("116"))
                        .filter(e -> e.getSex().equals("мужской"))
                        .count();
                infoM = "M - " + cont116M;

            } catch (Exception ex) {
                infoM = "M - " + cont116M;


            }
            try {
                cont116F = filterreps.stream().filter(e -> e.getCode().equals("116"))
                        .filter(e -> e.getSex().equals("женский"))
                        .count();
                infoF = "F - " + cont116F;

            } catch (Exception ex) {
                infoF = "F - " + cont116F;


            }
            try {
                cont109a = filterreps.stream().filter(e -> e.getCode().equals("109.а"))
                        .count();
                info109A = "109.а - " + cont109a;

            } catch (Exception ex) {
                info109A = "109.а - " + cont109a;


            }
            try {
                cont109b = filterreps.stream().filter(e -> e.getCode().equals("109.б"))
                        .count();
                info109B = "109.б - " + cont109b;

            } catch (Exception ex) {
                info109B = "109.б - " + cont109b;


            }
            try {
                cont1262a = filterreps.stream().filter(e -> e.getCode().equals("110"))
                        .count();
                info1262A = "110 - " + cont1262a;

            } catch (Exception ex) {
                info1262A = "110 - " + cont1262a;


            }
            try {
                cont108b = filterreps.stream().filter(e -> e.getCode().equals("108.б"))
                        .count();
                info108B = "108.б - " + cont108b;

            } catch (Exception ex) {
                info108B = "108.б - " + cont108b;


            }try {
                cont132b = filterreps.stream().filter(e -> e.getCode().equals("132.б"))
                        .count();
                info132B = "132.б - " + cont132b;

            } catch (Exception ex) {
                info132B = "132.б - " + cont132b;


            }
            long total = cont116M + cont116F + cont109a + cont109b + cont108b + cont132b
                    +cont1262a;
            System.out.println(newDate.toString());
            System.out.println();
            System.out.println(total);
            System.out.println(infoM);
            System.out.println(infoF);
            System.out.println(info109A);
            System.out.println(info109B);
            System.out.println(info1262A);
            System.out.println(info108B);
            System.out.println(info132B);
            System.out.println();
            System.out.println();
            sum += total;

        }
        System.out.println(sum);
    }
}
