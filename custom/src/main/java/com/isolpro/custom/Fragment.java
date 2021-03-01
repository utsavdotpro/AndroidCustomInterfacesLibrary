/*
  Author: UB
  Version: v1.0
  Date: March 2, 2021
*/

package com.isolpro.custom;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;

public abstract class Fragment<B> extends androidx.fragment.app.Fragment {

  protected Activity activity;

  protected B binding;
  private View mv;

  @Override
  public void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    activity = getActivity();
  }

  @Nullable
  @Override
  public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
    return mv;
  }

  public void setContentBinding(B binding) {
    this.binding = binding;
    mv = ((ViewBinding) binding).getRoot();
  }

  public void setContentResource(int layoutResource) {
    mv = getLayoutInflater().inflate(layoutResource, null);
  }

  public void setContentView(View view) {
    mv = view;
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
