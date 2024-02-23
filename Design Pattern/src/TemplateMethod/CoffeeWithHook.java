package TemplateMethod;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook{
    boolean customerWantsCondiments() {
        String answer = getUserInput();
        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    void brew() {
        System.out.println("brew coffee");
    }

    void addCondiments() {
        System.out.println("add milk");
    }

    String getUserInput() {
        String answer = null;

        System.out.println("Do you want to add milk?");

        BufferedReader in = new BufferedReader(new InputStreamReader((System.in)));
        try {
            answer = in.readLine();
        } catch (Exception e) {
            // TODO: handle exception
            System.err.println(e);
        }

        if (answer == null) {
            return "no";
        }
        return answer;
    }
}
