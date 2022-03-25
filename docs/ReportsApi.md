# ReportsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createLedgerBillingGroupReport**](ReportsApi.md#createLedgerBillingGroupReport) | **POST** /ledger_billing_group_reports | Create a ledger billing group report
[**retrieveLedgerBillingGroupReport**](ReportsApi.md#retrieveLedgerBillingGroupReport) | **GET** /ledger_billing_group_reports/{id} | Retrieve a ledger billing group report



## createLedgerBillingGroupReport

> CreateLedgerBillingGroupReportResponse createLedgerBillingGroupReport(newLedgerBillingGroupReport)

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
            CreateLedgerBillingGroupReportResponse result = apiInstance.createLedgerBillingGroupReport(newLedgerBillingGroupReport);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#createLedgerBillingGroupReport");
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

[**CreateLedgerBillingGroupReportResponse**](CreateLedgerBillingGroupReportResponse.md)

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


## retrieveLedgerBillingGroupReport

> RetrieveLedgerBillingGroupReportResponse retrieveLedgerBillingGroupReport(id)

Retrieve a ledger billing group report

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
            RetrieveLedgerBillingGroupReportResponse result = apiInstance.retrieveLedgerBillingGroupReport(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#retrieveLedgerBillingGroupReport");
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

[**RetrieveLedgerBillingGroupReportResponse**](RetrieveLedgerBillingGroupReportResponse.md)

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

