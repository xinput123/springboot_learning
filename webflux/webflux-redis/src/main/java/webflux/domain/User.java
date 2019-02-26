package webflux.domain;

import org.springframework.data.annotation.Id;

import java.io.Serializable;

/**
 * @Author: xinput
 * @Date: 2019-02-22 14:54
 * @Versioin: 1.0.0
 * @Description: 存储到Reids，必须要实现序列化。如果没实现 Serializable，
 * 会引出异常：java.lang.IllegalArgumentException:
 * DefaultSerializer requires a Serializable payload but received an object of type。
 */
public class User implements Serializable {

    private static final long serialVersionUID = 1632564666814297829L;

    /**
     * @Id 注解标记对应库表的主键或唯一标识符
     */
    @Id
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
