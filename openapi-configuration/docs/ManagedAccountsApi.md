# ManagedAccountsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createManagedAccount**](ManagedAccountsApi.md#createManagedAccount) | **POST** /managed_accounts | Create a new managed account.
[**disableManagedAccount**](ManagedAccountsApi.md#disableManagedAccount) | **POST** /managed_accounts/{id}/actions/disable | Disables a managed account
[**enableManagedAccount**](ManagedAccountsApi.md#enableManagedAccount) | **POST** /managed_accounts/{id}/actions/enable | Enables a managed account
[**listAllocatableGlobalOutboundChannels**](ManagedAccountsApi.md#listAllocatableGlobalOutboundChannels) | **GET** /managed_accounts/allocatable_global_outbound_channels | Display information about allocatable global outbound channels for the current user.
[**listManagedAccounts**](ManagedAccountsApi.md#listManagedAccounts) | **GET** /managed_accounts | Lists accounts managed by the current user.
[**retrieveManagedAccount**](ManagedAccountsApi.md#retrieveManagedAccount) | **GET** /managed_accounts/{id} | Retrieve a managed account
[**updateManagedAccount**](ManagedAccountsApi.md#updateManagedAccount) | **PATCH** /managed_accounts/{id} | Update a managed account
[**updateManagedAccountGlobalChannelLimit**](ManagedAccountsApi.md#updateManagedAccountGlobalChannelLimit) | **PATCH** /managed_accounts/{id}/update_global_channel_limit | Update the amount of allocatable global outbound channels allocated to a specific managed account.



## createManagedAccount

> CreateManagedAccount200Response createManagedAccount(createManagedAccountRequest)

Create a new managed account.

Create a new managed account owned by the authenticated user. You need to be explictly approved by Telnyx in order to become a manager account.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ManagedAccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ManagedAccountsApi apiInstance = new ManagedAccountsApi(defaultClient);
        CreateManagedAccountRequest createManagedAccountRequest = new CreateManagedAccountRequest(); // CreateManagedAccountRequest | Parameters that define the managed account to be created
        try {
            CreateManagedAccount200Response result = apiInstance.createManagedAccount(createManagedAccountRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ManagedAccountsApi#createManagedAccount");
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
 **createManagedAccountRequest** | [**CreateManagedAccountRequest**](CreateManagedAccountRequest.md)| Parameters that define the managed account to be created |

### Return type

[**CreateManagedAccount200Response**](CreateManagedAccount200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with information about a single managed account. |  -  |
| **401** | Unauthorized |  -  |
| **422** | Unprocessable entity. Check the &#39;detail&#39; field in response for details. |  -  |


## disableManagedAccount

> CreateManagedAccount200Response disableManagedAccount(id)

Disables a managed account

Disables a managed account, forbidding it to use Telnyx services, including sending or receiving phone calls and SMS messages. Ongoing phone calls will not be affected. The managed account and its sub-users will no longer be able to log in via the mission control portal.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ManagedAccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ManagedAccountsApi apiInstance = new ManagedAccountsApi(defaultClient);
        String id = "id_example"; // String | Managed Account User ID
        try {
            CreateManagedAccount200Response result = apiInstance.disableManagedAccount(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ManagedAccountsApi#disableManagedAccount");
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
 **id** | **String**| Managed Account User ID |

### Return type

[**CreateManagedAccount200Response**](CreateManagedAccount200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with information about a single managed account. |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **422** | Unprocessable entity. Check the &#39;detail&#39; field in response for details. |  -  |


## enableManagedAccount

> CreateManagedAccount200Response enableManagedAccount(id, enableManagedAccountRequest)

Enables a managed account

Enables a managed account and its sub-users to use Telnyx services.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ManagedAccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ManagedAccountsApi apiInstance = new ManagedAccountsApi(defaultClient);
        String id = "id_example"; // String | Managed Account User ID
        EnableManagedAccountRequest enableManagedAccountRequest = new EnableManagedAccountRequest(); // EnableManagedAccountRequest | Additional parameters for what to do when enabling the managed account
        try {
            CreateManagedAccount200Response result = apiInstance.enableManagedAccount(id, enableManagedAccountRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ManagedAccountsApi#enableManagedAccount");
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
 **id** | **String**| Managed Account User ID |
 **enableManagedAccountRequest** | [**EnableManagedAccountRequest**](EnableManagedAccountRequest.md)| Additional parameters for what to do when enabling the managed account | [optional]

### Return type

[**CreateManagedAccount200Response**](CreateManagedAccount200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with information about a single managed account. |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **422** | Unprocessable entity. Check the &#39;detail&#39; field in response for details. |  -  |


## listAllocatableGlobalOutboundChannels

> ListAllocatableGlobalOutboundChannels200Response listAllocatableGlobalOutboundChannels()

Display information about allocatable global outbound channels for the current user.

Display information about allocatable global outbound channels for the current user. Only usable by account managers.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ManagedAccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ManagedAccountsApi apiInstance = new ManagedAccountsApi(defaultClient);
        try {
            ListAllocatableGlobalOutboundChannels200Response result = apiInstance.listAllocatableGlobalOutboundChannels();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ManagedAccountsApi#listAllocatableGlobalOutboundChannels");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ListAllocatableGlobalOutboundChannels200Response**](ListAllocatableGlobalOutboundChannels200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with information about allocatable global outbound channels. |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |


## listManagedAccounts

> ListManagedAccounts200Response listManagedAccounts(pageNumber, pageSize, filterEmailContains, filterEmailEq, filterOrganizationNameContains, filterOrganizationNameEq, sort, includeCancelledAccounts)

Lists accounts managed by the current user.

Lists the accounts managed by the current user. Users need to be explictly approved by Telnyx in order to become manager accounts.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ManagedAccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ManagedAccountsApi apiInstance = new ManagedAccountsApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        String filterEmailContains = "null"; // String | If present, email containing the given value will be returned. Matching is not case-sensitive. Requires at least three characters.
        String filterEmailEq = "null"; // String | If present, only returns results with the <code>email</code> matching exactly the value given.
        String filterOrganizationNameContains = "null"; // String | If present, only returns results with the <code>organization_name</code> containing the given value. Matching is not case-sensitive. Requires at least three characters.
        String filterOrganizationNameEq = "null"; // String | If present, only returns results with the <code>organization_name</code> matching exactly the value given.
        String sort = "asc"; // String | Set the order of the results by the creation date.
        Boolean includeCancelledAccounts = false; // Boolean | Specifies if cancelled accounts should be included in the results.
        try {
            ListManagedAccounts200Response result = apiInstance.listManagedAccounts(pageNumber, pageSize, filterEmailContains, filterEmailEq, filterOrganizationNameContains, filterOrganizationNameEq, sort, includeCancelledAccounts);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ManagedAccountsApi#listManagedAccounts");
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
 **filterEmailContains** | **String**| If present, email containing the given value will be returned. Matching is not case-sensitive. Requires at least three characters. | [optional] [default to null]
 **filterEmailEq** | **String**| If present, only returns results with the &lt;code&gt;email&lt;/code&gt; matching exactly the value given. | [optional] [default to null]
 **filterOrganizationNameContains** | **String**| If present, only returns results with the &lt;code&gt;organization_name&lt;/code&gt; containing the given value. Matching is not case-sensitive. Requires at least three characters. | [optional] [default to null]
 **filterOrganizationNameEq** | **String**| If present, only returns results with the &lt;code&gt;organization_name&lt;/code&gt; matching exactly the value given. | [optional] [default to null]
 **sort** | **String**| Set the order of the results by the creation date. | [optional] [enum: asc, desc]
 **includeCancelledAccounts** | **Boolean**| Specifies if cancelled accounts should be included in the results. | [optional] [default to false]

### Return type

[**ListManagedAccounts200Response**](ListManagedAccounts200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of managed accounts. |  -  |
| **401** | Unauthorized |  -  |


## retrieveManagedAccount

> CreateManagedAccount200Response retrieveManagedAccount(id)

Retrieve a managed account

Retrieves the details of a single managed account.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ManagedAccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ManagedAccountsApi apiInstance = new ManagedAccountsApi(defaultClient);
        String id = "id_example"; // String | Managed Account User ID
        try {
            CreateManagedAccount200Response result = apiInstance.retrieveManagedAccount(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ManagedAccountsApi#retrieveManagedAccount");
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
 **id** | **String**| Managed Account User ID |

### Return type

[**CreateManagedAccount200Response**](CreateManagedAccount200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with information about a single managed account. |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |


## updateManagedAccount

> CreateManagedAccount200Response updateManagedAccount(id, updateManagedAccountRequest)

Update a managed account

Update a single managed account.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ManagedAccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ManagedAccountsApi apiInstance = new ManagedAccountsApi(defaultClient);
        String id = "id_example"; // String | Managed Account User ID
        UpdateManagedAccountRequest updateManagedAccountRequest = new UpdateManagedAccountRequest(); // UpdateManagedAccountRequest | Parameters that define the updates to the managed account
        try {
            CreateManagedAccount200Response result = apiInstance.updateManagedAccount(id, updateManagedAccountRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ManagedAccountsApi#updateManagedAccount");
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
 **id** | **String**| Managed Account User ID |
 **updateManagedAccountRequest** | [**UpdateManagedAccountRequest**](UpdateManagedAccountRequest.md)| Parameters that define the updates to the managed account |

### Return type

[**CreateManagedAccount200Response**](CreateManagedAccount200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with information about a single managed account. |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **422** | Unprocessable entity. Check the &#39;detail&#39; field in response for details. |  -  |


## updateManagedAccountGlobalChannelLimit

> UpdateManagedAccountGlobalChannelLimit200Response updateManagedAccountGlobalChannelLimit(id, updateManagedAccountGlobalChannelLimitRequest)

Update the amount of allocatable global outbound channels allocated to a specific managed account.

Update the amount of allocatable global outbound channels allocated to a specific managed account.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ManagedAccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ManagedAccountsApi apiInstance = new ManagedAccountsApi(defaultClient);
        String id = "id_example"; // String | Managed Account User ID
        UpdateManagedAccountGlobalChannelLimitRequest updateManagedAccountGlobalChannelLimitRequest = new UpdateManagedAccountGlobalChannelLimitRequest(); // UpdateManagedAccountGlobalChannelLimitRequest | Parameters that define the changes to the global outbounds channels for the managed account
        try {
            UpdateManagedAccountGlobalChannelLimit200Response result = apiInstance.updateManagedAccountGlobalChannelLimit(id, updateManagedAccountGlobalChannelLimitRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ManagedAccountsApi#updateManagedAccountGlobalChannelLimit");
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
 **id** | **String**| Managed Account User ID |
 **updateManagedAccountGlobalChannelLimitRequest** | [**UpdateManagedAccountGlobalChannelLimitRequest**](UpdateManagedAccountGlobalChannelLimitRequest.md)| Parameters that define the changes to the global outbounds channels for the managed account |

### Return type

[**UpdateManagedAccountGlobalChannelLimit200Response**](UpdateManagedAccountGlobalChannelLimit200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with information about the allocatable global outbound channels for the given account. |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **422** | Unprocessable entity. Check the &#39;detail&#39; field in response for details. |  -  |

