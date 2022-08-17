# SimCardOrdersApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**simCardOrderGet**](SimCardOrdersApi.md#simCardOrderGet) | **GET** /sim_card_orders/{id} | Get a single SIM card order
[**simCardOrdersGet**](SimCardOrdersApi.md#simCardOrdersGet) | **GET** /sim_card_orders | Get all SIM card orders
[**simCardOrdersPost**](SimCardOrdersApi.md#simCardOrdersPost) | **POST** /sim_card_orders | Create a SIM card order
[**simCardOrdersPreview**](SimCardOrdersApi.md#simCardOrdersPreview) | **POST** /sim_card_order_preview | Preview SIM card orders



## simCardOrderGet

> SimCardOrdersPost200Response simCardOrderGet(id)

Get a single SIM card order

Get a single SIM card order by its ID.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.SimCardOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        SimCardOrdersApi apiInstance = new SimCardOrdersApi(defaultClient);
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the resource.
        try {
            SimCardOrdersPost200Response result = apiInstance.simCardOrderGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardOrdersApi#simCardOrderGet");
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
 **id** | **UUID**| Identifies the resource. |

### Return type

[**SimCardOrdersPost200Response**](SimCardOrdersPost200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **404** | Resource not found |  -  |
| **0** | Unexpected error |  -  |


## simCardOrdersGet

> SimCardOrdersGet200Response simCardOrdersGet(filterCreatedAt, filterUpdatedAt, filterQuantity, filterCostAmount, filterCostCurrency, filterAddressId, filterAddressStreetAddress, filterAddressExtendedAddress, filterAddressLocality, filterAddressAdministrativeArea, filterAddressCountryCode, filterAddressPostalCode, pageNumber, pageSize)

Get all SIM card orders

Get all SIM card orders according to filters.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.SimCardOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        SimCardOrdersApi apiInstance = new SimCardOrdersApi(defaultClient);
        String filterCreatedAt = "2018-02-02T22:25:27.521Z"; // String | Filter by ISO 8601 formatted date-time string matching resource creation date-time.
        String filterUpdatedAt = "2018-02-02T22:25:27.521Z"; // String | Filter by ISO 8601 formatted date-time string matching resource last update date-time.
        Integer filterQuantity = 21; // Integer | Filter orders by how many SIM cards were ordered.
        String filterCostAmount = "2.53"; // String | The total monetary amount of the order.
        String filterCostCurrency = "USD"; // String | Filter by ISO 4217 currency string.
        String filterAddressId = "1293384261075731499"; // String | Uniquely identifies the address for the order.
        String filterAddressStreetAddress = "311 W Superior St"; // String | Returns entries with matching name of the street where the address is located.
        String filterAddressExtendedAddress = "Suite 504"; // String | Returns entries with matching name of the supplemental field for address information.
        String filterAddressLocality = "Chicago"; // String | Filter by the name of the city where the address is located.
        String filterAddressAdministrativeArea = "IL"; // String | Filter by state or province where the address is located.
        String filterAddressCountryCode = "US"; // String | Filter by the mobile operator two-character (ISO 3166-1 alpha-2) origin country code.
        String filterAddressPostalCode = "60654"; // String | Filter by postal code for the address.
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        try {
            SimCardOrdersGet200Response result = apiInstance.simCardOrdersGet(filterCreatedAt, filterUpdatedAt, filterQuantity, filterCostAmount, filterCostCurrency, filterAddressId, filterAddressStreetAddress, filterAddressExtendedAddress, filterAddressLocality, filterAddressAdministrativeArea, filterAddressCountryCode, filterAddressPostalCode, pageNumber, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardOrdersApi#simCardOrdersGet");
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
 **filterCreatedAt** | **String**| Filter by ISO 8601 formatted date-time string matching resource creation date-time. | [optional]
 **filterUpdatedAt** | **String**| Filter by ISO 8601 formatted date-time string matching resource last update date-time. | [optional]
 **filterQuantity** | **Integer**| Filter orders by how many SIM cards were ordered. | [optional]
 **filterCostAmount** | **String**| The total monetary amount of the order. | [optional]
 **filterCostCurrency** | **String**| Filter by ISO 4217 currency string. | [optional]
 **filterAddressId** | **String**| Uniquely identifies the address for the order. | [optional]
 **filterAddressStreetAddress** | **String**| Returns entries with matching name of the street where the address is located. | [optional]
 **filterAddressExtendedAddress** | **String**| Returns entries with matching name of the supplemental field for address information. | [optional]
 **filterAddressLocality** | **String**| Filter by the name of the city where the address is located. | [optional]
 **filterAddressAdministrativeArea** | **String**| Filter by state or province where the address is located. | [optional]
 **filterAddressCountryCode** | **String**| Filter by the mobile operator two-character (ISO 3166-1 alpha-2) origin country code. | [optional]
 **filterAddressPostalCode** | **String**| Filter by postal code for the address. | [optional]
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]

### Return type

[**SimCardOrdersGet200Response**](SimCardOrdersGet200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **0** | Unexpected error |  -  |


## simCardOrdersPost

> SimCardOrdersPost200Response simCardOrdersPost(simCardOrderCreate)

Create a SIM card order

Creates a new order for SIM cards.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.SimCardOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        SimCardOrdersApi apiInstance = new SimCardOrdersApi(defaultClient);
        SimCardOrderCreate simCardOrderCreate = new SimCardOrderCreate(); // SimCardOrderCreate | 
        try {
            SimCardOrdersPost200Response result = apiInstance.simCardOrdersPost(simCardOrderCreate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardOrdersApi#simCardOrdersPost");
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
 **simCardOrderCreate** | [**SimCardOrderCreate**](SimCardOrderCreate.md)|  |

### Return type

[**SimCardOrdersPost200Response**](SimCardOrdersPost200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **0** | Unexpected error |  -  |


## simCardOrdersPreview

> SimCardOrdersPreview202Response simCardOrdersPreview(simCardOrdersPreviewRequest)

Preview SIM card orders

Preview SIM card order purchases.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.SimCardOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        SimCardOrdersApi apiInstance = new SimCardOrdersApi(defaultClient);
        SimCardOrdersPreviewRequest simCardOrdersPreviewRequest = new SimCardOrdersPreviewRequest(); // SimCardOrdersPreviewRequest | 
        try {
            SimCardOrdersPreview202Response result = apiInstance.simCardOrdersPreview(simCardOrdersPreviewRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardOrdersApi#simCardOrdersPreview");
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
 **simCardOrdersPreviewRequest** | [**SimCardOrdersPreviewRequest**](SimCardOrdersPreviewRequest.md)|  | [optional]

### Return type

[**SimCardOrdersPreview202Response**](SimCardOrdersPreview202Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful response |  -  |
| **422** | Unprocessable entity. Check the &#39;detail&#39; field in response for details. |  -  |

