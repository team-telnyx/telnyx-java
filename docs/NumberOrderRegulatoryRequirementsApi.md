# NumberOrderRegulatoryRequirementsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listNumberOrderRegulatoryRequirements**](NumberOrderRegulatoryRequirementsApi.md#listNumberOrderRegulatoryRequirements) | **GET** /regulatory_requirements | Get list of Number Order Regulatory Requirements
[**listPhoneNumberRegulatoryRequirements**](NumberOrderRegulatoryRequirementsApi.md#listPhoneNumberRegulatoryRequirements) | **GET** /phone_number_regulatory_requirements | Get Regulatory Requirements Per Number
[**retrieveNumberOrderRegulatoryRequirement**](NumberOrderRegulatoryRequirementsApi.md#retrieveNumberOrderRegulatoryRequirement) | **GET** /regulatory_requirements/{requirement_id} | Get Detailed Number Order Regulatory Requirement

<a name="listNumberOrderRegulatoryRequirements"></a>
# **listNumberOrderRegulatoryRequirements**
> ListNumberOrderRegulatoryRequirementsResponse listNumberOrderRegulatoryRequirements(filterRequirementId, filterFieldType, filterRequirementType)

Get list of Number Order Regulatory Requirements

Gets a paginated list of Number Order Regulatory Requirements

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NumberOrderRegulatoryRequirementsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NumberOrderRegulatoryRequirementsApi apiInstance = new NumberOrderRegulatoryRequirementsApi();
String filterRequirementId = "filterRequirementId_example"; // String | Filter number order regulatory requirements by requirement_id
String filterFieldType = "filterFieldType_example"; // String | Filter number order regulatory requirements by field_type
String filterRequirementType = "filterRequirementType_example"; // String | Filter number order regulatory requirements by requirement_type
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
 **filterRequirementId** | **String**| Filter number order regulatory requirements by requirement_id | [optional]
 **filterFieldType** | **String**| Filter number order regulatory requirements by field_type | [optional]
 **filterRequirementType** | **String**| Filter number order regulatory requirements by requirement_type | [optional]

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

Get Regulatory Requirements Per Number

Gets a paginated list of Phone Number Regulatory Requirements

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NumberOrderRegulatoryRequirementsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NumberOrderRegulatoryRequirementsApi apiInstance = new NumberOrderRegulatoryRequirementsApi();
List<String> filterPhoneNumber = Arrays.asList("filterPhoneNumber_example"); // List<String> | The list of phone numbers to retrieve regulatory requirements for
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
 **filterPhoneNumber** | [**List&lt;String&gt;**](String.md)| The list of phone numbers to retrieve regulatory requirements for | [optional]

### Return type

[**ListPhoneNumberRegulatoryRequirementsResponse**](ListPhoneNumberRegulatoryRequirementsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveNumberOrderRegulatoryRequirement"></a>
# **retrieveNumberOrderRegulatoryRequirement**
> RetrieveNumberOrderRegulatoryRequirementResponse retrieveNumberOrderRegulatoryRequirement(requirementId)

Get Detailed Number Order Regulatory Requirement

Gets a single Number Order Regulatory Requirement

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NumberOrderRegulatoryRequirementsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NumberOrderRegulatoryRequirementsApi apiInstance = new NumberOrderRegulatoryRequirementsApi();
String requirementId = "requirementId_example"; // String | The number order regulatory requirement id
try {
    RetrieveNumberOrderRegulatoryRequirementResponse result = apiInstance.retrieveNumberOrderRegulatoryRequirement(requirementId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NumberOrderRegulatoryRequirementsApi#retrieveNumberOrderRegulatoryRequirement");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requirementId** | **String**| The number order regulatory requirement id |

### Return type

[**RetrieveNumberOrderRegulatoryRequirementResponse**](RetrieveNumberOrderRegulatoryRequirementResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

