package com.abacatepay.clients;

import com.abacatepay.model.billing.CreateBillingData;
import com.abacatepay.model.billing.CreateBillingResponse;
import com.abacatepay.model.billing.ListBillingResponse;
import com.abacatepay.model.customer.CreateCustomerResponse;
import com.abacatepay.model.customer.CustomerMetadata;
import feign.RequestLine;

public interface AbacatePayClient {

    @RequestLine("GET /billing/list")
    ListBillingResponse list();

    @RequestLine("POST /billing/create")
    CreateBillingResponse create(CreateBillingData body);

    @RequestLine("POST /customer/create")
    CreateCustomerResponse createCustomer(CustomerMetadata body);
}
