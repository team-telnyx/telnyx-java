# InboundChannelsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listOutboundChannels**](InboundChannelsApi.md#listOutboundChannels) | **GET** /phone_numbers/inbound_channels | Retrieve your inbound channels
[**updateOutboundChannels**](InboundChannelsApi.md#updateOutboundChannels) | **PATCH** /phone_numbers/inbound_channels | Update inbound channels



## listOutboundChannels

> ListOutboundChannels200Response listOutboundChannels()

Retrieve your inbound channels

Returns the inbound channels for your account. Inbound channels allows you to use Channel Billing for calls to your Telnyx phone numbers. Please check the Telnyx Support Articles section for full information and examples of how to utilize Channel Billing.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.InboundChannelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        InboundChannelsApi apiInstance = new InboundChannelsApi(defaultClient);
        try {
            ListOutboundChannels200Response result = apiInstance.listOutboundChannels();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InboundChannelsApi#listOutboundChannels");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ListOutboundChannels200Response**](ListOutboundChannels200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Inbound Channels Response |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **422** | Unprocessable entity. Check message field in response for details. |  -  |


## updateOutboundChannels

> UpdateOutboundChannels200Response updateOutboundChannels(updateOutboundChannelsRequest)

Update inbound channels

Update the inbound channels for the account

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.InboundChannelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        InboundChannelsApi apiInstance = new InboundChannelsApi(defaultClient);
        UpdateOutboundChannelsRequest updateOutboundChannelsRequest = new UpdateOutboundChannelsRequest(); // UpdateOutboundChannelsRequest | Inbound channels update
        try {
            UpdateOutboundChannels200Response result = apiInstance.updateOutboundChannels(updateOutboundChannelsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InboundChannelsApi#updateOutboundChannels");
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
 **updateOutboundChannelsRequest** | [**UpdateOutboundChannelsRequest**](UpdateOutboundChannelsRequest.md)| Inbound channels update |

### Return type

[**UpdateOutboundChannels200Response**](UpdateOutboundChannels200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected Update response |  -  |
| **0** | Unexpected error |  -  |

