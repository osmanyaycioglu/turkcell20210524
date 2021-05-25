package com.training.turkcell.java8.lambda;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LamdaRunner {

    public static void main(final String[] args) {
        int port = 80;

        IProc procLoc = new MyProcImpl(port);
        procLoc.proc("osman");

        IProc procLoc2 = new IProc() {

            @Override
            public void proc(final String strParam) {
                System.out.println(port + " Anonim output : " + strParam);
            }
        };
        procLoc2.proc("Ali");

        IProc lambdaIProcLoc = s -> System.out.println(port + " Lambda output : " + s);
        lambdaIProcLoc.proc("Veli");

        IExec eIExecLoc = new IExec() {

            @Override
            public String exec(final String str1Param,
                               final String str2Param) {
                return str1Param + str2Param;
            }
        };

        IExec execLoc = (a,
                         b) -> a + b;
        execLoc.exec("osman",
                     "yay");
        IExec execLoc2 = (a,
                          b) -> {
            if (a.length() > 10) {
                a = a.substring(1);
            }
            return a + b;
        };
        execLoc2.exec("osman",
                      "yay");

        IExec execLoc3 = LamdaRunner::xyz;
        execLoc3.exec("osman",
                      "yay");

        LamdaRunner lamdaRunnerLoc = new LamdaRunner();
        IExec execLoc4 = lamdaRunnerLoc::abc;
        execLoc4.exec("osman",
                      "yay");

        List<String> strs = Arrays.asList("osman",
                                          "ayay",
                                          "ali",
                                          "veli",
                                          "ayse");

        List<Integer> collectLoc = strs.stream()
                                       .filter(t -> t.length() > 4)
                                       .map(ty -> ty.length())
                                       .collect(Collectors.toList());
    }

    public static String xyz(String str1,
                             final String str2) {
        if (str1.length() > 10) {
            str1 = str1.substring(1);
        }
        return str1 + str2;
    }

    public String abc(String str1,
                      final String str2) {
        if (str1.length() > 10) {
            str1 = str1.substring(1);
        }
        return str1 + str2;
    }

}
