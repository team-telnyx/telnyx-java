# AddressesApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**acceptAddressSuggestions**](AddressesApi.md#acceptAddressSuggestions) | **POST** /addresses/{id}/actions/accept_suggestions | Accepts this address suggestion as a new emergency address for Operator Connect and finishes the uploads of the numbers associated with it to Microsoft.
[**createAddress**](AddressesApi.md#createAddress) | **POST** /addresses | Creates an address
[**deleteAddress**](AddressesApi.md#deleteAddress) | **DELETE** /addresses/{id} | Deletes an address
[**findAddresses**](AddressesApi.md#findAddresses) | **GET** /addresses | List all addresses
[**getAddress**](AddressesApi.md#getAddress) | **GET** /addresses/{id} | Retrieve an address
[**validateAddress**](AddressesApi.md#validateAddress) | **POST** /addresses/actions/validate | Validate an address



## acceptAddressSuggestions

> AddressSuggestionResponse acceptAddressSuggestions(id, acceptSuggestionsRequest)

Accepts this address suggestion as a new emergency address for Operator Connect and finishes the uploads of the numbers associated with it to Microsoft.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.AddressesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        AddressesApi apiInstance = new AddressesApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The UUID of the address that should be accepted.
        AcceptSuggestionsRequest acceptSuggestionsRequest = new AcceptSuggestionsRequest(); // AcceptSuggestionsRequest | 
        try {
            AddressSuggestionResponse result = apiInstance.acceptAddressSuggestions(id, acceptSuggestionsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AddressesApi#acceptAddressSuggestions");
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
 **id** | **UUID**| The UUID of the address that should be accepted. |
 **acceptSuggestionsRequest** | [**AcceptSuggestionsRequest**](AcceptSuggestionsRequest.md)|  | [optional]

### Return type

[**AddressSuggestionResponse**](AddressSuggestionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | This address suggestion has already been accepted. |  -  |
| **202** | This address suggestion was accepted. The numbers associated to it will resume processing in the background. |  -  |
| **404** | Address not found or not accessible by the user. |  -  |


## createAddress

> CreateAddress200Response createAddress(addressCreate)

Creates an address

Creates an address.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.AddressesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        AddressesApi apiInstance = new AddressesApi(defaultClient);
        AddressCreate addressCreate = new AddressCreate(); // AddressCreate | Parameters that can be defined during address creation
        try {
            CreateAddress200Response result = apiInstance.createAddress(addressCreate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AddressesApi#createAddress");
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
 **addressCreate** | [**AddressCreate**](AddressCreate.md)| Parameters that can be defined during address creation |

### Return type

[**CreateAddress200Response**](CreateAddress200Response.md)

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


## deleteAddress

> CreateAddress200Response deleteAddress(id)

Deletes an address

Deletes an existing address.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.AddressesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        AddressesApi apiInstance = new AddressesApi(defaultClient);
        String id = "id_example"; // String | address ID
        try {
            CreateAddress200Response result = apiInstance.deleteAddress(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AddressesApi#deleteAddress");
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
 **id** | **String**| address ID |

### Return type

[**CreateAddress200Response**](CreateAddress200Response.md)

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


## findAddresses

> FindAddresses200Response findAddresses(pageNumber, pageSize, filterCustomerReferenceEq, filterCustomerReferenceContains, filterUsedAsEmergency, filterStreetAddressContains, filterAddressBookEq, sort)

List all addresses

Returns a list of your addresses.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.AddressesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        AddressesApi apiInstance = new AddressesApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        String filterCustomerReferenceEq = "filterCustomerReferenceEq_example"; // String | Filter addresses via the customer reference set. Matching is not case-sensitive.
        String filterCustomerReferenceContains = "filterCustomerReferenceContains_example"; // String | If present, addresses with <code>customer_reference</code> containing the given value will be returned. Matching is not case-sensitive.
        String filterUsedAsEmergency = "null"; // String | If set as 'true', only addresses used as the emergency address for at least one active phone-number will be returned. When set to 'false', the opposite happens: only addresses not used as the emergency address from phone-numbers will be returned.
        String filterStreetAddressContains = "null"; // String | If present, addresses with <code>street_address</code> containing the given value will be returned. Matching is not case-sensitive. Requires at least three characters.
        String filterAddressBookEq = "null"; // String | If present, only returns results with the <code>address_book</code> flag set to the given value.
        String sort = "created_at"; // String | Specifies the sort order for results. By default sorting direction is ascending. To have the results sorted in descending order add the <code> -</code> prefix.<br/><br/> That is: <ul>   <li>     <code>street_address</code>: sorts the result by the     <code>street_address</code> field in ascending order.   </li>    <li>     <code>-street_address</code>: sorts the result by the     <code>street_address</code> field in descending order.   </li> </ul> <br/> If not given, results are sorted by <code>created_at</code> in descending order.
        try {
            FindAddresses200Response result = apiInstance.findAddresses(pageNumber, pageSize, filterCustomerReferenceEq, filterCustomerReferenceContains, filterUsedAsEmergency, filterStreetAddressContains, filterAddressBookEq, sort);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AddressesApi#findAddresses");
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
 **filterUsedAsEmergency** | **String**| If set as &#39;true&#39;, only addresses used as the emergency address for at least one active phone-number will be returned. When set to &#39;false&#39;, the opposite happens: only addresses not used as the emergency address from phone-numbers will be returned. | [optional] [default to null]
 **filterStreetAddressContains** | **String**| If present, addresses with &lt;code&gt;street_address&lt;/code&gt; containing the given value will be returned. Matching is not case-sensitive. Requires at least three characters. | [optional] [default to null]
 **filterAddressBookEq** | **String**| If present, only returns results with the &lt;code&gt;address_book&lt;/code&gt; flag set to the given value. | [optional] [default to null]
 **sort** | **String**| Specifies the sort order for results. By default sorting direction is ascending. To have the results sorted in descending order add the &lt;code&gt; -&lt;/code&gt; prefix.&lt;br/&gt;&lt;br/&gt; That is: &lt;ul&gt;   &lt;li&gt;     &lt;code&gt;street_address&lt;/code&gt;: sorts the result by the     &lt;code&gt;street_address&lt;/code&gt; field in ascending order.   &lt;/li&gt;    &lt;li&gt;     &lt;code&gt;-street_address&lt;/code&gt;: sorts the result by the     &lt;code&gt;street_address&lt;/code&gt; field in descending order.   &lt;/li&gt; &lt;/ul&gt; &lt;br/&gt; If not given, results are sorted by &lt;code&gt;created_at&lt;/code&gt; in descending order. | [optional] [default to created_at] [enum: created_at, first_name, last_name, business_name, street_address]

### Return type

[**FindAddresses200Response**](FindAddresses200Response.md)

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


## getAddress

> CreateAddress200Response getAddress(id)

Retrieve an address

Retrieves the details of an existing address.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.AddressesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        AddressesApi apiInstance = new AddressesApi(defaultClient);
        String id = "id_example"; // String | address ID
        try {
            CreateAddress200Response result = apiInstance.getAddress(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AddressesApi#getAddress");
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
 **id** | **String**| address ID |

### Return type

[**CreateAddress200Response**](CreateAddress200Response.md)

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


## validateAddress

> ValidateAddressActionResponse validateAddress(validateAddressRequest)

Validate an address

Validates an address for emergency services.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.AddressesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        AddressesApi apiInstance = new AddressesApi(defaultClient);
        ValidateAddressRequest validateAddressRequest = new ValidateAddressRequest(); // ValidateAddressRequest | Parameters that can be defined during address validation
        try {
            ValidateAddressActionResponse result = apiInstance.validateAddress(validateAddressRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AddressesApi#validateAddress");
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
 **validateAddressRequest** | [**ValidateAddressRequest**](ValidateAddressRequest.md)| Parameters that can be defined during address validation |

### Return type

[**ValidateAddressActionResponse**](ValidateAddressActionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Action response |  -  |
| **422** | Bad request |  -  |

