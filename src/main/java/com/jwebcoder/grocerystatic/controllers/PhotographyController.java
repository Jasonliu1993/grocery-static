package com.jwebcoder.grocerystatic.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by Jason on 12/10/2017.
 */

@Controller
public class PhotographyController {

    /*@Autowired
    private IndexService indexService;

    @Autowired
    private PhotographyService photographyService;*/

    @GetMapping("/photography/detail/{id}")
    public String photographyDetail(ModelMap modelMap, @PathVariable("id") Integer id) {

        /**
         * 摄影详细页数据
         */
//        modelMap.addAttribute("PhotographyDetail",PackingInfo.changeData2Message(photographyService.getPhotographyDetailById(id)));

        return "/photography/photography_detail";
    }

}
