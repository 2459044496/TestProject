package test.jdbc;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;

/**
 * @Desc:TODO
 * @author: Cui Pai
 * @date 2020/2/3 16:02
 */
public class MybatisTest {

    static Logger logger = LoggerFactory.getLogger(MybatisTest.class);

    public static void main(String[] args) throws Exception{
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        try (SqlSession session = sqlSessionFactory.openSession()) {
            User user = (User) session.selectOne("org.mybatis.example.BlogMapper.selectBlog", 101);
            logger.info("user[]{}",user.toString());
        }
        finally {

        }
    }
}
