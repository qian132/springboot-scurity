package com.qian.springboot.api.entity;

    import com.baomidou.mybatisplus.annotation.TableName;
    import com.baomidou.mybatisplus.annotation.IdType;
    import com.baomidou.mybatisplus.annotation.TableId;
    import java.io.Serializable;
    import lombok.Data;
    import lombok.EqualsAndHashCode;
    import lombok.experimental.Accessors;

/**
* <p>
    * 
    * </p>
*
* @author qian
* @since 2020-03-05
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    @TableName("sys_user_role")
    public class UserRole implements Serializable {

    private static final long serialVersionUID = 1L;

            @TableId(value = "user_id", type = IdType.AUTO)
    private Integer userId;

    private Integer roleId;


}
