# FieldDescriptorProto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**unknownFields** | [**UnknownFieldSet**](UnknownFieldSet.md) |  |  [optional]
**initialized** | **Boolean** |  |  [optional]
**label** | [**LabelEnum**](#LabelEnum) |  |  [optional]
**options** | [**FieldOptions**](FieldOptions.md) |  |  [optional]
**nameBytes** | [**ByteString**](ByteString.md) |  |  [optional]
**oneofIndex** | **Integer** |  |  [optional]
**extendee** | **String** |  |  [optional]
**jsonName** | **String** |  |  [optional]
**typeNameBytes** | [**ByteString**](ByteString.md) |  |  [optional]
**extendeeBytes** | [**ByteString**](ByteString.md) |  |  [optional]
**defaultValueBytes** | [**ByteString**](ByteString.md) |  |  [optional]
**jsonNameBytes** | [**ByteString**](ByteString.md) |  |  [optional]
**serializedSize** | **Integer** |  |  [optional]
**parserForType** | [**ParserFieldDescriptorProto**](ParserFieldDescriptorProto.md) |  |  [optional]
**defaultInstanceForType** | [**FieldDescriptorProto**](FieldDescriptorProto.md) |  |  [optional]
**optionsOrBuilder** | [**FieldOptionsOrBuilder**](FieldOptionsOrBuilder.md) |  |  [optional]
**name** | **String** |  |  [optional]
**typeName** | **String** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**defaultValue** | **String** |  |  [optional]
**number** | **Integer** |  |  [optional]
**allFields** | **Map&lt;String, Object&gt;** |  |  [optional]
**initializationErrorString** | **String** |  |  [optional]
**descriptorForType** | [**Descriptor**](Descriptor.md) |  |  [optional]
**memoizedSerializedSize** | **Integer** |  |  [optional]

<a name="LabelEnum"></a>
## Enum: LabelEnum
Name | Value
---- | -----
OPTIONAL | &quot;LABEL_OPTIONAL&quot;
REQUIRED | &quot;LABEL_REQUIRED&quot;
REPEATED | &quot;LABEL_REPEATED&quot;

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
DOUBLE | &quot;TYPE_DOUBLE&quot;
FLOAT | &quot;TYPE_FLOAT&quot;
INT64 | &quot;TYPE_INT64&quot;
UINT64 | &quot;TYPE_UINT64&quot;
INT32 | &quot;TYPE_INT32&quot;
FIXED64 | &quot;TYPE_FIXED64&quot;
FIXED32 | &quot;TYPE_FIXED32&quot;
BOOL | &quot;TYPE_BOOL&quot;
STRING | &quot;TYPE_STRING&quot;
GROUP | &quot;TYPE_GROUP&quot;
MESSAGE | &quot;TYPE_MESSAGE&quot;
BYTES | &quot;TYPE_BYTES&quot;
UINT32 | &quot;TYPE_UINT32&quot;
ENUM | &quot;TYPE_ENUM&quot;
SFIXED32 | &quot;TYPE_SFIXED32&quot;
SFIXED64 | &quot;TYPE_SFIXED64&quot;
SINT32 | &quot;TYPE_SINT32&quot;
SINT64 | &quot;TYPE_SINT64&quot;
