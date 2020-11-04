package com.pro.financial.user.converter;

import com.pro.financial.user.dao.entity.StudentEntity;
import com.pro.financial.user.dto.StudentDto;
import com.pro.financial.utils.Converter;

public class StudentEntity2Dto implements Converter<StudentEntity, StudentDto> {

    public static final StudentEntity2Dto instance = new StudentEntity2Dto();

    @Override
    public StudentDto convert(StudentEntity studentEntity) {
        StudentDto studentDto = new StudentDto();
        studentDto.setId(studentEntity.getId());
        studentDto.setStuNum(studentEntity.getStuNum());
        studentDto.setName(studentEntity.getName());
        studentDto.setAge(studentEntity.getAge());
        studentDto.setPwd(studentEntity.getPwd());
        return studentDto;
    }
}
