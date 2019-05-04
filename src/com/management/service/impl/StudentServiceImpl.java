
/**
*实现类
*/
package com.management.service.impl;

import java.util.List;

import com.management.dao.StudentDao;
import com.management.dao.impl.StudentDaoImpl;
import com.management.pojo.Student;
import com.management.service.StudentService;

public class StudentServiceImpl implements StudentService {

	StudentDao studentDao;
	//重写getAllStudent()方法，获取所有学生信息
	@Override
	public List<Student> getAllStudent() {
		//创建对象
		studentDao = new StudentDaoImpl();
		//调用studentDao中的getAllStudent()方法并把结果返回
		return studentDao.getAllStudent();
	}

	//根据学号查询学生信息
	@Override
	public Student getStudentById(long id) {

		studentDao = new StudentDaoImpl();
		return studentDao.getStudentById(id);
	}

	//根据学号编写学生信息
	@Override
	public int updateStudent(long id, Student student) {

		studentDao = new StudentDaoImpl();
		return studentDao.updateStudent(id, student);
	}

	//根据学号删除学生信息
	@Override
	public int deleteStudent(long id) {

		studentDao = new StudentDaoImpl();
		return studentDao.deleteStudent(id);
	}

	//插入学生信息
	@Override
	public int insertStudent(Student student) {

		studentDao = new StudentDaoImpl();
		return studentDao.insertStudent(student);
	}
}
