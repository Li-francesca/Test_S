
/**
*ʵ����
*/
package com.management.service.impl;

import java.util.List;

import com.management.dao.StudentDao;
import com.management.dao.impl.StudentDaoImpl;
import com.management.pojo.Student;
import com.management.service.StudentService;

public class StudentServiceImpl implements StudentService {

	StudentDao studentDao;
	//��дgetAllStudent()��������ȡ����ѧ����Ϣ
	@Override
	public List<Student> getAllStudent() {
		//��������
		studentDao = new StudentDaoImpl();
		//����studentDao�е�getAllStudent()�������ѽ������
		return studentDao.getAllStudent();
	}

	//����ѧ�Ų�ѯѧ����Ϣ
	@Override
	public Student getStudentById(long id) {

		studentDao = new StudentDaoImpl();
		return studentDao.getStudentById(id);
	}

	//����ѧ�ű�дѧ����Ϣ
	@Override
	public int updateStudent(long id, Student student) {

		studentDao = new StudentDaoImpl();
		return studentDao.updateStudent(id, student);
	}

	//����ѧ��ɾ��ѧ����Ϣ
	@Override
	public int deleteStudent(long id) {

		studentDao = new StudentDaoImpl();
		return studentDao.deleteStudent(id);
	}

	//����ѧ����Ϣ
	@Override
	public int insertStudent(Student student) {

		studentDao = new StudentDaoImpl();
		return studentDao.insertStudent(student);
	}
}
