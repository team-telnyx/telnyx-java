# NumberReservationsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNumberReservation**](NumberReservationsApi.md#createNumberReservation) | **POST** /number_reservations | Create a number reservation
[**extendNumberReservationExpiryTime**](NumberReservationsApi.md#extendNumberReservationExpiryTime) | **POST** /number_reservations/{number_reservation_id}/actions/extend | Extend a number reservation
[**listNumberReservations**](NumberReservationsApi.md#listNumberReservations) | **GET** /number_reservations | List number reservations
[**retrieveNumberReservation**](NumberReservationsApi.md#retrieveNumberReservation) | **GET** /number_reservations/{number_reservation_id} | Retrieve a number reservation

<a name="createNumberReservation"></a>
# **createNumberReservation**
> NumberReservationResponse createNumberReservation(body)

Create a number reservation

Creates a Phone Number Reservation for multiple numbers.

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.NumberReservationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NumberReservationsApi apiInstance = new NumberReservationsApi();
CreateNumberReservationRequest body = new CreateNumberReservationRequest(); // CreateNumberReservationRequest | 
try {
    NumberReservationResponse result = apiInstance.createNumberReservation(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NumberReservationsApi#createNumberReservation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateNumberReservationRequest**](CreateNumberReservationRequest.md)|  |

### Return type

[**NumberReservationResponse**](NumberReservationResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="extendNumberReservationExpiryTime"></a>
# **extendNumberReservationExpiryTime**
> NumberReservationResponse extendNumberReservationExpiryTime(numberReservationId)

Extend a number reservation

Extends reservation expiry time on all phone numbers.

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.NumberReservationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NumberReservationsApi apiInstance = new NumberReservationsApi();
String numberReservationId = "numberReservationId_example"; // String | The number reservation ID.
try {
    NumberReservationResponse result = apiInstance.extendNumberReservationExpiryTime(numberReservationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NumberReservationsApi#extendNumberReservationExpiryTime");
    e.printStackTrace();
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

<a name="listNumberReservations"></a>
# **listNumberReservations**
> ListNumberReservationsResponse listNumberReservations(filterStatus, filterCreatedAtGt, filterCreatedAtLt, filterPhoneNumbersPhoneNumber, filterCustomerReference)

List number reservations

Gets a paginated list of phone number reservations.

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.NumberReservationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NumberReservationsApi apiInstance = new NumberReservationsApi();
String filterStatus = "filterStatus_example"; // String | Filter number reservations by status.
String filterCreatedAtGt = "filterCreatedAtGt_example"; // String | Filter number reservations later than this value.
String filterCreatedAtLt = "filterCreatedAtLt_example"; // String | Filter number reservations earlier than this value.
String filterPhoneNumbersPhoneNumber = "filterPhoneNumbersPhoneNumber_example"; // String | Filter number reservations having these phone numbers.
String filterCustomerReference = "filterCustomerReference_example"; // String | Filter number reservations via the customer reference set.
try {
    ListNumberReservationsResponse result = apiInstance.listNumberReservations(filterStatus, filterCreatedAtGt, filterCreatedAtLt, filterPhoneNumbersPhoneNumber, filterCustomerReference);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NumberReservationsApi#listNumberReservations");
    e.printStackTrace();
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

### Return type

[**ListNumberReservationsResponse**](ListNumberReservationsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveNumberReservation"></a>
# **retrieveNumberReservation**
> NumberReservationResponse retrieveNumberReservation(numberReservationId)

Retrieve a number reservation

Gets a single phone number reservation.

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.NumberReservationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NumberReservationsApi apiInstance = new NumberReservationsApi();
String numberReservationId = "numberReservationId_example"; // String | The number reservation ID.
try {
    NumberReservationResponse result = apiInstance.retrieveNumberReservation(numberReservationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NumberReservationsApi#retrieveNumberReservation");
    e.printStackTrace();
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

