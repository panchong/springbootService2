package mybatis.mediator;

import java.util.List;

public interface SqlSession {
    <T> T selectOne(String var1);

    <E> List<E> selectList(String var1);

    void close();
}
