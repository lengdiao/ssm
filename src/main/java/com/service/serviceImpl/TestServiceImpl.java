package com.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dao.TestDao;
import com.service.TestService;

/**
 * Created by infodba on 2018/5/23.
 */

@Service("testService")
public class TestServiceImpl implements TestService {


    @Autowired(required = false)
    private TestDao testDao;

    public String testAction() {

        String i = testDao.selectCount();

        return i;
    }
}

