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
 * 楼盘经费支出项目
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class WyEstateOutProject implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 项目id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 项目名称
     */
    private String projectName;

    /**
     * 上级支出项目id
     */
    private Integer parentOutProjectId;

    /**
     * 所属主项目
     */
    private String belongMainProjecct;

    /**
     * 说明
     */
    private String desc;

    /**
     * 建档人
     */
    private String createPerson;

    /**
     * 建档时间
     */
    private LocalDateTime createDate;

    /**
     * 修改人
     */
    private String updatePerson;

    /**
     * 修改时间
     */
    private LocalDateTime updateDate;


}
