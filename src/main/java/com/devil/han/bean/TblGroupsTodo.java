package com.devil.han.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 分组待办事项
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TblGroupsTodo implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 分组id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 待办事项id
     */
    private String todoId;


}
