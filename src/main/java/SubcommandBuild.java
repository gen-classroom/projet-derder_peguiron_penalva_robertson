package java;

import picocli.CommandLine.Command;

import java.util.concurrent.Callable;

@Command(name = "build")
public class SubcommandBuild implements Callable<Integer> {

    @Override
    public Integer call() {
        System.out.println("Command build");
        return 0;
    }

}
