package shoo.denonapps.com.freshworks;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import shoo.denonapps.com.freshworks.databinding.ActivityMainBindingImpl;
import shoo.denonapps.com.freshworks.databinding.FragmentFavBindingImpl;
import shoo.denonapps.com.freshworks.databinding.FragmentHomeBindingImpl;
import shoo.denonapps.com.freshworks.databinding.GiphyItemBindingImpl;
import shoo.denonapps.com.freshworks.databinding.ProgressDialogBindingImpl;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_FRAGMENTFAV = 2;

  private static final int LAYOUT_FRAGMENTHOME = 3;

  private static final int LAYOUT_GIPHYITEM = 4;

  private static final int LAYOUT_PROGRESSDIALOG = 5;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(5);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(shoo.denonapps.com.freshworks.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(shoo.denonapps.com.freshworks.R.layout.fragment_fav, LAYOUT_FRAGMENTFAV);
    INTERNAL_LAYOUT_ID_LOOKUP.put(shoo.denonapps.com.freshworks.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(shoo.denonapps.com.freshworks.R.layout.giphy_item, LAYOUT_GIPHYITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(shoo.denonapps.com.freshworks.R.layout.progress_dialog, LAYOUT_PROGRESSDIALOG);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTFAV: {
          if ("layout/fragment_fav_0".equals(tag)) {
            return new FragmentFavBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_fav is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOME: {
          if ("layout/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
        }
        case  LAYOUT_GIPHYITEM: {
          if ("layout/giphy_item_0".equals(tag)) {
            return new GiphyItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for giphy_item is invalid. Received: " + tag);
        }
        case  LAYOUT_PROGRESSDIALOG: {
          if ("layout/progress_dialog_0".equals(tag)) {
            return new ProgressDialogBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for progress_dialog is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(2);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(5);

    static {
      sKeys.put("layout/activity_main_0", shoo.denonapps.com.freshworks.R.layout.activity_main);
      sKeys.put("layout/fragment_fav_0", shoo.denonapps.com.freshworks.R.layout.fragment_fav);
      sKeys.put("layout/fragment_home_0", shoo.denonapps.com.freshworks.R.layout.fragment_home);
      sKeys.put("layout/giphy_item_0", shoo.denonapps.com.freshworks.R.layout.giphy_item);
      sKeys.put("layout/progress_dialog_0", shoo.denonapps.com.freshworks.R.layout.progress_dialog);
    }
  }
}
