package com.horders.spring.controller;


import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.horders.spring.bean.LoginForm;
import com.horders.utility.DrawImageCode;


@Controller
public class LoginController {
	 @RequestMapping(value="")
    public ModelAndView test2(HttpServletRequest request,HttpServletResponse response,LoginForm command ){
        String username = command.getUsername();
        //ModelAndView mv = new ModelAndView("/login/login","command","LOGIN SUCCESS, " + username);
        //ModelAndView mav = new ModelAndView("/login/login");
        ModelAndView mav = new ModelAndView("/home/index");
        mav.addObject("message","hello kitty");  
        
        //List  
        List<String> list = new ArrayList<String>();  
        list.add("java");  
        list.add("c++");  
        list.add("oracle");  
        mav.addObject("bookList", list);  
          
        //Map  
        Map<String,String> map = new HashMap<String,String>();  
        map.put("zhangsan", "北京");  
        map.put("lisi", "上海");  
        map.put("wangwu", "深圳");  
        mav.addObject("map",map); 
        return mav;
    }
    @RequestMapping(value="login")
    public ModelAndView login(HttpServletRequest request,HttpServletResponse response,LoginForm command ){
        String username = command.getUsername();
        ModelAndView mav = new ModelAndView("/index/index");
        mav.addObject("message","hello kitty");  
        
        //List  
        List<String> list = new ArrayList<String>();  
        list.add("java");  
        list.add("c++");  
        list.add("oracle");  
        mav.addObject("bookList", list);  
          
        //Map  
        Map<String,String> map = new HashMap<String,String>();  
        map.put("zhangsan", "北京");  
        map.put("lisi", "上海");  
        map.put("wangwu", "深圳");  
        mav.addObject("map",map); 
        return mav;
    }
    @RequestMapping(value="test")
    public ModelAndView test(HttpServletRequest request,HttpServletResponse response,LoginForm command ){
        String username = command.getUsername();
        ModelAndView mv = new ModelAndView("/index/index","command","LOGIN SUCCESS, ");
        return mv;
    }
    @RequestMapping(value="home/home")
    public ModelAndView home(HttpServletRequest request,HttpServletResponse response,LoginForm command ){
        String username = command.getUsername();
        ModelAndView mv = new ModelAndView("/home/home","command","LOGIN SUCCESS, ");
        return mv;
    }
    
    @RequestMapping(value="code/get_code")
    public ModelAndView getCode(HttpServletRequest request,HttpServletResponse response,LoginForm command ){
        String username = command.getUsername();
        ModelAndView mv = new ModelAndView("/code/get_code","command","LOGIN SUCCESS, ");
        return mv;
    }
    
    @RequestMapping(value="topup/topup")
    public ModelAndView topup(HttpServletRequest request,HttpServletResponse response,LoginForm command ){
        String username = command.getUsername();
        ModelAndView mv = new ModelAndView("/topup/topup","command","LOGIN SUCCESS, ");
        return mv;
    }
    
    @RequestMapping(value="home/image_code")
    public void getImageCode(HttpServletRequest request,HttpServletResponse response,LoginForm command ){
        String username = command.getUsername();
        response.setHeader("Pragma", "No-cache");  
        response.setHeader("Cache-Control", "No-cache");  
        response.setDateHeader("Expires", 0);  
        //指定生成的响应图片  
        response.setContentType("image/jpeg");
        DrawImageCode drawImageCode = new DrawImageCode(80,30,BufferedImage.TYPE_INT_RGB);
        String code = drawImageCode.getImageCode();
        HttpSession session = request.getSession(true);  
        session.setMaxInactiveInterval(5*60);//设置session对象5分钟失效  
        session.setAttribute("code", code);
        //System.out.println(code);  
        try {
			ImageIO.write(drawImageCode, "JPEG", response.getOutputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
//        ModelAndView mv = new ModelAndView("/topup/topup","command","LOGIN SUCCESS, ");
//        return mv;
    }
}