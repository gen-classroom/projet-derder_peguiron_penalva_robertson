import java.util.concurrent.Callable;

import picocli.CommandLine.Command;

@Command(name = "serve")
public class SubcommandServe implements Callable<Integer> {

    @Override
    public Integer call() {
        System.out.println("Command serve");
        return 0;
    }

}

