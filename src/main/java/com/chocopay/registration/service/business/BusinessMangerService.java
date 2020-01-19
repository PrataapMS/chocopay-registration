package com.chocopay.registration.service.business;

import com.chocopay.registration.base.entity.Business;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class BusinessMangerService {

    private final BusinessManager businessManager;

    @Autowired
    public BusinessMangerService(BusinessManager businessManager) {
        this.businessManager = businessManager;
    }

    public Business saveBusiness(Business business) {
        return businessManager.save(business);
    }

    public Business getBusiness(Long businessId) {
        return businessManager.getBusiness(businessId);
    }

    public Boolean removeBusiness(Long businessId) {
        businessManager.removeBusiness(businessId);
        return true;
    }

    public List<Business> getAllBusiness() {
        return businessManager.getAllBusiness();
    }
}
