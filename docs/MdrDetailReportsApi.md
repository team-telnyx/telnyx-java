# MdrDetailReportsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPaginatedMdrs**](MdrDetailReportsApi.md#getPaginatedMdrs) | **GET** /reports/mdrs | Fetch all Mdr records



## getPaginatedMdrs

> MdrGetDetailResponse getPaginatedMdrs(startDate, endDate, id, direction, profile, cld, cli, status, messageType)

Fetch all Mdr records

Fetch all Mdr records 

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.MdrDetailReportsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MdrDetailReportsApi apiInstance = new MdrDetailReportsApi(defaultClient);
        String startDate = "startDate_example"; // String | Pagination start date
        String endDate = "endDate_example"; // String | Pagination end date
        String id = "e093fbe0-5bde-11eb-ae93-0242ac130002"; // String | 
        String direction = "INBOUND"; // String | 
        String profile = "My profile"; // String | 
        String cld = "+15551237654"; // String | 
        String cli = "+15551237654"; // String | 
        String status = "GW_TIMEOUT"; // String | 
        String messageType = "SMS"; // String | 
        try {
            MdrGetDetailResponse result = apiInstance.getPaginatedMdrs(startDate, endDate, id, direction, profile, cld, cli, status, messageType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MdrDetailReportsApi#getPaginatedMdrs");
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
 **startDate** | **String**| Pagination start date | [optional]
 **endDate** | **String**| Pagination end date | [optional]
 **id** | **String**|  | [optional]
 **direction** | **String**|  | [optional] [enum: INBOUND, OUTBOUND]
 **profile** | **String**|  | [optional]
 **cld** | **String**|  | [optional]
 **cli** | **String**|  | [optional]
 **status** | **String**|  | [optional] [enum: GW_TIMEOUT, DELIVERED, DLR_UNCONFIRMED, DLR_TIMEOUT, RECEIVED, GW_REJECT, FAILED]
 **messageType** | **String**|  | [optional] [enum: SMS, MMS]

### Return type

[**MdrGetDetailResponse**](MdrGetDetailResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful |  -  |

