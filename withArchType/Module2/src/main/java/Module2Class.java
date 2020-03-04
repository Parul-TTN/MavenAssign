import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Module2Class {
    public static void main(String[] args) {
        BasicConfigurator.configure();
        Logger log = Logger.getLogger(Module2Class.class.getName());
        log.info("Hello world");
    }

}
