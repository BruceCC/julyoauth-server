package org.leave.mapper;

import org.leave.bean.ClientDetailsBean;

public interface ClientDetailsMapper {
    ClientDetailsBean getByClientId(String clientId);
}
