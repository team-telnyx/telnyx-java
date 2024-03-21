# ReportsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBillingGroupReport**](ReportsApi.md#createBillingGroupReport) | **POST** /ledger_billing_group_reports | Create a ledger billing group report
[**getBillingGroupReport**](ReportsApi.md#getBillingGroupReport) | **GET** /ledger_billing_group_reports/{id} | Get a ledger billing group report



## createBillingGroupReport

> CreateBillingGroupReport200Response createBillingGroupReport(newLedgerBillingGroupReport)

Create a ledger billing group report

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ReportsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ReportsApi apiInstance = new ReportsApi(defaultClient);
        NewLedgerBillingGroupReport newLedgerBillingGroupReport = new NewLedgerBillingGroupReport(); // NewLedgerBillingGroupReport | New ledger billing group report parameters
        try {
            CreateBillingGroupReport200Response result = apiInstance.createBillingGroupReport(newLedgerBillingGroupReport);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#createBillingGroupReport");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **newLedgerBillingGroupReport** | [**NewLedgerBillingGroupReport**](NewLedgerBillingGroupReport.md)| New ledger billing group report parameters |

### Return type

[**CreateBillingGroupReport200Response**](CreateBillingGroupReport200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected ledger billing group report response to a valid request |  -  |
| **0** | Unexpected error |  -  |


## getBillingGroupReport

> CreateBillingGroupReport200Response getBillingGroupReport(id)

Get a ledger billing group report

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ReportsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ReportsApi apiInstance = new ReportsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The id of the ledger billing group report
        try {
            CreateBillingGroupReport200Response result = apiInstance.getBillingGroupReport(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#getBillingGroupReport");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| The id of the ledger billing group report |

### Return type

[**CreateBillingGroupReport200Response**](CreateBillingGroupReport200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected ledger billing group report response to a valid request |  -  |
| **0** | Unexpected error |  -  |

