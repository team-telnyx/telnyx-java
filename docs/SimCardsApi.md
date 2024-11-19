# SimCardsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulkSimCardNetworkPreferences**](SimCardsApi.md#bulkSimCardNetworkPreferences) | **PUT** /actions/network_preferences/sim_cards | Bulk Network Preferences for SIM cards
[**deleteNetworkPreferences**](SimCardsApi.md#deleteNetworkPreferences) | **POST** /sim_cards/{id}/actions/delete_network_preferences | Delete network preferences for a SIM card
[**deleteSIMCardNetworkPreferences**](SimCardsApi.md#deleteSIMCardNetworkPreferences) | **DELETE** /sim_cards/{id}/network_preferences | Delete network preferences
[**deleteSimCard**](SimCardsApi.md#deleteSimCard) | **DELETE** /sim_cards/{id} | Deletes a SIM card
[**deleteSimCardDataUsageNotifications**](SimCardsApi.md#deleteSimCardDataUsageNotifications) | **DELETE** /sim_card_data_usage_notifications/{id} | Delete SIM card data usage notifications
[**disableSimCard**](SimCardsApi.md#disableSimCard) | **POST** /sim_cards/{id}/actions/disable | Request a SIM card disable
[**enableSimCard**](SimCardsApi.md#enableSimCard) | **POST** /sim_cards/{id}/actions/enable | Request a SIM card enable
[**getSimCard**](SimCardsApi.md#getSimCard) | **GET** /sim_cards/{id} | Get SIM card
[**getSimCardActivationCode**](SimCardsApi.md#getSimCardActivationCode) | **GET** /sim_cards/{id}/activation_code | Get activation code for an eSIM
[**getSimCardDataUsageNotification**](SimCardsApi.md#getSimCardDataUsageNotification) | **GET** /sim_card_data_usage_notifications/{id} | Get a single SIM card data usage notification
[**getSimCardDeviceDetails**](SimCardsApi.md#getSimCardDeviceDetails) | **GET** /sim_cards/{id}/device_details | Get SIM card device details
[**getSimCardNetworkPreferences**](SimCardsApi.md#getSimCardNetworkPreferences) | **GET** /sim_cards/{id}/network_preferences | Get network preferences
[**getSimCardPublicIp**](SimCardsApi.md#getSimCardPublicIp) | **GET** /sim_cards/{id}/public_ip | Get SIM card public IP definition
[**getSimCards**](SimCardsApi.md#getSimCards) | **GET** /sim_cards | Get all SIM cards
[**getWirelessConnectivityLogs**](SimCardsApi.md#getWirelessConnectivityLogs) | **GET** /sim_cards/{id}/wireless_connectivity_logs | List wireless connectivity logs
[**listDataUsageNotifications**](SimCardsApi.md#listDataUsageNotifications) | **GET** /sim_card_data_usage_notifications | List SIM card data usage notifications
[**patchSimCardDataUsageNotification**](SimCardsApi.md#patchSimCardDataUsageNotification) | **PATCH** /sim_card_data_usage_notifications/{id} | Updates information for a SIM Card Data Usage Notification
[**postSimCardDataUsageNotification**](SimCardsApi.md#postSimCardDataUsageNotification) | **POST** /sim_card_data_usage_notifications | Create a new SIM card data usage notification
[**purchaseESim**](SimCardsApi.md#purchaseESim) | **POST** /actions/purchase/esims | Purchase eSIMs
[**putSimCardNetworkPreferences**](SimCardsApi.md#putSimCardNetworkPreferences) | **PUT** /sim_cards/{id}/network_preferences | Set network preferences
[**registerSimCards**](SimCardsApi.md#registerSimCards) | **POST** /actions/register/sim_cards | Register SIM cards
[**removeSimCardPublicIp**](SimCardsApi.md#removeSimCardPublicIp) | **POST** /sim_cards/{id}/actions/remove_public_ip | Request removing a SIM card public IP
[**setNetworkPreference**](SimCardsApi.md#setNetworkPreference) | **POST** /sim_cards/{id}/actions/set_network_preferences | Create or update network preferences for a SIM card
[**setNetworkPreferencesBulk**](SimCardsApi.md#setNetworkPreferencesBulk) | **POST** /sim_cards/actions/bulk_set_network_preferences | Request bulk setting of network preferences for SIM cards.
[**setPublicIPsBulk**](SimCardsApi.md#setPublicIPsBulk) | **POST** /sim_cards/actions/bulk_set_public_ips | Request bulk setting SIM card public IPs.
[**setSimCardPublicIp**](SimCardsApi.md#setSimCardPublicIp) | **POST** /sim_cards/{id}/actions/set_public_ip | Request setting a SIM card public IP
[**setSimCardStandby**](SimCardsApi.md#setSimCardStandby) | **POST** /sim_cards/{id}/actions/set_standby | Request setting a SIM card to standby
[**updateSimCard**](SimCardsApi.md#updateSimCard) | **PATCH** /sim_cards/{id} | Update a SIM card
[**validateRegistrationCodes**](SimCardsApi.md#validateRegistrationCodes) | **POST** /sim_cards/actions/validate_registration_codes | Validate SIM cards registration codes



## bulkSimCardNetworkPreferences

> BulkSimCardNetworkPreferences202Response bulkSimCardNetworkPreferences(bulkSimCardNetworkPreferencesRequest)

Bulk Network Preferences for SIM cards

This API allows dispatching the same operation described for the PUT sim_cards/:id/network_preferences API for multiple SIM cards at once.<br/><br/>
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
        BulkSimCardNetworkPreferencesRequest bulkSimCardNetworkPreferencesRequest = new BulkSimCardNetworkPreferencesRequest(); // BulkSimCardNetworkPreferencesRequest | 
        try {
            BulkSimCardNetworkPreferences202Response result = apiInstance.bulkSimCardNetworkPreferences(bulkSimCardNetworkPreferencesRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardsApi#bulkSimCardNetworkPreferences");
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
 **bulkSimCardNetworkPreferencesRequest** | [**BulkSimCardNetworkPreferencesRequest**](BulkSimCardNetworkPreferencesRequest.md)|  | [optional]

### Return type

[**BulkSimCardNetworkPreferences202Response**](BulkSimCardNetworkPreferences202Response.md)

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


## deleteNetworkPreferences

> GetSimCardAction200Response deleteNetworkPreferences(id)

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
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the SIM.
        try {
            GetSimCardAction200Response result = apiInstance.deleteNetworkPreferences(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardsApi#deleteNetworkPreferences");
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
 **id** | **UUID**| Identifies the SIM. |

### Return type

[**GetSimCardAction200Response**](GetSimCardAction200Response.md)

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


## deleteSIMCardNetworkPreferences

> GetSimCardNetworkPreferences200Response deleteSIMCardNetworkPreferences(id)

Delete network preferences

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
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the SIM.
        try {
            GetSimCardNetworkPreferences200Response result = apiInstance.deleteSIMCardNetworkPreferences(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardsApi#deleteSIMCardNetworkPreferences");
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
 **id** | **UUID**| Identifies the SIM. |

### Return type

[**GetSimCardNetworkPreferences200Response**](GetSimCardNetworkPreferences200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | A successful network preferences deletion response. &lt;br/&gt;&lt;br/&gt; The delete won&#39;t be done right away - this is an asynchronous operation. The request will return the resource with an in-progress OTA update resource (in the ota_updates node) representing the delete operation. Similarly to the PUT API, the resource will only be deleted when the OTA updated is successfully completed. |  -  |
| **401** | Unauthorized |  -  |
| **0** | Unexpected error |  -  |


## deleteSimCard

> GetSimCard200Response deleteSimCard(id)

Deletes a SIM card

The SIM card will be decommissioned, removed from your account and you will stop being charged.<br />The SIM card won't be able to connect to the network after the deletion is completed, thus making it impossible to consume data.<br/>
Transitioning to the disabled state may take a period of time.
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
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the SIM.
        try {
            GetSimCard200Response result = apiInstance.deleteSimCard(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardsApi#deleteSimCard");
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
 **id** | **UUID**| Identifies the SIM. |

### Return type

[**GetSimCard200Response**](GetSimCard200Response.md)

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
| **0** | Unexpected error |  -  |


## deleteSimCardDataUsageNotifications

> PostSimCardDataUsageNotification201Response deleteSimCardDataUsageNotifications(id)

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
            PostSimCardDataUsageNotification201Response result = apiInstance.deleteSimCardDataUsageNotifications(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardsApi#deleteSimCardDataUsageNotifications");
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

[**PostSimCardDataUsageNotification201Response**](PostSimCardDataUsageNotification201Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **401** | Unauthorized |  -  |
| **0** | Unexpected error |  -  |


## disableSimCard

> GetSimCardAction200Response disableSimCard(id)

Request a SIM card disable

This API disables a SIM card, disconnecting it from the network and making it impossible to consume data.<br/>
The API will trigger an asynchronous operation called a SIM Card Action. Transitioning to the disabled state may take a period of time. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developersdev.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API.


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
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the SIM.
        try {
            GetSimCardAction200Response result = apiInstance.disableSimCard(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardsApi#disableSimCard");
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
 **id** | **UUID**| Identifies the SIM. |

### Return type

[**GetSimCardAction200Response**](GetSimCardAction200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful Response |  -  |
| **401** | Unauthorized |  -  |
| **0** | Unexpected error |  -  |


## enableSimCard

> GetSimCardAction200Response enableSimCard(id)

Request a SIM card enable

This API enables a SIM card, connecting it to the network and making it possible to consume data.<br/>
To enable a SIM card, it must be associated with a SIM card group.<br/>
The API will trigger an asynchronous operation called a SIM Card Action. Transitioning to the enabled state may take a period of time. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developersdev.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API.


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
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the SIM.
        try {
            GetSimCardAction200Response result = apiInstance.enableSimCard(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardsApi#enableSimCard");
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
 **id** | **UUID**| Identifies the SIM. |

### Return type

[**GetSimCardAction200Response**](GetSimCardAction200Response.md)

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


## getSimCard

> GetSimCard200Response getSimCard(id, includeSimCardGroup)

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
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the SIM.
        Boolean includeSimCardGroup = false; // Boolean | It includes the associated SIM card group object in the response when present.
        try {
            GetSimCard200Response result = apiInstance.getSimCard(id, includeSimCardGroup);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardsApi#getSimCard");
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
 **id** | **UUID**| Identifies the SIM. |
 **includeSimCardGroup** | **Boolean**| It includes the associated SIM card group object in the response when present. | [optional] [default to false]

### Return type

[**GetSimCard200Response**](GetSimCard200Response.md)

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
| **0** | Unexpected error |  -  |


## getSimCardActivationCode

> GetSimCardActivationCode200Response getSimCardActivationCode(id)

Get activation code for an eSIM

It returns the activation code for an eSIM.<br/><br/>
 This API is only available for eSIMs. If the given SIM is a physical SIM card, or has already been installed, an error will be returned.


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
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the SIM.
        try {
            GetSimCardActivationCode200Response result = apiInstance.getSimCardActivationCode(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardsApi#getSimCardActivationCode");
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
 **id** | **UUID**| Identifies the SIM. |

### Return type

[**GetSimCardActivationCode200Response**](GetSimCardActivationCode200Response.md)

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
| **0** | Unexpected error |  -  |


## getSimCardDataUsageNotification

> PostSimCardDataUsageNotification201Response getSimCardDataUsageNotification(id)

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
            PostSimCardDataUsageNotification201Response result = apiInstance.getSimCardDataUsageNotification(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardsApi#getSimCardDataUsageNotification");
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

[**PostSimCardDataUsageNotification201Response**](PostSimCardDataUsageNotification201Response.md)

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


## getSimCardDeviceDetails

> GetSimCardDeviceDetails200Response getSimCardDeviceDetails(id)

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
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the SIM.
        try {
            GetSimCardDeviceDetails200Response result = apiInstance.getSimCardDeviceDetails(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardsApi#getSimCardDeviceDetails");
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
 **id** | **UUID**| Identifies the SIM. |

### Return type

[**GetSimCardDeviceDetails200Response**](GetSimCardDeviceDetails200Response.md)

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
| **0** | Unexpected error |  -  |


## getSimCardNetworkPreferences

> GetSimCardNetworkPreferences200Response getSimCardNetworkPreferences(id, includeOtaUpdates)

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
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the SIM.
        Boolean includeOtaUpdates = false; // Boolean | It includes the associated OTA update objects in the response when present.
        try {
            GetSimCardNetworkPreferences200Response result = apiInstance.getSimCardNetworkPreferences(id, includeOtaUpdates);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardsApi#getSimCardNetworkPreferences");
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
 **id** | **UUID**| Identifies the SIM. |
 **includeOtaUpdates** | **Boolean**| It includes the associated OTA update objects in the response when present. | [optional] [default to false]

### Return type

[**GetSimCardNetworkPreferences200Response**](GetSimCardNetworkPreferences200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful network preferences definition response. |  -  |
| **401** | Unauthorized |  -  |
| **0** | Unexpected error |  -  |


## getSimCardPublicIp

> GetSimCardPublicIp200Response getSimCardPublicIp(id)

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
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the SIM.
        try {
            GetSimCardPublicIp200Response result = apiInstance.getSimCardPublicIp(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardsApi#getSimCardPublicIp");
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
 **id** | **UUID**| Identifies the SIM. |

### Return type

[**GetSimCardPublicIp200Response**](GetSimCardPublicIp200Response.md)

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
| **0** | Unexpected error |  -  |


## getSimCards

> GetSimCards200Response getSimCards(pageNumber, pageSize, includeSimCardGroup, filterSimCardGroupId, filterTags, filterIccid, filterStatus, sort)

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
        List<String> filterTags = Arrays.asList(); // List<String> | A list of SIM card tags to filter on.<br/><br/>  If the SIM card contains <b><i>all</i></b> of the given <code>tags</code> they will be found.<br/><br/> For example, if the SIM cards have the following tags: <ul>   <li><code>['customers', 'staff', 'test']</code>   <li><code>['test']</code></li>   <li><code>['customers']</code></li> </ul> Searching for <code>['customers', 'test']</code> returns only the first because it's the only one with both tags.<br/> Searching for <code>test</code> returns the first two SIMs, because both of them have such tag.<br/> Searching for <code>customers</code> returns the first and last SIMs.<br/> 
        String filterIccid = "89310410106543789301"; // String | A search string to partially match for the SIM card's ICCID.
        List<String> filterStatus = Arrays.asList(); // List<String> | Filter by a SIM card's status.
        String sort = "current_billing_period_consumed_data.amount"; // String | Sorts SIM cards by the given field. Defaults to ascending order unless field is prefixed with a minus sign.
        try {
            GetSimCards200Response result = apiInstance.getSimCards(pageNumber, pageSize, includeSimCardGroup, filterSimCardGroupId, filterTags, filterIccid, filterStatus, sort);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardsApi#getSimCards");
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
 **filterTags** | **List&lt;String&gt;**| A list of SIM card tags to filter on.&lt;br/&gt;&lt;br/&gt;  If the SIM card contains &lt;b&gt;&lt;i&gt;all&lt;/i&gt;&lt;/b&gt; of the given &lt;code&gt;tags&lt;/code&gt; they will be found.&lt;br/&gt;&lt;br/&gt; For example, if the SIM cards have the following tags: &lt;ul&gt;   &lt;li&gt;&lt;code&gt;[&#39;customers&#39;, &#39;staff&#39;, &#39;test&#39;]&lt;/code&gt;   &lt;li&gt;&lt;code&gt;[&#39;test&#39;]&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;[&#39;customers&#39;]&lt;/code&gt;&lt;/li&gt; &lt;/ul&gt; Searching for &lt;code&gt;[&#39;customers&#39;, &#39;test&#39;]&lt;/code&gt; returns only the first because it&#39;s the only one with both tags.&lt;br/&gt; Searching for &lt;code&gt;test&lt;/code&gt; returns the first two SIMs, because both of them have such tag.&lt;br/&gt; Searching for &lt;code&gt;customers&lt;/code&gt; returns the first and last SIMs.&lt;br/&gt;  | [optional]
 **filterIccid** | **String**| A search string to partially match for the SIM card&#39;s ICCID. | [optional]
 **filterStatus** | **List&lt;String&gt;**| Filter by a SIM card&#39;s status. | [optional] [enum: enabled, disabled, standby, data_limit_exceeded, unauthorized_imei]
 **sort** | **String**| Sorts SIM cards by the given field. Defaults to ascending order unless field is prefixed with a minus sign. | [optional] [enum: current_billing_period_consumed_data.amount]

### Return type

[**GetSimCards200Response**](GetSimCards200Response.md)

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
| **0** | Unexpected error |  -  |


## getWirelessConnectivityLogs

> GetWirelessConnectivityLogs200Response getWirelessConnectivityLogs(id, pageNumber, pageSize)

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
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the SIM.
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        try {
            GetWirelessConnectivityLogs200Response result = apiInstance.getWirelessConnectivityLogs(id, pageNumber, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardsApi#getWirelessConnectivityLogs");
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
 **id** | **UUID**| Identifies the SIM. |
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]

### Return type

[**GetWirelessConnectivityLogs200Response**](GetWirelessConnectivityLogs200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **401** | Unauthorized |  -  |
| **0** | Unexpected error |  -  |


## listDataUsageNotifications

> ListDataUsageNotifications200Response listDataUsageNotifications(pageNumber, pageSize, filterSimCardId)

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
            ListDataUsageNotifications200Response result = apiInstance.listDataUsageNotifications(pageNumber, pageSize, filterSimCardId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardsApi#listDataUsageNotifications");
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

[**ListDataUsageNotifications200Response**](ListDataUsageNotifications200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **401** | Unauthorized |  -  |
| **0** | Unexpected error |  -  |


## patchSimCardDataUsageNotification

> PostSimCardDataUsageNotification201Response patchSimCardDataUsageNotification(id, simCardDataUsageNotification)

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
            PostSimCardDataUsageNotification201Response result = apiInstance.patchSimCardDataUsageNotification(id, simCardDataUsageNotification);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardsApi#patchSimCardDataUsageNotification");
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

[**PostSimCardDataUsageNotification201Response**](PostSimCardDataUsageNotification201Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **401** | Unauthorized |  -  |
| **0** | Unexpected error |  -  |


## postSimCardDataUsageNotification

> PostSimCardDataUsageNotification201Response postSimCardDataUsageNotification(postSimCardDataUsageNotificationRequest)

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
        PostSimCardDataUsageNotificationRequest postSimCardDataUsageNotificationRequest = new PostSimCardDataUsageNotificationRequest(); // PostSimCardDataUsageNotificationRequest | 
        try {
            PostSimCardDataUsageNotification201Response result = apiInstance.postSimCardDataUsageNotification(postSimCardDataUsageNotificationRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardsApi#postSimCardDataUsageNotification");
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
 **postSimCardDataUsageNotificationRequest** | [**PostSimCardDataUsageNotificationRequest**](PostSimCardDataUsageNotificationRequest.md)|  |

### Return type

[**PostSimCardDataUsageNotification201Response**](PostSimCardDataUsageNotification201Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful Response |  -  |
| **401** | Unauthorized |  -  |
| **0** | Unexpected error |  -  |


## purchaseESim

> PurchaseESim202Response purchaseESim(esimPurchase)

Purchase eSIMs

Purchases and registers the specified amount of eSIMs to the current user's account.<br/><br/>
If <code>sim_card_group_id</code> is provided, the eSIMs will be associated with that group. Otherwise, the default group for the current user will be used.<br/><br/>


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
        ESimPurchase esimPurchase = new ESimPurchase(); // ESimPurchase | 
        try {
            PurchaseESim202Response result = apiInstance.purchaseESim(esimPurchase);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardsApi#purchaseESim");
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
 **esimPurchase** | [**ESimPurchase**](ESimPurchase.md)|  |

### Return type

[**PurchaseESim202Response**](PurchaseESim202Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful response |  -  |
| **401** | Unauthorized |  -  |


## putSimCardNetworkPreferences

> GetSimCardNetworkPreferences200Response putSimCardNetworkPreferences(id, putSimCardNetworkPreferencesRequest)

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
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the SIM.
        PutSimCardNetworkPreferencesRequest putSimCardNetworkPreferencesRequest = new PutSimCardNetworkPreferencesRequest(); // PutSimCardNetworkPreferencesRequest | 
        try {
            GetSimCardNetworkPreferences200Response result = apiInstance.putSimCardNetworkPreferences(id, putSimCardNetworkPreferencesRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardsApi#putSimCardNetworkPreferences");
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
 **id** | **UUID**| Identifies the SIM. |
 **putSimCardNetworkPreferencesRequest** | [**PutSimCardNetworkPreferencesRequest**](PutSimCardNetworkPreferencesRequest.md)|  | [optional]

### Return type

[**GetSimCardNetworkPreferences200Response**](GetSimCardNetworkPreferences200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | A successful network preferences definition response. &lt;br/&gt;&lt;br/&gt; The sent mobile_network_operators_preferences parameter won&#39;t be applied to the main resource right away - this is an asynchronous operation. While interacting with this API, you will face the following scenarios:    * The first request for this API will return an empty mobile_network_operators_preferences with an in-progress OTA update resource in the ota_updates node containing the exact sent parameters to indicate the operation progress. The value will be applied to the principal object when the OTA update finishes its processing, thus indicating the SIM card network preference current state.    * The subsequent requests will contain the current state, that is what&#39;s applied to the SIM card settings, and return the related OTA update in the ota_updates node.    The returned OTA updated (present in the ota_updates node) will, by default, be the resource related to the operation, not all of them. |  -  |
| **401** | Unauthorized |  -  |
| **0** | Unexpected error |  -  |


## registerSimCards

> PurchaseESim202Response registerSimCards(siMCardRegistration)

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
            PurchaseESim202Response result = apiInstance.registerSimCards(siMCardRegistration);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardsApi#registerSimCards");
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

[**PurchaseESim202Response**](PurchaseESim202Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful response |  -  |
| **401** | Unauthorized |  -  |


## removeSimCardPublicIp

> GetSimCardAction200Response removeSimCardPublicIp(id)

Request removing a SIM card public IP

This API removes an existing public IP from a SIM card. <br/><br/>
 The API will trigger an asynchronous operation called a SIM Card Action. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developersdev.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API.

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
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the SIM.
        try {
            GetSimCardAction200Response result = apiInstance.removeSimCardPublicIp(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardsApi#removeSimCardPublicIp");
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
 **id** | **UUID**| Identifies the SIM. |

### Return type

[**GetSimCardAction200Response**](GetSimCardAction200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful Response |  -  |
| **401** | Unauthorized |  -  |
| **0** | Unexpected error |  -  |


## setNetworkPreference

> GetSimCardAction200Response setNetworkPreference(id)

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
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the SIM.
        try {
            GetSimCardAction200Response result = apiInstance.setNetworkPreference(id);
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
 **id** | **UUID**| Identifies the SIM. |

### Return type

[**GetSimCardAction200Response**](GetSimCardAction200Response.md)

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


## setNetworkPreferencesBulk

> SetNetworkPreferencesBulk202Response setNetworkPreferencesBulk(setNetworkPreferencesBulkRequest)

Request bulk setting of network preferences for SIM cards.

This API triggers an asynchronous operation to set network preferences for each of the specified SIM cards.<br/>
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
        SetNetworkPreferencesBulkRequest setNetworkPreferencesBulkRequest = new SetNetworkPreferencesBulkRequest(); // SetNetworkPreferencesBulkRequest | 
        try {
            SetNetworkPreferencesBulk202Response result = apiInstance.setNetworkPreferencesBulk(setNetworkPreferencesBulkRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardsApi#setNetworkPreferencesBulk");
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
 **setNetworkPreferencesBulkRequest** | [**SetNetworkPreferencesBulkRequest**](SetNetworkPreferencesBulkRequest.md)|  | [optional]

### Return type

[**SetNetworkPreferencesBulk202Response**](SetNetworkPreferencesBulk202Response.md)

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


## setPublicIPsBulk

> SetNetworkPreferencesBulk202Response setPublicIPsBulk(setNetworkPreferencesBulkRequest)

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
        SetNetworkPreferencesBulkRequest setNetworkPreferencesBulkRequest = new SetNetworkPreferencesBulkRequest(); // SetNetworkPreferencesBulkRequest | 
        try {
            SetNetworkPreferencesBulk202Response result = apiInstance.setPublicIPsBulk(setNetworkPreferencesBulkRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardsApi#setPublicIPsBulk");
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
 **setNetworkPreferencesBulkRequest** | [**SetNetworkPreferencesBulkRequest**](SetNetworkPreferencesBulkRequest.md)|  | [optional]

### Return type

[**SetNetworkPreferencesBulk202Response**](SetNetworkPreferencesBulk202Response.md)

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


## setSimCardPublicIp

> GetSimCardAction200Response setSimCardPublicIp(id, regionCode)

Request setting a SIM card public IP

This API makes a SIM card reachable on the public internet by mapping a random public IP to the SIM card. <br/><br/>
 The API will trigger an asynchronous operation called a SIM Card Action. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developersdev.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API. <br/><br/>
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
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the SIM.
        String regionCode = "dc2"; // String | The code of the region where the public IP should be assigned. A list of available regions can be found at the regions endpoint
        try {
            GetSimCardAction200Response result = apiInstance.setSimCardPublicIp(id, regionCode);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardsApi#setSimCardPublicIp");
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
 **id** | **UUID**| Identifies the SIM. |
 **regionCode** | **String**| The code of the region where the public IP should be assigned. A list of available regions can be found at the regions endpoint | [optional]

### Return type

[**GetSimCardAction200Response**](GetSimCardAction200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful Response |  -  |
| **401** | Unauthorized |  -  |
| **0** | Unexpected error |  -  |


## setSimCardStandby

> GetSimCardAction200Response setSimCardStandby(id)

Request setting a SIM card to standby

The SIM card will be able to connect to the network once the process to set it to standby has been completed, thus making it possible to consume data.<br/>
To set a SIM card to standby, it must be associated with SIM card group.<br/>
The API will trigger an asynchronous operation called a SIM Card Action. Transitioning to the standby state may take a period of time. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developersdev.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API.


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
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the SIM.
        try {
            GetSimCardAction200Response result = apiInstance.setSimCardStandby(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardsApi#setSimCardStandby");
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
 **id** | **UUID**| Identifies the SIM. |

### Return type

[**GetSimCardAction200Response**](GetSimCardAction200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful Response |  -  |
| **401** | Unauthorized |  -  |
| **0** | Unexpected error |  -  |


## updateSimCard

> GetSimCard200Response updateSimCard(id, siMCard)

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
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the SIM.
        SIMCard siMCard = new SIMCard(); // SIMCard | 
        try {
            GetSimCard200Response result = apiInstance.updateSimCard(id, siMCard);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardsApi#updateSimCard");
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
 **id** | **UUID**| Identifies the SIM. |
 **siMCard** | [**SIMCard**](SIMCard.md)|  |

### Return type

[**GetSimCard200Response**](GetSimCard200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **401** | Unauthorized |  -  |
| **0** | Unexpected error |  -  |


## validateRegistrationCodes

> SIMCardRegistrationCodeValidations validateRegistrationCodes(validateRegistrationCodesRequest)

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
        ValidateRegistrationCodesRequest validateRegistrationCodesRequest = new ValidateRegistrationCodesRequest(); // ValidateRegistrationCodesRequest | 
        try {
            SIMCardRegistrationCodeValidations result = apiInstance.validateRegistrationCodes(validateRegistrationCodesRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardsApi#validateRegistrationCodes");
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
 **validateRegistrationCodesRequest** | [**ValidateRegistrationCodesRequest**](ValidateRegistrationCodesRequest.md)|  |

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
| **401** | Unauthorized |  -  |
| **0** | Unexpected error |  -  |

