package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.model.StaffModel;
import com.example.service.StaffService;

@Controller
@RequestMapping("/staff")
public class StaffController {

	@Autowired
	StaffModel staffModel;

	@Autowired
	StaffService staffService;

	@GetMapping("/addStaff")
	public String addStaff() {
		staffModel = new StaffModel();
		staffModel.setPassword("1234");
		staffModel.setEmail("email@email.com");
		staffModel.setPhone("22334455");
		staffModel.setPosition("Manager");
		staffService.addStaff(staffModel);
		return "addStaff";
	}

	@GetMapping("/getStaff/{id}")
	public String getStaffById(@PathVariable Integer id,
			@RequestParam(name = "email", required = false, defaultValue = "") String email, Model model) {
		System.out.println(this.getClass().getName() + ".getStaffById() = " + id);
		System.out.println(this.getClass().getName() + ".getStaffById() = " + email);
		staffModel = staffService.getStaffById(id);
		if (staffModel != null) {
			System.out.print("staffModel is not Null " + staffModel.getPosition());
		}

		model.addAttribute("position", staffModel.getPosition());

		return "getStaff";
	}
}