package com.emobile.connect.service;

import com.emobile.connect.model.UserDetails;
import com.emobile.connect.repository.UserDetailRepository;
import com.emobile.connect.util.RequestStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserDetailServiceImpl implements UserDetailService {

    @Autowired
    private UserDetailRepository userDetailRepository;

    @Override
    public String createNewConnection(UserDetails userDetails) {
        userDetails.setRequestId(UUID.randomUUID().toString());
        userDetails.setRequestStatus(RequestStatus.IN_PROGRESS.name());
        UserDetails details = userDetailRepository.save(userDetails);
        return details.getRequestId();
    }
}
