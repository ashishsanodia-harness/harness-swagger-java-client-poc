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
import io.swagger.client.model.AlertThreshold;
import io.swagger.client.model.BudgetScope;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * The Cloud Cost Budget definition
 */
@Schema(description = "The Cloud Cost Budget definition")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class Budget {
  @SerializedName("uuid")
  private String uuid = null;

  @SerializedName("accountId")
  private String accountId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("scope")
  private BudgetScope scope = null;

  /**
   * Whether the Budget is based on a specified amount or based on previous month&#x27;s actual spend
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    SPECIFIED_AMOUNT("SPECIFIED_AMOUNT"),
    PREVIOUS_MONTH_SPEND("PREVIOUS_MONTH_SPEND"),
    PREVIOUS_PERIOD_SPEND("PREVIOUS_PERIOD_SPEND");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TypeEnum fromValue(String input) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return TypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("budgetAmount")
  private Double budgetAmount = null;

  /**
   * Gets or Sets period
   */
  @JsonAdapter(PeriodEnum.Adapter.class)
  public enum PeriodEnum {
    DAILY("DAILY"),
    WEEKLY("WEEKLY"),
    MONTHLY("MONTHLY"),
    QUARTERLY("QUARTERLY"),
    YEARLY("YEARLY");

    private String value;

    PeriodEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static PeriodEnum fromValue(String input) {
      for (PeriodEnum b : PeriodEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<PeriodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PeriodEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public PeriodEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return PeriodEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("period")
  private PeriodEnum period = null;

  @SerializedName("growthRate")
  private Double growthRate = null;

  @SerializedName("actualCost")
  private Double actualCost = null;

  @SerializedName("forecastCost")
  private Double forecastCost = null;

  @SerializedName("lastMonthCost")
  private Double lastMonthCost = null;

  @SerializedName("alertThresholds")
  private List<AlertThreshold> alertThresholds = null;

  @SerializedName("emailAddresses")
  private List<String> emailAddresses = null;

  @SerializedName("userGroupIds")
  private List<String> userGroupIds = null;

  @SerializedName("notifyOnSlack")
  private Boolean notifyOnSlack = null;

  @SerializedName("isNgBudget")
  private Boolean isNgBudget = null;

  @SerializedName("startTime")
  private Long startTime = null;

  @SerializedName("endTime")
  private Long endTime = null;

  @SerializedName("createdAt")
  private Long createdAt = null;

  @SerializedName("lastUpdatedAt")
  private Long lastUpdatedAt = null;

  @SerializedName("ngBudget")
  private Boolean ngBudget = null;

  public Budget uuid(String uuid) {
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

  public Budget accountId(String accountId) {
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

  public Budget name(String name) {
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

  public Budget scope(BudgetScope scope) {
    this.scope = scope;
    return this;
  }

   /**
   * Get scope
   * @return scope
  **/
  @Schema(description = "")
  public BudgetScope getScope() {
    return scope;
  }

  public void setScope(BudgetScope scope) {
    this.scope = scope;
  }

  public Budget type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Whether the Budget is based on a specified amount or based on previous month&#x27;s actual spend
   * @return type
  **/
  @Schema(description = "Whether the Budget is based on a specified amount or based on previous month's actual spend")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Budget budgetAmount(Double budgetAmount) {
    this.budgetAmount = budgetAmount;
    return this;
  }

   /**
   * Get budgetAmount
   * @return budgetAmount
  **/
  @Schema(description = "")
  public Double getBudgetAmount() {
    return budgetAmount;
  }

  public void setBudgetAmount(Double budgetAmount) {
    this.budgetAmount = budgetAmount;
  }

  public Budget period(PeriodEnum period) {
    this.period = period;
    return this;
  }

   /**
   * Get period
   * @return period
  **/
  @Schema(description = "")
  public PeriodEnum getPeriod() {
    return period;
  }

  public void setPeriod(PeriodEnum period) {
    this.period = period;
  }

  public Budget growthRate(Double growthRate) {
    this.growthRate = growthRate;
    return this;
  }

   /**
   * Get growthRate
   * @return growthRate
  **/
  @Schema(description = "")
  public Double getGrowthRate() {
    return growthRate;
  }

  public void setGrowthRate(Double growthRate) {
    this.growthRate = growthRate;
  }

  public Budget actualCost(Double actualCost) {
    this.actualCost = actualCost;
    return this;
  }

   /**
   * Get actualCost
   * @return actualCost
  **/
  @Schema(description = "")
  public Double getActualCost() {
    return actualCost;
  }

  public void setActualCost(Double actualCost) {
    this.actualCost = actualCost;
  }

  public Budget forecastCost(Double forecastCost) {
    this.forecastCost = forecastCost;
    return this;
  }

   /**
   * Get forecastCost
   * @return forecastCost
  **/
  @Schema(description = "")
  public Double getForecastCost() {
    return forecastCost;
  }

  public void setForecastCost(Double forecastCost) {
    this.forecastCost = forecastCost;
  }

  public Budget lastMonthCost(Double lastMonthCost) {
    this.lastMonthCost = lastMonthCost;
    return this;
  }

   /**
   * Get lastMonthCost
   * @return lastMonthCost
  **/
  @Schema(description = "")
  public Double getLastMonthCost() {
    return lastMonthCost;
  }

  public void setLastMonthCost(Double lastMonthCost) {
    this.lastMonthCost = lastMonthCost;
  }

  public Budget alertThresholds(List<AlertThreshold> alertThresholds) {
    this.alertThresholds = alertThresholds;
    return this;
  }

  public Budget addAlertThresholdsItem(AlertThreshold alertThresholdsItem) {
    if (this.alertThresholds == null) {
      this.alertThresholds = new ArrayList<AlertThreshold>();
    }
    this.alertThresholds.add(alertThresholdsItem);
    return this;
  }

   /**
   * Get alertThresholds
   * @return alertThresholds
  **/
  @Schema(description = "")
  public List<AlertThreshold> getAlertThresholds() {
    return alertThresholds;
  }

  public void setAlertThresholds(List<AlertThreshold> alertThresholds) {
    this.alertThresholds = alertThresholds;
  }

  public Budget emailAddresses(List<String> emailAddresses) {
    this.emailAddresses = emailAddresses;
    return this;
  }

  public Budget addEmailAddressesItem(String emailAddressesItem) {
    if (this.emailAddresses == null) {
      this.emailAddresses = new ArrayList<String>();
    }
    this.emailAddresses.add(emailAddressesItem);
    return this;
  }

   /**
   * Get emailAddresses
   * @return emailAddresses
  **/
  @Schema(description = "")
  public List<String> getEmailAddresses() {
    return emailAddresses;
  }

  public void setEmailAddresses(List<String> emailAddresses) {
    this.emailAddresses = emailAddresses;
  }

  public Budget userGroupIds(List<String> userGroupIds) {
    this.userGroupIds = userGroupIds;
    return this;
  }

  public Budget addUserGroupIdsItem(String userGroupIdsItem) {
    if (this.userGroupIds == null) {
      this.userGroupIds = new ArrayList<String>();
    }
    this.userGroupIds.add(userGroupIdsItem);
    return this;
  }

   /**
   * Get userGroupIds
   * @return userGroupIds
  **/
  @Schema(description = "")
  public List<String> getUserGroupIds() {
    return userGroupIds;
  }

  public void setUserGroupIds(List<String> userGroupIds) {
    this.userGroupIds = userGroupIds;
  }

  public Budget notifyOnSlack(Boolean notifyOnSlack) {
    this.notifyOnSlack = notifyOnSlack;
    return this;
  }

   /**
   * Get notifyOnSlack
   * @return notifyOnSlack
  **/
  @Schema(description = "")
  public Boolean isNotifyOnSlack() {
    return notifyOnSlack;
  }

  public void setNotifyOnSlack(Boolean notifyOnSlack) {
    this.notifyOnSlack = notifyOnSlack;
  }

  public Budget isNgBudget(Boolean isNgBudget) {
    this.isNgBudget = isNgBudget;
    return this;
  }

   /**
   * Get isNgBudget
   * @return isNgBudget
  **/
  @Schema(description = "")
  public Boolean isIsNgBudget() {
    return isNgBudget;
  }

  public void setIsNgBudget(Boolean isNgBudget) {
    this.isNgBudget = isNgBudget;
  }

  public Budget startTime(Long startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @Schema(description = "")
  public Long getStartTime() {
    return startTime;
  }

  public void setStartTime(Long startTime) {
    this.startTime = startTime;
  }

  public Budget endTime(Long endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @Schema(description = "")
  public Long getEndTime() {
    return endTime;
  }

  public void setEndTime(Long endTime) {
    this.endTime = endTime;
  }

  public Budget createdAt(Long createdAt) {
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

  public Budget lastUpdatedAt(Long lastUpdatedAt) {
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

  public Budget ngBudget(Boolean ngBudget) {
    this.ngBudget = ngBudget;
    return this;
  }

   /**
   * Get ngBudget
   * @return ngBudget
  **/
  @Schema(description = "")
  public Boolean isNgBudget() {
    return ngBudget;
  }

  public void setNgBudget(Boolean ngBudget) {
    this.ngBudget = ngBudget;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Budget budget = (Budget) o;
    return Objects.equals(this.uuid, budget.uuid) &&
        Objects.equals(this.accountId, budget.accountId) &&
        Objects.equals(this.name, budget.name) &&
        Objects.equals(this.scope, budget.scope) &&
        Objects.equals(this.type, budget.type) &&
        Objects.equals(this.budgetAmount, budget.budgetAmount) &&
        Objects.equals(this.period, budget.period) &&
        Objects.equals(this.growthRate, budget.growthRate) &&
        Objects.equals(this.actualCost, budget.actualCost) &&
        Objects.equals(this.forecastCost, budget.forecastCost) &&
        Objects.equals(this.lastMonthCost, budget.lastMonthCost) &&
        Objects.equals(this.alertThresholds, budget.alertThresholds) &&
        Objects.equals(this.emailAddresses, budget.emailAddresses) &&
        Objects.equals(this.userGroupIds, budget.userGroupIds) &&
        Objects.equals(this.notifyOnSlack, budget.notifyOnSlack) &&
        Objects.equals(this.isNgBudget, budget.isNgBudget) &&
        Objects.equals(this.startTime, budget.startTime) &&
        Objects.equals(this.endTime, budget.endTime) &&
        Objects.equals(this.createdAt, budget.createdAt) &&
        Objects.equals(this.lastUpdatedAt, budget.lastUpdatedAt) &&
        Objects.equals(this.ngBudget, budget.ngBudget);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, accountId, name, scope, type, budgetAmount, period, growthRate, actualCost, forecastCost, lastMonthCost, alertThresholds, emailAddresses, userGroupIds, notifyOnSlack, isNgBudget, startTime, endTime, createdAt, lastUpdatedAt, ngBudget);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Budget {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    budgetAmount: ").append(toIndentedString(budgetAmount)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    growthRate: ").append(toIndentedString(growthRate)).append("\n");
    sb.append("    actualCost: ").append(toIndentedString(actualCost)).append("\n");
    sb.append("    forecastCost: ").append(toIndentedString(forecastCost)).append("\n");
    sb.append("    lastMonthCost: ").append(toIndentedString(lastMonthCost)).append("\n");
    sb.append("    alertThresholds: ").append(toIndentedString(alertThresholds)).append("\n");
    sb.append("    emailAddresses: ").append(toIndentedString(emailAddresses)).append("\n");
    sb.append("    userGroupIds: ").append(toIndentedString(userGroupIds)).append("\n");
    sb.append("    notifyOnSlack: ").append(toIndentedString(notifyOnSlack)).append("\n");
    sb.append("    isNgBudget: ").append(toIndentedString(isNgBudget)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    lastUpdatedAt: ").append(toIndentedString(lastUpdatedAt)).append("\n");
    sb.append("    ngBudget: ").append(toIndentedString(ngBudget)).append("\n");
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
