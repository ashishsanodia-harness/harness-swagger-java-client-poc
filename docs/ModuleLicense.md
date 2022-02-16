# ModuleLicense

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**accountIdentifier** | **String** |  |  [optional]
**moduleType** | [**ModuleTypeEnum**](#ModuleTypeEnum) |  |  [optional]
**edition** | [**EditionEnum**](#EditionEnum) |  |  [optional]
**licenseType** | [**LicenseTypeEnum**](#LicenseTypeEnum) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**startTime** | **Long** |  |  [optional]
**expiryTime** | **Long** |  |  [optional]
**createdAt** | **Long** |  |  [optional]
**lastModifiedAt** | **Long** |  |  [optional]

<a name="ModuleTypeEnum"></a>
## Enum: ModuleTypeEnum
Name | Value
---- | -----
CD | &quot;CD&quot;
CI | &quot;CI&quot;
CV | &quot;CV&quot;
CF | &quot;CF&quot;
CE | &quot;CE&quot;
CORE | &quot;CORE&quot;
PMS | &quot;PMS&quot;
TEMPLATESERVICE | &quot;TEMPLATESERVICE&quot;

<a name="EditionEnum"></a>
## Enum: EditionEnum
Name | Value
---- | -----
COMMUNITY | &quot;COMMUNITY&quot;
FREE | &quot;FREE&quot;
TEAM | &quot;TEAM&quot;
ENTERPRISE | &quot;ENTERPRISE&quot;

<a name="LicenseTypeEnum"></a>
## Enum: LicenseTypeEnum
Name | Value
---- | -----
TRIAL | &quot;TRIAL&quot;
PAID | &quot;PAID&quot;

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ACTIVE | &quot;ACTIVE&quot;
DELETED | &quot;DELETED&quot;
EXPIRED | &quot;EXPIRED&quot;
