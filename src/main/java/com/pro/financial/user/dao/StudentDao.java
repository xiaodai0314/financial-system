package com.pro.financial.user.dao;

import com.pro.financial.user.dao.entity.StudentEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author ASUS
 */
@Repository
public interface StudentDao {

    StudentEntity getStudentById(@Param("id") int id);
}
