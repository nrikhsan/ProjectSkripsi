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
import androidx.viewpager2.widget.ViewPager2;
import com.example.projectskripsi.R;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.tabs.TabLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityGaleriDesaBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TabLayout tabLayoutGaleriDesa;

  @NonNull
  public final MaterialToolbar toolbarGaleriDesa;

  @NonNull
  public final ViewPager2 viewPagerGaleriDesa;

  private ActivityGaleriDesaBinding(@NonNull LinearLayout rootView,
      @NonNull TabLayout tabLayoutGaleriDesa, @NonNull MaterialToolbar toolbarGaleriDesa,
      @NonNull ViewPager2 viewPagerGaleriDesa) {
    this.rootView = rootView;
    this.tabLayoutGaleriDesa = tabLayoutGaleriDesa;
    this.toolbarGaleriDesa = toolbarGaleriDesa;
    this.viewPagerGaleriDesa = viewPagerGaleriDesa;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityGaleriDesaBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityGaleriDesaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_galeri_desa, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityGaleriDesaBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.tabLayoutGaleriDesa;
      TabLayout tabLayoutGaleriDesa = ViewBindings.findChildViewById(rootView, id);
      if (tabLayoutGaleriDesa == null) {
        break missingId;
      }

      id = R.id.toolbarGaleriDesa;
      MaterialToolbar toolbarGaleriDesa = ViewBindings.findChildViewById(rootView, id);
      if (toolbarGaleriDesa == null) {
        break missingId;
      }

      id = R.id.viewPagerGaleriDesa;
      ViewPager2 viewPagerGaleriDesa = ViewBindings.findChildViewById(rootView, id);
      if (viewPagerGaleriDesa == null) {
        break missingId;
      }

      return new ActivityGaleriDesaBinding((LinearLayout) rootView, tabLayoutGaleriDesa,
          toolbarGaleriDesa, viewPagerGaleriDesa);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
