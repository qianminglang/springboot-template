package com.clear.param.input;

import com.clear.param.AbstractPageQueryRequest;
import com.clear.util.ParamUtil;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName UserInfoParam
 *
 * @author qml
 * Date 2020/8/13 13:25
 * Version 1.0
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel
public class UserInfoParam extends AbstractPageQueryRequest {

    @ApiModelProperty(value = "用户名")
    private String username;

    @ApiModelProperty(value = "密码")
    private String password;

    @Override
    public void checkInput() {
        super.checkInput();
        ParamUtil.notBlank(username,"用户名称不能为空");
    }
}