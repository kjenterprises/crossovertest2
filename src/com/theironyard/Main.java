package com.theironyard;

import spark.Spark;

public class Main {

    public static void main(String[] args) {
        Spark.init();
        Spark.staticFileLocation("public");

        Spark.get("/api/hello", (
                (request, response) -> {
            return "Hello World"; })
        );
    }
}
