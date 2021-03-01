/*
  Author: UB
  Version: v1.0
  Date: March 2, 2021
*/

package com.isolpro.custom;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewbinding.ViewBinding;

public abstract class Activity<B> extends AppCompatActivity {

  protected android.app.Activity activity;

  protected B binding;

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    activity = this;
  }

  public void setContentBinding(B binding) {
    this.binding = binding;
    super.setContentView(((ViewBinding) binding).getRoot());
  }

  public void setContentResource(int layoutResource) {
    super.setContentView(layoutResource);
  }

  public void setContentView(View view) {
    super.setContentView(view);
  }

  protected void begin() {
    instantiate();
    initialize();
    listen();
    load();
  }

  protected abstract void instantiate();

  protected abstract void initialize();

  protected abstract void listen();

  protected abstract void load();

}
