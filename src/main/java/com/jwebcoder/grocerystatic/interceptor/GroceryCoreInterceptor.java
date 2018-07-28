package com.jwebcoder.grocerystatic.interceptor;

import com.jwebcoder.grocerystatic.domain.NavigatationMenu;
import com.jwebcoder.grocerystatic.domain.SystemUser;
import com.jwebcoder.grocerystatic.utilities.PackingInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jason on 14/10/2017.
 */

@Component
public class GroceryCoreInterceptor implements HandlerInterceptor {

    /*@Autowired
    private IndexService indexService;

    @Autowired
    private CustomProperty customProperty;*/

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        HttpSession session = request.getSession();
        SystemUser systemUser = (SystemUser) session.getAttribute("User");
        if (request.getRequestURI().contains("/admin")) {
            if (systemUser != null) {
                if ("admin".equals(systemUser.getType())) {
                    return true;
                } else {
                    response.sendRedirect(request.getContextPath() + "/error/authFailed");
                    return false;
                }
            } else {
                response.sendRedirect(request.getContextPath() + "/error/authFailed");
                return false;
            }
        } else {
//            List<String> notAllowUrl = customProperty.getLoginOnly();
            List<String> notAllowUrl = new ArrayList<>();

            for (String URL : notAllowUrl) {
                if (request.getRequestURI().contains(URL)) {
                    if (systemUser != null)
                        return true;
                    else {

                        response.sendRedirect(request.getContextPath() + "/error/authFailed");
                        return false;
                    }
                }

            }
            return true;
        }


    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        /**
         * 导航条
         */

        List<NavigatationMenu> navigatationMenus = new ArrayList<>();

        HttpSession session = request.getSession();
        SystemUser systemUser = null;
        if ((systemUser = (SystemUser) session.getAttribute("User")) != null) {
            if ("admin".equals(systemUser.getType())) {
                request.setAttribute("Nav", PackingInfo.changeData2Message(navigatationMenus));
            } else {
                navigatationMenus.remove(navigatationMenus.remove(navigatationMenus.size() - 1));
                request.setAttribute("Nav", PackingInfo.changeData2Message(navigatationMenus));
            }
        } else {
            navigatationMenus.remove(navigatationMenus.remove(navigatationMenus.size() - 1));
            request.setAttribute("Nav", PackingInfo.changeData2Message(navigatationMenus));
        }

        /*记录用户访问信息*/
        if (session != null) {
//            indexService.loggingInfo();
        }

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
