package com.clear.repository;

import com.clear.entity.SysUser;
import com.clear.mapper.SysUserMapper;
import com.clear.repository.impl.UserInfoRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * ClassName UserInfoRepositoryImpl
 *
 * @author qml
 * Date 2020/8/14 15:32
 * Version 1.0
 **/
@Repository
public class UserInfoRepositoryImpl implements UserInfoRepository {

    @Resource
    private SysUserMapper userMapper;

    @Override
    public List<SysUser> selectUserInfo(SysUser sysUser) {
        return userMapper.selectUserInfo(sysUser);
    }

    @Override
    public List<SysUser> selectUserInfoUserIds(List<String> userIds) {
        return userMapper.selectUserInfoUserIds(userIds);
    }
}