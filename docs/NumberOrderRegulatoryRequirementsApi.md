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
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.NumberOrderRegulatoryRequirementsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NumberOrderRegulatoryRequirementsApi apiInstance = new NumberOrderRegulatoryRequirementsApi();
String filterRequirementId = "filterRequirementId_example"; // String | Filter number order regulatory requirements by `requirement_id`.
String filterFieldType = "filterFieldType_example"; // String | Filter number order regulatory requirements by `field_type`.
String filterRequirementType = "filterRequirementType_example"; // String | Filter number order regulatory requirements by `requirement_type`.
try {
    ListNumberOrderRegulatoryRequirementsResponse result = apiInstance.listNumberOrderRegulatoryRequirements(filterRequirementId, filterFieldType, filterRequirementType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NumberOrderRegulatoryRequirementsApi#listNumberOrderRegulatoryRequirements");
    e.printStackTrace();
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

<a name="listPhoneNumberRegulatoryRequirements"></a>
# **listPhoneNumberRegulatoryRequirements**
> ListPhoneNumberRegulatoryRequirementsResponse listPhoneNumberRegulatoryRequirements(filterPhoneNumber)

List regulatory requirements per number

Gets a paginated list of phone number regulatory requirements.

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.NumberOrderRegulatoryRequirementsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NumberOrderRegulatoryRequirementsApi apiInstance = new NumberOrderRegulatoryRequirementsApi();
List<String> filterPhoneNumber = Arrays.asList("filterPhoneNumber_example"); // List<String> | The list of phone numbers to retrieve regulatory requirements for.
try {
    ListPhoneNumberRegulatoryRequirementsResponse result = apiInstance.listPhoneNumberRegulatoryRequirements(filterPhoneNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NumberOrderRegulatoryRequirementsApi#listPhoneNumberRegulatoryRequirements");
    e.printStackTrace();
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

<a name="retrieveNumberOrderRegulatoryRequirement"></a>
# **retrieveNumberOrderRegulatoryRequirement**
> NumberOrderRegulatoryRequirementResponse retrieveNumberOrderRegulatoryRequirement(requirementId)

Retrieve a number order regulatory requirement

Gets a single number order regulatory requirement.

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.NumberOrderRegulatoryRequirementsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NumberOrderRegulatoryRequirementsApi apiInstance = new NumberOrderRegulatoryRequirementsApi();
String requirementId = "requirementId_example"; // String | The number order regulatory requirement ID.
try {
    NumberOrderRegulatoryRequirementResponse result = apiInstance.retrieveNumberOrderRegulatoryRequirement(requirementId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NumberOrderRegulatoryRequirementsApi#retrieveNumberOrderRegulatoryRequirement");
    e.printStackTrace();
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

