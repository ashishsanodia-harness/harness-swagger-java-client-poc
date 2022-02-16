# ExecutionPrincipalInfoOrBuilder

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**principal** | **String** |  |  [optional]
**principalBytes** | [**ByteString**](ByteString.md) |  |  [optional]
**principalTypeValue** | **Integer** |  |  [optional]
**principalType** | [**PrincipalTypeEnum**](#PrincipalTypeEnum) |  |  [optional]
**shouldValidateRbac** | **Boolean** |  |  [optional]
**allFields** | **Map&lt;String, Object&gt;** |  |  [optional]
**initializationErrorString** | **String** |  |  [optional]
**descriptorForType** | [**Descriptor**](Descriptor.md) |  |  [optional]
**defaultInstanceForType** | [**Message**](Message.md) |  |  [optional]
**unknownFields** | [**UnknownFieldSet**](UnknownFieldSet.md) |  |  [optional]
**initialized** | **Boolean** |  |  [optional]

<a name="PrincipalTypeEnum"></a>
## Enum: PrincipalTypeEnum
Name | Value
---- | -----
UNKNOWN | &quot;UNKNOWN&quot;
USER | &quot;USER&quot;
USER_GROUP | &quot;USER_GROUP&quot;
API_KEY | &quot;API_KEY&quot;
SERVICE | &quot;SERVICE&quot;
SERVICE_ACCOUNT | &quot;SERVICE_ACCOUNT&quot;
UNRECOGNIZED | &quot;UNRECOGNIZED&quot;
