package com.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.demo.student.Studentdetail;
import com.demo.service.StudentService;

@Controller
@RequestMapping
public class StudentdetailControlller {
	@Autowired
	StudentService studentService;
	@GetMapping("addStudentdetail")
	public String  addStu()
	{
		
		return "AddStudentdetail";
		
	}
	@PostMapping("/insertStudentdetail")
	public String insertStudentdetail(@ModelAttribute("insertStudentdetail") Studentdetail stu)
	{
		
		studentService.addStu(stu);
		return "redirect:/studentdetailReport";
	}
	
	@GetMapping("studentReport")
	public String lodeStudentdetail(Model m)
	{
		m.addAttribute("studentdetail", studentService.getAllStu());
		m.addAttribute("title", "Student Report");
		
		return "StudentReport";
	}
	
	 @GetMapping("/editStudentdetail/{id}")
	public String lodeEditForm(@PathVariable(value="id") Long id, Model m)
	{
		Studentdetail Stu=studentService.getById(id);
		
		System.out.println(Stu);
		m.addAttribute("studentdetail", Stu);
		m.addAttribute("title", "Edit Studentdetail");
		
		return "EditStudentdetail";
		
	}
	@PostMapping("/editStudentdetail/updateStudentdetail")
	public String updateStu(@ModelAttribute("updateStudentdetail") Studentdetail stu)
	{
		studentService.updateStu(stu);
		
		return "redirect:/StudentReport";
		
	}
	@GetMapping("/deleteStudentdetail/{id}")
	public String deleteStudentdetail(@PathVariable Long id)
	{
		studentService.deleteStudentdetail(id);
		
		
		return "redirect:/StudentReport";
	}
}
