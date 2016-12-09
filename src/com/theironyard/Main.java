package com.theironyard;

import spark.Spark;

public class Main {

    public static void main(String[] args) {

        Spark.port(getHerokuAssignedPort());

        Spark.staticFileLocation("public");

        Spark.init();

        Spark.get("/api/hello", (
                (request, response) -> {
                    return "Hello World";
                })
        );
    }


    static int getHerokuAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567; //return default port if heroku-port isn't set (i.e. on localhost)
    }
}
