
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
public class Prog1 {
    public static void main(String[] args) {
        BasicConfigurator.configure();
        Logger log = Logger.getLogger(Prog1.class.getName());
        log.info("Hello world");
    }

}
