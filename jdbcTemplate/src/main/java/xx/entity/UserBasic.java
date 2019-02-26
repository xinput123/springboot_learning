package xx.entity;

import org.springframework.jdbc.core.RowMapper;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Author: xinput
 * @Date: 2019-01-25 17:15
 * @Versioin: 1.0.0
 * @Description:
 */
public class UserBasic implements RowMapper<UserBasic>, Serializable {

    private String id;

    private String hospitalId;

    private String hospitalName;

    private String userId;

    private String pid;

    private String name;

    private String gender;

    private String idCard;

    private String phone;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public UserBasic mapRow(ResultSet rs, int i) throws SQLException {
        UserBasic userBasic = new UserBasic();
        userBasic.setId(rs.getString("id"));
        userBasic.setHospitalId(rs.getString("hospital_id"));
        userBasic.setHospitalName(rs.getString("hospital_name"));
        userBasic.setUserId(rs.getString("user_id"));
        userBasic.setPid(rs.getString("pid"));
        userBasic.setName(rs.getString("name"));
        userBasic.setGender(rs.getString("gender"));
        userBasic.setIdCard(rs.getString("id_card"));
        userBasic.setPhone(rs.getString("phone"));

        return userBasic;
    }
}
