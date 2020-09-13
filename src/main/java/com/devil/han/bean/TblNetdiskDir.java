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
 * 网络硬盘_文件夹
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TblNetdiskDir implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 自动编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 文件夹名称
     */
    private String name;

    /**
     * 上级文件夹
     */
    private Integer parentDir;

    /**
     * 是否共享
     */
    private String isShare;

    /**
     * 创建用户编码
     */
    private String userId;

    /**
     * 创建日期
     */
    private LocalDateTime createDate;


}
