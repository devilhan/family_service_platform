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
 * 投票项目表
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TblVoteProject1 implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 项目编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 项目名称
     */
    private String projectName;

    /**
     * 项目类型
     */
    private String projectType;

    /**
     * 项目标志
     */
    private String projectTag;

    /**
     * 项目说明
     */
    private String projectDesc;

    /**
     * 建档人
     */
    private String inputRecordPerson;

    /**
     * 建档时间
     */
    private LocalDateTime inputRecordDate;


}
