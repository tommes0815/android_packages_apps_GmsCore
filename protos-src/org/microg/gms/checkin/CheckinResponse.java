// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: protos-repo/checkin.proto
package org.microg.gms.checkin;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import okio.ByteString;

import static com.squareup.wire.Message.Datatype.BOOL;
import static com.squareup.wire.Message.Datatype.BYTES;
import static com.squareup.wire.Message.Datatype.FIXED64;
import static com.squareup.wire.Message.Datatype.INT64;
import static com.squareup.wire.Message.Datatype.STRING;
import static com.squareup.wire.Message.Label.REPEATED;

public final class CheckinResponse extends Message {

  public static final Boolean DEFAULT_STATSOK = false;
  public static final List<Intent> DEFAULT_INTENT = Collections.emptyList();
  public static final Long DEFAULT_TIMEMS = 0L;
  public static final String DEFAULT_DIGEST = "";
  public static final List<GservicesSetting> DEFAULT_SETTING = Collections.emptyList();
  public static final Boolean DEFAULT_MARKETOK = false;
  public static final Long DEFAULT_ANDROIDID = 0L;
  public static final Long DEFAULT_SECURITYTOKEN = 0L;
  public static final Boolean DEFAULT_SETTINGSDIFF = false;
  public static final List<String> DEFAULT_DELETESETTING = Collections.emptyList();

  @ProtoField(tag = 1, type = BOOL)
  public final Boolean statsOk;

  @ProtoField(tag = 2, label = REPEATED, messageType = Intent.class)
  public final List<Intent> intent;

  @ProtoField(tag = 3, type = INT64)
  public final Long timeMs;

  @ProtoField(tag = 4, type = STRING)
  public final String digest;

  @ProtoField(tag = 5, label = REPEATED, messageType = GservicesSetting.class)
  public final List<GservicesSetting> setting;

  @ProtoField(tag = 6, type = BOOL)
  public final Boolean marketOk;

  @ProtoField(tag = 7, type = FIXED64)
  public final Long androidId;

  @ProtoField(tag = 8, type = FIXED64)
  public final Long securityToken;

  @ProtoField(tag = 9, type = BOOL)
  public final Boolean settingsDiff;

  @ProtoField(tag = 10, type = STRING, label = REPEATED)
  public final List<String> deleteSetting;

  public CheckinResponse(Boolean statsOk, List<Intent> intent, Long timeMs, String digest, List<GservicesSetting> setting, Boolean marketOk, Long androidId, Long securityToken, Boolean settingsDiff, List<String> deleteSetting) {
    this.statsOk = statsOk;
    this.intent = immutableCopyOf(intent);
    this.timeMs = timeMs;
    this.digest = digest;
    this.setting = immutableCopyOf(setting);
    this.marketOk = marketOk;
    this.androidId = androidId;
    this.securityToken = securityToken;
    this.settingsDiff = settingsDiff;
    this.deleteSetting = immutableCopyOf(deleteSetting);
  }

  private CheckinResponse(Builder builder) {
    this(builder.statsOk, builder.intent, builder.timeMs, builder.digest, builder.setting, builder.marketOk, builder.androidId, builder.securityToken, builder.settingsDiff, builder.deleteSetting);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof CheckinResponse)) return false;
    CheckinResponse o = (CheckinResponse) other;
    return equals(statsOk, o.statsOk)
        && equals(intent, o.intent)
        && equals(timeMs, o.timeMs)
        && equals(digest, o.digest)
        && equals(setting, o.setting)
        && equals(marketOk, o.marketOk)
        && equals(androidId, o.androidId)
        && equals(securityToken, o.securityToken)
        && equals(settingsDiff, o.settingsDiff)
        && equals(deleteSetting, o.deleteSetting);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = statsOk != null ? statsOk.hashCode() : 0;
      result = result * 37 + (intent != null ? intent.hashCode() : 1);
      result = result * 37 + (timeMs != null ? timeMs.hashCode() : 0);
      result = result * 37 + (digest != null ? digest.hashCode() : 0);
      result = result * 37 + (setting != null ? setting.hashCode() : 1);
      result = result * 37 + (marketOk != null ? marketOk.hashCode() : 0);
      result = result * 37 + (androidId != null ? androidId.hashCode() : 0);
      result = result * 37 + (securityToken != null ? securityToken.hashCode() : 0);
      result = result * 37 + (settingsDiff != null ? settingsDiff.hashCode() : 0);
      result = result * 37 + (deleteSetting != null ? deleteSetting.hashCode() : 1);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<CheckinResponse> {

    public Boolean statsOk;
    public List<Intent> intent;
    public Long timeMs;
    public String digest;
    public List<GservicesSetting> setting;
    public Boolean marketOk;
    public Long androidId;
    public Long securityToken;
    public Boolean settingsDiff;
    public List<String> deleteSetting;

    public Builder() {
    }

    public Builder(CheckinResponse message) {
      super(message);
      if (message == null) return;
      this.statsOk = message.statsOk;
      this.intent = copyOf(message.intent);
      this.timeMs = message.timeMs;
      this.digest = message.digest;
      this.setting = copyOf(message.setting);
      this.marketOk = message.marketOk;
      this.androidId = message.androidId;
      this.securityToken = message.securityToken;
      this.settingsDiff = message.settingsDiff;
      this.deleteSetting = copyOf(message.deleteSetting);
    }

    public Builder statsOk(Boolean statsOk) {
      this.statsOk = statsOk;
      return this;
    }

    public Builder intent(List<Intent> intent) {
      this.intent = checkForNulls(intent);
      return this;
    }

    public Builder timeMs(Long timeMs) {
      this.timeMs = timeMs;
      return this;
    }

    public Builder digest(String digest) {
      this.digest = digest;
      return this;
    }

    public Builder setting(List<GservicesSetting> setting) {
      this.setting = checkForNulls(setting);
      return this;
    }

    public Builder marketOk(Boolean marketOk) {
      this.marketOk = marketOk;
      return this;
    }

    public Builder androidId(Long androidId) {
      this.androidId = androidId;
      return this;
    }

    public Builder securityToken(Long securityToken) {
      this.securityToken = securityToken;
      return this;
    }

    public Builder settingsDiff(Boolean settingsDiff) {
      this.settingsDiff = settingsDiff;
      return this;
    }

    public Builder deleteSetting(List<String> deleteSetting) {
      this.deleteSetting = checkForNulls(deleteSetting);
      return this;
    }

    @Override
    public CheckinResponse build() {
      return new CheckinResponse(this);
    }
  }

  public static final class Intent extends Message {

    public static final String DEFAULT_ACTION = "";
    public static final String DEFAULT_DATAURI = "";
    public static final String DEFAULT_MIMETYPE = "";
    public static final String DEFAULT_JAVACLASS = "";
    public static final List<Intent.Extra> DEFAULT_EXTRA = Collections.emptyList();

    @ProtoField(tag = 1, type = STRING)
    public final String action;

    @ProtoField(tag = 2, type = STRING)
    public final String dataUri;

    @ProtoField(tag = 3, type = STRING)
    public final String mimeType;

    @ProtoField(tag = 4, type = STRING)
    public final String javaClass;

    @ProtoField(tag = 5, label = REPEATED, messageType = Intent.Extra.class)
    public final List<Intent.Extra> extra;

    public Intent(String action, String dataUri, String mimeType, String javaClass, List<Intent.Extra> extra) {
      this.action = action;
      this.dataUri = dataUri;
      this.mimeType = mimeType;
      this.javaClass = javaClass;
      this.extra = immutableCopyOf(extra);
    }

    private Intent(Builder builder) {
      this(builder.action, builder.dataUri, builder.mimeType, builder.javaClass, builder.extra);
      setBuilder(builder);
    }

    @Override
    public boolean equals(Object other) {
      if (other == this) return true;
      if (!(other instanceof Intent)) return false;
      Intent o = (Intent) other;
      return equals(action, o.action)
          && equals(dataUri, o.dataUri)
          && equals(mimeType, o.mimeType)
          && equals(javaClass, o.javaClass)
          && equals(extra, o.extra);
    }

    @Override
    public int hashCode() {
      int result = hashCode;
      if (result == 0) {
        result = action != null ? action.hashCode() : 0;
        result = result * 37 + (dataUri != null ? dataUri.hashCode() : 0);
        result = result * 37 + (mimeType != null ? mimeType.hashCode() : 0);
        result = result * 37 + (javaClass != null ? javaClass.hashCode() : 0);
        result = result * 37 + (extra != null ? extra.hashCode() : 1);
        hashCode = result;
      }
      return result;
    }

    public static final class Builder extends Message.Builder<Intent> {

      public String action;
      public String dataUri;
      public String mimeType;
      public String javaClass;
      public List<Intent.Extra> extra;

      public Builder() {
      }

      public Builder(Intent message) {
        super(message);
        if (message == null) return;
        this.action = message.action;
        this.dataUri = message.dataUri;
        this.mimeType = message.mimeType;
        this.javaClass = message.javaClass;
        this.extra = copyOf(message.extra);
      }

      public Builder action(String action) {
        this.action = action;
        return this;
      }

      public Builder dataUri(String dataUri) {
        this.dataUri = dataUri;
        return this;
      }

      public Builder mimeType(String mimeType) {
        this.mimeType = mimeType;
        return this;
      }

      public Builder javaClass(String javaClass) {
        this.javaClass = javaClass;
        return this;
      }

      public Builder extra(List<Intent.Extra> extra) {
        this.extra = checkForNulls(extra);
        return this;
      }

      @Override
      public Intent build() {
        return new Intent(this);
      }
    }

    public static final class Extra extends Message {

      public static final String DEFAULT_NAME = "";
      public static final String DEFAULT_VALUE = "";

      @ProtoField(tag = 6, type = STRING)
      public final String name;

      @ProtoField(tag = 7, type = STRING)
      public final String value;

      public Extra(String name, String value) {
        this.name = name;
        this.value = value;
      }

      private Extra(Builder builder) {
        this(builder.name, builder.value);
        setBuilder(builder);
      }

      @Override
      public boolean equals(Object other) {
        if (other == this) return true;
        if (!(other instanceof Extra)) return false;
        Extra o = (Extra) other;
        return equals(name, o.name)
            && equals(value, o.value);
      }

      @Override
      public int hashCode() {
        int result = hashCode;
        if (result == 0) {
          result = name != null ? name.hashCode() : 0;
          result = result * 37 + (value != null ? value.hashCode() : 0);
          hashCode = result;
        }
        return result;
      }

      public static final class Builder extends Message.Builder<Extra> {

        public String name;
        public String value;

        public Builder() {
        }

        public Builder(Extra message) {
          super(message);
          if (message == null) return;
          this.name = message.name;
          this.value = message.value;
        }

        public Builder name(String name) {
          this.name = name;
          return this;
        }

        public Builder value(String value) {
          this.value = value;
          return this;
        }

        @Override
        public Extra build() {
          return new Extra(this);
        }
      }
    }
  }

  public static final class GservicesSetting extends Message {

    public static final ByteString DEFAULT_NAME = ByteString.EMPTY;
    public static final ByteString DEFAULT_VALUE = ByteString.EMPTY;

    @ProtoField(tag = 1, type = BYTES)
    public final ByteString name;

    @ProtoField(tag = 2, type = BYTES)
    public final ByteString value;

    public GservicesSetting(ByteString name, ByteString value) {
      this.name = name;
      this.value = value;
    }

    private GservicesSetting(Builder builder) {
      this(builder.name, builder.value);
      setBuilder(builder);
    }

    @Override
    public boolean equals(Object other) {
      if (other == this) return true;
      if (!(other instanceof GservicesSetting)) return false;
      GservicesSetting o = (GservicesSetting) other;
      return equals(name, o.name)
          && equals(value, o.value);
    }

    @Override
    public int hashCode() {
      int result = hashCode;
      if (result == 0) {
        result = name != null ? name.hashCode() : 0;
        result = result * 37 + (value != null ? value.hashCode() : 0);
        hashCode = result;
      }
      return result;
    }

    public static final class Builder extends Message.Builder<GservicesSetting> {

      public ByteString name;
      public ByteString value;

      public Builder() {
      }

      public Builder(GservicesSetting message) {
        super(message);
        if (message == null) return;
        this.name = message.name;
        this.value = message.value;
      }

      public Builder name(ByteString name) {
        this.name = name;
        return this;
      }

      public Builder value(ByteString value) {
        this.value = value;
        return this;
      }

      @Override
      public GservicesSetting build() {
        return new GservicesSetting(this);
      }
    }
  }
}
