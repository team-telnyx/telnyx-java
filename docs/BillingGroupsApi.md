# BillingGroupsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBillingGroup**](BillingGroupsApi.md#createBillingGroup) | **POST** /billing_groups | Create a billing group
[**deleteBillingGroup**](BillingGroupsApi.md#deleteBillingGroup) | **DELETE** /billing_groups/{id} | Delete a billing group
[**listBillingGroups**](BillingGroupsApi.md#listBillingGroups) | **GET** /billing_groups | List all billing groups
[**retrieveBillingGroup**](BillingGroupsApi.md#retrieveBillingGroup) | **GET** /billing_groups/{id} | Retrieve a billing group
[**updateBillingGroup**](BillingGroupsApi.md#updateBillingGroup) | **PATCH** /billing_groups/{id} | Update a billing group



## createBillingGroup

> CreateBillingGroupResponse createBillingGroup(newBillingGroup)

Create a billing group

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.BillingGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        BillingGroupsApi apiInstance = new BillingGroupsApi(defaultClient);
        NewBillingGroup newBillingGroup = new NewBillingGroup(); // NewBillingGroup | New billing group object
        try {
            CreateBillingGroupResponse result = apiInstance.createBillingGroup(newBillingGroup);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BillingGroupsApi#createBillingGroup");
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
 **newBillingGroup** | [**NewBillingGroup**](NewBillingGroup.md)| New billing group object |

### Return type

[**CreateBillingGroupResponse**](CreateBillingGroupResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected billing group response to a valid request |  -  |
| **0** | Unexpected error |  -  |


## deleteBillingGroup

> DeleteBillingGroupResponse deleteBillingGroup(id)

Delete a billing group

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.BillingGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        BillingGroupsApi apiInstance = new BillingGroupsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The id of the billing group
        try {
            DeleteBillingGroupResponse result = apiInstance.deleteBillingGroup(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BillingGroupsApi#deleteBillingGroup");
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
 **id** | **UUID**| The id of the billing group |

### Return type

[**DeleteBillingGroupResponse**](DeleteBillingGroupResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected billing group response to a valid request |  -  |
| **0** | Unexpected error |  -  |


## listBillingGroups

> ListBillingGroupsResponse listBillingGroups(pageNumber, pageSize)

List all billing groups

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.BillingGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        BillingGroupsApi apiInstance = new BillingGroupsApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        try {
            ListBillingGroupsResponse result = apiInstance.listBillingGroups(pageNumber, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BillingGroupsApi#listBillingGroups");
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
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]

### Return type

[**ListBillingGroupsResponse**](ListBillingGroupsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A paginated array of billing groups |  -  |
| **0** | Unexpected error |  -  |


## retrieveBillingGroup

> RetrieveBillingGroupResponse retrieveBillingGroup(id)

Retrieve a billing group

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.BillingGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        BillingGroupsApi apiInstance = new BillingGroupsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The id of the billing group
        try {
            RetrieveBillingGroupResponse result = apiInstance.retrieveBillingGroup(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BillingGroupsApi#retrieveBillingGroup");
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
 **id** | **UUID**| The id of the billing group |

### Return type

[**RetrieveBillingGroupResponse**](RetrieveBillingGroupResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected billing group response to a valid request |  -  |
| **0** | Unexpected error |  -  |


## updateBillingGroup

> UpdateBillingGroupResponse updateBillingGroup(id, updateBillingGroup)

Update a billing group

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.BillingGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        BillingGroupsApi apiInstance = new BillingGroupsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The id of the billing group
        UpdateBillingGroup updateBillingGroup = new UpdateBillingGroup(); // UpdateBillingGroup | Update billing group object
        try {
            UpdateBillingGroupResponse result = apiInstance.updateBillingGroup(id, updateBillingGroup);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BillingGroupsApi#updateBillingGroup");
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
 **id** | **UUID**| The id of the billing group |
 **updateBillingGroup** | [**UpdateBillingGroup**](UpdateBillingGroup.md)| Update billing group object |

### Return type

[**UpdateBillingGroupResponse**](UpdateBillingGroupResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected billing group response to a valid request |  -  |
| **0** | Unexpected error |  -  |

