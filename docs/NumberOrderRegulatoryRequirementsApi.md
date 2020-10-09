# NumberOrderRegulatoryRequirementsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listNumberOrderRegulatoryRequirements**](NumberOrderRegulatoryRequirementsApi.md#listNumberOrderRegulatoryRequirements) | **GET** /regulatory_requirements | List number order regulatory requirements
[**listPhoneNumberRegulatoryRequirements**](NumberOrderRegulatoryRequirementsApi.md#listPhoneNumberRegulatoryRequirements) | **GET** /phone_number_regulatory_requirements | List regulatory requirements per number
[**retrieveNumberOrderRegulatoryRequirement**](NumberOrderRegulatoryRequirementsApi.md#retrieveNumberOrderRegulatoryRequirement) | **GET** /regulatory_requirements/{requirement_id} | Retrieve a number order regulatory requirement


<a name="listNumberOrderRegulatoryRequirements"></a>
# **listNumberOrderRegulatoryRequirements**
> ListNumberOrderRegulatoryRequirementsResponse listNumberOrderRegulatoryRequirements(filterRequirementId, filterFieldType, filterRequirementType)

List number order regulatory requirements

Gets a paginated list of number order regulatory requirements.

### Example
```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.NumberOrderRegulatoryRequirementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.telnyx.com/v2");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    NumberOrderRegulatoryRequirementsApi apiInstance = new NumberOrderRegulatoryRequirementsApi(defaultClient);
    String filterRequirementId = "filterRequirementId_example"; // String | Filter number order regulatory requirements by `requirement_id`.
    String filterFieldType = "filterFieldType_example"; // String | Filter number order regulatory requirements by `field_type`.
    String filterRequirementType = "filterRequirementType_example"; // String | Filter number order regulatory requirements by `requirement_type`.
    try {
      ListNumberOrderRegulatoryRequirementsResponse result = apiInstance.listNumberOrderRegulatoryRequirements(filterRequirementId, filterFieldType, filterRequirementType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NumberOrderRegulatoryRequirementsApi#listNumberOrderRegulatoryRequirements");
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
 **filterRequirementId** | **String**| Filter number order regulatory requirements by &#x60;requirement_id&#x60;. | [optional]
 **filterFieldType** | **String**| Filter number order regulatory requirements by &#x60;field_type&#x60;. | [optional]
 **filterRequirementType** | **String**| Filter number order regulatory requirements by &#x60;requirement_type&#x60;. | [optional]

### Return type

[**ListNumberOrderRegulatoryRequirementsResponse**](ListNumberOrderRegulatoryRequirementsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response with a list of number order regulatory requirements. |  -  |
**0** | Unexpected error |  -  |

<a name="listPhoneNumberRegulatoryRequirements"></a>
# **listPhoneNumberRegulatoryRequirements**
> ListPhoneNumberRegulatoryRequirementsResponse listPhoneNumberRegulatoryRequirements(filterPhoneNumber)

List regulatory requirements per number

Gets a paginated list of phone number regulatory requirements.

### Example
```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.NumberOrderRegulatoryRequirementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.telnyx.com/v2");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    NumberOrderRegulatoryRequirementsApi apiInstance = new NumberOrderRegulatoryRequirementsApi(defaultClient);
    List<String> filterPhoneNumber = Arrays.asList(); // List<String> | The list of phone numbers to retrieve regulatory requirements for.
    try {
      ListPhoneNumberRegulatoryRequirementsResponse result = apiInstance.listPhoneNumberRegulatoryRequirements(filterPhoneNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NumberOrderRegulatoryRequirementsApi#listPhoneNumberRegulatoryRequirements");
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
 **filterPhoneNumber** | [**List&lt;String&gt;**](String.md)| The list of phone numbers to retrieve regulatory requirements for. | [optional]

### Return type

[**ListPhoneNumberRegulatoryRequirementsResponse**](ListPhoneNumberRegulatoryRequirementsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response with a list of phone number regulatory requirements. |  -  |
**0** | Unexpected error |  -  |

<a name="retrieveNumberOrderRegulatoryRequirement"></a>
# **retrieveNumberOrderRegulatoryRequirement**
> NumberOrderRegulatoryRequirementResponse retrieveNumberOrderRegulatoryRequirement(requirementId)

Retrieve a number order regulatory requirement

Gets a single number order regulatory requirement.

### Example
```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.NumberOrderRegulatoryRequirementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.telnyx.com/v2");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    NumberOrderRegulatoryRequirementsApi apiInstance = new NumberOrderRegulatoryRequirementsApi(defaultClient);
    String requirementId = "requirementId_example"; // String | The number order regulatory requirement ID.
    try {
      NumberOrderRegulatoryRequirementResponse result = apiInstance.retrieveNumberOrderRegulatoryRequirement(requirementId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NumberOrderRegulatoryRequirementsApi#retrieveNumberOrderRegulatoryRequirement");
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
 **requirementId** | **String**| The number order regulatory requirement ID. |

### Return type

[**NumberOrderRegulatoryRequirementResponse**](NumberOrderRegulatoryRequirementResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response with details about a number order regulatory requirement. |  -  |
**0** | Unexpected error |  -  |

