package com.devil.han.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 登录日志
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TblLoginLog implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 登录人员编码
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 登录日期
     */
    private LocalDateTime loginDate;

    /**
     * 登录的ip地址
     */
    private String loginIp;

    /**
     * 登录状态
     */
    private String loginStatus;

    /**
     * 进入模块名称
     */
    private Long openMk;

    /**
     * 登录机器名
     */
    private String loginMechineName;

    /**
     * 端口号
     */
    private String loginPort;

    /**
     * 登录入口
     */
    private String loginDoor;


}
