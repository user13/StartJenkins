import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by user on 2/1/18.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("");
        System.out.println("" + new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(Calendar.getInstance().getTime()));
        System.out.println("");
    }
}
