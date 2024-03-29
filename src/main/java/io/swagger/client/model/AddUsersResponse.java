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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * AddUsersResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class AddUsersResponse {
  /**
   * Gets or Sets inner
   */
  @JsonAdapter(InnerEnum.Adapter.class)
  public enum InnerEnum {
    USER_INVITED_SUCCESSFULLY("USER_INVITED_SUCCESSFULLY"),
    USER_ADDED_SUCCESSFULLY("USER_ADDED_SUCCESSFULLY"),
    USER_ALREADY_ADDED("USER_ALREADY_ADDED"),
    USER_ALREADY_INVITED("USER_ALREADY_INVITED"),
    FAIL("FAIL");

    private String value;

    InnerEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static InnerEnum fromValue(String input) {
      for (InnerEnum b : InnerEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<InnerEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final InnerEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public InnerEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return InnerEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("addUserResponseMap")
  private Map<String, InnerEnum> addUserResponseMap = null;

  public AddUsersResponse addUserResponseMap(Map<String, InnerEnum> addUserResponseMap) {
    this.addUserResponseMap = addUserResponseMap;
    return this;
  }

  public AddUsersResponse putAddUserResponseMapItem(String key, InnerEnum addUserResponseMapItem) {
    if (this.addUserResponseMap == null) {
      this.addUserResponseMap = new HashMap<String, InnerEnum>();
    }
    this.addUserResponseMap.put(key, addUserResponseMapItem);
    return this;
  }

   /**
   * Get addUserResponseMap
   * @return addUserResponseMap
  **/
  @Schema(description = "")
  public Map<String, InnerEnum> getAddUserResponseMap() {
    return addUserResponseMap;
  }

  public void setAddUserResponseMap(Map<String, InnerEnum> addUserResponseMap) {
    this.addUserResponseMap = addUserResponseMap;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddUsersResponse addUsersResponse = (AddUsersResponse) o;
    return Objects.equals(this.addUserResponseMap, addUsersResponse.addUserResponseMap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addUserResponseMap);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddUsersResponse {\n");
    
    sb.append("    addUserResponseMap: ").append(toIndentedString(addUserResponseMap)).append("\n");
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
