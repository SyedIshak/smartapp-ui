package com.pramati.smartapp.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pramati.smartapp.model.Message;

@Controller
public class AppController {

    @RequestMapping(value = "/")
    public String index() {
        return "index.html";
    }
    
    @RequestMapping(value="/getMessage",  produces = MediaType.TEXT_PLAIN_VALUE)
    @ResponseBody
    public String getMessage(Message message) {
	Message out = new Message();
	out.setMessage("you have entered "+message.getMessage());
	return out.getMessage();
    }
}