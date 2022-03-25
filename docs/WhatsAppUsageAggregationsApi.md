# WhatsAppUsageAggregationsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUsageAggregationsSync**](WhatsAppUsageAggregationsApi.md#getUsageAggregationsSync) | **GET** /whatsapp_usage_aggregations | 



## getUsageAggregationsSync

> WhatsAppUsageAggregationsResponseContainer getUsageAggregationsSync(startDate, endDate)



Generate and fetch WhatsApp usage aggregations synchronously. This endpoint will both generate and fetch the WhatsApp aggregations over a specified time period. 

### Example

```java
import java.time.OffsetDateTime;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.WhatsAppUsageAggregationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        WhatsAppUsageAggregationsApi apiInstance = new WhatsAppUsageAggregationsApi(defaultClient);
        OffsetDateTime startDate = OffsetDateTime.parse("2020-07-01T00:00-06:00"); // OffsetDateTime | 
        OffsetDateTime endDate = OffsetDateTime.parse("2020-07-01T00:00-06:00"); // OffsetDateTime | 
        try {
            WhatsAppUsageAggregationsResponseContainer result = apiInstance.getUsageAggregationsSync(startDate, endDate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WhatsAppUsageAggregationsApi#getUsageAggregationsSync");
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
 **startDate** | **OffsetDateTime**|  | [optional]
 **endDate** | **OffsetDateTime**|  | [optional]

### Return type

[**WhatsAppUsageAggregationsResponseContainer**](WhatsAppUsageAggregationsResponseContainer.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful |  -  |

