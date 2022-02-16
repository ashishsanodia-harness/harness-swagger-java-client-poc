# ExecutionPrincipalInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**unknownFields** | [**UnknownFieldSet**](UnknownFieldSet.md) |  |  [optional]
**initialized** | **Boolean** |  |  [optional]
**principal** | **String** |  |  [optional]
**principalBytes** | [**ByteString**](ByteString.md) |  |  [optional]
**principalTypeValue** | **Integer** |  |  [optional]
**principalType** | [**PrincipalTypeEnum**](#PrincipalTypeEnum) |  |  [optional]
**shouldValidateRbac** | **Boolean** |  |  [optional]
**serializedSize** | **Integer** |  |  [optional]
**parserForType** | [**ParserExecutionPrincipalInfo**](ParserExecutionPrincipalInfo.md) |  |  [optional]
**defaultInstanceForType** | [**ExecutionPrincipalInfo**](ExecutionPrincipalInfo.md) |  |  [optional]
**allFields** | **Map&lt;String, Object&gt;** |  |  [optional]
**initializationErrorString** | **String** |  |  [optional]
**descriptorForType** | [**Descriptor**](Descriptor.md) |  |  [optional]
**memoizedSerializedSize** | **Integer** |  |  [optional]

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
