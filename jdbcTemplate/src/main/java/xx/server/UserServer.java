package xx.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import xx.entity.UserBasic;

import java.util.List;

/**
 * @Author: xinput
 * @Date: 2019-01-25 17:16
 * @Versioin: 1.0.0
 * @Description:
 */
@Service
public class UserServer {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<UserBasic> queryUserBasic() {
        String sql = "SELECT * FROM t_user_basic WHERE regist_flag=1 AND record_state=0";
        return jdbcTemplate.query(sql, new UserBasic());
    }
}
