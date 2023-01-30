package com.example.mall;

import com.example.mall.mbg.mapper.UserMapper;
import com.example.mall.mbg.model.User;
import com.example.mall.mbg.model.UserExample;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.InputStream;
import java.util.List;

@SpringBootTest
class MallApplicationTests {


        public static void main(String[] args) throws Exception {
            //1、读取配置文件
            InputStream in = Resources.getResourceAsStream("Mybatis-config.xml");
            //2、创建 SqlSessionFactoryBuilder 的构建者对象
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            //3、使用构建者模式创建工厂对象 SqlSessionFactory
            SqlSessionFactory factory = builder.build(in);
            //4、使用SqlSessionFactory 生产 SqlSession
            SqlSession session = factory.openSession();
            //5、使用SqlSession 创建 dao接口的代理对象
            UserMapper mapper = session.getMapper(UserMapper.class);
            //6、使用代理对象执行查询所有的方法
            List<User> all = mapper.selectAll();
            for (User user : all) {
                System.out.println(user);
            }
            //7、释放资源
            session.close();
            in.close();
        }
}
