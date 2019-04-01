public class WhatCanASwitchBranchExecute {
    public static void main(String[] args) {
        String day = "Mon";   // assign a value here
        switch (day) {
            case "Sun" -> System.out.println("OSS-Jav");
            case "Mon", "Tue" -> {        // some simple/complex code
            }
            default -> throw new RuntimeException("Running out of projects");
        }

    }
}
