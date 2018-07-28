package com.jwebcoder.grocerystatic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Jason on 16/10/2017.
 */

@Controller
@RequestMapping("/error")
public class ErrorPageController {

    @RequestMapping("/loginFailed")
    public String loginFailed() {
        return "/error-page/login_failed";
    }

    @RequestMapping("/authFailed")
    public String authFailed() {
        return "/error-page/authentication_failed";
    }

}
