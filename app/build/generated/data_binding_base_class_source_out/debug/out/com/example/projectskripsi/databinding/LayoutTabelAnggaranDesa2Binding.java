// Generated by view binder compiler. Do not edit!
package com.example.projectskripsi.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.projectskripsi.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LayoutTabelAnggaranDesa2Binding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final GridLayout grid1;

  @NonNull
  public final LinearLayout layout1;

  @NonNull
  public final LinearLayout layout2;

  @NonNull
  public final LinearLayout layout3;

  @NonNull
  public final LinearLayout layout4;

  @NonNull
  public final LinearLayout layout5;

  @NonNull
  public final RelativeLayout relativ1;

  private LayoutTabelAnggaranDesa2Binding(@NonNull RelativeLayout rootView,
      @NonNull GridLayout grid1, @NonNull LinearLayout layout1, @NonNull LinearLayout layout2,
      @NonNull LinearLayout layout3, @NonNull LinearLayout layout4, @NonNull LinearLayout layout5,
      @NonNull RelativeLayout relativ1) {
    this.rootView = rootView;
    this.grid1 = grid1;
    this.layout1 = layout1;
    this.layout2 = layout2;
    this.layout3 = layout3;
    this.layout4 = layout4;
    this.layout5 = layout5;
    this.relativ1 = relativ1;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LayoutTabelAnggaranDesa2Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LayoutTabelAnggaranDesa2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.layout_tabel_anggaran_desa_2, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LayoutTabelAnggaranDesa2Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.grid1;
      GridLayout grid1 = ViewBindings.findChildViewById(rootView, id);
      if (grid1 == null) {
        break missingId;
      }

      id = R.id.layout1;
      LinearLayout layout1 = ViewBindings.findChildViewById(rootView, id);
      if (layout1 == null) {
        break missingId;
      }

      id = R.id.layout2;
      LinearLayout layout2 = ViewBindings.findChildViewById(rootView, id);
      if (layout2 == null) {
        break missingId;
      }

      id = R.id.layout3;
      LinearLayout layout3 = ViewBindings.findChildViewById(rootView, id);
      if (layout3 == null) {
        break missingId;
      }

      id = R.id.layout4;
      LinearLayout layout4 = ViewBindings.findChildViewById(rootView, id);
      if (layout4 == null) {
        break missingId;
      }

      id = R.id.layout5;
      LinearLayout layout5 = ViewBindings.findChildViewById(rootView, id);
      if (layout5 == null) {
        break missingId;
      }

      id = R.id.relativ1;
      RelativeLayout relativ1 = ViewBindings.findChildViewById(rootView, id);
      if (relativ1 == null) {
        break missingId;
      }

      return new LayoutTabelAnggaranDesa2Binding((RelativeLayout) rootView, grid1, layout1, layout2,
          layout3, layout4, layout5, relativ1);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
