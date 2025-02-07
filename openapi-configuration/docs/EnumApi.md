# EnumApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEnumEndpoint**](EnumApi.md#getEnumEndpoint) | **GET** /enum/{endpoint} | Get Enum



## getEnumEndpoint

> GetEnumEndpoint200Response getEnumEndpoint(endpoint)

Get Enum

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.EnumApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        EnumApi apiInstance = new EnumApi(defaultClient);
        String endpoint = "mno"; // String | 
        try {
            GetEnumEndpoint200Response result = apiInstance.getEnumEndpoint(endpoint);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EnumApi#getEnumEndpoint");
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
 **endpoint** | **String**|  | [enum: mno, optionalAttributes, usecase, vertical, altBusinessIdType, brandIdentityStatus, brandRelationship, campaignStatus, entityType, extVettingProvider, vettingStatus, brandStatus, operationStatus, approvedPublicCompany, stockExchange, vettingClass]

### Return type

[**GetEnumEndpoint200Response**](GetEnumEndpoint200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **404** | Resource not found |  -  |

