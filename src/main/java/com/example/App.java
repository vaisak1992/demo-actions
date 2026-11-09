package com.example;

public class App {

    public String getMessage() {
        return "Hello! Maven CI/CD Pipeline is working!";
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.getMessage());
    }
}
