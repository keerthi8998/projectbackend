package com.demo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.demo.dao.StudentdetailDao;
import com.demo.student.Studentdetail;
@Component
@Service
public class StudentService {
	@Autowired
	StudentdetailDao studentdetailDao;
		public void addStu(Studentdetail stu)
		{
			studentdetailDao.addStudentdetail(stu);
		}
		
		public List<Studentdetail> getAllStu()
		{
			return studentdetailDao.getAllStu();
		}
		
		public Studentdetail getById(Long id)
		{
			return studentdetailDao.getStuById(id);
		}
	
		public void updateStu(Studentdetail stu)
		{
			studentdetailDao.updateStu(stu);
		}
		

		public void deleteStudentdetail(Long id) {
			studentdetailDao.deleteStuById(id);
			
		}
}
