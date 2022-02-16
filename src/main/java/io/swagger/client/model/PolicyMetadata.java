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
import io.swagger.client.model.ParserPolicyMetadata;
import io.swagger.client.model.PolicyMetadata;
import io.swagger.client.model.UnknownFieldSet;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * PolicyMetadata
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class PolicyMetadata {
  @SerializedName("unknownFields")
  private UnknownFieldSet unknownFields = null;

  @SerializedName("identifier")
  private String identifier = null;

  @SerializedName("severity")
  private String severity = null;

  @SerializedName("initialized")
  private Boolean initialized = null;

  @SerializedName("error")
  private String error = null;

  @SerializedName("created")
  private Long created = null;

  @SerializedName("updated")
  private Long updated = null;

  @SerializedName("accountId")
  private String accountId = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("policyName")
  private String policyName = null;

  @SerializedName("policyId")
  private String policyId = null;

  @SerializedName("policyIdBytes")
  private ByteString policyIdBytes = null;

  @SerializedName("policyNameBytes")
  private ByteString policyNameBytes = null;

  @SerializedName("severityBytes")
  private ByteString severityBytes = null;

  @SerializedName("denyMessagesList")
  private List<String> denyMessagesList = null;

  @SerializedName("denyMessagesCount")
  private Integer denyMessagesCount = null;

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

  @SerializedName("errorBytes")
  private ByteString errorBytes = null;

  @SerializedName("identifierBytes")
  private ByteString identifierBytes = null;

  @SerializedName("orgId")
  private String orgId = null;

  @SerializedName("serializedSize")
  private Integer serializedSize = null;

  @SerializedName("parserForType")
  private ParserPolicyMetadata parserForType = null;

  @SerializedName("defaultInstanceForType")
  private PolicyMetadata defaultInstanceForType = null;

  @SerializedName("allFields")
  private Map<String, Object> allFields = null;

  @SerializedName("initializationErrorString")
  private String initializationErrorString = null;

  @SerializedName("descriptorForType")
  private Descriptor descriptorForType = null;

  @SerializedName("memoizedSerializedSize")
  private Integer memoizedSerializedSize = null;

  public PolicyMetadata unknownFields(UnknownFieldSet unknownFields) {
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

  public PolicyMetadata identifier(String identifier) {
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

  public PolicyMetadata severity(String severity) {
    this.severity = severity;
    return this;
  }

   /**
   * Get severity
   * @return severity
  **/
  @Schema(description = "")
  public String getSeverity() {
    return severity;
  }

  public void setSeverity(String severity) {
    this.severity = severity;
  }

  public PolicyMetadata initialized(Boolean initialized) {
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

  public PolicyMetadata error(String error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @Schema(description = "")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public PolicyMetadata created(Long created) {
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

  public PolicyMetadata updated(Long updated) {
    this.updated = updated;
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/
  @Schema(description = "")
  public Long getUpdated() {
    return updated;
  }

  public void setUpdated(Long updated) {
    this.updated = updated;
  }

  public PolicyMetadata accountId(String accountId) {
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

  public PolicyMetadata status(String status) {
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

  public PolicyMetadata policyName(String policyName) {
    this.policyName = policyName;
    return this;
  }

   /**
   * Get policyName
   * @return policyName
  **/
  @Schema(description = "")
  public String getPolicyName() {
    return policyName;
  }

  public void setPolicyName(String policyName) {
    this.policyName = policyName;
  }

  public PolicyMetadata policyId(String policyId) {
    this.policyId = policyId;
    return this;
  }

   /**
   * Get policyId
   * @return policyId
  **/
  @Schema(description = "")
  public String getPolicyId() {
    return policyId;
  }

  public void setPolicyId(String policyId) {
    this.policyId = policyId;
  }

  public PolicyMetadata policyIdBytes(ByteString policyIdBytes) {
    this.policyIdBytes = policyIdBytes;
    return this;
  }

   /**
   * Get policyIdBytes
   * @return policyIdBytes
  **/
  @Schema(description = "")
  public ByteString getPolicyIdBytes() {
    return policyIdBytes;
  }

  public void setPolicyIdBytes(ByteString policyIdBytes) {
    this.policyIdBytes = policyIdBytes;
  }

  public PolicyMetadata policyNameBytes(ByteString policyNameBytes) {
    this.policyNameBytes = policyNameBytes;
    return this;
  }

   /**
   * Get policyNameBytes
   * @return policyNameBytes
  **/
  @Schema(description = "")
  public ByteString getPolicyNameBytes() {
    return policyNameBytes;
  }

  public void setPolicyNameBytes(ByteString policyNameBytes) {
    this.policyNameBytes = policyNameBytes;
  }

  public PolicyMetadata severityBytes(ByteString severityBytes) {
    this.severityBytes = severityBytes;
    return this;
  }

   /**
   * Get severityBytes
   * @return severityBytes
  **/
  @Schema(description = "")
  public ByteString getSeverityBytes() {
    return severityBytes;
  }

  public void setSeverityBytes(ByteString severityBytes) {
    this.severityBytes = severityBytes;
  }

  public PolicyMetadata denyMessagesList(List<String> denyMessagesList) {
    this.denyMessagesList = denyMessagesList;
    return this;
  }

  public PolicyMetadata addDenyMessagesListItem(String denyMessagesListItem) {
    if (this.denyMessagesList == null) {
      this.denyMessagesList = new ArrayList<String>();
    }
    this.denyMessagesList.add(denyMessagesListItem);
    return this;
  }

   /**
   * Get denyMessagesList
   * @return denyMessagesList
  **/
  @Schema(description = "")
  public List<String> getDenyMessagesList() {
    return denyMessagesList;
  }

  public void setDenyMessagesList(List<String> denyMessagesList) {
    this.denyMessagesList = denyMessagesList;
  }

  public PolicyMetadata denyMessagesCount(Integer denyMessagesCount) {
    this.denyMessagesCount = denyMessagesCount;
    return this;
  }

   /**
   * Get denyMessagesCount
   * @return denyMessagesCount
  **/
  @Schema(description = "")
  public Integer getDenyMessagesCount() {
    return denyMessagesCount;
  }

  public void setDenyMessagesCount(Integer denyMessagesCount) {
    this.denyMessagesCount = denyMessagesCount;
  }

  public PolicyMetadata statusBytes(ByteString statusBytes) {
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

  public PolicyMetadata accountIdBytes(ByteString accountIdBytes) {
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

  public PolicyMetadata orgIdBytes(ByteString orgIdBytes) {
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

  public PolicyMetadata projectId(String projectId) {
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

  public PolicyMetadata projectIdBytes(ByteString projectIdBytes) {
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

  public PolicyMetadata errorBytes(ByteString errorBytes) {
    this.errorBytes = errorBytes;
    return this;
  }

   /**
   * Get errorBytes
   * @return errorBytes
  **/
  @Schema(description = "")
  public ByteString getErrorBytes() {
    return errorBytes;
  }

  public void setErrorBytes(ByteString errorBytes) {
    this.errorBytes = errorBytes;
  }

  public PolicyMetadata identifierBytes(ByteString identifierBytes) {
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

  public PolicyMetadata orgId(String orgId) {
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

  public PolicyMetadata serializedSize(Integer serializedSize) {
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

  public PolicyMetadata parserForType(ParserPolicyMetadata parserForType) {
    this.parserForType = parserForType;
    return this;
  }

   /**
   * Get parserForType
   * @return parserForType
  **/
  @Schema(description = "")
  public ParserPolicyMetadata getParserForType() {
    return parserForType;
  }

  public void setParserForType(ParserPolicyMetadata parserForType) {
    this.parserForType = parserForType;
  }

  public PolicyMetadata defaultInstanceForType(PolicyMetadata defaultInstanceForType) {
    this.defaultInstanceForType = defaultInstanceForType;
    return this;
  }

   /**
   * Get defaultInstanceForType
   * @return defaultInstanceForType
  **/
  @Schema(description = "")
  public PolicyMetadata getDefaultInstanceForType() {
    return defaultInstanceForType;
  }

  public void setDefaultInstanceForType(PolicyMetadata defaultInstanceForType) {
    this.defaultInstanceForType = defaultInstanceForType;
  }

  public PolicyMetadata allFields(Map<String, Object> allFields) {
    this.allFields = allFields;
    return this;
  }

  public PolicyMetadata putAllFieldsItem(String key, Object allFieldsItem) {
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

  public PolicyMetadata initializationErrorString(String initializationErrorString) {
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

  public PolicyMetadata descriptorForType(Descriptor descriptorForType) {
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

  public PolicyMetadata memoizedSerializedSize(Integer memoizedSerializedSize) {
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
    PolicyMetadata policyMetadata = (PolicyMetadata) o;
    return Objects.equals(this.unknownFields, policyMetadata.unknownFields) &&
        Objects.equals(this.identifier, policyMetadata.identifier) &&
        Objects.equals(this.severity, policyMetadata.severity) &&
        Objects.equals(this.initialized, policyMetadata.initialized) &&
        Objects.equals(this.error, policyMetadata.error) &&
        Objects.equals(this.created, policyMetadata.created) &&
        Objects.equals(this.updated, policyMetadata.updated) &&
        Objects.equals(this.accountId, policyMetadata.accountId) &&
        Objects.equals(this.status, policyMetadata.status) &&
        Objects.equals(this.policyName, policyMetadata.policyName) &&
        Objects.equals(this.policyId, policyMetadata.policyId) &&
        Objects.equals(this.policyIdBytes, policyMetadata.policyIdBytes) &&
        Objects.equals(this.policyNameBytes, policyMetadata.policyNameBytes) &&
        Objects.equals(this.severityBytes, policyMetadata.severityBytes) &&
        Objects.equals(this.denyMessagesList, policyMetadata.denyMessagesList) &&
        Objects.equals(this.denyMessagesCount, policyMetadata.denyMessagesCount) &&
        Objects.equals(this.statusBytes, policyMetadata.statusBytes) &&
        Objects.equals(this.accountIdBytes, policyMetadata.accountIdBytes) &&
        Objects.equals(this.orgIdBytes, policyMetadata.orgIdBytes) &&
        Objects.equals(this.projectId, policyMetadata.projectId) &&
        Objects.equals(this.projectIdBytes, policyMetadata.projectIdBytes) &&
        Objects.equals(this.errorBytes, policyMetadata.errorBytes) &&
        Objects.equals(this.identifierBytes, policyMetadata.identifierBytes) &&
        Objects.equals(this.orgId, policyMetadata.orgId) &&
        Objects.equals(this.serializedSize, policyMetadata.serializedSize) &&
        Objects.equals(this.parserForType, policyMetadata.parserForType) &&
        Objects.equals(this.defaultInstanceForType, policyMetadata.defaultInstanceForType) &&
        Objects.equals(this.allFields, policyMetadata.allFields) &&
        Objects.equals(this.initializationErrorString, policyMetadata.initializationErrorString) &&
        Objects.equals(this.descriptorForType, policyMetadata.descriptorForType) &&
        Objects.equals(this.memoizedSerializedSize, policyMetadata.memoizedSerializedSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unknownFields, identifier, severity, initialized, error, created, updated, accountId, status, policyName, policyId, policyIdBytes, policyNameBytes, severityBytes, denyMessagesList, denyMessagesCount, statusBytes, accountIdBytes, orgIdBytes, projectId, projectIdBytes, errorBytes, identifierBytes, orgId, serializedSize, parserForType, defaultInstanceForType, allFields, initializationErrorString, descriptorForType, memoizedSerializedSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyMetadata {\n");
    
    sb.append("    unknownFields: ").append(toIndentedString(unknownFields)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    initialized: ").append(toIndentedString(initialized)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
    sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
    sb.append("    policyIdBytes: ").append(toIndentedString(policyIdBytes)).append("\n");
    sb.append("    policyNameBytes: ").append(toIndentedString(policyNameBytes)).append("\n");
    sb.append("    severityBytes: ").append(toIndentedString(severityBytes)).append("\n");
    sb.append("    denyMessagesList: ").append(toIndentedString(denyMessagesList)).append("\n");
    sb.append("    denyMessagesCount: ").append(toIndentedString(denyMessagesCount)).append("\n");
    sb.append("    statusBytes: ").append(toIndentedString(statusBytes)).append("\n");
    sb.append("    accountIdBytes: ").append(toIndentedString(accountIdBytes)).append("\n");
    sb.append("    orgIdBytes: ").append(toIndentedString(orgIdBytes)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    projectIdBytes: ").append(toIndentedString(projectIdBytes)).append("\n");
    sb.append("    errorBytes: ").append(toIndentedString(errorBytes)).append("\n");
    sb.append("    identifierBytes: ").append(toIndentedString(identifierBytes)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
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
