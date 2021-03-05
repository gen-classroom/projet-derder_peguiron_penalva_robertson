import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

@Command(name = "Main", version = "Main 1.0", mixinStandardHelpOptions = true)
public class Main implements Runnable{

    @Override
    public void run() {
        System.out.println("Class Main");
    }

    public static void main(String[] args) {
        int exitCode = new CommandLine(new Main()).execute(args);
        System.exit(exitCode);
    }
}
