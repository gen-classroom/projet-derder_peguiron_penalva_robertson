package java;

import java.util.concurrent.Callable;

import picocli.CommandLine.Command;

@Command(name = "clean")
public class SubcommandClean implements Callable<Integer> {

    @Override
    public Integer call() {
        System.out.println("Command clean");
        return 0;
    }

}
