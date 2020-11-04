package com.pro.financial.user.biz;

import com.pro.financial.user.converter.StudentEntity2Dto;
import com.pro.financial.user.dao.StudentDao;
import com.pro.financial.user.dao.entity.StudentEntity;
import com.pro.financial.user.dto.StudentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentBiz {

    @Autowired
    private StudentDao studentDao;

    public StudentDto getStudent(int id) {
        StudentEntity studentEntity = studentDao.getStudentById(id);
        return StudentEntity2Dto.instance.convert(studentEntity);
    }

}
