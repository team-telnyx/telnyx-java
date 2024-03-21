# BillingGroupsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBillingGroup**](BillingGroupsApi.md#createBillingGroup) | **POST** /billing_groups | Create a billing group
[**deleteBillingGroup**](BillingGroupsApi.md#deleteBillingGroup) | **DELETE** /billing_groups/{id} | Delete a billing group
[**getBillingGroup**](BillingGroupsApi.md#getBillingGroup) | **GET** /billing_groups/{id} | Get a billing group
[**listBillingGroups**](BillingGroupsApi.md#listBillingGroups) | **GET** /billing_groups | List all billing groups
[**updateBillingGroup**](BillingGroupsApi.md#updateBillingGroup) | **PATCH** /billing_groups/{id} | Update a billing group



## createBillingGroup

> CreateBillingGroup200Response createBillingGroup(newBillingGroup)

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
            CreateBillingGroup200Response result = apiInstance.createBillingGroup(newBillingGroup);
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

[**CreateBillingGroup200Response**](CreateBillingGroup200Response.md)

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

> CreateBillingGroup200Response deleteBillingGroup(id)

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
            CreateBillingGroup200Response result = apiInstance.deleteBillingGroup(id);
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

[**CreateBillingGroup200Response**](CreateBillingGroup200Response.md)

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


## getBillingGroup

> CreateBillingGroup200Response getBillingGroup(id)

Get a billing group

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
            CreateBillingGroup200Response result = apiInstance.getBillingGroup(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BillingGroupsApi#getBillingGroup");
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

[**CreateBillingGroup200Response**](CreateBillingGroup200Response.md)

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

> ListBillingGroups200Response listBillingGroups(pageNumber, pageSize)

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
            ListBillingGroups200Response result = apiInstance.listBillingGroups(pageNumber, pageSize);
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

[**ListBillingGroups200Response**](ListBillingGroups200Response.md)

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


## updateBillingGroup

> CreateBillingGroup200Response updateBillingGroup(id, updateBillingGroup)

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
            CreateBillingGroup200Response result = apiInstance.updateBillingGroup(id, updateBillingGroup);
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

[**CreateBillingGroup200Response**](CreateBillingGroup200Response.md)

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

