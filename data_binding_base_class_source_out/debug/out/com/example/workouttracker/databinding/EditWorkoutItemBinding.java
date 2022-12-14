// Generated by view binder compiler. Do not edit!
package com.example.workouttracker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import com.example.workouttracker.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class EditWorkoutItemBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final ImageView deleteSet;

  @NonNull
  public final EditText etInsertNumberOfRepsEditItem;

  @NonNull
  public final EditText etInsertSetWeightEditItem;

  private EditWorkoutItemBinding(@NonNull CardView rootView, @NonNull ImageView deleteSet,
      @NonNull EditText etInsertNumberOfRepsEditItem, @NonNull EditText etInsertSetWeightEditItem) {
    this.rootView = rootView;
    this.deleteSet = deleteSet;
    this.etInsertNumberOfRepsEditItem = etInsertNumberOfRepsEditItem;
    this.etInsertSetWeightEditItem = etInsertSetWeightEditItem;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static EditWorkoutItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static EditWorkoutItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.edit_workout_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static EditWorkoutItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.delete_set;
      ImageView deleteSet = rootView.findViewById(id);
      if (deleteSet == null) {
        break missingId;
      }

      id = R.id.et_insert_number_of_reps_edit_item;
      EditText etInsertNumberOfRepsEditItem = rootView.findViewById(id);
      if (etInsertNumberOfRepsEditItem == null) {
        break missingId;
      }

      id = R.id.et_insert_set_weight_edit_item;
      EditText etInsertSetWeightEditItem = rootView.findViewById(id);
      if (etInsertSetWeightEditItem == null) {
        break missingId;
      }

      return new EditWorkoutItemBinding((CardView) rootView, deleteSet,
          etInsertNumberOfRepsEditItem, etInsertSetWeightEditItem);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
