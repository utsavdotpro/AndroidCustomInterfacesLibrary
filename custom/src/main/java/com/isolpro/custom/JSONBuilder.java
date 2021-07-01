package com.isolpro.custom;

import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

public class JSONBuilder {

  private final JSONObject jsonObject;

  private JSONBuilder(JSONObject jsonObject) {
    this.jsonObject = jsonObject;
  }

  public static JSONBuilder get(JSONObject jsonObject) {
    return new JSONBuilder(
      jsonObject != null ? jsonObject : new JSONObject()
    );
  }

  public static JSONBuilder get() {
    return get(new JSONObject());
  }

  private JSONBuilder putHandled(String key, Object value, boolean toPut) {
    if (toPut) {
      try {
        jsonObject.put(key, value);
      } catch (JSONException e) {
        Log.e(JSONBuilder.class.toString(), e.getMessage());
      }
    }

    return this;
  }

  public JSONBuilder put(String key, String value, boolean toPut) {
    return putHandled(key, value, toPut);
  }

  public JSONBuilder put(String key, String value) {
    return put(key, value, true);
  }

  public JSONBuilder put(String key, int value, boolean toPut) {
    return putHandled(key, value, toPut);
  }

  public JSONBuilder put(String key, int value) {
    return put(key, value, true);
  }

  public JSONBuilder put(String key, float value, boolean toPut) {
    return putHandled(key, value, toPut);
  }

  public JSONBuilder put(String key, float value) {
    return put(key, value, true);
  }

  public JSONBuilder put(String key, boolean value, boolean toPut) {
    return putHandled(key, value, toPut);
  }

  public JSONBuilder put(String key, boolean value) {
    return put(key, value, true);
  }

  public JSONBuilder put(String key, JSONObject jsonObject, boolean toPut) {
    return putHandled(key, jsonObject, toPut);
  }

  public JSONBuilder put(String key, JSONObject jsonObject) {
    return put(key, jsonObject, true);
  }

  public JSONObject build() {
    return jsonObject;
  }

}
