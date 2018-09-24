package com.zc.tower.web.action.servers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangchi
 */
@Controller
public class ServersListController {
    @RequestMapping("/serversList")
    public String toList(ModelMap model){

        model.addAttribute("serversList",null);
        return "/servers/lists";
    }


}
