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
 * 网络硬盘路径
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TblNetdiskUrl implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 自动编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 文件夹id
     */
    private Integer dirId;

    /**
     * 文件原名称
     */
    private String fileName;

    /**
     * 新名称
     */
    private String newName;

    /**
     * 文件类型
     */
    private String fileType;

    /**
     * 文档大小
     */
    private Integer fileSize;

    /**
     * 上传时间
     */
    private LocalDateTime createDate;


}
