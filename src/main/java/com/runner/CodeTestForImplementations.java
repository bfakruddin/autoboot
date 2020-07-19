package com.runner;

public class CodeTestForImplementations {
    public static void main(String[] args) {
        String abc = "baba";
        switch (abc){
            case "baba":
                System.out.println(abc);
                break;
            case "kiran":
                System.out.println("name is not baba");
                break;
            default:
                System.out.println("Nothing passed");
                break;
        }
    }
}
