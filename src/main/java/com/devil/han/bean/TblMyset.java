package com.devil.han.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 个人设置
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TblMyset implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 自动编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户编码
     */
    private String username;

    /**
     * 是否需要提醒
     */
    private String idRemain;

    /**
     * 提醒间隔时间
     */
    private String remainInterval;

    /**
     * 弹出提醒窗口
     */
    private String remainWindowOpen;

    /**
     * 消息提醒
     */
    private String messageRemain;

    /**
     * 默认主页面
     */
    private String defaultMain;

    /**
     * 邮箱全称
     */
    private String emailAll;

    /**
     * smtp地址
     */
    private String smtpAddr;

    /**
     * 登录用户
     */
    private String loginUser;

    /**
     * 登录密码
     */
    private String loginPwd;

    /**
     * 邮件端口
     */
    private String mailPort;

    /**
     * 发送人名称
     */
    private String sendPerson;

    /**
     * 分页行数
     */
    private Integer pageCount;


}
