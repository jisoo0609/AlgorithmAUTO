import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar today = Calendar.getInstance();
        String todayStr = format.format(today.getTime());
        System.out.println(todayStr);
    }
}