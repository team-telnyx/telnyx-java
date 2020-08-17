# NumberReservationsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNumberReservations**](NumberReservationsApi.md#createNumberReservations) | **POST** /number_reservations | Create a Phone Number Reservation
[**extendNumberReservationExpiryTime**](NumberReservationsApi.md#extendNumberReservationExpiryTime) | **POST** /number_reservations/{number_reservation_id}/actions/extend | Extend a Phone Number Reservation
[**listNumberReservations**](NumberReservationsApi.md#listNumberReservations) | **GET** /number_reservations | List multiple Number Reservations
[**retrieveNumberReservation**](NumberReservationsApi.md#retrieveNumberReservation) | **GET** /number_reservations/{number_reservation_id} | Get a Single Phone Number Reservation

<a name="createNumberReservations"></a>
# **createNumberReservations**
> CreateNumberReservationsResponse createNumberReservations(body)

Create a Phone Number Reservation

Creates a Phone Number Reservation for multiple numbers

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NumberReservationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NumberReservationsApi apiInstance = new NumberReservationsApi();
NumberReservation body = new NumberReservation(); // NumberReservation | 
try {
    CreateNumberReservationsResponse result = apiInstance.createNumberReservations(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NumberReservationsApi#createNumberReservations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NumberReservation**](NumberReservation.md)|  |

### Return type

[**CreateNumberReservationsResponse**](CreateNumberReservationsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="extendNumberReservationExpiryTime"></a>
# **extendNumberReservationExpiryTime**
> RetrieveNumberReservationResponse extendNumberReservationExpiryTime(numberReservationId)

Extend a Phone Number Reservation

Extends reservation expiry time on all phone numbers

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NumberReservationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NumberReservationsApi apiInstance = new NumberReservationsApi();
String numberReservationId = "numberReservationId_example"; // String | The number reservation id
try {
    RetrieveNumberReservationResponse result = apiInstance.extendNumberReservationExpiryTime(numberReservationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NumberReservationsApi#extendNumberReservationExpiryTime");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **numberReservationId** | **String**| The number reservation id |

### Return type

[**RetrieveNumberReservationResponse**](RetrieveNumberReservationResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listNumberReservations"></a>
# **listNumberReservations**
> ListNumberReservationsResponse listNumberReservations(filterStatus, filterCreatedAtGt, filterCreatedAtLt, filterPhoneNumbersPhoneNumber, filterCustomerReference)

List multiple Number Reservations

Gets a paginated list of Phone Number Reservations

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NumberReservationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NumberReservationsApi apiInstance = new NumberReservationsApi();
String filterStatus = "filterStatus_example"; // String | Filter number reservations by status
String filterCreatedAtGt = "filterCreatedAtGt_example"; // String | Filter number reservations later than this value
String filterCreatedAtLt = "filterCreatedAtLt_example"; // String | Filter number reservations earlier than this value
String filterPhoneNumbersPhoneNumber = "filterPhoneNumbersPhoneNumber_example"; // String | Filter number reservations having these phone numbers
String filterCustomerReference = "filterCustomerReference_example"; // String | Filter number reservations via the customer reference set
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
 **filterStatus** | **String**| Filter number reservations by status | [optional]
 **filterCreatedAtGt** | **String**| Filter number reservations later than this value | [optional]
 **filterCreatedAtLt** | **String**| Filter number reservations earlier than this value | [optional]
 **filterPhoneNumbersPhoneNumber** | **String**| Filter number reservations having these phone numbers | [optional]
 **filterCustomerReference** | **String**| Filter number reservations via the customer reference set | [optional]

### Return type

[**ListNumberReservationsResponse**](ListNumberReservationsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveNumberReservation"></a>
# **retrieveNumberReservation**
> RetrieveNumberReservationResponse retrieveNumberReservation(numberReservationId)

Get a Single Phone Number Reservation

Gets a single Phone Number Reservation

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NumberReservationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NumberReservationsApi apiInstance = new NumberReservationsApi();
String numberReservationId = "numberReservationId_example"; // String | The number reservation id
try {
    RetrieveNumberReservationResponse result = apiInstance.retrieveNumberReservation(numberReservationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NumberReservationsApi#retrieveNumberReservation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **numberReservationId** | **String**| The number reservation id |

### Return type

[**RetrieveNumberReservationResponse**](RetrieveNumberReservationResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

