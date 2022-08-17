# SimCardsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulkSIMCardNetworkPreferences**](SimCardsApi.md#bulkSIMCardNetworkPreferences) | **PUT** /actions/network_preferences/sim_cards | Bulk Network Preferences for SIM cards
[**bulkSetPublicIPs**](SimCardsApi.md#bulkSetPublicIPs) | **POST** /sim_cards/actions/bulk_set_public_ips | Request bulk setting SIM card public IPs.
[**deleteNetworkPreference**](SimCardsApi.md#deleteNetworkPreference) | **POST** /sim_cards/{id}/actions/delete_network_preferences | Delete network preferences for a SIM card
[**listSimCardDataUsageNotifications**](SimCardsApi.md#listSimCardDataUsageNotifications) | **GET** /sim_card_data_usage_notifications | List SIM card data usage notifications
[**postValidateRegistrationCodes**](SimCardsApi.md#postValidateRegistrationCodes) | **POST** /sim_cards/actions/validate_registration_codes | Validate SIM cards registration codes
[**removeSIMCardPublicIP**](SimCardsApi.md#removeSIMCardPublicIP) | **POST** /sim_cards/{id}/actions/remove_public_ip | Request removing a SIM card public IP
[**sIMCardDeviceDetailsGet**](SimCardsApi.md#sIMCardDeviceDetailsGet) | **GET** /sim_cards/{sim_card_id}/device_details | Get SIM card device details
[**sIMCardNetworkPreferencesDelete**](SimCardsApi.md#sIMCardNetworkPreferencesDelete) | **DELETE** /sim_cards/{sim_card_id}/network_preferences | DELETE network preferences
[**sIMCardNetworkPreferencesGet**](SimCardsApi.md#sIMCardNetworkPreferencesGet) | **GET** /sim_cards/{sim_card_id}/network_preferences | Get network preferences
[**sIMCardNetworkPreferencesPut**](SimCardsApi.md#sIMCardNetworkPreferencesPut) | **PUT** /sim_cards/{sim_card_id}/network_preferences | Set network preferences
[**sIMCardPublicIPGet**](SimCardsApi.md#sIMCardPublicIPGet) | **GET** /sim_cards/{sim_card_id}/public_ip | Get SIM card public IP definition
[**setNetworkPreference**](SimCardsApi.md#setNetworkPreference) | **POST** /sim_cards/{id}/actions/set_network_preferences | Create or update network preferences for a SIM card
[**setSIMCardPublicIP**](SimCardsApi.md#setSIMCardPublicIP) | **POST** /sim_cards/{id}/actions/set_public_ip | Request setting a SIM card public IP
[**simCardDataUsageNotificationsDelete**](SimCardsApi.md#simCardDataUsageNotificationsDelete) | **DELETE** /sim_card_data_usage_notifications/{id} | Delete SIM card data usage notifications
[**simCardDataUsageNotificationsGet**](SimCardsApi.md#simCardDataUsageNotificationsGet) | **GET** /sim_card_data_usage_notifications/{id} | Get a single SIM card data usage notification
[**simCardDataUsageNotificationsPatch**](SimCardsApi.md#simCardDataUsageNotificationsPatch) | **PATCH** /sim_card_data_usage_notifications/{id} | Updates information for a SIM Card Data Usage Notification
[**simCardDataUsageNotificationsPost**](SimCardsApi.md#simCardDataUsageNotificationsPost) | **POST** /sim_card_data_usage_notifications | Create a new SIM card data usage notification
[**simCardDelete**](SimCardsApi.md#simCardDelete) | **DELETE** /sim_cards/{id} | Deletes a SIM card
[**simCardDisable**](SimCardsApi.md#simCardDisable) | **POST** /sim_cards/{id}/actions/disable | Request a SIM card disable
[**simCardEnable**](SimCardsApi.md#simCardEnable) | **POST** /sim_cards/{id}/actions/enable | Request a SIM card enable
[**simCardGet**](SimCardsApi.md#simCardGet) | **GET** /sim_cards/{id} | Get SIM card
[**simCardRegister**](SimCardsApi.md#simCardRegister) | **POST** /actions/register/sim_cards | Register SIM cards
[**simCardSetStandby**](SimCardsApi.md#simCardSetStandby) | **POST** /sim_cards/{id}/actions/set_standby | Request setting a SIM card to standby
[**simCardUpdate**](SimCardsApi.md#simCardUpdate) | **PATCH** /sim_cards/{id} | Update a SIM card
[**simCardsGet**](SimCardsApi.md#simCardsGet) | **GET** /sim_cards | Get all SIM cards
[**wirelessConnectivityLogsGet**](SimCardsApi.md#wirelessConnectivityLogsGet) | **GET** /sim_cards/{sim_card_id}/wireless_connectivity_logs | List wireless connectivity logs



## bulkSIMCardNetworkPreferences

> BulkSIMCardNetworkPreferences202Response bulkSIMCardNetworkPreferences(bulkSIMCardNetworkPreferencesRequest)

Bulk Network Preferences for SIM cards

This API allows dispatching the same operation described for the PUT sim_cards/:sim_card_id/network_preferences API for multiple SIM cards at once.<br/><br/>
Although, a SIM card network preference may fail individually under any validation triggered as a consequence of its state. For example, a SIM can't have an in-progress OTA update for applying a Network Preference, so they'll fail when requested in this API. In that scenario, the specific error will be present in the response along with the successful definitions in the "errors" response node.


### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.SimCardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        SimCardsApi apiInstance = new SimCardsApi(defaultClient);
        BulkSIMCardNetworkPreferencesRequest bulkSIMCardNetworkPreferencesRequest = new BulkSIMCardNetworkPreferencesRequest(); // BulkSIMCardNetworkPreferencesRequest | 
        try {
            BulkSIMCardNetworkPreferences202Response result = apiInstance.bulkSIMCardNetworkPreferences(bulkSIMCardNetworkPreferencesRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardsApi#bulkSIMCardNetworkPreferences");
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
 **bulkSIMCardNetworkPreferencesRequest** | [**BulkSIMCardNetworkPreferencesRequest**](BulkSIMCardNetworkPreferencesRequest.md)|  | [optional]

### Return type

[**BulkSIMCardNetworkPreferences202Response**](BulkSIMCardNetworkPreferences202Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** |  |  -  |
| **422** | Unprocessable entity. Check the &#39;detail&#39; field in response for details. |  -  |


## bulkSetPublicIPs

> BulkSetPublicIPs202Response bulkSetPublicIPs(bulkSetPublicIPsRequest)

Request bulk setting SIM card public IPs.

This API triggers an asynchronous operation to set a public IP for each of the specified SIM cards.<br/>
For each SIM Card a SIM Card Action will be generated. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developersdev.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API.


### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.SimCardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        SimCardsApi apiInstance = new SimCardsApi(defaultClient);
        BulkSetPublicIPsRequest bulkSetPublicIPsRequest = new BulkSetPublicIPsRequest(); // BulkSetPublicIPsRequest | 
        try {
            BulkSetPublicIPs202Response result = apiInstance.bulkSetPublicIPs(bulkSetPublicIPsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardsApi#bulkSetPublicIPs");
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
 **bulkSetPublicIPsRequest** | [**BulkSetPublicIPsRequest**](BulkSetPublicIPsRequest.md)|  | [optional]

### Return type

[**BulkSetPublicIPs202Response**](BulkSetPublicIPs202Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful Response |  -  |
| **422** | Unprocessable entity. Check the &#39;detail&#39; field in response for details. |  -  |


## deleteNetworkPreference

> SimCardActionGet200Response deleteNetworkPreference(id)

Delete network preferences for a SIM card

This API deletes network preferences for a SIM card.<br/>
The API will trigger an asynchronous operation called a SIM Card Action. Creating network preferences may take a period of time. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developersdev.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API.


### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.SimCardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        SimCardsApi apiInstance = new SimCardsApi(defaultClient);
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the resource.
        try {
            SimCardActionGet200Response result = apiInstance.deleteNetworkPreference(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardsApi#deleteNetworkPreference");
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

[**SimCardActionGet200Response**](SimCardActionGet200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful Response |  -  |
| **422** | Unprocessable entity. Check the &#39;detail&#39; field in response for details. |  -  |
| **0** | Unexpected error |  -  |


## listSimCardDataUsageNotifications

> ListSimCardDataUsageNotifications200Response listSimCardDataUsageNotifications(pageNumber, pageSize, filterSimCardId)

List SIM card data usage notifications

Lists a paginated collection of SIM card data usage notifications. It enables exploring the collection using specific filters.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.SimCardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        SimCardsApi apiInstance = new SimCardsApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        UUID filterSimCardId = UUID.fromString("47a1c2b0-cc7b-4ab1-bb98-b33fb0fc61b9"); // UUID | A valid SIM card ID.
        try {
            ListSimCardDataUsageNotifications200Response result = apiInstance.listSimCardDataUsageNotifications(pageNumber, pageSize, filterSimCardId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardsApi#listSimCardDataUsageNotifications");
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
 **filterSimCardId** | **UUID**| A valid SIM card ID. | [optional]

### Return type

[**ListSimCardDataUsageNotifications200Response**](ListSimCardDataUsageNotifications200Response.md)

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


## postValidateRegistrationCodes

> SIMCardRegistrationCodeValidations postValidateRegistrationCodes(postValidateRegistrationCodesRequest)

Validate SIM cards registration codes

It validates whether SIM card registration codes are valid or not.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.SimCardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        SimCardsApi apiInstance = new SimCardsApi(defaultClient);
        PostValidateRegistrationCodesRequest postValidateRegistrationCodesRequest = new PostValidateRegistrationCodesRequest(); // PostValidateRegistrationCodesRequest | 
        try {
            SIMCardRegistrationCodeValidations result = apiInstance.postValidateRegistrationCodes(postValidateRegistrationCodesRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardsApi#postValidateRegistrationCodes");
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
 **postValidateRegistrationCodesRequest** | [**PostValidateRegistrationCodesRequest**](PostValidateRegistrationCodesRequest.md)|  |

### Return type

[**SIMCardRegistrationCodeValidations**](SIMCardRegistrationCodeValidations.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful |  -  |
| **0** | Unexpected error |  -  |


## removeSIMCardPublicIP

> SimCardActionGet200Response removeSIMCardPublicIP(id)

Request removing a SIM card public IP

This API removes an existing public IP from a SIM card. <br/><br/>
 The API will trigger an asynchronous operation called a SIM Card Action. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developers.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.SimCardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        SimCardsApi apiInstance = new SimCardsApi(defaultClient);
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the resource.
        try {
            SimCardActionGet200Response result = apiInstance.removeSIMCardPublicIP(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardsApi#removeSIMCardPublicIP");
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

[**SimCardActionGet200Response**](SimCardActionGet200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful Response |  -  |
| **0** | Unexpected error |  -  |


## sIMCardDeviceDetailsGet

> SIMCardDeviceDetailsGet200Response sIMCardDeviceDetailsGet(simCardId)

Get SIM card device details

It returns the device details where a SIM card is currently being used.


### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.SimCardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        SimCardsApi apiInstance = new SimCardsApi(defaultClient);
        UUID simCardId = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies a SIM card.
        try {
            SIMCardDeviceDetailsGet200Response result = apiInstance.sIMCardDeviceDetailsGet(simCardId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardsApi#sIMCardDeviceDetailsGet");
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
 **simCardId** | **UUID**| Identifies a SIM card. |

### Return type

[**SIMCardDeviceDetailsGet200Response**](SIMCardDeviceDetailsGet200Response.md)

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


## sIMCardNetworkPreferencesDelete

> SIMCardNetworkPreferencesGet200Response sIMCardNetworkPreferencesDelete(simCardId)

DELETE network preferences

This API asynchronously removes the custom-defined network preferences settings. After this operation is done the Telnyx default settings, the same applied for an unaltered SIM card, will be in place.


### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.SimCardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        SimCardsApi apiInstance = new SimCardsApi(defaultClient);
        UUID simCardId = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies a SIM card.
        try {
            SIMCardNetworkPreferencesGet200Response result = apiInstance.sIMCardNetworkPreferencesDelete(simCardId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardsApi#sIMCardNetworkPreferencesDelete");
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
 **simCardId** | **UUID**| Identifies a SIM card. |

### Return type

[**SIMCardNetworkPreferencesGet200Response**](SIMCardNetworkPreferencesGet200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | A successful network preferences deletion response. &lt;br/&gt;&lt;br/&gt; The delete won&#39;t be done right away - this is an asynchronous operation. The request will return the resource with an in-progress OTA update resource (in the ota_updates node) representing the delete operation. Similarly to the PUT API, the resource will only be deleted when the OTA updated is successfully completed. |  -  |
| **0** | Unexpected error |  -  |


## sIMCardNetworkPreferencesGet

> SIMCardNetworkPreferencesGet200Response sIMCardNetworkPreferencesGet(simCardId, includeOtaUpdates)

Get network preferences

It returns the network preferences currently applied in the SIM card.


### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.SimCardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        SimCardsApi apiInstance = new SimCardsApi(defaultClient);
        UUID simCardId = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies a SIM card.
        Boolean includeOtaUpdates = false; // Boolean | It includes the associated OTA update objects in the response when present.
        try {
            SIMCardNetworkPreferencesGet200Response result = apiInstance.sIMCardNetworkPreferencesGet(simCardId, includeOtaUpdates);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardsApi#sIMCardNetworkPreferencesGet");
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
 **simCardId** | **UUID**| Identifies a SIM card. |
 **includeOtaUpdates** | **Boolean**| It includes the associated OTA update objects in the response when present. | [optional] [default to false]

### Return type

[**SIMCardNetworkPreferencesGet200Response**](SIMCardNetworkPreferencesGet200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful network preferences definition response. |  -  |
| **0** | Unexpected error |  -  |


## sIMCardNetworkPreferencesPut

> SIMCardNetworkPreferencesGet200Response sIMCardNetworkPreferencesPut(simCardId, siMCardNetworkPreferencesPutRequest)

Set network preferences

This API allows setting or updating a SIM card network preference. <br/><br/>
Every SIM card has default network preferences defined on Telnyx. These preferences will determine how a SIMCard will connect to the network by considering a list of preferable operators.<br/><br/>
There can be multiple scenarios where an operator can be preferred over another, for example, when a specific mobile operator can provide better network latency or better pricing.


### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.SimCardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        SimCardsApi apiInstance = new SimCardsApi(defaultClient);
        UUID simCardId = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies a SIM card.
        SIMCardNetworkPreferencesPutRequest siMCardNetworkPreferencesPutRequest = new SIMCardNetworkPreferencesPutRequest(); // SIMCardNetworkPreferencesPutRequest | 
        try {
            SIMCardNetworkPreferencesGet200Response result = apiInstance.sIMCardNetworkPreferencesPut(simCardId, siMCardNetworkPreferencesPutRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardsApi#sIMCardNetworkPreferencesPut");
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
 **simCardId** | **UUID**| Identifies a SIM card. |
 **siMCardNetworkPreferencesPutRequest** | [**SIMCardNetworkPreferencesPutRequest**](SIMCardNetworkPreferencesPutRequest.md)|  | [optional]

### Return type

[**SIMCardNetworkPreferencesGet200Response**](SIMCardNetworkPreferencesGet200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | A successful network preferences definition response. &lt;br/&gt;&lt;br/&gt; The sent mobile_operator_networks_preferences parameter won&#39;t be applied to the main resource right away - this is an asynchronous operation. While interacting with this API, you will face the following scenarios:    * The first request for this API will return an empty mobile_operator_networks_preferences with an in-progress OTA update resource in the ota_updates node containing the exact sent parameters to indicate the operation progress. The value will be applied to the principal object when the OTA update finishes its processing, thus indicating the SIM card network preference current state.    * The subsequent requests will contain the current state, that is what&#39;s applied to the SIM card settings, and return the related OTA update in the ota_updates node.    The returned OTA updated (present in the ota_updates node) will, by default, be the resource related to the operation, not all of them. |  -  |
| **0** | Unexpected error |  -  |


## sIMCardPublicIPGet

> SIMCardPublicIPGet200Response sIMCardPublicIPGet(simCardId)

Get SIM card public IP definition

It returns the public IP requested for a SIM card.


### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.SimCardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        SimCardsApi apiInstance = new SimCardsApi(defaultClient);
        UUID simCardId = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies a SIM card.
        try {
            SIMCardPublicIPGet200Response result = apiInstance.sIMCardPublicIPGet(simCardId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardsApi#sIMCardPublicIPGet");
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
 **simCardId** | **UUID**| Identifies a SIM card. |

### Return type

[**SIMCardPublicIPGet200Response**](SIMCardPublicIPGet200Response.md)

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


## setNetworkPreference

> SimCardActionGet200Response setNetworkPreference(id)

Create or update network preferences for a SIM card

This API sets network preferences for a SIM card.<br/>
Every SIM card has default network preferences defined on Telnyx. These preferences will determine how a SIMCard will connect to the network by considering a list of preferable operators.<br/><br/>
The SIM card needs to be attached to the network so this can connect and SMS must be available, otherwise, the operation will fail. This preference will only be respected if the network is available, otherwise the strongest signal will be used. <br/><br/>
The API will trigger an asynchronous operation called a SIM Card Action. Creating network preferences may take a period of time. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developersdev.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API.


### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.SimCardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        SimCardsApi apiInstance = new SimCardsApi(defaultClient);
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the resource.
        try {
            SimCardActionGet200Response result = apiInstance.setNetworkPreference(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardsApi#setNetworkPreference");
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

[**SimCardActionGet200Response**](SimCardActionGet200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful Response |  -  |
| **422** | Unprocessable entity. Check the &#39;detail&#39; field in response for details. |  -  |
| **0** | Unexpected error |  -  |


## setSIMCardPublicIP

> SimCardActionGet200Response setSIMCardPublicIP(id)

Request setting a SIM card public IP

This API makes a SIM card reachable on the public internet by mapping a random public IP to the SIM card. <br/><br/>
 The API will trigger an asynchronous operation called a SIM Card Action. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developers.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API. <br/><br/>
 Setting a Public IP to a SIM Card incurs a charge and will only succeed if the account has sufficient funds.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.SimCardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        SimCardsApi apiInstance = new SimCardsApi(defaultClient);
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the resource.
        try {
            SimCardActionGet200Response result = apiInstance.setSIMCardPublicIP(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardsApi#setSIMCardPublicIP");
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

[**SimCardActionGet200Response**](SimCardActionGet200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful Response |  -  |
| **0** | Unexpected error |  -  |


## simCardDataUsageNotificationsDelete

> SimCardDataUsageNotificationsPost201Response simCardDataUsageNotificationsDelete(id)

Delete SIM card data usage notifications

Delete the SIM Card Data Usage Notification.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.SimCardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        SimCardsApi apiInstance = new SimCardsApi(defaultClient);
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the resource.
        try {
            SimCardDataUsageNotificationsPost201Response result = apiInstance.simCardDataUsageNotificationsDelete(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardsApi#simCardDataUsageNotificationsDelete");
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

[**SimCardDataUsageNotificationsPost201Response**](SimCardDataUsageNotificationsPost201Response.md)

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


## simCardDataUsageNotificationsGet

> SimCardDataUsageNotificationsPost201Response simCardDataUsageNotificationsGet(id)

Get a single SIM card data usage notification

Get a single SIM Card Data Usage Notification.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.SimCardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        SimCardsApi apiInstance = new SimCardsApi(defaultClient);
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the resource.
        try {
            SimCardDataUsageNotificationsPost201Response result = apiInstance.simCardDataUsageNotificationsGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardsApi#simCardDataUsageNotificationsGet");
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

[**SimCardDataUsageNotificationsPost201Response**](SimCardDataUsageNotificationsPost201Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **404** | Resource not found |  -  |
| **0** | Unexpected error |  -  |


## simCardDataUsageNotificationsPatch

> SimCardDataUsageNotificationsPost201Response simCardDataUsageNotificationsPatch(id, simCardDataUsageNotification)

Updates information for a SIM Card Data Usage Notification

Updates information for a SIM Card Data Usage Notification.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.SimCardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        SimCardsApi apiInstance = new SimCardsApi(defaultClient);
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the resource.
        SimCardDataUsageNotification simCardDataUsageNotification = new SimCardDataUsageNotification(); // SimCardDataUsageNotification | 
        try {
            SimCardDataUsageNotificationsPost201Response result = apiInstance.simCardDataUsageNotificationsPatch(id, simCardDataUsageNotification);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardsApi#simCardDataUsageNotificationsPatch");
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
 **simCardDataUsageNotification** | [**SimCardDataUsageNotification**](SimCardDataUsageNotification.md)|  |

### Return type

[**SimCardDataUsageNotificationsPost201Response**](SimCardDataUsageNotificationsPost201Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **0** | Unexpected error |  -  |


## simCardDataUsageNotificationsPost

> SimCardDataUsageNotificationsPost201Response simCardDataUsageNotificationsPost(simCardDataUsageNotificationsPostRequest)

Create a new SIM card data usage notification

Creates a new SIM card data usage notification.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.SimCardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        SimCardsApi apiInstance = new SimCardsApi(defaultClient);
        SimCardDataUsageNotificationsPostRequest simCardDataUsageNotificationsPostRequest = new SimCardDataUsageNotificationsPostRequest(); // SimCardDataUsageNotificationsPostRequest | 
        try {
            SimCardDataUsageNotificationsPost201Response result = apiInstance.simCardDataUsageNotificationsPost(simCardDataUsageNotificationsPostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardsApi#simCardDataUsageNotificationsPost");
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
 **simCardDataUsageNotificationsPostRequest** | [**SimCardDataUsageNotificationsPostRequest**](SimCardDataUsageNotificationsPostRequest.md)|  |

### Return type

[**SimCardDataUsageNotificationsPost201Response**](SimCardDataUsageNotificationsPost201Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response |  -  |
| **0** | Unexpected error |  -  |


## simCardDelete

> SimCardGet200Response simCardDelete(id)

Deletes a SIM card

The SIM card will be decommissioned, removed from your account and you will stop being charged.<br />The SIM card won't be able to connect to the network after the deletion is completed, thus making it impossible to consume data.<br/>
Transitioning to the disabled state may take a period of time.</br>
Until the transition is completed, the SIM card status will be disabling <code>disabling</code>.<br />In order to re-enable the SIM card, you will need to re-register it.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.SimCardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        SimCardsApi apiInstance = new SimCardsApi(defaultClient);
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the resource.
        try {
            SimCardGet200Response result = apiInstance.simCardDelete(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardsApi#simCardDelete");
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

[**SimCardGet200Response**](SimCardGet200Response.md)

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


## simCardDisable

> SimCardActionGet200Response simCardDisable(id)

Request a SIM card disable

This API disables a SIM card, disconnecting it from the network and making it impossible to consume data.<br/>
The API will trigger an asynchronous operation called a SIM Card Action. Transitioning to the disabled state may take a period of time. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developers.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API.


### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.SimCardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        SimCardsApi apiInstance = new SimCardsApi(defaultClient);
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the resource.
        try {
            SimCardActionGet200Response result = apiInstance.simCardDisable(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardsApi#simCardDisable");
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

[**SimCardActionGet200Response**](SimCardActionGet200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful Response |  -  |
| **0** | Unexpected error |  -  |


## simCardEnable

> SimCardActionGet200Response simCardEnable(id)

Request a SIM card enable

This API enables a SIM card, connecting it to the network and making it possible to consume data.<br/>
To enable a SIM card, it must be associated with a SIM card group.<br/>
The API will trigger an asynchronous operation called a SIM Card Action. Transitioning to the enabled state may take a period of time. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developers.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API.


### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.SimCardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        SimCardsApi apiInstance = new SimCardsApi(defaultClient);
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the resource.
        try {
            SimCardActionGet200Response result = apiInstance.simCardEnable(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardsApi#simCardEnable");
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

[**SimCardActionGet200Response**](SimCardActionGet200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful Response |  -  |
| **422** | Unprocessable entity. Check the &#39;detail&#39; field in response for details. |  -  |
| **0** | Unexpected error |  -  |


## simCardGet

> SimCardGet200Response simCardGet(id, includeSimCardGroup)

Get SIM card

Returns the details regarding a specific SIM card.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.SimCardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        SimCardsApi apiInstance = new SimCardsApi(defaultClient);
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the resource.
        Boolean includeSimCardGroup = false; // Boolean | It includes the associated SIM card group object in the response when present.
        try {
            SimCardGet200Response result = apiInstance.simCardGet(id, includeSimCardGroup);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardsApi#simCardGet");
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
 **includeSimCardGroup** | **Boolean**| It includes the associated SIM card group object in the response when present. | [optional] [default to false]

### Return type

[**SimCardGet200Response**](SimCardGet200Response.md)

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


## simCardRegister

> SimCardRegister202Response simCardRegister(siMCardRegistration)

Register SIM cards

Register the SIM cards associated with the provided registration codes to the current user's account.<br/><br/>
If <code>sim_card_group_id</code> is provided, the SIM cards will be associated with that group. Otherwise, the default group for the current user will be used.<br/><br/>


### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.SimCardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        SimCardsApi apiInstance = new SimCardsApi(defaultClient);
        SIMCardRegistration siMCardRegistration = new SIMCardRegistration(); // SIMCardRegistration | 
        try {
            SimCardRegister202Response result = apiInstance.simCardRegister(siMCardRegistration);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardsApi#simCardRegister");
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
 **siMCardRegistration** | [**SIMCardRegistration**](SIMCardRegistration.md)|  |

### Return type

[**SimCardRegister202Response**](SimCardRegister202Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful response |  -  |


## simCardSetStandby

> SimCardActionGet200Response simCardSetStandby(id)

Request setting a SIM card to standby

The SIM card will be able to connect to the network once the process to set it to standby has been completed, thus making it possible to consume data.<br/>
To set a SIM card to standby, it must be associated with SIM card group.<br/>
The API will trigger an asynchronous operation called a SIM Card Action. Transitioning to the standby state may take a period of time. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developers.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API.


### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.SimCardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        SimCardsApi apiInstance = new SimCardsApi(defaultClient);
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the resource.
        try {
            SimCardActionGet200Response result = apiInstance.simCardSetStandby(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardsApi#simCardSetStandby");
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

[**SimCardActionGet200Response**](SimCardActionGet200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful Response |  -  |
| **0** | Unexpected error |  -  |


## simCardUpdate

> SimCardGet200Response simCardUpdate(id, siMCard)

Update a SIM card

Updates SIM card data

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.SimCardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        SimCardsApi apiInstance = new SimCardsApi(defaultClient);
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the resource.
        SIMCard siMCard = new SIMCard(); // SIMCard | 
        try {
            SimCardGet200Response result = apiInstance.simCardUpdate(id, siMCard);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardsApi#simCardUpdate");
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
 **siMCard** | [**SIMCard**](SIMCard.md)|  |

### Return type

[**SimCardGet200Response**](SimCardGet200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **0** | Unexpected error |  -  |


## simCardsGet

> SimCardsGet200Response simCardsGet(pageNumber, pageSize, includeSimCardGroup, filterSimCardGroupId, filterTags, filterIccid, filterStatus)

Get all SIM cards

Get all SIM cards belonging to the user that match the given filters.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.SimCardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        SimCardsApi apiInstance = new SimCardsApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        Boolean includeSimCardGroup = false; // Boolean | It includes the associated SIM card group object in the response when present.
        UUID filterSimCardGroupId = UUID.fromString("47a1c2b0-cc7b-4ab1-bb98-b33fb0fc61b9"); // UUID | A valid SIM card group ID.
        List<String> filterTags = Arrays.asList(); // List<String> | A list of SIM card tags to filter on.<br/><br/> If the SIM card contains <b><i>all</i></b> of the given <code>tags</code> they will be found.<br/><br/> For example, if the SIM cards have the following tags: <ul>   <li><code>['customers', 'staff', 'test']</code>   <li><code>['test']</code></li>   <li><code>['customers']</code></li> </ul> Searching for <code>['customers', 'test']</code> returns only the first because it's the only one with both tags.<br/> Searching for <code>test</code> returns the first two SIMs, because both of them have such tag.<br/> Searching for <code>customers</code> returns the first and last SIMs.<br/> 
        String filterIccid = "89310410106543789301"; // String | A search string to partially match for the SIM card's ICCID.
        List<String> filterStatus = Arrays.asList(); // List<String> | Filter by a SIM card's status.
        try {
            SimCardsGet200Response result = apiInstance.simCardsGet(pageNumber, pageSize, includeSimCardGroup, filterSimCardGroupId, filterTags, filterIccid, filterStatus);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardsApi#simCardsGet");
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
 **includeSimCardGroup** | **Boolean**| It includes the associated SIM card group object in the response when present. | [optional] [default to false]
 **filterSimCardGroupId** | **UUID**| A valid SIM card group ID. | [optional]
 **filterTags** | **List&lt;String&gt;**| A list of SIM card tags to filter on.&lt;br/&gt;&lt;br/&gt; If the SIM card contains &lt;b&gt;&lt;i&gt;all&lt;/i&gt;&lt;/b&gt; of the given &lt;code&gt;tags&lt;/code&gt; they will be found.&lt;br/&gt;&lt;br/&gt; For example, if the SIM cards have the following tags: &lt;ul&gt;   &lt;li&gt;&lt;code&gt;[&#39;customers&#39;, &#39;staff&#39;, &#39;test&#39;]&lt;/code&gt;   &lt;li&gt;&lt;code&gt;[&#39;test&#39;]&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;[&#39;customers&#39;]&lt;/code&gt;&lt;/li&gt; &lt;/ul&gt; Searching for &lt;code&gt;[&#39;customers&#39;, &#39;test&#39;]&lt;/code&gt; returns only the first because it&#39;s the only one with both tags.&lt;br/&gt; Searching for &lt;code&gt;test&lt;/code&gt; returns the first two SIMs, because both of them have such tag.&lt;br/&gt; Searching for &lt;code&gt;customers&lt;/code&gt; returns the first and last SIMs.&lt;br/&gt;  | [optional]
 **filterIccid** | **String**| A search string to partially match for the SIM card&#39;s ICCID. | [optional]
 **filterStatus** | **List&lt;String&gt;**| Filter by a SIM card&#39;s status. | [optional] [enum: enabled, disabled, standby, data_limit_exceeded, unauthorized_imei]

### Return type

[**SimCardsGet200Response**](SimCardsGet200Response.md)

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


## wirelessConnectivityLogsGet

> WirelessConnectivityLogsGet200Response wirelessConnectivityLogsGet(simCardId, pageNumber, pageSize)

List wireless connectivity logs

This API allows listing a paginated collection of Wireless Connectivity Logs associated with a SIM Card, for troubleshooting purposes.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.SimCardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        SimCardsApi apiInstance = new SimCardsApi(defaultClient);
        UUID simCardId = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies a SIM card.
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        try {
            WirelessConnectivityLogsGet200Response result = apiInstance.wirelessConnectivityLogsGet(simCardId, pageNumber, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardsApi#wirelessConnectivityLogsGet");
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
 **simCardId** | **UUID**| Identifies a SIM card. |
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]

### Return type

[**WirelessConnectivityLogsGet200Response**](WirelessConnectivityLogsGet200Response.md)

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

