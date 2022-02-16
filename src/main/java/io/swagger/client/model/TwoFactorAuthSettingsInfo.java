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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * TwoFactorAuthSettingsInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class TwoFactorAuthSettingsInfo {
  @SerializedName("userId")
  private String userId = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("twoFactorAuthenticationEnabled")
  private Boolean twoFactorAuthenticationEnabled = null;

  /**
   * Gets or Sets mechanism
   */
  @JsonAdapter(MechanismEnum.Adapter.class)
  public enum MechanismEnum {
    TOTP("TOTP");

    private String value;

    MechanismEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static MechanismEnum fromValue(String input) {
      for (MechanismEnum b : MechanismEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<MechanismEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MechanismEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public MechanismEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return MechanismEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("mechanism")
  private MechanismEnum mechanism = null;

  @SerializedName("totpSecretKey")
  private String totpSecretKey = null;

  @SerializedName("totpqrurl")
  private String totpqrurl = null;

  public TwoFactorAuthSettingsInfo userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @Schema(description = "")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public TwoFactorAuthSettingsInfo email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @Schema(description = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public TwoFactorAuthSettingsInfo twoFactorAuthenticationEnabled(Boolean twoFactorAuthenticationEnabled) {
    this.twoFactorAuthenticationEnabled = twoFactorAuthenticationEnabled;
    return this;
  }

   /**
   * Get twoFactorAuthenticationEnabled
   * @return twoFactorAuthenticationEnabled
  **/
  @Schema(description = "")
  public Boolean isTwoFactorAuthenticationEnabled() {
    return twoFactorAuthenticationEnabled;
  }

  public void setTwoFactorAuthenticationEnabled(Boolean twoFactorAuthenticationEnabled) {
    this.twoFactorAuthenticationEnabled = twoFactorAuthenticationEnabled;
  }

  public TwoFactorAuthSettingsInfo mechanism(MechanismEnum mechanism) {
    this.mechanism = mechanism;
    return this;
  }

   /**
   * Get mechanism
   * @return mechanism
  **/
  @Schema(description = "")
  public MechanismEnum getMechanism() {
    return mechanism;
  }

  public void setMechanism(MechanismEnum mechanism) {
    this.mechanism = mechanism;
  }

  public TwoFactorAuthSettingsInfo totpSecretKey(String totpSecretKey) {
    this.totpSecretKey = totpSecretKey;
    return this;
  }

   /**
   * Get totpSecretKey
   * @return totpSecretKey
  **/
  @Schema(description = "")
  public String getTotpSecretKey() {
    return totpSecretKey;
  }

  public void setTotpSecretKey(String totpSecretKey) {
    this.totpSecretKey = totpSecretKey;
  }

  public TwoFactorAuthSettingsInfo totpqrurl(String totpqrurl) {
    this.totpqrurl = totpqrurl;
    return this;
  }

   /**
   * Get totpqrurl
   * @return totpqrurl
  **/
  @Schema(description = "")
  public String getTotpqrurl() {
    return totpqrurl;
  }

  public void setTotpqrurl(String totpqrurl) {
    this.totpqrurl = totpqrurl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TwoFactorAuthSettingsInfo twoFactorAuthSettingsInfo = (TwoFactorAuthSettingsInfo) o;
    return Objects.equals(this.userId, twoFactorAuthSettingsInfo.userId) &&
        Objects.equals(this.email, twoFactorAuthSettingsInfo.email) &&
        Objects.equals(this.twoFactorAuthenticationEnabled, twoFactorAuthSettingsInfo.twoFactorAuthenticationEnabled) &&
        Objects.equals(this.mechanism, twoFactorAuthSettingsInfo.mechanism) &&
        Objects.equals(this.totpSecretKey, twoFactorAuthSettingsInfo.totpSecretKey) &&
        Objects.equals(this.totpqrurl, twoFactorAuthSettingsInfo.totpqrurl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, email, twoFactorAuthenticationEnabled, mechanism, totpSecretKey, totpqrurl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TwoFactorAuthSettingsInfo {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    twoFactorAuthenticationEnabled: ").append(toIndentedString(twoFactorAuthenticationEnabled)).append("\n");
    sb.append("    mechanism: ").append(toIndentedString(mechanism)).append("\n");
    sb.append("    totpSecretKey: ").append(toIndentedString(totpSecretKey)).append("\n");
    sb.append("    totpqrurl: ").append(toIndentedString(totpqrurl)).append("\n");
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