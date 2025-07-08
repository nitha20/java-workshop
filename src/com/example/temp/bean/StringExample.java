package com.example.temp.bean;

public class StringExample {
    private String exampleString;

    public StringExample(String exampleString) {
        this.exampleString = exampleString;
    }

    public String getExampleString() {
        return exampleString;
    }

    public void setExampleString(String exampleString) {
        this.exampleString = exampleString;
    }

    @Override
    public String toString() {
        return "StringExample{" +
                "exampleString='" + exampleString + '\'' +
                '}';
    }
} 






