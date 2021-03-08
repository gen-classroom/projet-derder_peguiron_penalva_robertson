package java;

import java.util.concurrent.Callable;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

@Command(name = "Main", subcommands = { SubcommandServe.class, SubcommandClean.class})
public class Main implements Callable<Integer>{

    @Override
    public Integer call() {
        System.out.println("Class Main");
        return 0;
    }

    public static void main(String[] args) {
        int exitCode = new CommandLine(new Main()).execute(args);
        System.exit(exitCode);
    }
}
