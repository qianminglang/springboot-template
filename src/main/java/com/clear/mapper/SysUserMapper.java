package com.clear.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.clear.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author mybatis-plus generator
 * @since 2020-08-31
 */
@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {

    /**
     * 查询用户信息
     * @author 3Clear1
     * @date 2020/8/13 14:56
     * @param sysUser
     * @return com.baomidou.mybatisplus.core.metadata.IPage<com.clear.navigator.dto.UserInfoDto>
     **/
    List<SysUser> selectUserInfo(@Param("item") SysUser sysUser);

    /**
     * 根据用户id查询用户信息
     * @author 3Clear1
     * @date 2020/8/13 14:56
     * @param userids
     * @return com.baomidou.mybatisplus.core.metadata.IPage<com.clear.navigator.dto.UserInfoDto>
     **/
    List<SysUser> selectUserInfoUserIds(@Param("items") List<String> userids);
}
