package com.homework7;

public class StringHelper {

    String name;
    char charExample[];


    public char[] getCharExample() {
        return charExample;
    }

    public void setCharExample(char[] charExample) {
        this.charExample = charExample;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StringHelper() {
    }

    public StringHelper(String name, char[] charExample) {
        this.name = name;
        this.charExample = charExample;
    }

    public void helper(String name, char[] charExample) {


        if (!(charExample.length == 0)) {
            String stringFromChar = String.valueOf(charExample);
            System.out.println(stringFromChar);
        } else {
            System.out.println("Array is null");
        }
        System.out.println("name");


    }




}
