package com.github.binodnme.rs;

import com.github.binodnme.service.transaction.TransactionService;
import com.github.binodnme.util.ResponseUtil;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author Binod Shrestha <binodshrestha@lfetchnology.com> on 11/10/2016.
 */
@Path("/")
public class HelloRs {

    @Inject
    TransactionService transactionService;

    @Path("transaction")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getTransaction(@QueryParam("role") String role) {
        return Response.ok().entity(transactionService.getTransactionByRole(role)).build();
    }

    @Path("transaction-role")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getTransactionNew(@QueryParam("role") String role) {
        return Response.ok().entity(ResponseUtil.filterFieldByRole(transactionService.getTransaction(), role)).build();
    }
}