package com.spring.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

/**
 * @description:首页控制
 * @author: Cherry
 * @time: 2020/6/9 8:45
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public ModelAndView index(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        return mav;
    }
    @RequestMapping("/show")
    public ModelAndView show(){
        ModelAndView mav = new ModelAndView();
        mav.addObject("Chen");
        //指定视图
        mav.setView(new MappingJackson2JsonView());
        return mav;
    }
}
