package com.github.williamgdev.example.submodules.restapi;

/**
 * Created by wiltorri on 8/19/17.
 */

public interface RestAPIListener<T> {
    void onResult(T result);
}
