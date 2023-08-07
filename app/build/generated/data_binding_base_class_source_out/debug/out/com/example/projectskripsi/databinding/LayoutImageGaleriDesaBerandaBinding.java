// Generated by view binder compiler. Do not edit!
package com.example.projectskripsi.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.projectskripsi.R;
import com.google.android.material.button.MaterialButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LayoutImageGaleriDesaBerandaBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final MaterialButton btnLihatGaleriDesa;

  private LayoutImageGaleriDesaBerandaBinding(@NonNull CardView rootView,
      @NonNull MaterialButton btnLihatGaleriDesa) {
    this.rootView = rootView;
    this.btnLihatGaleriDesa = btnLihatGaleriDesa;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static LayoutImageGaleriDesaBerandaBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LayoutImageGaleriDesaBerandaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.layout_image_galeri_desa_beranda, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LayoutImageGaleriDesaBerandaBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnLihatGaleriDesa;
      MaterialButton btnLihatGaleriDesa = ViewBindings.findChildViewById(rootView, id);
      if (btnLihatGaleriDesa == null) {
        break missingId;
      }

      return new LayoutImageGaleriDesaBerandaBinding((CardView) rootView, btnLihatGaleriDesa);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}