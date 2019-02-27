package xx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import xx.entity.UserBasic;
import xx.server.UserServer;

import java.util.List;

@Component
public class MyApplicationRunner implements ApplicationRunner {

    @Autowired
    private UserServer userServer;

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        List<UserBasic> userBasics = userServer.queryUserBasic();
        System.out.println("数量：" + userBasics.size());
    }
}
