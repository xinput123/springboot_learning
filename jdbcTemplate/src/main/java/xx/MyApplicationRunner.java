package xx;

import com.xx.entity.UserBasic;
import com.xx.server.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

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
