package com.devil.han.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 数据库设置
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TblDbSetting implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 连接地址
     */
    @TableField("db_Url")
    private String dbUrl;

    /**
     * 用户名
     */
    private String dbUsername;

    /**
     * 密码
     */
    private String dbPwd;

    /**
     * 数据库名
     */
    private String dbLibName;

    /**
     * 存放路径
     */
    private String savePath;

    /**
     * 存放名称
     */
    private String saveName;


}
