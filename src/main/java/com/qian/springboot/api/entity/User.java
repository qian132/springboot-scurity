package com.qian.springboot.api.entity;

    import com.baomidou.mybatisplus.annotation.TableName;
    import com.baomidou.mybatisplus.annotation.IdType;
    import com.baomidou.mybatisplus.annotation.TableId;
    import java.time.LocalDateTime;
    import java.io.Serializable;
    import lombok.Data;
    import lombok.EqualsAndHashCode;
    import lombok.experimental.Accessors;

    import javax.validation.constraints.NotNull;

/**
* <p>
    * 系统用户表
    * </p>
*
* @author qian
* @since 2020-03-05
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    @TableName("sys_user")
    public class User implements Serializable {

    private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

            /**
            * 用户名
            */
            @NotNull(message = "用户名不能为空")
    private String name;

            /**
            * 密码
            */
    private String pwd;

            /**
            * 手机号
            */
    private String phone;

            /**
            * openId
            */
    private String openId;

            /**
            * 授权IP地址
            */
    private String authIp;

            /**
            * 创建日期
            */
    private LocalDateTime createTime;


}
