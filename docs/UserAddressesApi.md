# UserAddressesApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUserAddress**](UserAddressesApi.md#createUserAddress) | **POST** /user_addresses | Creates a user address
[**findUserAddress**](UserAddressesApi.md#findUserAddress) | **GET** /user_addresses | List all user addresses
[**getUserAddress**](UserAddressesApi.md#getUserAddress) | **GET** /user_addresses/{id} | Retrieve a user address



## createUserAddress

> CreateUserAddress200Response createUserAddress(userAddressCreate)

Creates a user address

Creates a user address.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.UserAddressesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        UserAddressesApi apiInstance = new UserAddressesApi(defaultClient);
        UserAddressCreate userAddressCreate = new UserAddressCreate(); // UserAddressCreate | Parameters that can be defined during user address creation
        try {
            CreateUserAddress200Response result = apiInstance.createUserAddress(userAddressCreate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserAddressesApi#createUserAddress");
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
 **userAddressCreate** | [**UserAddressCreate**](UserAddressCreate.md)| Parameters that can be defined during user address creation |

### Return type

[**CreateUserAddress200Response**](CreateUserAddress200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **422** | Bad request |  -  |


## findUserAddress

> FindUserAddress200Response findUserAddress(pageNumber, pageSize, filterCustomerReferenceEq, filterCustomerReferenceContains, filterStreetAddressContains, sort)

List all user addresses

Returns a list of your user addresses.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.UserAddressesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        UserAddressesApi apiInstance = new UserAddressesApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        String filterCustomerReferenceEq = "filterCustomerReferenceEq_example"; // String | Filter addresses via the customer reference set. Matching is not case-sensitive.
        String filterCustomerReferenceContains = "filterCustomerReferenceContains_example"; // String | If present, addresses with <code>customer_reference</code> containing the given value will be returned. Matching is not case-sensitive.
        String filterStreetAddressContains = "null"; // String | If present, addresses with <code>street_address</code> containing the given value will be returned. Matching is not case-sensitive. Requires at least three characters.
        String sort = "created_at"; // String | Specifies the sort order for results. By default sorting direction is ascending. To have the results sorted in descending order add the <code> -</code> prefix.<br/><br/> That is: <ul>   <li>     <code>street_address</code>: sorts the result by the     <code>street_address</code> field in ascending order.   </li>    <li>     <code>-street_address</code>: sorts the result by the     <code>street_address</code> field in descending order.   </li> </ul> <br/> If not given, results are sorted by <code>created_at</code> in descending order.
        try {
            FindUserAddress200Response result = apiInstance.findUserAddress(pageNumber, pageSize, filterCustomerReferenceEq, filterCustomerReferenceContains, filterStreetAddressContains, sort);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserAddressesApi#findUserAddress");
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
 **filterCustomerReferenceEq** | **String**| Filter addresses via the customer reference set. Matching is not case-sensitive. | [optional]
 **filterCustomerReferenceContains** | **String**| If present, addresses with &lt;code&gt;customer_reference&lt;/code&gt; containing the given value will be returned. Matching is not case-sensitive. | [optional]
 **filterStreetAddressContains** | **String**| If present, addresses with &lt;code&gt;street_address&lt;/code&gt; containing the given value will be returned. Matching is not case-sensitive. Requires at least three characters. | [optional] [default to null]
 **sort** | **String**| Specifies the sort order for results. By default sorting direction is ascending. To have the results sorted in descending order add the &lt;code&gt; -&lt;/code&gt; prefix.&lt;br/&gt;&lt;br/&gt; That is: &lt;ul&gt;   &lt;li&gt;     &lt;code&gt;street_address&lt;/code&gt;: sorts the result by the     &lt;code&gt;street_address&lt;/code&gt; field in ascending order.   &lt;/li&gt;    &lt;li&gt;     &lt;code&gt;-street_address&lt;/code&gt;: sorts the result by the     &lt;code&gt;street_address&lt;/code&gt; field in descending order.   &lt;/li&gt; &lt;/ul&gt; &lt;br/&gt; If not given, results are sorted by &lt;code&gt;created_at&lt;/code&gt; in descending order. | [optional] [default to created_at] [enum: created_at, first_name, last_name, business_name, street_address]

### Return type

[**FindUserAddress200Response**](FindUserAddress200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |


## getUserAddress

> CreateUserAddress200Response getUserAddress(id)

Retrieve a user address

Retrieves the details of an existing user address.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.UserAddressesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        UserAddressesApi apiInstance = new UserAddressesApi(defaultClient);
        String id = "id_example"; // String | user address ID
        try {
            CreateUserAddress200Response result = apiInstance.getUserAddress(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserAddressesApi#getUserAddress");
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
 **id** | **String**| user address ID |

### Return type

[**CreateUserAddress200Response**](CreateUserAddress200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **422** | Bad request |  -  |

