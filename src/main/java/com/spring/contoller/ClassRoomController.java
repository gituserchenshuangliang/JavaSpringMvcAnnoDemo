package com.spring.contoller;

import com.spring.entity.ClassRoom;
import com.spring.entity.Teacher;
import com.spring.service.ClassRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

/**
 * @description:控制层
 * @author: Cherry
 * @time: 2020/6/8 17:17
 */
@Controller
public class ClassRoomController {
    @Autowired
    ClassRoomService classRoomService;

    @RequestMapping(value = "/room",method = RequestMethod.GET)
    public ModelAndView getClassOfTeahcer(int uuid){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        ClassRoom clazz = classRoomService.findByUuid(uuid);
        mav.addObject(clazz.getTeacher());
        mav.addObject(clazz.getList());
        //指定视图
        mav.setView(new MappingJackson2JsonView());
        return mav;
    }
}
