package com.jwebcoder.grocerystatic.controllers;

import com.jwebcoder.grocerystatic.domain.SystemUser;
import com.jwebcoder.grocerystatic.dto.Message;
import com.jwebcoder.grocerystatic.utilities.EncryptionUtility;
import com.jwebcoder.grocerystatic.utilities.PackingInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by Jason on 15/10/2017.
 */

@Controller
@RequestMapping("/authentication")
public class AuthenticationController {

//    @Autowired
//    private IndexService indexService;

    @PostMapping("/login")
    public void login(String userNameOrEmail, String password4log, String currentURL4Login, HttpSession session, HttpServletResponse response) throws IOException {
        SystemUser user = null;
//        if ((user = indexService.loginAuthentication(userNameOrEmail, EncryptionUtility.encrypt4MD5(password4log))) != null) {
        if (true) {
            session.setAttribute("User", user);
            if(currentURL4Login.contains("/error/")) {
                response.sendRedirect("/index");
            } else {
                response.sendRedirect(currentURL4Login);
            }
        } else
            response.sendRedirect("/error/loginFailed");
    }

    @GetMapping("/logout")
    public void logout(HttpSession session, HttpServletResponse response) throws IOException {
        session.removeAttribute("User");
        response.sendRedirect("/index");
    }

    @PostMapping("/register")
    public void register(String userName, String password4Register, String activeEmail, String currentURL4Register, HttpSession session, HttpServletResponse response) throws IOException {
//        SystemUser user = indexService.registerAuthentication(userName,EncryptionUtility.encrypt4MD5(password4Register),activeEmail);
        SystemUser user = null;
        session.setAttribute("User", user);
        if(currentURL4Register.contains("/error/")) {
            response.sendRedirect("/index");
        } else {
            response.sendRedirect(currentURL4Register);
        }
    }

    @PostMapping("/registerCheck")
    @ResponseBody
    public Message registerCheck(String object, String content) throws IOException {
//        return PackingInfo.changeData2Message(indexService.doAuthInfo(object,content));
        return null;
    }

}
