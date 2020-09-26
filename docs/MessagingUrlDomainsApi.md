# MessagingUrlDomainsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listMessagingUrlDomains**](MessagingUrlDomainsApi.md#listMessagingUrlDomains) | **GET** /messaging_url_domains | List messaging URL domains

<a name="listMessagingUrlDomains"></a>
# **listMessagingUrlDomains**
> ListMessagingProfileUrlDomainsResponse listMessagingUrlDomains()

List messaging URL domains

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.MessagingUrlDomainsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MessagingUrlDomainsApi apiInstance = new MessagingUrlDomainsApi();
try {
    ListMessagingProfileUrlDomainsResponse result = apiInstance.listMessagingUrlDomains();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingUrlDomainsApi#listMessagingUrlDomains");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListMessagingProfileUrlDomainsResponse**](ListMessagingProfileUrlDomainsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

