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
 * 视频点播
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TblVod implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 视频编码
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 视频名称
     */
    private String videoName;

    /**
     * 来源
     */
    private String videoSource;

    /**
     * 视频类型
     */
    private Long videlType;

    /**
     * 节目名称
     */
    private String programName;

    /**
     * 节目路径
     */
    private String programUrl;

    /**
     * 简介
     */
    private String simpleIntro;

    /**
     * 是否在首页显示
     */
    private String isFirst;

    /**
     * 创建人
     */
    private String createPerson;

    /**
     * 创建时间
     */
    private LocalDateTime createDate;


}
