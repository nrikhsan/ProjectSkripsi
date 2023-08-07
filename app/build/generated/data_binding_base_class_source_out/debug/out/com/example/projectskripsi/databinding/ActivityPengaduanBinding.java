// Generated by view binder compiler. Do not edit!
package com.example.projectskripsi.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.projectskripsi.R;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityPengaduanBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final MaterialButton btnKirimPengaduan;

  @NonNull
  public final EditText edtCatatan;

  @NonNull
  public final EditText edtNIK;

  @NonNull
  public final MaterialToolbar toolbarPengaduan;

  private ActivityPengaduanBinding(@NonNull LinearLayout rootView,
      @NonNull MaterialButton btnKirimPengaduan, @NonNull EditText edtCatatan,
      @NonNull EditText edtNIK, @NonNull MaterialToolbar toolbarPengaduan) {
    this.rootView = rootView;
    this.btnKirimPengaduan = btnKirimPengaduan;
    this.edtCatatan = edtCatatan;
    this.edtNIK = edtNIK;
    this.toolbarPengaduan = toolbarPengaduan;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityPengaduanBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityPengaduanBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_pengaduan, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityPengaduanBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnKirimPengaduan;
      MaterialButton btnKirimPengaduan = ViewBindings.findChildViewById(rootView, id);
      if (btnKirimPengaduan == null) {
        break missingId;
      }

      id = R.id.edtCatatan;
      EditText edtCatatan = ViewBindings.findChildViewById(rootView, id);
      if (edtCatatan == null) {
        break missingId;
      }

      id = R.id.edtNIK;
      EditText edtNIK = ViewBindings.findChildViewById(rootView, id);
      if (edtNIK == null) {
        break missingId;
      }

      id = R.id.toolbarPengaduan;
      MaterialToolbar toolbarPengaduan = ViewBindings.findChildViewById(rootView, id);
      if (toolbarPengaduan == null) {
        break missingId;
      }

      return new ActivityPengaduanBinding((LinearLayout) rootView, btnKirimPengaduan, edtCatatan,
          edtNIK, toolbarPengaduan);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}