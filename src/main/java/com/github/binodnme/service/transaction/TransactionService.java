package com.github.binodnme.service.transaction;

import com.github.binodnme.dto.demo1.UserResponse;
import com.github.binodnme.dto.demo2.CommonResponse;

/**
 * @author Binod Shrestha <binodshrestha@lftechnology.com> on 5/26/17.
 */
public interface TransactionService {

    CommonResponse getTransaction();

    UserResponse getTransactionByRole(String role);

}
