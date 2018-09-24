package com.zc.tower.web.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhangchi
 */
@Controller
public class IndexController {
    @RequestMapping("/templates/")
    public String index(){
        return "index";
    }
}
