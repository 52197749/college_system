package com.college.common.service;

import com.college.common.entity.College;

import java.util.List;

/**
 * Created by DELL on 2020/7/9.
 */
public interface CollegeService {
    public List<College> getList();


    public boolean addCollege(College college);

}
