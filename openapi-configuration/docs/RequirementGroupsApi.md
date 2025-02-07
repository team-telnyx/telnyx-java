# RequirementGroupsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRequirementGroup**](RequirementGroupsApi.md#createRequirementGroup) | **POST** /requirement_groups | Create a new requirement group
[**deleteRequirementGroup**](RequirementGroupsApi.md#deleteRequirementGroup) | **DELETE** /requirement_groups/{id} | Delete a requirement group by ID
[**getRequirementGroup**](RequirementGroupsApi.md#getRequirementGroup) | **GET** /requirement_groups/{id} | Get a single requirement group by ID
[**getRequirementGroups**](RequirementGroupsApi.md#getRequirementGroups) | **GET** /requirement_groups | List requirement groups
[**submitRequirementGroup**](RequirementGroupsApi.md#submitRequirementGroup) | **POST** /requirement_groups/{id}/submit_for_approval | Submit a Requirement Group for Approval
[**updateNumberOrderPhoneNumberRequirementGroup**](RequirementGroupsApi.md#updateNumberOrderPhoneNumberRequirementGroup) | **POST** /number_order_phone_numbers/{id}/requirement_group | Update requirement group for a phone number order
[**updateRequirementGroup**](RequirementGroupsApi.md#updateRequirementGroup) | **PATCH** /requirement_groups/{id} | Update requirement values in requirement group
[**updateSubNumberOrderRequirementGroup**](RequirementGroupsApi.md#updateSubNumberOrderRequirementGroup) | **POST** /sub_number_orders/{id}/requirement_group | Update requirement group for a sub number order



## createRequirementGroup

> RequirementGroup createRequirementGroup(createRequirementGroupRequest)

Create a new requirement group

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.RequirementGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        RequirementGroupsApi apiInstance = new RequirementGroupsApi(defaultClient);
        CreateRequirementGroupRequest createRequirementGroupRequest = new CreateRequirementGroupRequest(); // CreateRequirementGroupRequest | 
        try {
            RequirementGroup result = apiInstance.createRequirementGroup(createRequirementGroupRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RequirementGroupsApi#createRequirementGroup");
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
 **createRequirementGroupRequest** | [**CreateRequirementGroupRequest**](CreateRequirementGroupRequest.md)|  |

### Return type

[**RequirementGroup**](RequirementGroup.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Requirement group created |  -  |


## deleteRequirementGroup

> RequirementGroup deleteRequirementGroup(id)

Delete a requirement group by ID

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.RequirementGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        RequirementGroupsApi apiInstance = new RequirementGroupsApi(defaultClient);
        String id = "id_example"; // String | ID of the requirement group
        try {
            RequirementGroup result = apiInstance.deleteRequirementGroup(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RequirementGroupsApi#deleteRequirementGroup");
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
 **id** | **String**| ID of the requirement group |

### Return type

[**RequirementGroup**](RequirementGroup.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Deleted requirement group |  -  |


## getRequirementGroup

> RequirementGroup getRequirementGroup(id)

Get a single requirement group by ID

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.RequirementGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        RequirementGroupsApi apiInstance = new RequirementGroupsApi(defaultClient);
        String id = "id_example"; // String | ID of the requirement group to retrieve
        try {
            RequirementGroup result = apiInstance.getRequirementGroup(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RequirementGroupsApi#getRequirementGroup");
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
 **id** | **String**| ID of the requirement group to retrieve |

### Return type

[**RequirementGroup**](RequirementGroup.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A single requirement group |  -  |


## getRequirementGroups

> List&lt;RequirementGroup&gt; getRequirementGroups(filterCountryCode, filterPhoneNumberType, filterAction, filterStatus, filterCustomerReference)

List requirement groups

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.RequirementGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        RequirementGroupsApi apiInstance = new RequirementGroupsApi(defaultClient);
        String filterCountryCode = "FR"; // String | Filter requirement groups by country code (iso alpha 2)
        String filterPhoneNumberType = "local"; // String | Filter requirement groups by phone number type.
        String filterAction = "ordering"; // String | Filter requirement groups by action type
        String filterStatus = "approved"; // String | Filter requirement groups by status
        String filterCustomerReference = "12345"; // String | Filter requirement groups by customer reference
        try {
            List<RequirementGroup> result = apiInstance.getRequirementGroups(filterCountryCode, filterPhoneNumberType, filterAction, filterStatus, filterCustomerReference);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RequirementGroupsApi#getRequirementGroups");
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
 **filterCountryCode** | **String**| Filter requirement groups by country code (iso alpha 2) | [optional]
 **filterPhoneNumberType** | **String**| Filter requirement groups by phone number type. | [optional] [enum: local, toll_free, mobile, national, shared_cost]
 **filterAction** | **String**| Filter requirement groups by action type | [optional] [enum: ordering, porting, action]
 **filterStatus** | **String**| Filter requirement groups by status | [optional] [enum: approved, unapproved, pending-approval, declined]
 **filterCustomerReference** | **String**| Filter requirement groups by customer reference | [optional]

### Return type

[**List&lt;RequirementGroup&gt;**](RequirementGroup.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List requirement groups |  -  |


## submitRequirementGroup

> RequirementGroup submitRequirementGroup(id)

Submit a Requirement Group for Approval

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.RequirementGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        RequirementGroupsApi apiInstance = new RequirementGroupsApi(defaultClient);
        String id = "id_example"; // String | ID of the requirement group to submit
        try {
            RequirementGroup result = apiInstance.submitRequirementGroup(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RequirementGroupsApi#submitRequirementGroup");
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
 **id** | **String**| ID of the requirement group to submit |

### Return type

[**RequirementGroup**](RequirementGroup.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A single requirement group |  -  |


## updateNumberOrderPhoneNumberRequirementGroup

> UpdateNumberOrderPhoneNumberRequirementGroup200Response updateNumberOrderPhoneNumberRequirementGroup(id, updateNumberOrderPhoneNumberRequirementGroupRequest)

Update requirement group for a phone number order

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.RequirementGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        RequirementGroupsApi apiInstance = new RequirementGroupsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The unique identifier of the number order phone number
        UpdateNumberOrderPhoneNumberRequirementGroupRequest updateNumberOrderPhoneNumberRequirementGroupRequest = new UpdateNumberOrderPhoneNumberRequirementGroupRequest(); // UpdateNumberOrderPhoneNumberRequirementGroupRequest | 
        try {
            UpdateNumberOrderPhoneNumberRequirementGroup200Response result = apiInstance.updateNumberOrderPhoneNumberRequirementGroup(id, updateNumberOrderPhoneNumberRequirementGroupRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RequirementGroupsApi#updateNumberOrderPhoneNumberRequirementGroup");
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
 **id** | **UUID**| The unique identifier of the number order phone number |
 **updateNumberOrderPhoneNumberRequirementGroupRequest** | [**UpdateNumberOrderPhoneNumberRequirementGroupRequest**](UpdateNumberOrderPhoneNumberRequirementGroupRequest.md)|  |

### Return type

[**UpdateNumberOrderPhoneNumberRequirementGroup200Response**](UpdateNumberOrderPhoneNumberRequirementGroup200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with updated phone number order details |  -  |
| **0** | Unexpected error |  -  |


## updateRequirementGroup

> RequirementGroup updateRequirementGroup(id, updateRequirementGroupRequest)

Update requirement values in requirement group

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.RequirementGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        RequirementGroupsApi apiInstance = new RequirementGroupsApi(defaultClient);
        String id = "id_example"; // String | ID of the requirement group
        UpdateRequirementGroupRequest updateRequirementGroupRequest = new UpdateRequirementGroupRequest(); // UpdateRequirementGroupRequest | 
        try {
            RequirementGroup result = apiInstance.updateRequirementGroup(id, updateRequirementGroupRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RequirementGroupsApi#updateRequirementGroup");
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
 **id** | **String**| ID of the requirement group |
 **updateRequirementGroupRequest** | [**UpdateRequirementGroupRequest**](UpdateRequirementGroupRequest.md)|  |

### Return type

[**RequirementGroup**](RequirementGroup.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Updated requirement group |  -  |


## updateSubNumberOrderRequirementGroup

> SubNumberOrderRequirementGroupResponse updateSubNumberOrderRequirementGroup(id, updateNumberOrderPhoneNumberRequirementGroupRequest)

Update requirement group for a sub number order

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.RequirementGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        RequirementGroupsApi apiInstance = new RequirementGroupsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the sub number order
        UpdateNumberOrderPhoneNumberRequirementGroupRequest updateNumberOrderPhoneNumberRequirementGroupRequest = new UpdateNumberOrderPhoneNumberRequirementGroupRequest(); // UpdateNumberOrderPhoneNumberRequirementGroupRequest | 
        try {
            SubNumberOrderRequirementGroupResponse result = apiInstance.updateSubNumberOrderRequirementGroup(id, updateNumberOrderPhoneNumberRequirementGroupRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RequirementGroupsApi#updateSubNumberOrderRequirementGroup");
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
 **id** | **UUID**| The ID of the sub number order |
 **updateNumberOrderPhoneNumberRequirementGroupRequest** | [**UpdateNumberOrderPhoneNumberRequirementGroupRequest**](UpdateNumberOrderPhoneNumberRequirementGroupRequest.md)|  |

### Return type

[**SubNumberOrderRequirementGroupResponse**](SubNumberOrderRequirementGroupResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Sub number order requirement group updated successfully |  -  |
| **0** | Unexpected error |  -  |

