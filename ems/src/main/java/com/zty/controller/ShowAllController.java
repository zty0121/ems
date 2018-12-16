package com.zty.controller;
import com.zty.entity.Emp;
import com.zty.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/es")
public class ShowAllController  {
        //这是拉取修改
        //这是推送修改
	@Autowired
	private EmpService empService;
	@RequestMapping("/QueryAll")
	@ResponseBody()
	public List<Emp> QueryAll() {
		return empService.getAll();
	}
}




