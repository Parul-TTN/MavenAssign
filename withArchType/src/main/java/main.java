import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
public class main{
    public static void main(String[] args) {
        BasicConfigurator.configure();
        Logger log = Logger.getLogger(main.class.getName());
        log.info("Hello world");
    }

}

