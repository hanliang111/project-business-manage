package com.neuedu.controller;


import com.neuedu.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user/category")
public class CategoryController {

    @Autowired
    ICategoryService categoryService;

    RequestMapping("find")
        public String findAll(){
            List<Category> categoryList=categoryService.findAll();

            session.
        }
}
