package org.example.Utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class MybatisUtils {

    private static SqlSessionFactory sqlSessionFactory = null;
    static {
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            sqlSessionFactory = builder.build(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static SqlSession getSession() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        return sqlSession;
    }
}
