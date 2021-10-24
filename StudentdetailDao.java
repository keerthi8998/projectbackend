package com.demo.dao;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import com.demo.student.Studentdetail;

@Component
public class StudentdetailDao {
	@Autowired
	HibernateTemplate hiberneteTemplate;
		//add employee
	@Transactional
	public void addStudentdetail(Studentdetail stu)
	{
		hiberneteTemplate.save(stu);
	}
	public List<Studentdetail> getAllStu()
	{
		return hiberneteTemplate.loadAll(Studentdetail.class);
	}
	@Transactional
	public Studentdetail getStuById(Long id)
	{
	Studentdetail stu= hiberneteTemplate.get(Studentdetail.class, id);
		return stu;
	}
	@Transactional
	public void updateStu(Studentdetail stu)
	{
		hiberneteTemplate.update(stu);
	}
	@Transactional
	public void deleteStu(Long id)
	{
		hiberneteTemplate.delete(hiberneteTemplate.load(Studentdetail.class, id));
	}
}
