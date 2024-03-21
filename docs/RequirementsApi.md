# RequirementsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listRequirements**](RequirementsApi.md#listRequirements) | **GET** /requirements | List all requirements
[**retrieveDocumentRequirements**](RequirementsApi.md#retrieveDocumentRequirements) | **GET** /requirements/{id} | Retrieve a document requirement



## listRequirements

> ListRequirements200Response listRequirements(filterCountryCode, filterPhoneNumberType, filterAction, sort, pageNumber, pageSize)

List all requirements

List all requirements with filtering, sorting, and pagination

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.RequirementsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        RequirementsApi apiInstance = new RequirementsApi(defaultClient);
        String filterCountryCode = "US"; // String | Filters results to those applying to a 2-character (ISO 3166-1 alpha-2) country code
        String filterPhoneNumberType = "local"; // String | Filters results to those applying to a specific `phone_number_type`
        String filterAction = "ordering"; // String | Filters requirements to those applying to a specific action.
        String sort = "action"; // String | Specifies the sort order for results. If you want to sort by a field in ascending order, include it as a sort parameter. If you want to sort in descending order, prepend a `-` in front of the field name.
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        try {
            ListRequirements200Response result = apiInstance.listRequirements(filterCountryCode, filterPhoneNumberType, filterAction, sort, pageNumber, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RequirementsApi#listRequirements");
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
 **filterCountryCode** | **String**| Filters results to those applying to a 2-character (ISO 3166-1 alpha-2) country code | [optional]
 **filterPhoneNumberType** | **String**| Filters results to those applying to a specific &#x60;phone_number_type&#x60; | [optional] [enum: local, national, toll-free]
 **filterAction** | **String**| Filters requirements to those applying to a specific action. | [optional] [enum: ordering, porting]
 **sort** | **String**| Specifies the sort order for results. If you want to sort by a field in ascending order, include it as a sort parameter. If you want to sort in descending order, prepend a &#x60;-&#x60; in front of the field name. | [optional] [enum: action, country_code, locality, phone_number_type]
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]

### Return type

[**ListRequirements200Response**](ListRequirements200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **0** | Unexpected error |  -  |


## retrieveDocumentRequirements

> RetrieveDocumentRequirements200Response retrieveDocumentRequirements(id)

Retrieve a document requirement

Retrieve a document requirement record

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.RequirementsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        RequirementsApi apiInstance = new RequirementsApi(defaultClient);
        UUID id = UUID.fromString("a9dad8d5-fdbd-49d7-aa23-39bb08a5ebaa"); // UUID | Uniquely identifies the requirement_type record
        try {
            RetrieveDocumentRequirements200Response result = apiInstance.retrieveDocumentRequirements(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RequirementsApi#retrieveDocumentRequirements");
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

[**RetrieveDocumentRequirements200Response**](RetrieveDocumentRequirements200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **0** | Unexpected error |  -  |

