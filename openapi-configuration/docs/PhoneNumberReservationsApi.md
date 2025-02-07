# PhoneNumberReservationsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNumberReservation**](PhoneNumberReservationsApi.md#createNumberReservation) | **POST** /number_reservations | Create a number reservation
[**extendNumberReservationExpiryTime**](PhoneNumberReservationsApi.md#extendNumberReservationExpiryTime) | **POST** /number_reservations/{number_reservation_id}/actions/extend | Extend a number reservation
[**listNumberReservations**](PhoneNumberReservationsApi.md#listNumberReservations) | **GET** /number_reservations | List number reservations
[**retrieveNumberReservation**](PhoneNumberReservationsApi.md#retrieveNumberReservation) | **GET** /number_reservations/{number_reservation_id} | Retrieve a number reservation



## createNumberReservation

> NumberReservationResponse createNumberReservation(createNumberReservationRequest)

Create a number reservation

Creates a Phone Number Reservation for multiple numbers.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PhoneNumberReservationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PhoneNumberReservationsApi apiInstance = new PhoneNumberReservationsApi(defaultClient);
        CreateNumberReservationRequest createNumberReservationRequest = new CreateNumberReservationRequest(); // CreateNumberReservationRequest | 
        try {
            NumberReservationResponse result = apiInstance.createNumberReservation(createNumberReservationRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PhoneNumberReservationsApi#createNumberReservation");
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
 **createNumberReservationRequest** | [**CreateNumberReservationRequest**](CreateNumberReservationRequest.md)|  |

### Return type

[**NumberReservationResponse**](NumberReservationResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a number reservation. |  -  |
| **0** | Unexpected error |  -  |


## extendNumberReservationExpiryTime

> NumberReservationResponse extendNumberReservationExpiryTime(numberReservationId)

Extend a number reservation

Extends reservation expiry time on all phone numbers.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PhoneNumberReservationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PhoneNumberReservationsApi apiInstance = new PhoneNumberReservationsApi(defaultClient);
        String numberReservationId = "numberReservationId_example"; // String | The number reservation ID.
        try {
            NumberReservationResponse result = apiInstance.extendNumberReservationExpiryTime(numberReservationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PhoneNumberReservationsApi#extendNumberReservationExpiryTime");
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
 **numberReservationId** | **String**| The number reservation ID. |

### Return type

[**NumberReservationResponse**](NumberReservationResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a number reservation. |  -  |
| **0** | Unexpected error |  -  |


## listNumberReservations

> ListNumberReservationsResponse listNumberReservations().filterStatus(filterStatus).filterCreatedAtGt(filterCreatedAtGt).filterCreatedAtLt(filterCreatedAtLt).filterPhoneNumbersPhoneNumber(filterPhoneNumbersPhoneNumber).filterCustomerReference(filterCustomerReference).pageNumber(pageNumber).pageSize(pageSize).execute();

List number reservations

Gets a paginated list of phone number reservations.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PhoneNumberReservationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PhoneNumberReservationsApi apiInstance = new PhoneNumberReservationsApi(defaultClient);
        String filterStatus = "filterStatus_example"; // String | Filter number reservations by status.
        String filterCreatedAtGt = "filterCreatedAtGt_example"; // String | Filter number reservations later than this value.
        String filterCreatedAtLt = "filterCreatedAtLt_example"; // String | Filter number reservations earlier than this value.
        String filterPhoneNumbersPhoneNumber = "filterPhoneNumbersPhoneNumber_example"; // String | Filter number reservations having these phone numbers.
        String filterCustomerReference = "filterCustomerReference_example"; // String | Filter number reservations via the customer reference set.
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        try {
            ListNumberReservationsResponse result = api.listNumberReservations()
                .filterStatus(filterStatus)
                .filterCreatedAtGt(filterCreatedAtGt)
                .filterCreatedAtLt(filterCreatedAtLt)
                .filterPhoneNumbersPhoneNumber(filterPhoneNumbersPhoneNumber)
                .filterCustomerReference(filterCustomerReference)
                .pageNumber(pageNumber)
                .pageSize(pageSize)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PhoneNumberReservationsApi#listNumberReservations");
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
 **filterStatus** | **String**| Filter number reservations by status. | [optional]
 **filterCreatedAtGt** | **String**| Filter number reservations later than this value. | [optional]
 **filterCreatedAtLt** | **String**| Filter number reservations earlier than this value. | [optional]
 **filterPhoneNumbersPhoneNumber** | **String**| Filter number reservations having these phone numbers. | [optional]
 **filterCustomerReference** | **String**| Filter number reservations via the customer reference set. | [optional]
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]

### Return type

[**ListNumberReservationsResponse**](ListNumberReservationsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of number reservations. |  -  |
| **0** | Unexpected error |  -  |


## retrieveNumberReservation

> NumberReservationResponse retrieveNumberReservation(numberReservationId)

Retrieve a number reservation

Gets a single phone number reservation.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PhoneNumberReservationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PhoneNumberReservationsApi apiInstance = new PhoneNumberReservationsApi(defaultClient);
        String numberReservationId = "numberReservationId_example"; // String | The number reservation ID.
        try {
            NumberReservationResponse result = apiInstance.retrieveNumberReservation(numberReservationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PhoneNumberReservationsApi#retrieveNumberReservation");
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
 **numberReservationId** | **String**| The number reservation ID. |

### Return type

[**NumberReservationResponse**](NumberReservationResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a number reservation. |  -  |
| **0** | Unexpected error |  -  |

