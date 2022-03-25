

# RoomSession


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** | A unique identifier for the room session. |  [optional]
**roomId** | **UUID** | Identify the room hosting that room session. |  [optional]
**active** | **Boolean** | Shows if the room session is active or not. |  [optional]
**createdAt** | **String** | ISO 8601 timestamp when the room session was created. |  [optional]
**updatedAt** | **String** | ISO 8601 timestamp when the room session was updated. |  [optional]
**endedAt** | **String** | ISO 8601 timestamp when the room session has ended. |  [optional]
**participants** | [**List&lt;RoomParticipant&gt;**](RoomParticipant.md) |  |  [optional]
**recordType** | **String** |  |  [optional] [readonly]



