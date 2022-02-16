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
import io.swagger.client.model.SSORequest;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * LoginTypeResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class LoginTypeResponse {
  /**
   * Gets or Sets authenticationMechanism
   */
  @JsonAdapter(AuthenticationMechanismEnum.Adapter.class)
  public enum AuthenticationMechanismEnum {
    USER_PASSWORD("USER_PASSWORD"),
    SAML("SAML"),
    LDAP("LDAP"),
    OAUTH("OAUTH");

    private String value;

    AuthenticationMechanismEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static AuthenticationMechanismEnum fromValue(String input) {
      for (AuthenticationMechanismEnum b : AuthenticationMechanismEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<AuthenticationMechanismEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AuthenticationMechanismEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public AuthenticationMechanismEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return AuthenticationMechanismEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("authenticationMechanism")
  private AuthenticationMechanismEnum authenticationMechanism = null;

  @SerializedName("SSORequest")
  private SSORequest ssORequest = null;

  @SerializedName("isOauthEnabled")
  private Boolean isOauthEnabled = null;

  @SerializedName("showCaptcha")
  private Boolean showCaptcha = null;

  /**
   * Gets or Sets defaultExperience
   */
  @JsonAdapter(DefaultExperienceEnum.Adapter.class)
  public enum DefaultExperienceEnum {
    NG("NG"),
    CG("CG");

    private String value;

    DefaultExperienceEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static DefaultExperienceEnum fromValue(String input) {
      for (DefaultExperienceEnum b : DefaultExperienceEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<DefaultExperienceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DefaultExperienceEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public DefaultExperienceEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return DefaultExperienceEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("defaultExperience")
  private DefaultExperienceEnum defaultExperience = null;

  @SerializedName("oauthEnabled")
  private Boolean oauthEnabled = null;

  @SerializedName("ssorequest")
  private SSORequest ssorequest = null;

  public LoginTypeResponse authenticationMechanism(AuthenticationMechanismEnum authenticationMechanism) {
    this.authenticationMechanism = authenticationMechanism;
    return this;
  }

   /**
   * Get authenticationMechanism
   * @return authenticationMechanism
  **/
  @Schema(description = "")
  public AuthenticationMechanismEnum getAuthenticationMechanism() {
    return authenticationMechanism;
  }

  public void setAuthenticationMechanism(AuthenticationMechanismEnum authenticationMechanism) {
    this.authenticationMechanism = authenticationMechanism;
  }

  public LoginTypeResponse ssORequest(SSORequest ssORequest) {
    this.ssORequest = ssORequest;
    return this;
  }

   /**
   * Get ssORequest
   * @return ssORequest
  **/
  @Schema(description = "")
  public SSORequest getSsORequest() {
    return ssORequest;
  }

  public void setSsORequest(SSORequest ssORequest) {
    this.ssORequest = ssORequest;
  }

  public LoginTypeResponse isOauthEnabled(Boolean isOauthEnabled) {
    this.isOauthEnabled = isOauthEnabled;
    return this;
  }

   /**
   * Get isOauthEnabled
   * @return isOauthEnabled
  **/
  @Schema(description = "")
  public Boolean isIsOauthEnabled() {
    return isOauthEnabled;
  }

  public void setIsOauthEnabled(Boolean isOauthEnabled) {
    this.isOauthEnabled = isOauthEnabled;
  }

  public LoginTypeResponse showCaptcha(Boolean showCaptcha) {
    this.showCaptcha = showCaptcha;
    return this;
  }

   /**
   * Get showCaptcha
   * @return showCaptcha
  **/
  @Schema(description = "")
  public Boolean isShowCaptcha() {
    return showCaptcha;
  }

  public void setShowCaptcha(Boolean showCaptcha) {
    this.showCaptcha = showCaptcha;
  }

  public LoginTypeResponse defaultExperience(DefaultExperienceEnum defaultExperience) {
    this.defaultExperience = defaultExperience;
    return this;
  }

   /**
   * Get defaultExperience
   * @return defaultExperience
  **/
  @Schema(description = "")
  public DefaultExperienceEnum getDefaultExperience() {
    return defaultExperience;
  }

  public void setDefaultExperience(DefaultExperienceEnum defaultExperience) {
    this.defaultExperience = defaultExperience;
  }

  public LoginTypeResponse oauthEnabled(Boolean oauthEnabled) {
    this.oauthEnabled = oauthEnabled;
    return this;
  }

   /**
   * Get oauthEnabled
   * @return oauthEnabled
  **/
  @Schema(description = "")
  public Boolean isOauthEnabled() {
    return oauthEnabled;
  }

  public void setOauthEnabled(Boolean oauthEnabled) {
    this.oauthEnabled = oauthEnabled;
  }

  public LoginTypeResponse ssorequest(SSORequest ssorequest) {
    this.ssorequest = ssorequest;
    return this;
  }

   /**
   * Get ssorequest
   * @return ssorequest
  **/
  @Schema(description = "")
  public SSORequest getSsorequest() {
    return ssorequest;
  }

  public void setSsorequest(SSORequest ssorequest) {
    this.ssorequest = ssorequest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginTypeResponse loginTypeResponse = (LoginTypeResponse) o;
    return Objects.equals(this.authenticationMechanism, loginTypeResponse.authenticationMechanism) &&
        Objects.equals(this.ssORequest, loginTypeResponse.ssORequest) &&
        Objects.equals(this.isOauthEnabled, loginTypeResponse.isOauthEnabled) &&
        Objects.equals(this.showCaptcha, loginTypeResponse.showCaptcha) &&
        Objects.equals(this.defaultExperience, loginTypeResponse.defaultExperience) &&
        Objects.equals(this.oauthEnabled, loginTypeResponse.oauthEnabled) &&
        Objects.equals(this.ssorequest, loginTypeResponse.ssorequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticationMechanism, ssORequest, isOauthEnabled, showCaptcha, defaultExperience, oauthEnabled, ssorequest);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginTypeResponse {\n");
    
    sb.append("    authenticationMechanism: ").append(toIndentedString(authenticationMechanism)).append("\n");
    sb.append("    ssORequest: ").append(toIndentedString(ssORequest)).append("\n");
    sb.append("    isOauthEnabled: ").append(toIndentedString(isOauthEnabled)).append("\n");
    sb.append("    showCaptcha: ").append(toIndentedString(showCaptcha)).append("\n");
    sb.append("    defaultExperience: ").append(toIndentedString(defaultExperience)).append("\n");
    sb.append("    oauthEnabled: ").append(toIndentedString(oauthEnabled)).append("\n");
    sb.append("    ssorequest: ").append(toIndentedString(ssorequest)).append("\n");
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
