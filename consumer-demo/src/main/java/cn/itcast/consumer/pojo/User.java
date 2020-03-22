package cn.itcast.consumer.pojo;

import lombok.Data;

import javax.persistence.Transient;
import java.util.Date;

@Data
public class User {

    private Long id;

    private String userName;

    private String password;

    private String name;

    private Integer age;

    private Integer sex;

    private Date brithday;

    private Date created;

    private Date updated;

    private String note;

    @Transient //非记录
    private String note2;
}
