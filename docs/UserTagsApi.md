# UserTagsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUserTags**](UserTagsApi.md#getUserTags) | **GET** /user_tags | List User Tags



## getUserTags

> GetUserTags200Response getUserTags(filterStartsWith)

List User Tags

List all user tags.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.UserTagsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        UserTagsApi apiInstance = new UserTagsApi(defaultClient);
        String filterStartsWith = "my-tag"; // String | Filter tags by prefix
        try {
            GetUserTags200Response result = apiInstance.getUserTags(filterStartsWith);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserTagsApi#getUserTags");
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
 **filterStartsWith** | **String**| Filter tags by prefix | [optional]

### Return type

[**GetUserTags200Response**](GetUserTags200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of your tags |  -  |
| **401** | Unauthorized |  -  |

