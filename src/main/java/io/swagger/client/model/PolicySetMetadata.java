/*
 * CD NextGen API Reference
 * This is the Open Api Spec 3 for the NextGen Manager. This is under active development. Beware of the breaking change with respect to the generated code stub  # Authentication  <!-- ReDoc-Inject: <security-definitions> -->
 *
 * OpenAPI spec version: 3.0
 * Contact: contact@harness.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.ByteString;
import io.swagger.client.model.Descriptor;
import io.swagger.client.model.ParserPolicySetMetadata;
import io.swagger.client.model.PolicyMetadata;
import io.swagger.client.model.PolicyMetadataOrBuilder;
import io.swagger.client.model.PolicySetMetadata;
import io.swagger.client.model.UnknownFieldSet;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * PolicySetMetadata
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class PolicySetMetadata {
  @SerializedName("unknownFields")
  private UnknownFieldSet unknownFields = null;

  @SerializedName("identifier")
  private String identifier = null;

  @SerializedName("initialized")
  private Boolean initialized = null;

  @SerializedName("created")
  private Long created = null;

  @SerializedName("accountId")
  private String accountId = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("statusBytes")
  private ByteString statusBytes = null;

  @SerializedName("accountIdBytes")
  private ByteString accountIdBytes = null;

  @SerializedName("orgIdBytes")
  private ByteString orgIdBytes = null;

  @SerializedName("projectId")
  private String projectId = null;

  @SerializedName("projectIdBytes")
  private ByteString projectIdBytes = null;

  @SerializedName("policySetId")
  private String policySetId = null;

  @SerializedName("policySetIdBytes")
  private ByteString policySetIdBytes = null;

  @SerializedName("policyMetadataList")
  private List<PolicyMetadata> policyMetadataList = null;

  @SerializedName("policyMetadataOrBuilderList")
  private List<PolicyMetadataOrBuilder> policyMetadataOrBuilderList = null;

  @SerializedName("policyMetadataCount")
  private Integer policyMetadataCount = null;

  @SerializedName("policySetName")
  private String policySetName = null;

  @SerializedName("policySetNameBytes")
  private ByteString policySetNameBytes = null;

  @SerializedName("identifierBytes")
  private ByteString identifierBytes = null;

  @SerializedName("orgId")
  private String orgId = null;

  @SerializedName("deny")
  private Boolean deny = null;

  @SerializedName("serializedSize")
  private Integer serializedSize = null;

  @SerializedName("parserForType")
  private ParserPolicySetMetadata parserForType = null;

  @SerializedName("defaultInstanceForType")
  private PolicySetMetadata defaultInstanceForType = null;

  @SerializedName("allFields")
  private Map<String, Object> allFields = null;

  @SerializedName("initializationErrorString")
  private String initializationErrorString = null;

  @SerializedName("descriptorForType")
  private Descriptor descriptorForType = null;

  @SerializedName("memoizedSerializedSize")
  private Integer memoizedSerializedSize = null;

  public PolicySetMetadata unknownFields(UnknownFieldSet unknownFields) {
    this.unknownFields = unknownFields;
    return this;
  }

   /**
   * Get unknownFields
   * @return unknownFields
  **/
  @Schema(description = "")
  public UnknownFieldSet getUnknownFields() {
    return unknownFields;
  }

  public void setUnknownFields(UnknownFieldSet unknownFields) {
    this.unknownFields = unknownFields;
  }

  public PolicySetMetadata identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * Get identifier
   * @return identifier
  **/
  @Schema(description = "")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public PolicySetMetadata initialized(Boolean initialized) {
    this.initialized = initialized;
    return this;
  }

   /**
   * Get initialized
   * @return initialized
  **/
  @Schema(description = "")
  public Boolean isInitialized() {
    return initialized;
  }

  public void setInitialized(Boolean initialized) {
    this.initialized = initialized;
  }

  public PolicySetMetadata created(Long created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @Schema(description = "")
  public Long getCreated() {
    return created;
  }

  public void setCreated(Long created) {
    this.created = created;
  }

  public PolicySetMetadata accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @Schema(description = "")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public PolicySetMetadata status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public PolicySetMetadata statusBytes(ByteString statusBytes) {
    this.statusBytes = statusBytes;
    return this;
  }

   /**
   * Get statusBytes
   * @return statusBytes
  **/
  @Schema(description = "")
  public ByteString getStatusBytes() {
    return statusBytes;
  }

  public void setStatusBytes(ByteString statusBytes) {
    this.statusBytes = statusBytes;
  }

  public PolicySetMetadata accountIdBytes(ByteString accountIdBytes) {
    this.accountIdBytes = accountIdBytes;
    return this;
  }

   /**
   * Get accountIdBytes
   * @return accountIdBytes
  **/
  @Schema(description = "")
  public ByteString getAccountIdBytes() {
    return accountIdBytes;
  }

  public void setAccountIdBytes(ByteString accountIdBytes) {
    this.accountIdBytes = accountIdBytes;
  }

  public PolicySetMetadata orgIdBytes(ByteString orgIdBytes) {
    this.orgIdBytes = orgIdBytes;
    return this;
  }

   /**
   * Get orgIdBytes
   * @return orgIdBytes
  **/
  @Schema(description = "")
  public ByteString getOrgIdBytes() {
    return orgIdBytes;
  }

  public void setOrgIdBytes(ByteString orgIdBytes) {
    this.orgIdBytes = orgIdBytes;
  }

  public PolicySetMetadata projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * Get projectId
   * @return projectId
  **/
  @Schema(description = "")
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public PolicySetMetadata projectIdBytes(ByteString projectIdBytes) {
    this.projectIdBytes = projectIdBytes;
    return this;
  }

   /**
   * Get projectIdBytes
   * @return projectIdBytes
  **/
  @Schema(description = "")
  public ByteString getProjectIdBytes() {
    return projectIdBytes;
  }

  public void setProjectIdBytes(ByteString projectIdBytes) {
    this.projectIdBytes = projectIdBytes;
  }

  public PolicySetMetadata policySetId(String policySetId) {
    this.policySetId = policySetId;
    return this;
  }

   /**
   * Get policySetId
   * @return policySetId
  **/
  @Schema(description = "")
  public String getPolicySetId() {
    return policySetId;
  }

  public void setPolicySetId(String policySetId) {
    this.policySetId = policySetId;
  }

  public PolicySetMetadata policySetIdBytes(ByteString policySetIdBytes) {
    this.policySetIdBytes = policySetIdBytes;
    return this;
  }

   /**
   * Get policySetIdBytes
   * @return policySetIdBytes
  **/
  @Schema(description = "")
  public ByteString getPolicySetIdBytes() {
    return policySetIdBytes;
  }

  public void setPolicySetIdBytes(ByteString policySetIdBytes) {
    this.policySetIdBytes = policySetIdBytes;
  }

  public PolicySetMetadata policyMetadataList(List<PolicyMetadata> policyMetadataList) {
    this.policyMetadataList = policyMetadataList;
    return this;
  }

  public PolicySetMetadata addPolicyMetadataListItem(PolicyMetadata policyMetadataListItem) {
    if (this.policyMetadataList == null) {
      this.policyMetadataList = new ArrayList<PolicyMetadata>();
    }
    this.policyMetadataList.add(policyMetadataListItem);
    return this;
  }

   /**
   * Get policyMetadataList
   * @return policyMetadataList
  **/
  @Schema(description = "")
  public List<PolicyMetadata> getPolicyMetadataList() {
    return policyMetadataList;
  }

  public void setPolicyMetadataList(List<PolicyMetadata> policyMetadataList) {
    this.policyMetadataList = policyMetadataList;
  }

  public PolicySetMetadata policyMetadataOrBuilderList(List<PolicyMetadataOrBuilder> policyMetadataOrBuilderList) {
    this.policyMetadataOrBuilderList = policyMetadataOrBuilderList;
    return this;
  }

  public PolicySetMetadata addPolicyMetadataOrBuilderListItem(PolicyMetadataOrBuilder policyMetadataOrBuilderListItem) {
    if (this.policyMetadataOrBuilderList == null) {
      this.policyMetadataOrBuilderList = new ArrayList<PolicyMetadataOrBuilder>();
    }
    this.policyMetadataOrBuilderList.add(policyMetadataOrBuilderListItem);
    return this;
  }

   /**
   * Get policyMetadataOrBuilderList
   * @return policyMetadataOrBuilderList
  **/
  @Schema(description = "")
  public List<PolicyMetadataOrBuilder> getPolicyMetadataOrBuilderList() {
    return policyMetadataOrBuilderList;
  }

  public void setPolicyMetadataOrBuilderList(List<PolicyMetadataOrBuilder> policyMetadataOrBuilderList) {
    this.policyMetadataOrBuilderList = policyMetadataOrBuilderList;
  }

  public PolicySetMetadata policyMetadataCount(Integer policyMetadataCount) {
    this.policyMetadataCount = policyMetadataCount;
    return this;
  }

   /**
   * Get policyMetadataCount
   * @return policyMetadataCount
  **/
  @Schema(description = "")
  public Integer getPolicyMetadataCount() {
    return policyMetadataCount;
  }

  public void setPolicyMetadataCount(Integer policyMetadataCount) {
    this.policyMetadataCount = policyMetadataCount;
  }

  public PolicySetMetadata policySetName(String policySetName) {
    this.policySetName = policySetName;
    return this;
  }

   /**
   * Get policySetName
   * @return policySetName
  **/
  @Schema(description = "")
  public String getPolicySetName() {
    return policySetName;
  }

  public void setPolicySetName(String policySetName) {
    this.policySetName = policySetName;
  }

  public PolicySetMetadata policySetNameBytes(ByteString policySetNameBytes) {
    this.policySetNameBytes = policySetNameBytes;
    return this;
  }

   /**
   * Get policySetNameBytes
   * @return policySetNameBytes
  **/
  @Schema(description = "")
  public ByteString getPolicySetNameBytes() {
    return policySetNameBytes;
  }

  public void setPolicySetNameBytes(ByteString policySetNameBytes) {
    this.policySetNameBytes = policySetNameBytes;
  }

  public PolicySetMetadata identifierBytes(ByteString identifierBytes) {
    this.identifierBytes = identifierBytes;
    return this;
  }

   /**
   * Get identifierBytes
   * @return identifierBytes
  **/
  @Schema(description = "")
  public ByteString getIdentifierBytes() {
    return identifierBytes;
  }

  public void setIdentifierBytes(ByteString identifierBytes) {
    this.identifierBytes = identifierBytes;
  }

  public PolicySetMetadata orgId(String orgId) {
    this.orgId = orgId;
    return this;
  }

   /**
   * Get orgId
   * @return orgId
  **/
  @Schema(description = "")
  public String getOrgId() {
    return orgId;
  }

  public void setOrgId(String orgId) {
    this.orgId = orgId;
  }

  public PolicySetMetadata deny(Boolean deny) {
    this.deny = deny;
    return this;
  }

   /**
   * Get deny
   * @return deny
  **/
  @Schema(description = "")
  public Boolean isDeny() {
    return deny;
  }

  public void setDeny(Boolean deny) {
    this.deny = deny;
  }

  public PolicySetMetadata serializedSize(Integer serializedSize) {
    this.serializedSize = serializedSize;
    return this;
  }

   /**
   * Get serializedSize
   * @return serializedSize
  **/
  @Schema(description = "")
  public Integer getSerializedSize() {
    return serializedSize;
  }

  public void setSerializedSize(Integer serializedSize) {
    this.serializedSize = serializedSize;
  }

  public PolicySetMetadata parserForType(ParserPolicySetMetadata parserForType) {
    this.parserForType = parserForType;
    return this;
  }

   /**
   * Get parserForType
   * @return parserForType
  **/
  @Schema(description = "")
  public ParserPolicySetMetadata getParserForType() {
    return parserForType;
  }

  public void setParserForType(ParserPolicySetMetadata parserForType) {
    this.parserForType = parserForType;
  }

  public PolicySetMetadata defaultInstanceForType(PolicySetMetadata defaultInstanceForType) {
    this.defaultInstanceForType = defaultInstanceForType;
    return this;
  }

   /**
   * Get defaultInstanceForType
   * @return defaultInstanceForType
  **/
  @Schema(description = "")
  public PolicySetMetadata getDefaultInstanceForType() {
    return defaultInstanceForType;
  }

  public void setDefaultInstanceForType(PolicySetMetadata defaultInstanceForType) {
    this.defaultInstanceForType = defaultInstanceForType;
  }

  public PolicySetMetadata allFields(Map<String, Object> allFields) {
    this.allFields = allFields;
    return this;
  }

  public PolicySetMetadata putAllFieldsItem(String key, Object allFieldsItem) {
    if (this.allFields == null) {
      this.allFields = new HashMap<String, Object>();
    }
    this.allFields.put(key, allFieldsItem);
    return this;
  }

   /**
   * Get allFields
   * @return allFields
  **/
  @Schema(description = "")
  public Map<String, Object> getAllFields() {
    return allFields;
  }

  public void setAllFields(Map<String, Object> allFields) {
    this.allFields = allFields;
  }

  public PolicySetMetadata initializationErrorString(String initializationErrorString) {
    this.initializationErrorString = initializationErrorString;
    return this;
  }

   /**
   * Get initializationErrorString
   * @return initializationErrorString
  **/
  @Schema(description = "")
  public String getInitializationErrorString() {
    return initializationErrorString;
  }

  public void setInitializationErrorString(String initializationErrorString) {
    this.initializationErrorString = initializationErrorString;
  }

  public PolicySetMetadata descriptorForType(Descriptor descriptorForType) {
    this.descriptorForType = descriptorForType;
    return this;
  }

   /**
   * Get descriptorForType
   * @return descriptorForType
  **/
  @Schema(description = "")
  public Descriptor getDescriptorForType() {
    return descriptorForType;
  }

  public void setDescriptorForType(Descriptor descriptorForType) {
    this.descriptorForType = descriptorForType;
  }

  public PolicySetMetadata memoizedSerializedSize(Integer memoizedSerializedSize) {
    this.memoizedSerializedSize = memoizedSerializedSize;
    return this;
  }

   /**
   * Get memoizedSerializedSize
   * @return memoizedSerializedSize
  **/
  @Schema(description = "")
  public Integer getMemoizedSerializedSize() {
    return memoizedSerializedSize;
  }

  public void setMemoizedSerializedSize(Integer memoizedSerializedSize) {
    this.memoizedSerializedSize = memoizedSerializedSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolicySetMetadata policySetMetadata = (PolicySetMetadata) o;
    return Objects.equals(this.unknownFields, policySetMetadata.unknownFields) &&
        Objects.equals(this.identifier, policySetMetadata.identifier) &&
        Objects.equals(this.initialized, policySetMetadata.initialized) &&
        Objects.equals(this.created, policySetMetadata.created) &&
        Objects.equals(this.accountId, policySetMetadata.accountId) &&
        Objects.equals(this.status, policySetMetadata.status) &&
        Objects.equals(this.statusBytes, policySetMetadata.statusBytes) &&
        Objects.equals(this.accountIdBytes, policySetMetadata.accountIdBytes) &&
        Objects.equals(this.orgIdBytes, policySetMetadata.orgIdBytes) &&
        Objects.equals(this.projectId, policySetMetadata.projectId) &&
        Objects.equals(this.projectIdBytes, policySetMetadata.projectIdBytes) &&
        Objects.equals(this.policySetId, policySetMetadata.policySetId) &&
        Objects.equals(this.policySetIdBytes, policySetMetadata.policySetIdBytes) &&
        Objects.equals(this.policyMetadataList, policySetMetadata.policyMetadataList) &&
        Objects.equals(this.policyMetadataOrBuilderList, policySetMetadata.policyMetadataOrBuilderList) &&
        Objects.equals(this.policyMetadataCount, policySetMetadata.policyMetadataCount) &&
        Objects.equals(this.policySetName, policySetMetadata.policySetName) &&
        Objects.equals(this.policySetNameBytes, policySetMetadata.policySetNameBytes) &&
        Objects.equals(this.identifierBytes, policySetMetadata.identifierBytes) &&
        Objects.equals(this.orgId, policySetMetadata.orgId) &&
        Objects.equals(this.deny, policySetMetadata.deny) &&
        Objects.equals(this.serializedSize, policySetMetadata.serializedSize) &&
        Objects.equals(this.parserForType, policySetMetadata.parserForType) &&
        Objects.equals(this.defaultInstanceForType, policySetMetadata.defaultInstanceForType) &&
        Objects.equals(this.allFields, policySetMetadata.allFields) &&
        Objects.equals(this.initializationErrorString, policySetMetadata.initializationErrorString) &&
        Objects.equals(this.descriptorForType, policySetMetadata.descriptorForType) &&
        Objects.equals(this.memoizedSerializedSize, policySetMetadata.memoizedSerializedSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unknownFields, identifier, initialized, created, accountId, status, statusBytes, accountIdBytes, orgIdBytes, projectId, projectIdBytes, policySetId, policySetIdBytes, policyMetadataList, policyMetadataOrBuilderList, policyMetadataCount, policySetName, policySetNameBytes, identifierBytes, orgId, deny, serializedSize, parserForType, defaultInstanceForType, allFields, initializationErrorString, descriptorForType, memoizedSerializedSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicySetMetadata {\n");
    
    sb.append("    unknownFields: ").append(toIndentedString(unknownFields)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    initialized: ").append(toIndentedString(initialized)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusBytes: ").append(toIndentedString(statusBytes)).append("\n");
    sb.append("    accountIdBytes: ").append(toIndentedString(accountIdBytes)).append("\n");
    sb.append("    orgIdBytes: ").append(toIndentedString(orgIdBytes)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    projectIdBytes: ").append(toIndentedString(projectIdBytes)).append("\n");
    sb.append("    policySetId: ").append(toIndentedString(policySetId)).append("\n");
    sb.append("    policySetIdBytes: ").append(toIndentedString(policySetIdBytes)).append("\n");
    sb.append("    policyMetadataList: ").append(toIndentedString(policyMetadataList)).append("\n");
    sb.append("    policyMetadataOrBuilderList: ").append(toIndentedString(policyMetadataOrBuilderList)).append("\n");
    sb.append("    policyMetadataCount: ").append(toIndentedString(policyMetadataCount)).append("\n");
    sb.append("    policySetName: ").append(toIndentedString(policySetName)).append("\n");
    sb.append("    policySetNameBytes: ").append(toIndentedString(policySetNameBytes)).append("\n");
    sb.append("    identifierBytes: ").append(toIndentedString(identifierBytes)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    deny: ").append(toIndentedString(deny)).append("\n");
    sb.append("    serializedSize: ").append(toIndentedString(serializedSize)).append("\n");
    sb.append("    parserForType: ").append(toIndentedString(parserForType)).append("\n");
    sb.append("    defaultInstanceForType: ").append(toIndentedString(defaultInstanceForType)).append("\n");
    sb.append("    allFields: ").append(toIndentedString(allFields)).append("\n");
    sb.append("    initializationErrorString: ").append(toIndentedString(initializationErrorString)).append("\n");
    sb.append("    descriptorForType: ").append(toIndentedString(descriptorForType)).append("\n");
    sb.append("    memoizedSerializedSize: ").append(toIndentedString(memoizedSerializedSize)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
