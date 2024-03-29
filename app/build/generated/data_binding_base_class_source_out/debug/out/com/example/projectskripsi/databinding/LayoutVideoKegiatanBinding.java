// Generated by view binder compiler. Do not edit!
package com.example.projectskripsi.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.projectskripsi.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LayoutVideoKegiatanBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final CardView video1;

  @NonNull
  public final CardView video2;

  @NonNull
  public final CardView video3;

  private LayoutVideoKegiatanBinding(@NonNull LinearLayout rootView, @NonNull CardView video1,
      @NonNull CardView video2, @NonNull CardView video3) {
    this.rootView = rootView;
    this.video1 = video1;
    this.video2 = video2;
    this.video3 = video3;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LayoutVideoKegiatanBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LayoutVideoKegiatanBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.layout_video_kegiatan, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LayoutVideoKegiatanBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.video1;
      CardView video1 = ViewBindings.findChildViewById(rootView, id);
      if (video1 == null) {
        break missingId;
      }

      id = R.id.video2;
      CardView video2 = ViewBindings.findChildViewById(rootView, id);
      if (video2 == null) {
        break missingId;
      }

      id = R.id.video3;
      CardView video3 = ViewBindings.findChildViewById(rootView, id);
      if (video3 == null) {
        break missingId;
      }

      return new LayoutVideoKegiatanBinding((LinearLayout) rootView, video1, video2, video3);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
