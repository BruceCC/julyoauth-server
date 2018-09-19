package org.leave.service;

import org.leave.bean.ClientDetailsBean;
import org.leave.mapper.ClientDetailsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;
import org.springframework.security.oauth2.provider.NoSuchClientException;
import org.springframework.stereotype.Service;

@Service
public class JulyClientDetailsService/* implements ClientDetailsService*/ {
   /* @Autowired
    private ClientDetailsMapper clientDetailsMapper;

    @Override
    public ClientDetails loadClientByClientId(String clientId) throws ClientRegistrationException {
        ClientDetailsBean clientDetailsBean = getByClientId(clientId);
        if (null == clientDetailsBean){
            throw new NoSuchClientException("No client with requested id: " + clientId);
        }
        return clientDetailsBean;
    }

    public ClientDetailsBean getByClientId(String clientId){
        return clientDetailsMapper.getByClientId(clientId);
    }*/
}
