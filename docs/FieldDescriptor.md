# FieldDescriptor

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **Integer** |  |  [optional]
**proto** | [**FieldDescriptorProto**](FieldDescriptorProto.md) |  |  [optional]
**fullName** | **String** |  |  [optional]
**jsonName** | **String** |  |  [optional]
**file** | [**FileDescriptor**](FileDescriptor.md) |  |  [optional]
**extensionScope** | [**Descriptor**](Descriptor.md) |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**containingType** | [**Descriptor**](Descriptor.md) |  |  [optional]
**messageType** | [**Descriptor**](Descriptor.md) |  |  [optional]
**containingOneof** | [**OneofDescriptor**](OneofDescriptor.md) |  |  [optional]
**enumType** | [**EnumDescriptor**](EnumDescriptor.md) |  |  [optional]
**defaultValue** | **Object** |  |  [optional]
**options** | [**FieldOptions**](FieldOptions.md) |  |  [optional]
**optional** | **Boolean** |  |  [optional]
**javaType** | [**JavaTypeEnum**](#JavaTypeEnum) |  |  [optional]
**liteJavaType** | [**LiteJavaTypeEnum**](#LiteJavaTypeEnum) |  |  [optional]
**packable** | **Boolean** |  |  [optional]
**required** | **Boolean** |  |  [optional]
**packed** | **Boolean** |  |  [optional]
**extension** | **Boolean** |  |  [optional]
**repeated** | **Boolean** |  |  [optional]
**mapField** | **Boolean** |  |  [optional]
**liteType** | [**LiteTypeEnum**](#LiteTypeEnum) |  |  [optional]
**name** | **String** |  |  [optional]
**number** | **Integer** |  |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
DOUBLE | &quot;DOUBLE&quot;
FLOAT | &quot;FLOAT&quot;
INT64 | &quot;INT64&quot;
UINT64 | &quot;UINT64&quot;
INT32 | &quot;INT32&quot;
FIXED64 | &quot;FIXED64&quot;
FIXED32 | &quot;FIXED32&quot;
BOOL | &quot;BOOL&quot;
STRING | &quot;STRING&quot;
GROUP | &quot;GROUP&quot;
MESSAGE | &quot;MESSAGE&quot;
BYTES | &quot;BYTES&quot;
UINT32 | &quot;UINT32&quot;
ENUM | &quot;ENUM&quot;
SFIXED32 | &quot;SFIXED32&quot;
SFIXED64 | &quot;SFIXED64&quot;
SINT32 | &quot;SINT32&quot;
SINT64 | &quot;SINT64&quot;

<a name="JavaTypeEnum"></a>
## Enum: JavaTypeEnum
Name | Value
---- | -----
INT | &quot;INT&quot;
LONG | &quot;LONG&quot;
FLOAT | &quot;FLOAT&quot;
DOUBLE | &quot;DOUBLE&quot;
BOOLEAN | &quot;BOOLEAN&quot;
STRING | &quot;STRING&quot;
BYTE_STRING | &quot;BYTE_STRING&quot;
ENUM | &quot;ENUM&quot;
MESSAGE | &quot;MESSAGE&quot;

<a name="LiteJavaTypeEnum"></a>
## Enum: LiteJavaTypeEnum
Name | Value
---- | -----
INT | &quot;INT&quot;
LONG | &quot;LONG&quot;
FLOAT | &quot;FLOAT&quot;
DOUBLE | &quot;DOUBLE&quot;
BOOLEAN | &quot;BOOLEAN&quot;
STRING | &quot;STRING&quot;
BYTE_STRING | &quot;BYTE_STRING&quot;
ENUM | &quot;ENUM&quot;
MESSAGE | &quot;MESSAGE&quot;

<a name="LiteTypeEnum"></a>
## Enum: LiteTypeEnum
Name | Value
---- | -----
DOUBLE | &quot;DOUBLE&quot;
FLOAT | &quot;FLOAT&quot;
INT64 | &quot;INT64&quot;
UINT64 | &quot;UINT64&quot;
INT32 | &quot;INT32&quot;
FIXED64 | &quot;FIXED64&quot;
FIXED32 | &quot;FIXED32&quot;
BOOL | &quot;BOOL&quot;
STRING | &quot;STRING&quot;
GROUP | &quot;GROUP&quot;
MESSAGE | &quot;MESSAGE&quot;
BYTES | &quot;BYTES&quot;
UINT32 | &quot;UINT32&quot;
ENUM | &quot;ENUM&quot;
SFIXED32 | &quot;SFIXED32&quot;
SFIXED64 | &quot;SFIXED64&quot;
SINT32 | &quot;SINT32&quot;
SINT64 | &quot;SINT64&quot;
