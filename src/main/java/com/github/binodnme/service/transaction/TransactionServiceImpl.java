package com.github.binodnme.service.transaction;

import com.github.binodnme.dto.demo1.UserResponse;
import com.github.binodnme.dto.demo2.CommonResponse;
import com.github.binodnme.util.ObjectUtil;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;

/**
 * @author Binod Shrestha <binodshrestha@lftechnology.com> on 5/26/17.
 */
public class TransactionServiceImpl implements TransactionService {
    @Override
    public CommonResponse getTransaction() {
        return new CommonResponse();
    }

    @Override
    public UserResponse getTransactionByRole(String role) {
        Class roleType = ObjectUtil.getTypeByRole(UserResponse.class, role);
        return buildResponse(roleType, new Transaction());
    }

    private UserResponse buildResponse(Class roleType, Transaction transaction) {
        try {
            Object object = roleType.newInstance();
            BeanUtils.copyProperties(object, transaction);
            return (UserResponse) object;
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
            return null;
        }
    }

}
