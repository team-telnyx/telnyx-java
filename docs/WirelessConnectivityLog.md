

# WirelessConnectivityLog

This object represents a wireless connectivity session log that happened through a SIM card. It aids in finding out potential problems when the SIM is not able to attach properly.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recordType** | **String** |  |  [optional] [readonly]
**id** | **Integer** | Uniquely identifies the session. |  [optional] [readonly]
**simCardId** | **UUID** | The identification UUID of the related SIM card resource. |  [optional]
**logType** | [**LogTypeEnum**](#LogTypeEnum) | The type of the session, &#39;registration&#39; being the initial authentication session and &#39;data&#39; the actual data transfer sessions. |  [optional] [readonly]
**imsi** | **String** | SIM cards are identified on their individual operator networks by a unique International Mobile Subscriber Identity (IMSI). &lt;br/&gt; Mobile network operators connect mobile phone calls and communicate with their market SIM cards using their IMSIs. The IMSI is stored in the Subscriber  Identity Module (SIM) inside the device and is sent by the device to the appropriate network. It is used to acquire the details of the device in the Home  Location Register (HLR) or the Visitor Location Register (VLR).  |  [optional] [readonly]
**imei** | **String** | The International Mobile Equipment Identity (or IMEI) is a number, usually unique, that identifies the device currently being used connect to the network. |  [optional] [readonly]
**mobileCountryCode** | **String** | It&#39;s a three decimal digit that identifies a country.&lt;br/&gt;&lt;br/&gt; This code is commonly seen joined with a Mobile Network Code (MNC) in a tuple that allows identifying a carrier known as PLMN (Public Land Mobile Network) code. |  [optional] [readonly]
**mobileNetworkCode** | **String** | It&#39;s a two to three decimal digits that identify a network.&lt;br/&gt;&lt;br/&gt;  This code is commonly seen joined with a Mobile Country Code (MCC) in a tuple that allows identifying a carrier known as PLMN (Public Land Mobile Network) code. |  [optional] [readonly]
**startTime** | **String** | ISO 8601 formatted date-time indicating when the session started. |  [optional] [readonly]
**stopTime** | **String** | ISO 8601 formatted date-time indicating when the session ended. |  [optional] [readonly]
**apn** | **String** | The Access Point Name (APN) identifies the packet data network that a mobile data user wants to communicate with. |  [optional] [readonly]
**ipv4** | **String** | The SIM&#39;s address in the currently connected network. This IPv4 address is usually obtained dynamically, so it may vary according to the location or new connections.  |  [optional] [readonly]
**ipv6** | **String** | The SIM&#39;s address in the currently connected network. This IPv6 address is usually obtained dynamically, so it may vary according to the location or new connections.  |  [optional] [readonly]
**radioAccessTechnology** | **String** | The radio technology the SIM card used during the session. |  [optional] [readonly]
**state** | **String** | The state of the SIM card after when the session happened. |  [optional] [readonly]
**cellId** | **String** | The cell ID to which the SIM connected. |  [optional] [readonly]



## Enum: LogTypeEnum

Name | Value
---- | -----
REGISTRATION | &quot;registration&quot;
DATA | &quot;data&quot;



