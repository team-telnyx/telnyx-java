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
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.MessagingUrlDomainsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.telnyx.com/v2");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    MessagingUrlDomainsApi apiInstance = new MessagingUrlDomainsApi(defaultClient);
    try {
      ListMessagingProfileUrlDomainsResponse result = apiInstance.listMessagingUrlDomains();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagingUrlDomainsApi#listMessagingUrlDomains");
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

[**ListMessagingProfileUrlDomainsResponse**](ListMessagingProfileUrlDomainsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response with details about a messaging URL domain. |  -  |
**0** | Unexpected error |  -  |

