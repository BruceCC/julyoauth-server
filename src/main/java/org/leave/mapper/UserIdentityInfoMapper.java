package org.leave.mapper;


import org.leave.bean.UserIdentityInfoBean;

public interface UserIdentityInfoMapper {
    UserIdentityInfoBean getUserIdentityInfoByPK(String userId);

    UserIdentityInfoBean getUserIdentityInfoByMobile(String mobile);

    UserIdentityInfoBean getUserIdentityInfoByEmail(String email);

    UserIdentityInfoBean getUserIdentityInfoByUserName(String userName);
}
