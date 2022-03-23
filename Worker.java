package com.anuta;

public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;


    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start(int j) {
        for (int i = 0; i < 100; i++) {
            if (i == j) {
                errorCallback.onError("Операция " + j + " выполнена неуспешно");
                continue;
            }
            callback.onDone("Task " + i + " is done");
        }

    }
}
