

# Fqdn

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifies the resource. |  [optional]
**recordType** | **String** | Identifies the type of the resource. |  [optional]
**connectionId** | **String** | ID of the FQDN connection to which this FQDN is attached. |  [optional]
**fqdn** | **String** | FQDN represented by this resource. |  [optional]
**port** | **Integer** | Port to use when connecting to this FQDN. |  [optional]
**dnsRecordType** | **String** | The DNS record type for the FQDN. For cases where a port is not set, the DNS record type must be &#39;srv&#39;. For cases where a port is set, the DNS record type must be &#39;a&#39;. If the DNS record type is &#39;a&#39; and a port is not specified, 5060 will be used. |  [optional]
**createdAt** | **String** | ISO 8601 formatted date indicating when the resource was created. |  [optional]
**updatedAt** | **String** | ISO 8601 formatted date indicating when the resource was updated. |  [optional]



