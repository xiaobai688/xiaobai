package com.ssm.entry;

public class SysUser {
         /*   `user_id` bigint(32) NOT NULL AUTO_INCREMENT COMMENT '用户id',
            `user_code` varchar(32) NOT NULL COMMENT '用户账号',
            `user_name` varchar(64) NOT NULL COMMENT '用户名称',
            `user_password` varchar(32) NOT NULL COMMENT '用户密码',
            `user_state` char(1) NOT NULL COMMENT '1:正常,0:暂停',*/
         private int id;
         private String user_code;
         private String user_name;
         private String user_password;
         private String user_state;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_code() {
        return user_code;
    }

    public void setUser_code(String user_code) {
        this.user_code = user_code;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_state() {
        return user_state;
    }

    public void setUser_state(String user_state) {
        this.user_state = user_state;
    }
}
