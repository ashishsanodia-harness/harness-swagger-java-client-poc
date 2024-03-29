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
import io.swagger.client.model.EmbeddedUser;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
/**
 * Cloud Cost Report Schedule contains definition of &#x27;how often&#x27; and &#x27;to whom&#x27; the Report will be sent
 */
@Schema(description = "Cloud Cost Report Schedule contains definition of 'how often' and 'to whom' the Report will be sent")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class CEReportSchedule {
  @SerializedName("uuid")
  private String uuid = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("viewsId")
  private List<String> viewsId = new ArrayList<String>();

  @SerializedName("userCron")
  private String userCron = null;

  @SerializedName("recipients")
  private List<String> recipients = null;

  @SerializedName("accountId")
  private String accountId = null;

  @SerializedName("createdAt")
  private Long createdAt = null;

  @SerializedName("lastUpdatedAt")
  private Long lastUpdatedAt = null;

  @SerializedName("userCronTimeZone")
  private String userCronTimeZone = null;

  @SerializedName("createdBy")
  private EmbeddedUser createdBy = null;

  @SerializedName("lastUpdatedBy")
  private EmbeddedUser lastUpdatedBy = null;

  @SerializedName("nextExecution")
  private OffsetDateTime nextExecution = null;

  public CEReportSchedule uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @Schema(description = "")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public CEReportSchedule name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CEReportSchedule enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @Schema(description = "")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public CEReportSchedule description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CEReportSchedule viewsId(List<String> viewsId) {
    this.viewsId = viewsId;
    return this;
  }

  public CEReportSchedule addViewsIdItem(String viewsIdItem) {
    this.viewsId.add(viewsIdItem);
    return this;
  }

   /**
   * Get viewsId
   * @return viewsId
  **/
  @Schema(required = true, description = "")
  public List<String> getViewsId() {
    return viewsId;
  }

  public void setViewsId(List<String> viewsId) {
    this.viewsId = viewsId;
  }

  public CEReportSchedule userCron(String userCron) {
    this.userCron = userCron;
    return this;
  }

   /**
   * Get userCron
   * @return userCron
  **/
  @Schema(description = "")
  public String getUserCron() {
    return userCron;
  }

  public void setUserCron(String userCron) {
    this.userCron = userCron;
  }

  public CEReportSchedule recipients(List<String> recipients) {
    this.recipients = recipients;
    return this;
  }

  public CEReportSchedule addRecipientsItem(String recipientsItem) {
    if (this.recipients == null) {
      this.recipients = new ArrayList<String>();
    }
    this.recipients.add(recipientsItem);
    return this;
  }

   /**
   * Get recipients
   * @return recipients
  **/
  @Schema(description = "")
  public List<String> getRecipients() {
    return recipients;
  }

  public void setRecipients(List<String> recipients) {
    this.recipients = recipients;
  }

  public CEReportSchedule accountId(String accountId) {
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

  public CEReportSchedule createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @Schema(description = "")
  public Long getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }

  public CEReportSchedule lastUpdatedAt(Long lastUpdatedAt) {
    this.lastUpdatedAt = lastUpdatedAt;
    return this;
  }

   /**
   * Get lastUpdatedAt
   * @return lastUpdatedAt
  **/
  @Schema(description = "")
  public Long getLastUpdatedAt() {
    return lastUpdatedAt;
  }

  public void setLastUpdatedAt(Long lastUpdatedAt) {
    this.lastUpdatedAt = lastUpdatedAt;
  }

  public CEReportSchedule userCronTimeZone(String userCronTimeZone) {
    this.userCronTimeZone = userCronTimeZone;
    return this;
  }

   /**
   * Get userCronTimeZone
   * @return userCronTimeZone
  **/
  @Schema(description = "")
  public String getUserCronTimeZone() {
    return userCronTimeZone;
  }

  public void setUserCronTimeZone(String userCronTimeZone) {
    this.userCronTimeZone = userCronTimeZone;
  }

  public CEReportSchedule createdBy(EmbeddedUser createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @Schema(description = "")
  public EmbeddedUser getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(EmbeddedUser createdBy) {
    this.createdBy = createdBy;
  }

  public CEReportSchedule lastUpdatedBy(EmbeddedUser lastUpdatedBy) {
    this.lastUpdatedBy = lastUpdatedBy;
    return this;
  }

   /**
   * Get lastUpdatedBy
   * @return lastUpdatedBy
  **/
  @Schema(description = "")
  public EmbeddedUser getLastUpdatedBy() {
    return lastUpdatedBy;
  }

  public void setLastUpdatedBy(EmbeddedUser lastUpdatedBy) {
    this.lastUpdatedBy = lastUpdatedBy;
  }

  public CEReportSchedule nextExecution(OffsetDateTime nextExecution) {
    this.nextExecution = nextExecution;
    return this;
  }

   /**
   * Get nextExecution
   * @return nextExecution
  **/
  @Schema(description = "")
  public OffsetDateTime getNextExecution() {
    return nextExecution;
  }

  public void setNextExecution(OffsetDateTime nextExecution) {
    this.nextExecution = nextExecution;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CEReportSchedule ceReportSchedule = (CEReportSchedule) o;
    return Objects.equals(this.uuid, ceReportSchedule.uuid) &&
        Objects.equals(this.name, ceReportSchedule.name) &&
        Objects.equals(this.enabled, ceReportSchedule.enabled) &&
        Objects.equals(this.description, ceReportSchedule.description) &&
        Objects.equals(this.viewsId, ceReportSchedule.viewsId) &&
        Objects.equals(this.userCron, ceReportSchedule.userCron) &&
        Objects.equals(this.recipients, ceReportSchedule.recipients) &&
        Objects.equals(this.accountId, ceReportSchedule.accountId) &&
        Objects.equals(this.createdAt, ceReportSchedule.createdAt) &&
        Objects.equals(this.lastUpdatedAt, ceReportSchedule.lastUpdatedAt) &&
        Objects.equals(this.userCronTimeZone, ceReportSchedule.userCronTimeZone) &&
        Objects.equals(this.createdBy, ceReportSchedule.createdBy) &&
        Objects.equals(this.lastUpdatedBy, ceReportSchedule.lastUpdatedBy) &&
        Objects.equals(this.nextExecution, ceReportSchedule.nextExecution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, name, enabled, description, viewsId, userCron, recipients, accountId, createdAt, lastUpdatedAt, userCronTimeZone, createdBy, lastUpdatedBy, nextExecution);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CEReportSchedule {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    viewsId: ").append(toIndentedString(viewsId)).append("\n");
    sb.append("    userCron: ").append(toIndentedString(userCron)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    lastUpdatedAt: ").append(toIndentedString(lastUpdatedAt)).append("\n");
    sb.append("    userCronTimeZone: ").append(toIndentedString(userCronTimeZone)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    lastUpdatedBy: ").append(toIndentedString(lastUpdatedBy)).append("\n");
    sb.append("    nextExecution: ").append(toIndentedString(nextExecution)).append("\n");
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
