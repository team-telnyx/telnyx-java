# RequirementTypesApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listRequirementTypes**](RequirementTypesApi.md#listRequirementTypes) | **GET** /requirement_types | List all requirement types
[**retrieveRequirementType**](RequirementTypesApi.md#retrieveRequirementType) | **GET** /requirement_types/{id} | Retrieve a requirement type



## listRequirementTypes

> ListRequirementTypes200Response listRequirementTypes(filterNameContains, sort)

List all requirement types

List all requirement types ordered by created_at descending

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.RequirementTypesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        RequirementTypesApi apiInstance = new RequirementTypesApi(defaultClient);
        String filterNameContains = "utility bill"; // String | Filters requirement types to those whose name contains a certain string.
        String sort = "created_at"; // String | Specifies the sort order for results. If you want to sort by a field in ascending order, include it as a sort parameter. If you want to sort in descending order, prepend a `-` in front of the field name.
        try {
            ListRequirementTypes200Response result = apiInstance.listRequirementTypes(filterNameContains, sort);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RequirementTypesApi#listRequirementTypes");
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
 **filterNameContains** | **String**| Filters requirement types to those whose name contains a certain string. | [optional]
 **sort** | **String**| Specifies the sort order for results. If you want to sort by a field in ascending order, include it as a sort parameter. If you want to sort in descending order, prepend a &#x60;-&#x60; in front of the field name. | [optional] [enum: created_at, name, updated_at]

### Return type

[**ListRequirementTypes200Response**](ListRequirementTypes200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **500** | Unexpected error |  -  |


## retrieveRequirementType

> RetrieveRequirementType200Response retrieveRequirementType(id)

Retrieve a requirement type

Retrieve a requirement type by id

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.RequirementTypesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        RequirementTypesApi apiInstance = new RequirementTypesApi(defaultClient);
        UUID id = UUID.fromString("a38c217a-8019-48f8-bff6-0fdd9939075b"); // UUID | Uniquely identifies the requirement_type record
        try {
            RetrieveRequirementType200Response result = apiInstance.retrieveRequirementType(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RequirementTypesApi#retrieveRequirementType");
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
 **id** | **UUID**| Uniquely identifies the requirement_type record |

### Return type

[**RetrieveRequirementType200Response**](RetrieveRequirementType200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **500** | Unexpected error |  -  |

