// Generated by view binder compiler. Do not edit!
package com.example.projectskripsi.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.projectskripsi.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class CardRiwayatPengaduanBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final ImageView imageCheck;

  @NonNull
  public final TextView tvCatatan;

  @NonNull
  public final TextView tvNik;

  @NonNull
  public final TextView tvTanggalRiwayat;

  private CardRiwayatPengaduanBinding(@NonNull CardView rootView, @NonNull ImageView imageCheck,
      @NonNull TextView tvCatatan, @NonNull TextView tvNik, @NonNull TextView tvTanggalRiwayat) {
    this.rootView = rootView;
    this.imageCheck = imageCheck;
    this.tvCatatan = tvCatatan;
    this.tvNik = tvNik;
    this.tvTanggalRiwayat = tvTanggalRiwayat;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static CardRiwayatPengaduanBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CardRiwayatPengaduanBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.card_riwayat_pengaduan, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CardRiwayatPengaduanBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageCheck;
      ImageView imageCheck = ViewBindings.findChildViewById(rootView, id);
      if (imageCheck == null) {
        break missingId;
      }

      id = R.id.tvCatatan;
      TextView tvCatatan = ViewBindings.findChildViewById(rootView, id);
      if (tvCatatan == null) {
        break missingId;
      }

      id = R.id.tvNik;
      TextView tvNik = ViewBindings.findChildViewById(rootView, id);
      if (tvNik == null) {
        break missingId;
      }

      id = R.id.tvTanggalRiwayat;
      TextView tvTanggalRiwayat = ViewBindings.findChildViewById(rootView, id);
      if (tvTanggalRiwayat == null) {
        break missingId;
      }

      return new CardRiwayatPengaduanBinding((CardView) rootView, imageCheck, tvCatatan, tvNik,
          tvTanggalRiwayat);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}