package com.isolpro.custom;

import android.os.Bundle;

public class BundleBuilder {

  private final Bundle bundle;

  public BundleBuilder(Bundle bundle) {
    this.bundle = bundle;
  }

  public static BundleBuilder get(Bundle bundle) {
    return new BundleBuilder(
      bundle != null ? bundle : new Bundle()
    );
  }

  public static BundleBuilder get() {
    return get(new Bundle());
  }

  public BundleBuilder putString(String key, String value) {
    bundle.putString(key, value);
    return this;
  }

  public BundleBuilder putInt(String key, int value) {
    bundle.putInt(key, value);
    return this;
  }

  public BundleBuilder putBoolean(String key, boolean value) {
    bundle.putBoolean(key, value);
    return this;
  }

  public String getString(String key, String defaultValue) {
    return bundle.containsKey(key) ? bundle.getString(key) : defaultValue;
  }

  public String getString(String key) {
    return getString(key, "");
  }

  public int getInt(String key, int defaultValue) {
    return bundle.getInt(key, defaultValue);
  }

  public int getInt(String key) {
    return getInt(key, 0);
  }

  public boolean getBoolean(String key, boolean defaultValue) {
    return bundle.getBoolean(key, defaultValue);
  }

  public boolean getBoolean(String key) {
    return getBoolean(key, false);
  }

  public Bundle build() {
    return bundle;
  }

}
