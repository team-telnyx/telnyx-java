# CdrUsageReportsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUsageReportSync**](CdrUsageReportsApi.md#getUsageReportSync) | **GET** /reports/cdr_usage_reports/sync | 



## getUsageReportSync

> CdrGetSyncUsageReportResponse getUsageReportSync(aggregationType, productBreakdown, startDate, endDate, connections)



Generate and fetch voice usage report synchronously. This endpoint will both generate and fetch the voice report over a specified time period. No polling is necessary but the response may take up to a couple of minutes. 

### Example

```java
import java.time.OffsetDateTime;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CdrUsageReportsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CdrUsageReportsApi apiInstance = new CdrUsageReportsApi(defaultClient);
        String aggregationType = "NO_AGGREGATION"; // String | 
        String productBreakdown = "NO_BREAKDOWN"; // String | 
        OffsetDateTime startDate = OffsetDateTime.parse("2020-07-01T00:00-06:00"); // OffsetDateTime | 
        OffsetDateTime endDate = OffsetDateTime.parse("2020-07-01T00:00-06:00"); // OffsetDateTime | 
        List<BigDecimal> connections = Arrays.asList(); // List<BigDecimal> | 
        try {
            CdrGetSyncUsageReportResponse result = apiInstance.getUsageReportSync(aggregationType, productBreakdown, startDate, endDate, connections);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CdrUsageReportsApi#getUsageReportSync");
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
 **aggregationType** | **String**|  | [enum: NO_AGGREGATION, CONNECTION, TAG, BILLING_GROUP]
 **productBreakdown** | **String**|  | [enum: NO_BREAKDOWN, DID_VS_TOLL_FREE, COUNTRY, DID_VS_TOLL_FREE_PER_COUNTRY]
 **startDate** | **OffsetDateTime**|  | [optional]
 **endDate** | **OffsetDateTime**|  | [optional]
 **connections** | **List&lt;BigDecimal&gt;**|  | [optional]

### Return type

[**CdrGetSyncUsageReportResponse**](CdrGetSyncUsageReportResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful |  -  |

