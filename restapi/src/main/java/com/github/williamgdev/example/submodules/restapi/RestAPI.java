package com.github.williamgdev.example.submodules.restapi;

public class RestAPI {
    public static void getValue(RestAPIListener<Integer> listener){
        listener.onResult(5);
    }
}
