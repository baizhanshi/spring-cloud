package com.bai.Test;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by baizhanshi on 2018/3/23.
 */
public class user {
    @NotNull(message = "id不能为空")
    private Long id;
    private String userName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
