import java.util.concurrent.Callable;
import picocli.CommandLine.Command;

@Command(name = "New")
public class SubcommandNew implements Callable<Integer> {
    @Override
    public Integer call(){
        System.out.println("Command clean");
        return 0;
    }
}
