# RegulatoryRequirementsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listRegulatoryRequirements**](RegulatoryRequirementsApi.md#listRegulatoryRequirements) | **GET** /regulatory_requirements | Retrieve regulatory requirements
[**listRegulatoryRequirementsPhoneNumbers**](RegulatoryRequirementsApi.md#listRegulatoryRequirementsPhoneNumbers) | **GET** /phone_numbers_regulatory_requirements | Retrieve regulatory requirements for a list of phone numbers



## listRegulatoryRequirements

> ListRegulatoryRequirements200Response listRegulatoryRequirements(filterPhoneNumber, filterRequirementGroupId, filterCountryCode, filterPhoneNumberType, filterAction)

Retrieve regulatory requirements

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.RegulatoryRequirementsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        RegulatoryRequirementsApi apiInstance = new RegulatoryRequirementsApi(defaultClient);
        String filterPhoneNumber = "+41215470622"; // String | Phone number to check requirements for
        String filterRequirementGroupId = "d4c0b4a6-7bd2-40c5-a3b9-2acd99e212b2"; // String | ID of requirement group to check requirements for
        String filterCountryCode = "DE"; // String | Country code(iso2) to check requirements for
        String filterPhoneNumberType = "local"; // String | Phone number type to check requirements for
        String filterAction = "ordering"; // String | Action to check requirements for
        try {
            ListRegulatoryRequirements200Response result = apiInstance.listRegulatoryRequirements(filterPhoneNumber, filterRequirementGroupId, filterCountryCode, filterPhoneNumberType, filterAction);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegulatoryRequirementsApi#listRegulatoryRequirements");
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
 **filterPhoneNumber** | **String**| Phone number to check requirements for | [optional]
 **filterRequirementGroupId** | **String**| ID of requirement group to check requirements for | [optional]
 **filterCountryCode** | **String**| Country code(iso2) to check requirements for | [optional]
 **filterPhoneNumberType** | **String**| Phone number type to check requirements for | [optional] [enum: local, toll_free, mobile, national, shared_cost]
 **filterAction** | **String**| Action to check requirements for | [optional] [enum: ordering, porting, action]

### Return type

[**ListRegulatoryRequirements200Response**](ListRegulatoryRequirements200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An array of Regulatory Requirements Responses |  -  |
| **0** | Unexpected error |  -  |


## listRegulatoryRequirementsPhoneNumbers

> ListRegulatoryRequirementsPhoneNumbers200Response listRegulatoryRequirementsPhoneNumbers(filterPhoneNumber)

Retrieve regulatory requirements for a list of phone numbers

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.RegulatoryRequirementsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        RegulatoryRequirementsApi apiInstance = new RegulatoryRequirementsApi(defaultClient);
        String filterPhoneNumber = "+41215470622,+41215470633"; // String | Record type phone number/ phone numbers
        try {
            ListRegulatoryRequirementsPhoneNumbers200Response result = apiInstance.listRegulatoryRequirementsPhoneNumbers(filterPhoneNumber);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegulatoryRequirementsApi#listRegulatoryRequirementsPhoneNumbers");
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
 **filterPhoneNumber** | **String**| Record type phone number/ phone numbers |

### Return type

[**ListRegulatoryRequirementsPhoneNumbers200Response**](ListRegulatoryRequirementsPhoneNumbers200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An array of Regulatory Requirements Responses |  -  |
| **0** | Unexpected error |  -  |

