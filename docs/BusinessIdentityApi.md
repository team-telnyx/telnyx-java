# BusinessIdentityApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBusinessIdentity**](BusinessIdentityApi.md#createBusinessIdentity) | **POST** /business_identities | Creates a Business Identity
[**deleteBusinessIdentity**](BusinessIdentityApi.md#deleteBusinessIdentity) | **DELETE** /business_identities/{id} | Delete a Business Identity
[**displayBusinessIdentity**](BusinessIdentityApi.md#displayBusinessIdentity) | **GET** /business_identities/{id} | Display the Business Identity
[**listBusinessIdentities**](BusinessIdentityApi.md#listBusinessIdentities) | **GET** /business_identities | Lists the Business Identities owned by the current user/organization
[**updateBusinessIdentity**](BusinessIdentityApi.md#updateBusinessIdentity) | **PATCH** /business_identities/{id} | Update a Business Identity



## createBusinessIdentity

> createBusinessIdentity(createOrUpdateBusinessIdentityRequest)

Creates a Business Identity

Creates a new Business Identity.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.BusinessIdentityApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        BusinessIdentityApi apiInstance = new BusinessIdentityApi(defaultClient);
        CreateOrUpdateBusinessIdentityRequest createOrUpdateBusinessIdentityRequest = new CreateOrUpdateBusinessIdentityRequest(); // CreateOrUpdateBusinessIdentityRequest | 
        try {
            apiInstance.createBusinessIdentity(createOrUpdateBusinessIdentityRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling BusinessIdentityApi#createBusinessIdentity");
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
 **createOrUpdateBusinessIdentityRequest** | [**CreateOrUpdateBusinessIdentityRequest**](CreateOrUpdateBusinessIdentityRequest.md)|  |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Business Identity was created. |  -  |
| **0** | Unexpected error |  -  |


## deleteBusinessIdentity

> ShowBusinessIdentityResponse deleteBusinessIdentity(id).execute();

Delete a Business Identity

Deletes the Business Identity. This action will fail if any verification requests have been made for any associated Display Profile. Please contact support@telnyx.com in case you want to delete a Business Identity in that situation.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.BusinessIdentityApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        BusinessIdentityApi apiInstance = new BusinessIdentityApi(defaultClient);
        String id = "id_example"; // String | Identifies the Business Identity
        try {
            ShowBusinessIdentityResponse result = api.deleteBusinessIdentity(id)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BusinessIdentityApi#deleteBusinessIdentity");
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
 **id** | **String**| Identifies the Business Identity |

### Return type

[**ShowBusinessIdentityResponse**](ShowBusinessIdentityResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a Business Identity. |  -  |
| **0** | Unexpected error |  -  |


## displayBusinessIdentity

> ShowBusinessIdentityResponse displayBusinessIdentity(id).execute();

Display the Business Identity

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.BusinessIdentityApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        BusinessIdentityApi apiInstance = new BusinessIdentityApi(defaultClient);
        String id = "id_example"; // String | Identifies the Business Identity
        try {
            ShowBusinessIdentityResponse result = api.displayBusinessIdentity(id)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BusinessIdentityApi#displayBusinessIdentity");
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
 **id** | **String**| Identifies the Business Identity |

### Return type

[**ShowBusinessIdentityResponse**](ShowBusinessIdentityResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a Business Identity. |  -  |
| **0** | Unexpected error |  -  |


## listBusinessIdentities

> ListBusinessIdentitiesResponse listBusinessIdentities().pageNumber(pageNumber).pageSize(pageSize).execute();

Lists the Business Identities owned by the current user/organization

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.BusinessIdentityApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        BusinessIdentityApi apiInstance = new BusinessIdentityApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        try {
            ListBusinessIdentitiesResponse result = api.listBusinessIdentities()
                .pageNumber(pageNumber)
                .pageSize(pageSize)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BusinessIdentityApi#listBusinessIdentities");
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

[**ListBusinessIdentitiesResponse**](ListBusinessIdentitiesResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of Business Identities. |  -  |
| **0** | Unexpected error |  -  |


## updateBusinessIdentity

> updateBusinessIdentity(id, createOrUpdateBusinessIdentityRequest)

Update a Business Identity

Update an existing Business Identity.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.BusinessIdentityApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        BusinessIdentityApi apiInstance = new BusinessIdentityApi(defaultClient);
        String id = "id_example"; // String | Identifies the Business Identity
        CreateOrUpdateBusinessIdentityRequest createOrUpdateBusinessIdentityRequest = new CreateOrUpdateBusinessIdentityRequest(); // CreateOrUpdateBusinessIdentityRequest | 
        try {
            apiInstance.updateBusinessIdentity(id, createOrUpdateBusinessIdentityRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling BusinessIdentityApi#updateBusinessIdentity");
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
 **id** | **String**| Identifies the Business Identity |
 **createOrUpdateBusinessIdentityRequest** | [**CreateOrUpdateBusinessIdentityRequest**](CreateOrUpdateBusinessIdentityRequest.md)|  |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Business Identity was updated. |  -  |
| **0** | Unexpected error |  -  |

