/*
  Author: UB
  Version: v1.0
  Date: March 2, 2021
*/

package com.isolpro.custom;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;

public abstract class DialogFragment<B> extends androidx.fragment.app.DialogFragment {

  protected Activity activity;

  protected B binding;
  private View mv;

  @Override
  public void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    activity = getActivity();

    setStyle(STYLE_NO_FRAME, R.style.CustomDialog);
  }

  @Nullable
  @Override
  public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
    activity = getActivity();

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

  public void dismiss(int requestCode, int resultCode, Intent data) {
    if (getTargetFragment() != null)
      getTargetFragment().onActivityResult(requestCode, resultCode, data);

    dismiss();
  }

  public void onBackPressed() {
    activity.onBackPressed();
  }

}
