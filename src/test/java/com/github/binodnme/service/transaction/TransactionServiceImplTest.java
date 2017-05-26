package com.github.binodnme.service.transaction;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Binod Shrestha <binodshrestha@lftechnology.com> on 5/26/17.
 */
public class TransactionServiceImplTest {
    @Test
    public void getTransaction() throws Exception {
        TransactionService transactionService = new TransactionServiceImpl();

        System.out.println(transactionService.getTransaction());
    }

}