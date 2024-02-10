package org.example;


import org.example.dto.Current;
import org.example.dto.WeatherResponse;
import retrofit2.Response;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Weather API Console App!");
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println();
            System.out.println("Enter your City(or ctrl+F2 for exit):");

            String str = scanner.nextLine();

            Response<WeatherResponse> response = Weather.instance().current(Weather.KEY, str).execute();
            if(response.isSuccessful()){
                Current current = response.body().getCurrent();
                System.out.println("Temperature is " + current.getTempC() + " and it feels like " + current.getFeelslikeC());
            } else {
                System.out.println("Something went wrong");
            }
        }
    }
}