package com.zc.tower.biz.servers.handle;

import com.zc.tower.TestBase;
import com.zc.tower.model.dao.ServersDAO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestBase.class)
public class ServersRepositoryTest {

    @Autowired
    ServersRepository serversRepository;

    @Test
    public void test(){
        List<ServersDAO> list = serversRepository.findAll();
        Assert.assertNotNull("查询结果非空",list);
    }
}