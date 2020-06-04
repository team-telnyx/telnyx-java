# MessagingUrlDomainsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllMessagingUrlDomains**](MessagingUrlDomainsApi.md#getAllMessagingUrlDomains) | **GET** /messaging_url_domains | List all available messaging URL domains

<a name="getAllMessagingUrlDomains"></a>
# **getAllMessagingUrlDomains**
> ListMessagingProfileURLDomainsResponse getAllMessagingUrlDomains()

List all available messaging URL domains

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MessagingUrlDomainsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MessagingUrlDomainsApi apiInstance = new MessagingUrlDomainsApi();
try {
    ListMessagingProfileURLDomainsResponse result = apiInstance.getAllMessagingUrlDomains();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingUrlDomainsApi#getAllMessagingUrlDomains");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListMessagingProfileURLDomainsResponse**](ListMessagingProfileURLDomainsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

