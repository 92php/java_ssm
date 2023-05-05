package com.imooc.reader;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.imooc.reader.mapper.TestMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MyBatisPlusTest {
    @Resource
    private TestMapper testMapper;

    @Test
    public void testInsert(){
        com.imooc.reader.entity.Test test = new com.imooc.reader.entity.Test();
        test.setContent("测试MyBatisPlus");
        testMapper.insert(test);
    }

    @Test
    public void testUpdate(){
        com.imooc.reader.entity.Test test = testMapper.selectById(20);
        test.setContent("测试MyBatisPlus1");
        testMapper.updateById(test);
    }

    @Test
    public void testDelete(){
        testMapper.deleteById(20);
    }

    @Test
    public void testSelect(){
        QueryWrapper<com.imooc.reader.entity.Test> queryWrapper = new QueryWrapper<com.imooc.reader.entity.Test>();
        queryWrapper.eq("id",20);
        List<com.imooc.reader.entity.Test> list = testMapper.selectList(queryWrapper);
        System.out.println(list.get(0));
    }
}
