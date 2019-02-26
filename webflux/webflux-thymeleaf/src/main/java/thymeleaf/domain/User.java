package thymeleaf.domain;

/**
 * @Author: xinput
 * @Date: 2019-02-22 14:54
 * @Versioin: 1.0.0
 * @Description:
 */
public class User {

    private String id;

    private String name;

    private String idCard;

    private String phone;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
