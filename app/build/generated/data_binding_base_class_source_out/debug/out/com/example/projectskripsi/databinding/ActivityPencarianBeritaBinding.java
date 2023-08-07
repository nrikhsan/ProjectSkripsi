// Generated by view binder compiler. Do not edit!
package com.example.projectskripsi.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.projectskripsi.R;
import com.google.android.material.appbar.MaterialToolbar;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityPencarianBeritaBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LayoutBeritaPencarianBinding layoutBeritaPencarian;

  @NonNull
  public final SearchView searchBerita;

  @NonNull
  public final MaterialToolbar toolbarPencarianBerita;

  private ActivityPencarianBeritaBinding(@NonNull LinearLayout rootView,
      @NonNull LayoutBeritaPencarianBinding layoutBeritaPencarian, @NonNull SearchView searchBerita,
      @NonNull MaterialToolbar toolbarPencarianBerita) {
    this.rootView = rootView;
    this.layoutBeritaPencarian = layoutBeritaPencarian;
    this.searchBerita = searchBerita;
    this.toolbarPencarianBerita = toolbarPencarianBerita;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityPencarianBeritaBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityPencarianBeritaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_pencarian_berita, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityPencarianBeritaBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.layout_berita_pencarian;
      View layoutBeritaPencarian = ViewBindings.findChildViewById(rootView, id);
      if (layoutBeritaPencarian == null) {
        break missingId;
      }
      LayoutBeritaPencarianBinding binding_layoutBeritaPencarian = LayoutBeritaPencarianBinding.bind(layoutBeritaPencarian);

      id = R.id.searchBerita;
      SearchView searchBerita = ViewBindings.findChildViewById(rootView, id);
      if (searchBerita == null) {
        break missingId;
      }

      id = R.id.toolbarPencarianBerita;
      MaterialToolbar toolbarPencarianBerita = ViewBindings.findChildViewById(rootView, id);
      if (toolbarPencarianBerita == null) {
        break missingId;
      }

      return new ActivityPencarianBeritaBinding((LinearLayout) rootView,
          binding_layoutBeritaPencarian, searchBerita, toolbarPencarianBerita);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}