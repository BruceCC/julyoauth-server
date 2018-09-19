package org.leave.service;

import org.leave.bean.UserIdentityInfoBean;
import org.leave.mapper.UserIdentityInfoMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserIdentityInfoService {
    private final Logger logger = LoggerFactory.getLogger(UserIdentityInfoService.class);

    @Autowired
    private UserIdentityInfoMapper userIdentityInfoMapper;

    public UserIdentityInfoBean getUserIdentityInfoByUserName(String userName){
        UserIdentityInfoBean userIdentityInfoBean = null;
        try {
            userIdentityInfoBean =  userIdentityInfoMapper.getUserIdentityInfoByUserName(userName);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("Error (getUserIdentityInfoByUserName): userName->" + userName, e.getMessage());
        }
        return userIdentityInfoBean;
    }

   /* @Transactional
    public int addGeoFence(GeoFence geoFence) {
        String formatTime = TimeFunction.transTimeToFormatPerfect(System.currentTimeMillis());
        geoFence.setCreateTime(formatTime);
        geoFence.setUpdateTime(formatTime);
        int count = moonlightMapper.insertOne(geoFence);
        String a = null;
        a.indexOf('c');
        return count;
    }*/
}
