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
 * 数据库备份
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TblDbbackup implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 自动编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 备份数据库名
     */
    private String dbName;

    /**
     * 备份路径
     */
    private String dbUrl;

    /**
     * 操作人id
     */
    private String operateId;

    /**
     * 操作人姓名
     */
    private String operatePerson;

    /**
     * 操作时间
     */
    private LocalDateTime operateDate;


}
