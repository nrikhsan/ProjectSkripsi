// Generated by view binder compiler. Do not edit!
package com.example.projectskripsi.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.projectskripsi.R;
import com.google.android.material.appbar.MaterialToolbar;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDetailGaleriKegiatanBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final MaterialToolbar toolbarDetailGaleriKegiatan;

  private ActivityDetailGaleriKegiatanBinding(@NonNull LinearLayout rootView,
      @NonNull MaterialToolbar toolbarDetailGaleriKegiatan) {
    this.rootView = rootView;
    this.toolbarDetailGaleriKegiatan = toolbarDetailGaleriKegiatan;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDetailGaleriKegiatanBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDetailGaleriKegiatanBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_detail_galeri_kegiatan, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDetailGaleriKegiatanBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.toolbarDetailGaleriKegiatan;
      MaterialToolbar toolbarDetailGaleriKegiatan = ViewBindings.findChildViewById(rootView, id);
      if (toolbarDetailGaleriKegiatan == null) {
        break missingId;
      }

      return new ActivityDetailGaleriKegiatanBinding((LinearLayout) rootView,
          toolbarDetailGaleriKegiatan);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}