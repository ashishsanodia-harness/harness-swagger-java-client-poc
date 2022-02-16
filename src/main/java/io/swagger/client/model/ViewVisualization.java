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
import io.swagger.client.model.ViewField;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ViewVisualization
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class ViewVisualization {
  /**
   * Granularity of Perspective timeseries data
   */
  @JsonAdapter(GranularityEnum.Adapter.class)
  public enum GranularityEnum {
    DAY("DAY"),
    MONTH("MONTH");

    private String value;

    GranularityEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static GranularityEnum fromValue(String input) {
      for (GranularityEnum b : GranularityEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<GranularityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final GranularityEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public GranularityEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return GranularityEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("granularity")
  private GranularityEnum granularity = null;

  @SerializedName("groupBy")
  private ViewField groupBy = null;

  /**
   * Perspective chart type
   */
  @JsonAdapter(ChartTypeEnum.Adapter.class)
  public enum ChartTypeEnum {
    TIME_SERIES("STACKED_TIME_SERIES"),
    LINE_CHART("STACKED_LINE_CHART");

    private String value;

    ChartTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ChartTypeEnum fromValue(String input) {
      for (ChartTypeEnum b : ChartTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ChartTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ChartTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ChartTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ChartTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("chartType")
  private ChartTypeEnum chartType = null;

  public ViewVisualization granularity(GranularityEnum granularity) {
    this.granularity = granularity;
    return this;
  }

   /**
   * Granularity of Perspective timeseries data
   * @return granularity
  **/
  @Schema(description = "Granularity of Perspective timeseries data")
  public GranularityEnum getGranularity() {
    return granularity;
  }

  public void setGranularity(GranularityEnum granularity) {
    this.granularity = granularity;
  }

  public ViewVisualization groupBy(ViewField groupBy) {
    this.groupBy = groupBy;
    return this;
  }

   /**
   * Get groupBy
   * @return groupBy
  **/
  @Schema(description = "")
  public ViewField getGroupBy() {
    return groupBy;
  }

  public void setGroupBy(ViewField groupBy) {
    this.groupBy = groupBy;
  }

  public ViewVisualization chartType(ChartTypeEnum chartType) {
    this.chartType = chartType;
    return this;
  }

   /**
   * Perspective chart type
   * @return chartType
  **/
  @Schema(description = "Perspective chart type")
  public ChartTypeEnum getChartType() {
    return chartType;
  }

  public void setChartType(ChartTypeEnum chartType) {
    this.chartType = chartType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViewVisualization viewVisualization = (ViewVisualization) o;
    return Objects.equals(this.granularity, viewVisualization.granularity) &&
        Objects.equals(this.groupBy, viewVisualization.groupBy) &&
        Objects.equals(this.chartType, viewVisualization.chartType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(granularity, groupBy, chartType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViewVisualization {\n");
    
    sb.append("    granularity: ").append(toIndentedString(granularity)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    chartType: ").append(toIndentedString(chartType)).append("\n");
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