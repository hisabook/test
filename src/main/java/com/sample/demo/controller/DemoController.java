package com.sample.demo.controller;

import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.time.Instant;

@RestController
public class DemoController {

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = {"timestamp"}, method = {RequestMethod.GET})
    @ResponseBody
    public Response<Long> demo() {
        return new Response(Timestamp.from(Instant.now()));

    }
}
