# ManagedAccountsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createManagedAccount**](ManagedAccountsApi.md#createManagedAccount) | **POST** /managed_accounts | Create a new managed account.
[**disableManagedAccount**](ManagedAccountsApi.md#disableManagedAccount) | **POST** /managed_accounts/{id}/actions/disable | Disables a managed account
[**enableManagedAccount**](ManagedAccountsApi.md#enableManagedAccount) | **POST** /managed_accounts/{id}/actions/enable | Enables a managed account
[**listManagedAccounts**](ManagedAccountsApi.md#listManagedAccounts) | **GET** /managed_accounts | Lists accounts managed by the current user.
[**retrieveManagedAccount**](ManagedAccountsApi.md#retrieveManagedAccount) | **GET** /managed_accounts/{id} | Retrieve a managed account
[**updateManagedAccount**](ManagedAccountsApi.md#updateManagedAccount) | **PATCH** /managed_accounts/{id} | Update a managed account



## createManagedAccount

> ManagedAccountResponse createManagedAccount(createManagedAccountRequest)

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
            ManagedAccountResponse result = apiInstance.createManagedAccount(createManagedAccountRequest);
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

[**ManagedAccountResponse**](ManagedAccountResponse.md)

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

> ManagedAccountResponse disableManagedAccount(id)

Disables a managed account

Disables a managed account, forbidding it to use Telnyx services, including sending or receiving phone calls and SMS messages. Ongoing phone calls will not be affected. The managed account and its sub-users will still be able to log in via the mission control portal.

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
            ManagedAccountResponse result = apiInstance.disableManagedAccount(id);
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

[**ManagedAccountResponse**](ManagedAccountResponse.md)

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

> ManagedAccountResponse enableManagedAccount(id)

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
        try {
            ManagedAccountResponse result = apiInstance.enableManagedAccount(id);
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

### Return type

[**ManagedAccountResponse**](ManagedAccountResponse.md)

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


## listManagedAccounts

> ListManagedAccountsResponse listManagedAccounts(pageNumber, pageSize, filterEmailContains, filterEmailEq, sort)

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
        String sort = "created_at"; // String | Specifies the sort order for results. By default sorting direction is ascending. To have the results sorted in descending order add the <code> -</code> prefix.<br/><br/> That is: <ul>   <li>     <code>email</code>: sorts the result by the     <code>email</code> field in ascending order.   </li>    <li>     <code>-email</code>: sorts the result by the     <code>email</code> field in descending order.   </li> </ul> <br/> If not given, results are sorted by <code>created_at</code> in descending order.
        try {
            ListManagedAccountsResponse result = apiInstance.listManagedAccounts(pageNumber, pageSize, filterEmailContains, filterEmailEq, sort);
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
 **sort** | **String**| Specifies the sort order for results. By default sorting direction is ascending. To have the results sorted in descending order add the &lt;code&gt; -&lt;/code&gt; prefix.&lt;br/&gt;&lt;br/&gt; That is: &lt;ul&gt;   &lt;li&gt;     &lt;code&gt;email&lt;/code&gt;: sorts the result by the     &lt;code&gt;email&lt;/code&gt; field in ascending order.   &lt;/li&gt;    &lt;li&gt;     &lt;code&gt;-email&lt;/code&gt;: sorts the result by the     &lt;code&gt;email&lt;/code&gt; field in descending order.   &lt;/li&gt; &lt;/ul&gt; &lt;br/&gt; If not given, results are sorted by &lt;code&gt;created_at&lt;/code&gt; in descending order. | [optional] [default to created_at] [enum: created_at, email]

### Return type

[**ListManagedAccountsResponse**](ListManagedAccountsResponse.md)

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

> ManagedAccountResponse retrieveManagedAccount(id)

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
            ManagedAccountResponse result = apiInstance.retrieveManagedAccount(id);
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

[**ManagedAccountResponse**](ManagedAccountResponse.md)

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

> ManagedAccountResponse updateManagedAccount(id, updateManagedAccountRequest)

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
            ManagedAccountResponse result = apiInstance.updateManagedAccount(id, updateManagedAccountRequest);
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

[**ManagedAccountResponse**](ManagedAccountResponse.md)

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

