package com.sample.demo.controller;


import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonAutoDetect
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public class Response<E> {
    private int status;
    private E data;

    public Response() {
    }

    public Response(E data) {
        this.data = data;
        this.status = 200;
    }

    public Response(int code, E data) {
        this.status = code;
        this.data = data;
    }

    public E getData() {
        return this.data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Response{");
        sb.append("status=").append(this.status);
        sb.append(", data=").append(this.data);
        sb.append('}');
        return sb.toString();
    }
}

